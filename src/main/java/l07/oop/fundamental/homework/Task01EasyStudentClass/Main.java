package l07.oop.fundamental.homework.Task01EasyStudentClass;

public class Main {
    public static void main(String[] args) {
        //Create a Student class with fields: name, age, group.
        //Add a constructor for all fields.
        //Add method printInfo() to print student details.
        //In main, create at least 2 Student objects and print both.
        Student student1 = new Student("Ayxan", 19, "A655.1");
        Student student2 = new Student("Elxan", 23, "A645.2");
        student1.printInfo();
        student2.printInfo();
    }
}
