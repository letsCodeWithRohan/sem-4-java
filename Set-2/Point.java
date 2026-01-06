/* 2.4 Create a Point class representing a 2D point (x, y). Implement a default constructor that initializes both x and y to 5. 
Provide a parameterized constructor to initialize x and y with user-supplied values. 
Also, implement a copy constructor to create a new Point object as a
copy of an existing Point object. Include a display() method to show the point's coordinates 
and write a main method to test all constructors and the display functionality. */

class Point {
    int x, y;

    Point(){
        this.x = 5;
        this.y = 5;
    }

    Point(int x,int y){
        this.x = x;
        this.y = y;
    }

    Point(Point p){
        this.x = p.x;
        this.y = p.y;
    }

    private void display(){
        System.out.println("x : " + this.x + " and y : " + this.y);
    }

    public static void main(String[] args){
        Point p1, p2, p3;
        p1 = new Point();
        p2 = new Point(4,3);
        p3 = new Point(p2);
        p1.display();
        p2.display();
        p3.display();
    }
}