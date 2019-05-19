import java.util.*;

public class Number {

    HashMap<Integer, String> romansMap;
    List<Integer> exceptionalNumbers;
    public Number() {
        romansMap = new LinkedHashMap<>();
        exceptionalNumbers = new ArrayList<>();

        romansMap.put(5, "V");
        romansMap.put(10, "X");
        romansMap.put(50, "L");

        exceptionalNumbers.add(49);
    }

    String convertToRoman(int n) {
        if (n <= 3)
            return getStringNTimes("I", n);
        else {
            if (romansMap.containsKey(n))
                return romansMap.get(n);

            if(romansMap.containsKey(n + 1) && !exceptionalNumbers.contains(n))
                return convertToRoman(1) + convertToRoman(n + 1);
            else if (romansMap.containsKey(n + 10))
                return convertToRoman(10) + convertToRoman(n + 10);
            else {
                int nearestMax = getNearestMax(n);
                if (n % nearestMax == 0)
                    return getStringNTimes(romansMap.get(nearestMax), n / nearestMax);
                else
                    return convertToRoman(n - (n % nearestMax)) + convertToRoman(n % nearestMax);
            }
        }
    }

    private int getNearestMax(int n) {
        Iterator<Integer> itr = romansMap.keySet().iterator();

        int max = itr.next();
        int lastMax = 0;

        while (n >= max) {
            lastMax = max;
            if( itr.hasNext() )
                max = itr.next();
            else
                break;

        }

        return lastMax;
    }
    private String getStringNTimes(String str, int n) {
        String appendedString = "";

        for (int i = 0; i < n; i++) {
            appendedString += str;
        }

        return appendedString;
    }
}
