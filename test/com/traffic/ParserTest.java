package com.traffic;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class ParserTest {
    @BeforeEach
    void setUp() throws IOException {
        File file = new File("testInput");
        FileWriter fr = new FileWriter(file, true);
        fr.write("rainy 40 50");
        fr.close();
    }

    @AfterEach
    void tearDown() throws IOException {
        File file = new File("testInput");
        file.delete();
    }

    @Test
    void shouldReadFileAndParseInputFile() throws IOException {
        Parser parser = new Parser();
        ParsedInput actual = parser.parseInput("testInput");

        ParsedInput expected = new ParsedInput("rainy", 40, 50);
        assertEquals(expected, actual);
    }
}