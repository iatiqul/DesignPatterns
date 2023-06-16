package adapter;

public class GeoMath {
    public float getArea(Square square){
        float side = square.getSide();
        return side * side;
    }
}
