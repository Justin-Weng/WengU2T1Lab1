public class Point {

    // instance variables
    private int x;
    private int y;

    // constructor to create a Rectangle object with a particular width and length
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // constructor to create a Rectangle object with equal width and length (a square)
    public Point(int setTo) {
        x = setTo;
        y = setTo;
    }

    // "no-argument" constructor which creates a Rectangle object with default values
    public Point() {
        x = 0;
        y = 0;
    }

    // "getter" method that returns the length of the Rectangle
    public int getX() {
        return x;
    }

    // "setter" methods that sets the length of the Rectangle to a new length
    public void setX(int newX) {
        x = newX;
    }

    // "getter" method that returns the width of the Rectangle
    public int getY() {
        return y;
    }

    // "setter" methods that sets the width of the Rectangle to a new width
    public void setY(int newY) {
        y = newY;
    }

    // calculates and returns the area of the Rectangle
    public String coordinate() {
        return "(" + x + ", " + y + ")";
    }

    public String quadrant() {
        if (x > 0 && y > 0) {
            return "I";
        } else if (x < 0 && y > 0) {
            return "II";
        } else if (x < 0 && y < 0) {
            return "III";
        } else if (x > 0 && y < 0) {
            return "IV";
        } else if (x == 0 && y == 0) {
            return "origin";
        } else {
            return "on an axis";
        }
    }
}


