public class Point {
    private int x;
    private int y;

    // constructs a new point with the given (x, y) values
    public Point(int x, int y) {
        setLocation(x, y);
    }

    //constructs a Point object with location (0, 0)
    public Point() {
        this(0, 0); // calls Point(int, int) constructor
    }

    // shifts this point's location by the given amount
    public void translate(int dx, int dy) {
        setLocation(x + dx, y + dy);

    }

    // returns the distance from this point and (0, 0)
    public double distanceFromOrigin() {
        return Math.sqrt(x * x + y * y);
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }
    // returns whether o refers to a Point with the same (x, y)
    // coordinates as this Point
    public boolean equals(Object o) {
        if (o instanceof Point) {
            // typecaster Object o til Point, for at kunne sammenligne de 2 objekters fields
            Point other = (Point) o;
            return x == other.getX() && y == other.getY();
            // kan også tilgå fields direkte, men nogle vælger at respektere indkapslingen(encapsulation)
            // eller: return x == other.x && y == other.y;
        }
        else { // hvis det ikke er et Point objekt
            return false;

        }
    }

    public void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }


}
