import java.util.*;

import shapes.Sphere;

public class ShapesCalculation {
    public static void main(String[] args) {
        double r;
        Scanner aja = new Scanner(System.in);
        System.out.println("enter radius of sphere");
        r = aja.nextDouble();
        Sphere s = new Sphere(r);
        System.out.println("surface area of sphere is" + (s.surfacearea()));
        System.out.println("volume area of sphere is" + (s.volume()));
        aja.close();
    }
}