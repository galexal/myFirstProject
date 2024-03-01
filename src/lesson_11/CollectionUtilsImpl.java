package lesson_11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class CollectionUtilsImpl implements CollectionUtils {
    @Override
    public Collection<Integer> union(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        Collection<Integer> result = new ArrayList<>();
        if (a != null) {
            result.addAll(a);
        }
        if (b != null) {
            result.addAll(b);
        }
        return result;
    }

    @Override
    public Collection<Integer> intersection(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        Collection<Integer> result = new ArrayList<>();
        if (a != null && b != null) {
            for (Integer num :
                    a) {
                if (b.contains(num)) {
                    result.add(num);
                }
            }
            result.addAll(result);
        }
        return result;
    }

    @Override
    public Set<Integer> unionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        Set<Integer> result = new HashSet<>();
        if (a != null) {
            result.addAll(a);
        }
        if (b != null) {
            result.addAll(b);
        }
        return result;
    }

    @Override
    public Set<Integer> intersectionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        Set<Integer> result = new HashSet<>();
        if (a != null && b != null) {
            for (Integer num :
                    a) {
                if (b.contains(num)) {
                    result.add(num);
                }
            }
        }
        return result;
    }

    @Override
    public Collection<Integer> difference(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        Collection<Integer> result = new ArrayList<>();
        if (a != null) {
            result.addAll(a);
        }
        if (b != null) {
            for (Integer num :
                    b) {
                if (a != null && a.contains(num)) {
                    result.remove(num);
                } else {
                    result.add(num);
                }
            }
        }
        return result;
    }
}
