package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CircleTest {
    @Test
    public void equalCircles(){
        Circle a,b;
        a = new Circle(10,new Point(0,0));
        b = new Circle(10,new Point(5,3));
        Assertions.assertTrue(a.equals(b));
        Assertions.assertTrue(b.equals(a));
        Circle c;
        c = new Circle(5,new Point(0,0));
        Assertions.assertFalse(a.equals(c));
        Assertions.assertFalse(c.equals(a));
    }
}
