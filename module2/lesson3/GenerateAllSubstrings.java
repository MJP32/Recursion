package module2.lesson3;

import java.util.ArrayList;
import java.util.List;

public class GenerateAllSubstrings {
    public static void main(String[] args) {
        substringsIerative("mike").forEach(s -> System.out.println(s));
        substringsReursive("mike").forEach(s -> System.out.println(s));

    }
    
    private static List<String> substringsIerative(String s){
        List<String> results = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j < s.length(); j++) {
                results.add(s.substring(i,j));
            }
        }

        return results;
    }
    private static List<String> substringsReursive(String s){
        List<String> results = new ArrayList<>();
        iterateOverFirst(s,  0, results);

        return results;
    }

    private static void iterateOverFirst(String s,  int i, List<String> results) {


        if(i==s.length()){
            return;
        }

        iterateOverSecond(s, i, i+1, results);
        iterateOverFirst(s, i+1, results);

    }
    private static void iterateOverSecond(String s,  int i, int j,List<String> results) {


        if(j>s.length()){
            return;
        }

        results.add(s.substring(i,j));
        iterateOverSecond(s, i, j+1, results);

    }


}
