package org.itstep;
import java.io.*;

public class ReadObject {
    public static void main(String[] args) {
        try( ObjectInputStream ois = new ObjectInputStream(new FileInputStream("people.bin"))) {
            Person[]people= new Person[6];
            for (int j = 0; j < people.length; j++) {
                people[j]= (Person)ois.readObject();
            }
            for (Person per:people) {
                System.out.print(per+"\t");
            }

//            ois.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
