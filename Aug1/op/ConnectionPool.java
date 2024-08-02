package com.example.op;

import java.util.ArrayList;
import java.util.List;

public class ConnectionPool {
    private List<DatabaseConnection> pool;

    // Constructor initializes the pool with a set number of connections
    public ConnectionPool(int initialSize) {
        pool = new ArrayList<>();
        for (int i = 0; i < initialSize; i++) {
            pool.add(new DatabaseConnection());
        }
    }

    // Method to acquire a connection from the pool
    public DatabaseConnection getConnection() {
        for (DatabaseConnection connection : pool) {
            if (connection.isAvailable()) {
                connection.setAvailable(false); // Mark the connection as unavailable
                return connection;
            }
        }
        // Optionally create a new connection if none are available
        DatabaseConnection newConnection = new DatabaseConnection();
        pool.add(newConnection);
        return newConnection;
    }

    // Method to release a connection back to the pool
    public void releaseConnection(DatabaseConnection connection) {
        connection.setAvailable(true); // Mark the connection as available
    }
}
