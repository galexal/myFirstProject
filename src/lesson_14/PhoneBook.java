package lesson_14;

import java.util.*;

public class PhoneBook {
    private static PhoneBook instance;
    private Map<String, Set<String>> book = new HashMap<>();

    private PhoneBook() {
    }

    public static PhoneBook getInstance() {
        if (instance == null) {
            instance = new PhoneBook();
        }
        return instance;
    }

    public void addNumber(String lastName, String phoneNumber) {
        if (book.containsKey(lastName)) {
            book.get(lastName).add(phoneNumber);
        } else {
            book.put(lastName, new HashSet<>(List.of(phoneNumber)));
        }
    }

    public Set<String> getNumber(String lastName) {
        return book.get(lastName);
    }
}
