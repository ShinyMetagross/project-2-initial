package com.csc205.project2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SphereTest {

    Sphere sphere;

    @BeforeEach
    void setUp()
    {
        sphere = new Sphere();
    }

    @Test
    void surfaceArea()
    {
        Assertions.assertNotEquals(0.0,sphere.surfaceArea(),"Surface area is 0.");
    }

    @Test
    void volume()
    {
        Assertions.assertNotEquals(0.0,sphere.volume(),"Volume is 0.");
    }
}