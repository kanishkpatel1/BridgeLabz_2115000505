/* ===================== TaskProcessor.java ===================== */
package com.lcwd.test.utils;

public class TaskProcessor {
    public static String longRunningTask() throws InterruptedException {
        Thread.sleep(3000);
        return "Task Completed";
    }
}
