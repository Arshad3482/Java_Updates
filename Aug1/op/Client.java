package com.example.op;

public class Client {
    public static void main(String[] args) {
        // Create a pool with an initial size of 5 connections
        ConnectionPool connectionPool = new ConnectionPool(5);

        // Acquire a connection from the pool
        DatabaseConnection connection = connectionPool.getConnection();
        connection.connect(); // Use the connection

        // Perform operations with the connection...

        // Release the connection back to the pool
        connection.disconnect();
        connectionPool.releaseConnection(connection);
    }
}
