package org.example;

import static java.lang.Math.abs;

public class Triangle {
    Point vertex1, vertex2, vertex3;

    public Triangle(Point vertex1, Point vertex2, Point vertex3) {
        this.vertex1 = vertex1;
        this.vertex2 = vertex2;
        this.vertex3 = vertex3;
    }

    public double perimeter(){
        return vertex1.distanceTo(vertex2) + vertex2.distanceTo(vertex3) + vertex3.distanceTo(vertex1);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "vertex1=" + vertex1 +
                ", vertex2=" + vertex2 +
                ", vertex3=" + vertex3 +
                '}';
    }

    public double area(){
        return 0.5*abs((vertex2.x - vertex1.x)*(vertex3.y- vertex1.y) - (vertex3.x- vertex1.x)*(vertex2.y- vertex1.y));
    }
    public boolean equals(Triangle t){
        double side1 = vertex1.distanceTo(vertex2);
        double side2 = vertex1.distanceTo(vertex3);
        double side3 = vertex3.distanceTo(vertex2);

        double tside1 = t.vertex1.distanceTo(t.vertex2);
        double tside2 = t.vertex1.distanceTo(t.vertex3);
        double tside3 = t.vertex3.distanceTo(t.vertex2);

        if (side1 == tside1)
            if (side2 == tside2)
                if (side3 == tside3) return true;
                else return false;
            else if (side2 == tside3)
                if (side3 == tside2) return true;
                else return false;
        if (side1 == tside2)
            if (side2 == tside3)
                if (side3 == tside1) return true;
                else return false;
            else if (side3 == tside3)
                if (side2 == tside1) return true;
                else return false;
        if (side1 == tside3)
            if (side2 == tside2)
                if (side3 == tside1) return true;
                else return false;
            else if (side2 == tside1)
                if (side3 == tside2) return true;
                else return false;

        return false;
    }
}