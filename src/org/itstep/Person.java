package org.itstep;

import java.io.Serializable;

public class Person implements Serializable {
//    private transient int  id;
    private int  id;
    private String name;
    public Person(int id, String name){
        this.name=name;
        this.id=id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return id+":"+name;
    }
}
