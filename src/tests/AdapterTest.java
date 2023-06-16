package tests;

import adapter.Cube;
import adapter.GeoMath;
import adapter.GeoMathAdapter;
import adapter.Square;

public class AdapterTest implements Tester{
    public void test(){
        Square square = new Square(2);
        GeoMath geoMath = new GeoMath();
        System.out.println("Area of a square is: "+ geoMath.getArea(square));

        Cube cube = new Cube(2);
        GeoMathAdapter adapter = new GeoMathAdapter();
        System.out.println("Area of a cube is: "+ adapter.getArea(cube));
    }
}
