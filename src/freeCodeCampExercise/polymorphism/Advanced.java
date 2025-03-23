// Interface for elements that respond to click events.
package freeCodeCampExercise.polymorphism;
interface OnClickListener {
    void onClick();
}

// Abstract superclass defining a contract for all UI elements.
abstract class UIElement {
    abstract void draw();
    abstract void setOnClickListener(OnClickListener listener);
}

// Button is a subclass of UIElement and also implements OnClickListener.
// Demonstrates multiple polymorphism (with both superclass and interface).
class Button extends UIElement implements OnClickListener {
    private OnClickListener listener;

    @Override
    void draw() {
        System.out.println("Drawing a button...");
    }

    @Override
    public void setOnClickListener(OnClickListener listener) {
        this.listener = listener;
    }

    // Simulates a click event.
    void click() {
        if(listener != null) {
            listener.onClick();
        }
    }

    @Override
    public void onClick() {
        System.out.println("Button was clicked!");
    }
}

// Dropdown is another subclass of UIElement.
// It can potentially implement OnClickListener but for brevity, it's omitted here.
class Dropdown extends UIElement {
    @Override
    void draw() {
        System.out.println("Drawing a dropdown...");
    }

    @Override
    public void setOnClickListener(OnClickListener listener) {
        // Potential implementation for dropdown click.
    }
}

// Test class to demonstrate polymorphism in action, especially with interfaces.
public class Advanced {
    public static void main(String[] args) {
        Button btn = new Button();
        btn.draw();
        btn.setOnClickListener(btn);  // Setting the button itself as the click listener
        btn.click();
    }
}