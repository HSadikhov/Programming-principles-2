package week03.geometry;

public class Segment {
    private Point p1;
    private Point p2;

    private static final float EPSILON = 1e-5f;

    
    public Segment(Point p1, Point p2) {
        this.p1 = (p1 != null) ? new Point(p1) : new Point();
        this.p2 = (p2 != null) ? new Point(p2) : new Point();
    }

    
    public Segment(float x1, float y1, float x2, float y2) {
        this.p1 = new Point(x1, y1);
        this.p2 = new Point(x2, y2);
    }

    
    public Point getP1() {
        return this.p1;
    }

    public void setP1(Point p) {
        if (p != null) {
            this.p1 = new Point(p);
        }
    }

    public Point getP2() {
        return this.p2;
    }

    public void setP2(Point p) {
        if (p != null) {
            this.p2 = new Point(p);
        }
    }

    
    public void translate(float dX, float dY) {
        this.p1.translate(dX, dY);
        this.p2.translate(dX, dY);
    }

    
    public float length() {
        return this.p1.distance(this.p2);
    }

    
    public boolean equals(Segment s) {
        if (s == null) {
            return false;
        }
        boolean sameOrder = this.p1.equals(s.p1) && this.p2.equals(s.p2);
        boolean reverseOrder = this.p1.equals(s.p2) && this.p2.equals(s.p1);
        return sameOrder || reverseOrder;
    }

    
    public float getSlope() {
        float dx = p2.getX() - p1.getX();
        float dy = p2.getY() - p1.getY();
        if (Math.abs(dx) < EPSILON) {
            return Float.POSITIVE_INFINITY; 
        }
        return dy / dx;
    }

    
    public float getIntercept() {
        float slope = getSlope();
        if (Float.isInfinite(slope)) {
            return Float.NaN; 
        }
        return p1.getY() - slope * p1.getX();
    }

    
    public boolean isOnLine(Point p) {
        if (p == null) {
            return false;
        }

        
        if (Float.isInfinite(getSlope())) {
            return Math.abs(p.getX() - p1.getX()) < EPSILON;
        }

        float k = getSlope();
        float b = getIntercept();
        
        return Math.abs(p.getY() - (k * p.getX() + b)) < EPSILON;
    }

  
    public boolean isOnSegment(Point p) {
        if (!isOnLine(p)) {
            return false;
        }

        float minX = Math.min(p1.getX(), p2.getX()) - EPSILON;
        float maxX = Math.max(p1.getX(), p2.getX()) + EPSILON;
        float minY = Math.min(p1.getY(), p2.getY()) - EPSILON;
        float maxY = Math.max(p1.getY(), p2.getY()) + EPSILON;

        return (p.getX() >= minX && p.getX() <= maxX) &&
               (p.getY() >= minY && p.getY() <= maxY);
    }
}