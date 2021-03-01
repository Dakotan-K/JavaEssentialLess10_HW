package task2;

import java.util.ArrayList;
import java.util.List;

public class MyList<T> {
    List<T> list = new ArrayList<>();

    public List<T> getList() {
        return list;
    }

    public void add(T a) {
        list.add(a);
    }

    public int index (T a) {
        return list.indexOf(a);
    }

    public int counter () {
        return list.size();
    }
}
