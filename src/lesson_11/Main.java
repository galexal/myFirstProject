package lesson_11;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        List<Integer> list2 = new ArrayList<>(List.of(4, 5, 6, 7));

        CollectionUtils collectionUtils = new CollectionUtilsImpl();

        System.out.println(collectionUtils.union(list1, list2));
        System.out.println(collectionUtils.intersection(list1, list2));
        System.out.println(collectionUtils.unionWithoutDuplicate(list1, list2));
        System.out.println(collectionUtils.intersectionWithoutDuplicate(list1, list2));
        System.out.println(collectionUtils.difference(null, null));
    }
}
