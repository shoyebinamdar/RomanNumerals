package roman;

public class Number {

    RomanNumberUtils romanNumberUtils;

    public Number() {
        romanNumberUtils = new RomanNumberUtils();
    }

    String convertToRoman(int n) {

        if (Constants.romansMap.containsKey(n))
            return String.valueOf(Constants.romansMap.get(n));

        int placeValueFactor = romanNumberUtils.getPlaceValueFactor(n);

        if (Constants.romansMap.containsKey(n + placeValueFactor))
            return convertToRoman(placeValueFactor) + convertToRoman(n + placeValueFactor);
        else if (Constants.romansMap.containsKey(n - n % placeValueFactor + placeValueFactor))
            return convertToRoman(n - n % placeValueFactor) + convertToRoman(n % placeValueFactor);
        else {
            int nearestMax = romanNumberUtils.getNearestMax(n);
            if (n % nearestMax == 0)
                return romanNumberUtils.getStringNTimes(Constants.romansMap.get(nearestMax), n / nearestMax);
            else
                return convertToRoman(n - (n % nearestMax)) + convertToRoman(n % nearestMax);
        }
    }

    int convertFromRoman(String roman) {
        int sum = 0;
        int lastVal = Integer.MAX_VALUE;

        for (Character val : roman.toCharArray()) {
            int num = Constants.numericMap.get(val);

            if(num > lastVal)
                sum -= 2 * lastVal;
            sum += num;

            lastVal = num;
        }
        return sum;
    }


}
