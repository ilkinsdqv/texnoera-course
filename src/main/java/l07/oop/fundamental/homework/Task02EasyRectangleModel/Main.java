package l07.oop.fundamental.homework.Task02EasyRectangleModel;

public class Main {
    public static void main(String[] args) {
        //Create a Rectangle class with width and height.
        //Add constructor and methods:
        //double area()
        //double perimeter()
        //Create 2 rectangles in main.
        //Print area and perimeter for each.
        Rectangle rectangle1 = new Rectangle(10, 20);
        Rectangle rectangle2 = new Rectangle(20, 40);
        System.out.println("Rectangle 1 area: " + rectangle1.area() + " perimeter: " + rectangle1.perimeter());
        System.out.println("Rectangle 2 area: " + rectangle2.area() + " perimeter: " + rectangle2.perimeter());
    }
}
