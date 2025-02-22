/* ===================== UserRegistrationTest.java ===================== */
package com.lcwd.test.services;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class UserRegistrationTest {

    @Test
    public void testValidUserRegistration() {
        assertDoesNotThrow(() -> UserRegistration.registerUser("john_doe", "john@example.com", "SecurePass1"));
        assertDoesNotThrow(() -> UserRegistration.registerUser("alice", "alice@gmail.com", "Password123"));
    }

    @Test
    public void testInvalidUsername() {
        assertThrows(IllegalArgumentException.class, () -> UserRegistration.registerUser("", "test@example.com", "Password123"));
        assertThrows(IllegalArgumentException.class, () -> UserRegistration.registerUser(null, "test@example.com", "Password123"));
    }

    @Test
    public void testInvalidEmail() {
        assertThrows(IllegalArgumentException.class, () -> UserRegistration.registerUser("user", "invalid-email", "Password123"));
        assertThrows(IllegalArgumentException.class, () -> UserRegistration.registerUser("user", "user@", "Password123"));
    }

    @Test
    public void testInvalidPassword() {
        assertThrows(IllegalArgumentException.class, () -> UserRegistration.registerUser("user", "user@example.com", "123"));
        assertThrows(IllegalArgumentException.class, () -> UserRegistration.registerUser("user", "user@example.com", ""));
    }
}
