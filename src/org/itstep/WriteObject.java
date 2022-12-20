package org.itstep;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class WriteObject {

    public static void main(String[] args) {

        String[] name = {"Nadja","Vasil","Klavdia","Luka","Oksana","Valera"};
        int[]array = new int[name.length];
        Person[]people = new Person[name.length];

        for (int i = 0; i < people.length; i++) {
            array[i]=i;
            people[i]= new Person(array[i],name[i]);
        }
        System.out.println(Arrays.toString(people));
        try (  ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("people.bin"))){
            for (Person per:people) {
                oos.writeObject(per);
            }
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
