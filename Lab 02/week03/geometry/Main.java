package week03.geometry;

public class Main {
    public static void main(String[] args) {
        
        System.out.println("--- Testing Point ---");
        Point pt1 = new Point(1.0f, 2.0f);
        Point pt2 = new Point(4.0f, 6.0f);

        System.out.println("pt1: " + pt1);
        System.out.println("pt2: " + pt2);
        System.out.println("Distance pt1 to pt2: " + pt1.distance(pt2)); 

        pt1.translate(3.0f, 4.0f);
        System.out.println("pt1 after translation: " + pt1);
        System.out.println("pt1 equals pt2? " + pt1.equals(pt2)); 


        System.out.println("\n--- Testing Segment ---");
        Segment seg = new Segment(0.0f, 0.0f, 4.0f, 4.0f); 

        System.out.println("Segment length: " + seg.length());
        System.out.println("Segment slope (k): " + seg.getSlope());       
        System.out.println("Segment intercept (b): " + seg.getIntercept()); 

        
        Point onSeg = new Point(2.0f, 2.0f);
        Point onLineOnly = new Point(6.0f, 6.0f);
        Point outside = new Point(2.0f, 5.0f);

        System.out.println("(2, 2) on line: " + seg.isOnLine(onSeg));           
        System.out.println("(2, 2) on segment: " + seg.isOnSegment(onSeg));     

        System.out.println("(6, 6) on line: " + seg.isOnLine(onLineOnly));      
        System.out.println("(6, 6) on segment: " + seg.isOnSegment(onLineOnly));

        System.out.println("(2, 5) on line: " + seg.isOnLine(outside));         
    }
}