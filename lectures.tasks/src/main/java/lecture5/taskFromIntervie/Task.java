package lecture5.taskFromIntervie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class Task {

    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        Collections.addAll(integerArrayList, 1,2,53,43,51,6,424,22,35);
        System.out.println(Task.closeNumber(integerArrayList, 30));
        System.out.println(Task.closeNumber(integerArrayList, 31));
    }

    private static int closeNumber(ArrayList<Integer> integerArrayList, int n) {
        Collections.sort(integerArrayList);
        int place = Collections.binarySearch(integerArrayList, n);
        place=Math.abs(place);
        int beforeN = integerArrayList.get(place-1);
        int afterN = integerArrayList.get(place);
        if ((Math.abs(afterN - n)) < (beforeN - n)){
            return beforeN;
        } else if ((Math.abs(afterN - n)) == (beforeN - n)) {
            return Math.max(afterN, beforeN);
        } else {
            return afterN;
        }
    }
}

