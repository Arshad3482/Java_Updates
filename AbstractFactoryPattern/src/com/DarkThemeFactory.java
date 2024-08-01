package com.example;

// Concrete Factory 2
public class DarkThemeFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new DarkButton();
    }

    @Override
    public TextField createTextField() {
        return new DarkTextField();
    }
}
