// A program that deals with points.
// First version, to accompany Point class with state only


public class PointMain {
    public static void main(String[] args) {
        // create two Point objects
        Point p1 = new Point(5, 12);
        Point p2 = new Point(55, 88);

        // Print each point and its distance from the origin
        System.out.println("p1 is " + p1);
        System.out.println("distance from origin = " + p1.distanceFromOrigin());

        System.out.println("p2 is " + p2);
        System.out.println("distance from origin = " + p2.distanceFromOrigin());
        System.out.println();

        // translate each point to a new location
        p1.translate(11, 6);
        p2.translate(1, 7);

        // print the points again
        System.out.println("p1 is " + p1);
        System.out.println("p2 is " + p2);

        Point p3 = new Point();
        System.out.println(p3);
        System.out.println(p3);
    }
}
