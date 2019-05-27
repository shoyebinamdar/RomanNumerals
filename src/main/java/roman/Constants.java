package roman;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Constants {
    public static HashMap<Integer, Character> romansMap;
    public static HashMap<Character, Integer> numericMap;


    public static void init() {
        romansMap = new LinkedHashMap<>();
        numericMap = new LinkedHashMap<>();

        romansMap.put(1, 'I');
        romansMap.put(5, 'V');
        romansMap.put(10, 'X');
        romansMap.put(50, 'L');
        romansMap.put(100, 'C');
        romansMap.put(500, 'D');
        romansMap.put(1000, 'M');

        numericMap.put('I', 1);
        numericMap.put('V', 5);
        numericMap.put('X', 10);
        numericMap.put('L', 50);
        numericMap.put('C', 100);
        numericMap.put('D', 500);
        numericMap.put('M', 1000);
    }
}
