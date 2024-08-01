package com.example;

// Client Code
public class Application {
    private Button button;
    private TextField textField;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        textField = factory.createTextField();
    }

    public void renderUI() {
        button.render();
        textField.render();
    }

    public static void main(String[] args) {
        GUIFactory factory;

        // Choose the theme dynamically
        String theme = "light"; // Change to "dark" to test the other theme

        if ("light".equalsIgnoreCase(theme)) {
            factory = new LightThemeFactory();
        } else {
            factory = new DarkThemeFactory();
        }

        Application app = new Application(factory);
        app.renderUI();
    }
}
