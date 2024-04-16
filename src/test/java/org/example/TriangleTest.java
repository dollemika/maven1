package org.example;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class TriangleTest {
    @Test
    public void equalTriangles(){
        Triangle t1,t2,t3,t4,t5;
        t1 = new Triangle(new Point(0,0),new Point(0,5),new Point(7,0));
        t2 = new Triangle(new Point(0,0),new Point(0,-5),new Point(-7,0));
        t3 = new Triangle(new Point(3,3),new Point(3,-2),new Point(-4,3));
        t4 = new Triangle(new Point(0,5),new Point(7,0),new Point(0,0));
        t5 = new Triangle(new Point(0,0),new Point(100,0),new Point(0,100));
        Assertions.assertTrue(t1.equals(t2));
        Assertions.assertTrue(t2.equals(t1));
        Assertions.assertTrue(t1.equals(t3));
        Assertions.assertTrue(t3.equals(t1));
        Assertions.assertTrue(t2.equals(t3));
        Assertions.assertTrue(t3.equals(t2));
        Assertions.assertTrue(t1.equals(t4));
        Assertions.assertTrue(t4.equals(t1));
        Assertions.assertFalse(t1.equals(t5));
        Assertions.assertFalse(t5.equals(t1));
    }
}
