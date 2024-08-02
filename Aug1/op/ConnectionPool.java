package com.example.op;

import java.util.ArrayList;
import java.util.List;

public class ConnectionPool {
    // List to hold all the database connections in the pool
    private List<DatabaseConnection> pool;

    // Constructor to create a pool with a specified number of connections
    public ConnectionPool(int initialSize) {
        pool = new ArrayList<>();
        // Initialize the pool with the given number of connections
        for (int i = 0; i < initialSize; i++) {
            pool.add(new DatabaseConnection());
        }
    }

    // Method to get a connection from the pool
    public DatabaseConnection getConnection() {
        // Iterate through the pool to find an available connection
        for (DatabaseConnection connection : pool) {
            if (connection.isAvailable()) {
                // Mark this connection as used and return it
                connection.setAvailable(false);
                return connection;
            }
        }
        // If no available connections, create a new one and add it to the pool
        DatabaseConnection newConnection = new DatabaseConnection();
        pool.add(newConnection);
        return newConnection;
    }

    // Method to return a connection back to the pool
    public void releaseConnection(DatabaseConnection connection) {
        // Mark the connection as available again
        connection.setAvailable(true);
    }
}
