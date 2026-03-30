package l07.oop.fundamental.homework.Task01EasyStudentClass;

public class Student {
    public String name;
    public int age;
    public String group;
    public Student(String name, int age, String group) {
        this.name = name;
        this.age = age;
        this.group = group;
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Group: " + group);
    }
}
