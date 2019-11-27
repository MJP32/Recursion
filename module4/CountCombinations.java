package module4;

import java.util.LinkedList;
import java.util.List;

public class CountCombinations {
    public static void main(String[] args) {


        System.out.println(countCombinations(new int[]{1, 2, 3}));

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





}
