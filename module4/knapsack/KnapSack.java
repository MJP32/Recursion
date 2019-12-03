package module4.knapsack;

import java.util.LinkedList;
import java.util.List;

public class KnapSack {


    public static void main(String[] args) {

    }
    /*public static List<Item> knapsack(Item[] items, int totalWeight ){
        List<List<Item>> results= new LinkedList<List<Item>>();

        knapsack(items, 0, new LinkedList<Item>(), results);


        List<Item> maxlist = null;
        int max = Integer.MIN_VALUE;


        for(List<Item> l : results){

            int weight =0;
            int value = 0;


        }
    }

    private static void knapsack(Item[] items, int i, LinkedList<Item> path, List<List<Item>> results) {


        if(i==items.length){
            results.add(new LinkedList<Item>(path));
            return;
        }
        knapsack(items,i+1,path,results);
        path.add(items[i]);

        knapsack(items,i+1,path,results);
        path.remove(path.size()-1);
    }*/
}
