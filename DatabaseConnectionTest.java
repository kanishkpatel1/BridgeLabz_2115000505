/* ===================== DatabaseConnectionTest.java ===================== */
package com.lcwd.test.database;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class DatabaseConnectionTest {
    private DatabaseConnection db;

    @BeforeEach
    public void setUp() {
        db = new DatabaseConnection();
        db.connect();
    }

    @Test
    public void testConnectionIsEstablished() {
        assertTrue(db.isConnected(), "Database should be connected");
    }

    @AfterEach
    public void tearDown() {
        db.disconnect();
        assertFalse(db.isConnected(), "Database should be disconnected");
    }
}
