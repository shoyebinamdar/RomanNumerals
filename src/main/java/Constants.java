import java.util.HashMap;
import java.util.LinkedHashMap;

public class Constants {
    public static HashMap<Integer, Character> romansMap;

    public static void init() {
        romansMap = new LinkedHashMap<>();

        romansMap.put(1, 'I');
        romansMap.put(5, 'V');
        romansMap.put(10, 'X');
        romansMap.put(50, 'L');
        romansMap.put(100, 'C');
        romansMap.put(500, 'D');
        romansMap.put(1000, 'M');
    }
}
