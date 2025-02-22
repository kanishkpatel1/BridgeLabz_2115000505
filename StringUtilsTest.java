// StringUtilsTest.java
package com.lcwd.test.utils;

import org.junit.*;

public class StringUtilsTest {

    @Test
    public void testReverse() {
        Assert.assertEquals("dcba", StringUtils.reverse("abcd"));
        Assert.assertEquals("321", StringUtils.reverse("123"));
    }

    @Test
    public void testIsPalindrome() {
        Assert.assertTrue(StringUtils.isPalindrome("madam"));
        Assert.assertTrue(StringUtils.isPalindrome("racecar"));
        Assert.assertFalse(StringUtils.isPalindrome("hello"));
    }

    @Test
    public void testToUpperCase() {
        Assert.assertEquals("HELLO", StringUtils.toUpperCase("hello"));
        Assert.assertEquals("JAVA", StringUtils.toUpperCase("java"));
    }
}
