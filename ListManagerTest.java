// ListManagerTest.java
package com.lcwd.test.utils;

import org.junit.*;
import java.util.ArrayList;
import java.util.List;

public class ListManagerTest {

    private List<Integer> list;

    @Before
    public void setUp() {
        list = new ArrayList<>();
    }

    @Test
    public void testAddElement() {
        ListManager.addElement(list, 5);
        Assert.assertTrue(list.contains(5));
    }

    @Test
    public void testRemoveElement() {
        ListManager.addElement(list, 10);
        ListManager.removeElement(list, 10);
        Assert.assertFalse(list.contains(10));
    }

    @Test
    public void testGetSize() {
        ListManager.addElement(list, 1);
        ListManager.addElement(list, 2);
        Assert.assertEquals(2, ListManager.getSize(list));
        ListManager.removeElement(list, 1);
        Assert.assertEquals(1, ListManager.getSize(list));
    }
}
