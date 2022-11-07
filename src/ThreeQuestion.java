
import java.util.*;

public class ThreeQuestion {

    public static boolean isAnagram(String x, String y) {

        Integer resultXMap = 1;
        Integer resultYMap = 1;

        Map<Character, Integer> toPrime = new HashMap<>();
        toPrime.put('A', 1);
        toPrime.put('B', 2);
        toPrime.put('C', 3);
        toPrime.put('D', 4);
        toPrime.put('E', 5);
        toPrime.put('F', 6);
        toPrime.put('G', 7);
        toPrime.put('H', 8);
        toPrime.put('I', 9);
        toPrime.put('J', 10);
        toPrime.put('K', 11);
        toPrime.put('L', 12);
        toPrime.put('M', 13);
        toPrime.put('N', 14);
        toPrime.put('O', 15);
        toPrime.put('P', 16);
        toPrime.put('Q', 17);
        toPrime.put('R', 18);
        toPrime.put('S', 19);
        toPrime.put('T', 20);
        toPrime.put('U', 21);
        toPrime.put('V', 22);
        toPrime.put('W', 23);
        toPrime.put('X', 24);
        toPrime.put('Y', 25);
        toPrime.put('Z', 26);

        if (x.length() != y.length()) {
            return false;
        }

        Map<Character, Integer> xMap = new HashMap<>();
        for (Character ch : x.toCharArray()) {
            xMap.put(ch, xMap.getOrDefault(ch, 0) + 1);

        }

        for (Character i : toPrime.keySet()) {
            for (Character j : xMap.keySet()) {
                if (i == j) {
                    resultXMap *= toPrime.get(j).intValue();
                    System.out.println(resultXMap);
                }            }

        }

        System.out.println();


        Map<Character, Integer> yMap = new HashMap<>();
        for (Character ch : y.toCharArray())
            yMap.put(ch, yMap.getOrDefault(ch, 0) + 1);

        for (Character k : yMap.keySet()) {
            for (Character l : toPrime.keySet()) {
                if (k == l) {
                    resultYMap *= toPrime.get(k).intValue();
                    System.out.println(resultYMap);
                }

            }
        }


        if (!resultXMap.equals(resultYMap)) {

            return false;
        }


        return true;
    }

    public static void main(String[] args) {

        System.out.println(isAnagram("ENERJIK", "JENERIK"));

    }
}
