/* ===================== FileProcessorTest.java ===================== */
package com.lcwd.test.utils;

import org.junit.jupiter.api.*;
import java.io.File;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.*;

public class FileProcessorTest {

    private static final String TEST_FILE = "testfile.txt";

    @BeforeEach
    public void setup() throws IOException {
        FileProcessor.writeToFile(TEST_FILE, "Hello, World!");
    }

    @Test
    public void testWriteAndReadFile() throws IOException {
        String content = FileProcessor.readFromFile(TEST_FILE);
        assertEquals("Hello, World!", content);
    }

    @Test
    public void testFileExistsAfterWrite() {
        File file = new File(TEST_FILE);
        assertTrue(file.exists());
    }

    @Test
    public void testReadNonExistentFile() {
        assertThrows(IOException.class, () -> FileProcessor.readFromFile("nonexistent.txt"));
    }

    @AfterEach
    public void cleanup() {
        File file = new File(TEST_FILE);
        if (file.exists()) {
            file.delete();
        }
    }
}
