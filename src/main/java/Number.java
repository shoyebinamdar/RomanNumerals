import java.util.*;

public class Number {

    HashMap<Integer, String> romansMap;

    public Number() {
        romansMap = new LinkedHashMap<>();

        romansMap.put(1, "I");
        romansMap.put(5, "V");
        romansMap.put(10, "X");
        romansMap.put(50, "L");
        romansMap.put(100, "C");
        romansMap.put(500, "D");
        romansMap.put(1000, "M");
    }

    String convertToRoman(int n) {
        if (n <= 3)
            return getStringNTimes(romansMap.get(1), n);
        else {
            if (romansMap.containsKey(n))
                return romansMap.get(n);

            int numberOfDigits = getNumberOfDigits(n);
            int placeValueFactor = (int)Math.pow(10.0, (double)(numberOfDigits - 1));

            if(romansMap.containsKey(n + placeValueFactor))
                return convertToRoman(placeValueFactor) + convertToRoman(n + placeValueFactor);
            else if(romansMap.containsKey(n - n % placeValueFactor + placeValueFactor))
                return convertToRoman(n - n % placeValueFactor) + convertToRoman(n % placeValueFactor);
            else {
                int nearestMax = getNearestMax(n);
                if (n % nearestMax == 0)
                    return getStringNTimes(romansMap.get(nearestMax), n / nearestMax);
                else
                    return convertToRoman(n - (n % nearestMax)) + convertToRoman(n % nearestMax);
            }
        }
    }

    private int getNumberOfDigits(int n) {
        int numberOfDigits = 0;

        while (n != 0) {
            n /= 10;
            numberOfDigits++;
        }

        return numberOfDigits;
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
        return new String(new char[n]).replace("\0", str);
    }
}
