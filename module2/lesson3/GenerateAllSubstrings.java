package module2.lesson3;

import java.util.ArrayList;
import java.util.List;

public class GenerateAllSubstrings {
    public static void main(String[] args) {
        substringsIerative("mike").forEach(s -> System.out.println(s));

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
        iterateOverFirst(s, results, 0);

        return results;
    }



    
    
}
