package org.example;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class MethodsForTriangle {
    public static ArrayList<Triangle> readTriangles(String file) {
        try {
            Scanner scanner = new Scanner(new File(file));
            ArrayList<Triangle> triangles = new ArrayList<>();
            while(scanner.hasNext()) {
                String s = scanner.nextLine();
                Triangle t = makeTrFromStr(s);
                triangles.add(t);
            }
            return triangles;
        }
        catch (FileNotFoundException e){
            return null;
        }
    }

    public static Triangle makeTrFromStr(String s) {
        Scanner scanner = new Scanner(s);
        double x, y;
        x = scanner.nextDouble();
        y = scanner.nextDouble();
        Point v1 = new Point(x, y);
        x = scanner.nextDouble();
        y = scanner.nextDouble();
        Point v2 = new Point(x, y);
        x = scanner.nextDouble();
        y = scanner.nextDouble();
        Point v3 = new Point(x, y);
        return new Triangle(v1, v2, v3);
    }

    public static double averageArea(ArrayList<Triangle> triangles) {
        double sumS = 0;
        for (Triangle t : triangles) {
            sumS += t.area();
        }
        return sumS/ triangles.size();
    }
    public static int countEqual(ArrayList<Triangle> t){
        int maxEquals = 0;
        for (int i = 0; i<t.size(); i++){
            int tmp = 0;
            for (int j = i+1; j<t.size(); j++){
                if (t.get(i).equals(t.get(j))) tmp++;
            }
            if (tmp>0) tmp++;
            if (tmp>maxEquals) maxEquals=tmp;
        }
        return maxEquals;
    }
    /*static public ArrayList<Triangle> readFromFile(String fname){
        Scanner scanner = new Scanner(fname);
        ArrayList<Triangle> t = new ArrayList<>();
        while (scanner.hasNext()) {
            t.add(new Triangle(new Point(scanner.nextInt(), scanner.nextInt()), new Point(scanner.nextInt(), scanner.nextInt()), new Point(scanner.nextInt(), scanner.nextInt())));
        }
        return t;
    }
    static public double avgArea(ArrayList<Triangle> t){
        double tmp = 0;
        for (Triangle x: t){
            tmp += x.area();
        }
        tmp = tmp/t.size();
        return tmp;
    }
    static public int countEqual(ArrayList<Triangle> t){
        int maxEquals = 1;
        for (int i = 0; i<t.size(); i++){
            int tmp = 1;
            for (int j = i+1; j<t.size(); j++){
                if (t.get(i).equals(t.get(j))) tmp++;
            }
            if (tmp>maxEquals) maxEquals=tmp;
        }
        return maxEquals;
    }*/
}
