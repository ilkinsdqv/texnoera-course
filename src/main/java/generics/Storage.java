package generics;

import java.util.List;

public class Storage<T> {
    //Storage<T> adlı class yaradın. Daxilində List<T> saxlasın. Aşağıdakı metodları yazın:
    //add(T item)
    //getAll()
    public List<T> list;

    public void add(T item) {
        list.add(item);
    }

    public List<T> getAll() {
        return list;
    }
}
