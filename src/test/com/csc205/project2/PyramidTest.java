package com.csc205.project2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PyramidTest {

    Pyramid pyramid;

    @BeforeEach
    void setUp()
    {
        pyramid = new Pyramid();
    }

    @Test
    void surfaceArea()
    {
        Assertions.assertNotEquals(0.0,pyramid.surfaceArea(),"Surface area is 0.");
    }

    @Test
    void volume()
    {
        Assertions.assertNotEquals(0.0,pyramid.volume(),"Volume is 0.");
    }
}