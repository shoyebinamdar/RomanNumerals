import java.util.Arrays;
import java.util.Iterator;

public class RomanNumberUtils {

    RomanNumberUtils() {
        Constants.init();
    }

    public int getNumberOfDigits(int n) {
        int numberOfDigits = 0;

        while (n != 0) {
            n /= 10;
            numberOfDigits++;
        }

        return numberOfDigits;
    }

    public int getPlaceValueFactor(int n) {
        int numberOfDigits = getNumberOfDigits(n);
        return (int) Math.pow(10.0, (double) (numberOfDigits - 1));
    }

    public int getNearestMax(int n) {
        Iterator<Integer> itr = Constants.romansMap.keySet().iterator();

        int max = itr.next();
        int lastMax = 0;

        while (n >= max) {
            lastMax = max;
            if (itr.hasNext())
                max = itr.next();
            else
                break;

        }

        return lastMax;
    }

    public String getStringNTimes(char val, int n) {
        char[] chars = new char[n];
        Arrays.fill(chars, val);

        return String.valueOf(chars);
    }
}
