import java.util.ArrayList;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetCase {
    private SortedSet<Integer> set = new TreeSet<>();

    public static void main(String[] args) {

        SetCase setCase = new SetCase();
        setCase.addToSet();
        System.out.println(setCase.getNextElem(5));
        setCase.getPrevElems(5);
        System.out.println(setCase.getNextElem(6));
        setCase.getPrevElems(6);
    }

    private void addToSet() {
        for (int i = 1; i < 11; i++) {
            this.set.add(i);
        }
    }

    private Integer getNextElem(Integer elem) {
        Iterator<Integer> iterator = set.iterator();
        for (Integer integer : set) {
            iterator.next();
            if (integer.equals(elem)) {
                return iterator.next();
            }
        }
        return null;
    }

    private void getPrevElems(Integer elem) {
        boolean flag = false;
        Iterator<Integer> iterator = set.iterator();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (Integer integer : set) {
            iterator.next();
            if (integer.equals(elem)) {
                flag = true;
            }
            if (!flag) {
                arrayList.add(integer);
            }
        }
        if (flag) {
            for (Integer integer : arrayList) {
                System.out.println(integer);
            }
        }
    }
}
