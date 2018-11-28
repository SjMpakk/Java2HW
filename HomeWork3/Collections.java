package HomeWork3;

/**
 *
 * Java Home Work 3
 *
 * @author Denisov Alexey
 *
 * @version dated Nov 28, 2018
 */

import java.util.HashMap;

public class Collections {
    public static void main(String[] args) {


        String[] words = {"air", "animal", "answer", "area", "bird", "air", "book", "car", "area",
                "city", "dog", "dog", "dog"};
        HashMap<String, Integer> hm = new HashMap<>();
        for (String word : words) {
            Integer count = hm.get(word);
            hm.put(word, count == null ? 1 : count + 1);
        }
        System.out.println(hm);


        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Max", "89271112233");
        phoneBook.add("Rex", "89272223344");
        phoneBook.add("Max", "89273334455");
        phoneBook.add("Sam", "89274445566");

//        phoneBook.info();

        System.out.println("Max's phones; " + phoneBook.get("Max"));

    }
}