package module5;

import java.util.*;

public class Permutations {


    public static void main(String[] args) {
        // Create a set
        Set<Integer> set = new HashSet<Integer>();

        // Add some elements to the set
        set.add(1);
        set.add(2);
        set.add(3);

        List<List<Integer>> ans = permutations(set);

        ans.forEach(k->System.out.println(k));
    }

    public static List<List<Integer>> permutations(Set<Integer> items){
        List<List<Integer>> results = new LinkedList<List<Integer>>();

        permutations(items, new LinkedList<Integer>(), results);

        return results;
    }

    private static void permutations(Set<Integer> items, LinkedList<Integer> path, List<List<Integer>> results) {

        if(items.isEmpty()){

            results.add(new LinkedList<Integer>(path));
            return;
        }



        for(Integer i : items.toArray(new Integer[]{})){
            items.remove(i);
            path.add(i);
            permutations(items, path, results);
            items.add(i);
            path.remove(path.size()-1);
        }

    }
}
