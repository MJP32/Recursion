package module4.combinations;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CountCombinationsPassedVariable {
    public static void main(String[] args) {

    }
    public static List<List<Integer>> combinations(int[] n){

        List<List<Integer>> results = new LinkedList<>();
        combinations(n,0, results, new LinkedList<Integer>());
        return results;
    }

    private static void combinations(int[] n, int i, List<List<Integer>> results, LinkedList<Integer> path) {


    }

}
