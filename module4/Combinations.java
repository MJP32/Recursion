package module4;

import java.util.LinkedList;
import java.util.List;

public class Combinations {

    public static void main(String[] args) {
        System.out.println(combinations(new int[]{1, 2, 3}));
    }

    public static List<List<Integer>> combinations(int[] n) {
        return combinations(n, 0);
    }

    private static List<List<Integer>> combinations(int[] n, int i) {

        if (i == n.length) {
            List<List<Integer>> toReturn = new LinkedList<>();
            toReturn.add(new LinkedList<Integer>());
            return toReturn;
        }


        List<List<Integer>> toReturn = new LinkedList<>();
        for (List<Integer> result : combinations(n, i + 1)) {
            toReturn.add(new LinkedList<>(result));
            result.add(0, n[i]);
            toReturn.add(new LinkedList<>(result));

        }

        return toReturn;
    }

}
