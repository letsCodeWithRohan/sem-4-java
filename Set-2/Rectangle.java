class Rectangle {

    private int width, height;

    Rectangle(){
        this.width = 10;
        this.height = 5;
    }

    Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }

    public int getArea(){
        return (this.width * this.height);
    }

    public int getPerimeter(){
        return 2 * (this.width + this.height);
    }

    public static void main(String[] args){
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(7,3);
        System.out.println("Area of Rectangle 1 : " + r1.getArea());
        System.out.println("Perimeter of Rectangle 1 : " + r1.getPerimeter());
        System.out.println("Area of Rectangle 2 : " + r2.getArea());
        System.out.println("Perimeter of Rectangle 2 : " + r2.getPerimeter());
    }
}