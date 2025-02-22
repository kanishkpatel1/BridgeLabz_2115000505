/* ===================== PasswordValidatorTest.java ===================== */
package com.lcwd.test.security;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class PasswordValidatorTest {

    @Test
    public void testValidPassword() {
        assertTrue(PasswordValidator.isValid("StrongPass1"));
    }

    @Test
    public void testShortPassword() {
        assertFalse(PasswordValidator.isValid("Abc12"));
    }

    @Test
    public void testNoUpperCase() {
        assertFalse(PasswordValidator.isValid("password123"));
    }

    @Test
    public void testNoDigit() {
        assertFalse(PasswordValidator.isValid("PasswordOnly"));
    }

    @Test
    public void testNullPassword() {
        assertFalse(PasswordValidator.isValid(null));
    }
}
