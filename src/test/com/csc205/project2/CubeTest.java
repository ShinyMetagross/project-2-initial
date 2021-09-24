package com.csc205.project2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CubeTest {

    Cube cube;

    @BeforeEach
    void setUp()
    {
        cube = new Cube();
    }

    @Test
    void surfaceArea()
    {
        Assertions.assertNotEquals(0.0,cube.surfaceArea(),"Surface area is 0.");
    }

    @Test
    void volume()
    {
        Assertions.assertNotEquals(0.0,cube.volume(),"Volume is 0.");
    }
}