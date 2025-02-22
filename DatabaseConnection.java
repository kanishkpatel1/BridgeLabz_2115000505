/* ===================== DatabaseConnection.java ===================== */
package com.lcwd.test.database;

public class DatabaseConnection {
    private boolean isConnected;

    public void connect() {
        isConnected = true;
        System.out.println("Database connected");
    }

    public void disconnect() {
        isConnected = false;
        System.out.println("Database disconnected");
    }

    public boolean isConnected() {
        return isConnected;
    }
}
