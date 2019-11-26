package module4;

import java.util.LinkedList;
import java.util.List;

public class CountCombinations {
    public static void main(String[] args) {


        System.out.println(countCombinations(new int[]{1, 2, 3}));
        System.out.println(combinations(new int[]{1, 2, 3}));
    }


    public static int countCombinations(int[] n) {
        return countCombinations(n, 0);
    }

    public static int countCombinations(int[] n, int i) {

        if (i == n.length) {
            return 1;
        }

        int include = countCombinations(n, i + 1);
        int exclude = countCombinations(n, i + 1);
        return include + exclude;
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
