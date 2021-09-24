package com.csc205.project2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CylinderTest {

    Cylinder cylinder;

    @BeforeEach
    void setUp()
    {
        cylinder = new Cylinder();
    }

    @Test
    void surfaceArea()
    {
        Assertions.assertNotEquals(0.0,cylinder.surfaceArea(),"Surface area is 0.");
    }

    @Test
    void volume()
    {
        Assertions.assertNotEquals(0.0,cylinder.volume(),"Volume is 0.");
    }
}