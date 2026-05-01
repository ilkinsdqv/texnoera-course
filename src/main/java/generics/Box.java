package generics;

public class Box <T>{
    //Bir Box<T> class-ı yaradın. Class daxilində bir dənə T tipli field olsun. Bu field üçün set və get metodları yazın. Məqsəd: generic class anlayışını başa düşmək.
    T  box;
    public Box(T box) {
        this.box = box;
    }

    public T getBox() {
        return box;
    }
    public void setBox(T box) {
        this.box = box;
    }
}
