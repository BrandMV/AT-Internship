package com.at.internship.schedule.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Box<T> {
    private T obj;
    private void set(T obj) {
        this.obj = obj;
    }
    private T get() {
        return obj;
    }

    public static void main(String[] args) {

        List list = new ArrayList();

        Box<String> box = new Box<>();
        box.set("Hello");
        String content = box.get();
    }
}

class Util {

    public static <T> boolean equals(List<T> list1, List<T> list2) {
        if(list1 == null && list2 == null) return true;
        if(list1 == null || list2 == null || list1.size() != list2.size()) return false;
        for(T obj1 : list1) {
            Optional<T> match = list2.stream().filter(o2 -> o2 != null && o2.equals(obj1)).findAny();
            if(match.isEmpty()) return false;
        }
        return true;
    }

}

