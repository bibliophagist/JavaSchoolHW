package lecture7;

import java.util.ArrayList;
import java.util.List;

public class WildCards {

    public static <T> void addAll(ArrayList<? extends T> src, ArrayList<? super T> dest) {
        dest.addAll(src);
    }

    public static <T extends CanCalcDistance<? super T> & Comparable<? super T>> T findMax(final List<? extends T> container, final T target) {
        T max = container.get(0);
        for (T objectFromContainer : container) {
            if (objectFromContainer.compareTo(max) == 1) {
                max = objectFromContainer;
            }
        }
        return max;
    }

    public int countContains(ArrayList<?> src, Object element) {
        int count = 0;
        for (Object object : src) {
            if (object.equals(element)) {
                count++;
            }
        }
        return count;
    }
}
