package adapter;

public class GeoMathAdapter {
    public float getArea(Cube cube){
        Square square = new Square(cube.getEdgeLength());
        GeoMath geoMath = new GeoMath();
        return 6 * geoMath.getArea(square);
    }
}
