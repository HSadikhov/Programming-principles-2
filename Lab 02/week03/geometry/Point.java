package week03.geometry;

public class Point {
    private float x;
    private float y;

    
    public Point() {
        this.x = 0.0f;
        this.y = 0.0f;
    }

    
    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    
    public Point(Point p) {
        if (p != null) {
            this.x = p.x;
            this.y = p.y;
        }
    }

    
    public float getX() {
        return this.x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return this.y;
    }

    public void setY(float y) {
        this.y = y;
    }

    
    public void translate(float dX, float dY) {
        this.x += dX;
        this.y += dY;
    }

    
    public float distance(Point p) {
        if (p == null) {
            return 0.0f;
        }
        float dx = this.x - p.x;
        float dy = this.y - p.y;
        return (float) Math.sqrt(dx * dx + dy * dy);
    }

    
    public boolean equals(Point p) {
        if (p == null) {
            return false;
        }
        
        final float EPSILON = 1e-6f;
        return Math.abs(this.x - p.x) < EPSILON && Math.abs(this.y - p.y) < EPSILON;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}