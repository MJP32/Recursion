package module4.combinations;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Combinations {
    public static void main(String[] args) {
        combinations(new int[]{1,2,3,4}).forEach(k -> System.out.println(k));
    }
    public static List<List<Integer>> combinations(int[] n){
        return combinations(n,0);
    }

    private static List<List<Integer>> combinations(int[] n, int i) {

        if(i == n.length){
            List<List<Integer>> toReturn = new ArrayList<>();
            toReturn.add(new LinkedList<>());
            return toReturn;
        }

        List<List<Integer>> toReturn = new ArrayList<>();
        for(List<Integer> result : combinations(n, i+1)){
            toReturn.add(new LinkedList<Integer>(result));
            result.add(0,n[i]);
            toReturn.add(new LinkedList<Integer>(result));
        }


        return toReturn;

    }

}
