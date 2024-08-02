package com.example.op;

public class DatabaseConnection {
    private boolean isAvailable;

    // Constructor initializes the connection as available
    public DatabaseConnection() {
        this.isAvailable = true;
    }

    // Simulates connecting to the database
    public void connect() {
        System.out.println("Connecting to the database...");
    }

    // Simulates disconnecting from the database
    public void disconnect() {
        System.out.println("Disconnecting from the database...");
    }

    // Getter for availability status
    public boolean isAvailable() {
        return isAvailable;
    }

    // Setter for availability status
    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
