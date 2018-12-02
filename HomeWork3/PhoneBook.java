package HomeWork3;

import java.util.ArrayList;
import java.util.HashMap;

public class PhoneBook {
    HashMap <String, ArrayList <String>> phoneBook = new HashMap<>();

    public void add(String name, String tel) {
        ArrayList <String> telL = phoneBook.get(name);
        if (telL == null)
             telL = new ArrayList<>();
        telL.add(tel);
        phoneBook.put(name, telL);
    }

    public ArrayList <String> get (String name) {
        return phoneBook.get(name);
    }

    public void info() {
        System.out.println(phoneBook);
    }
}
