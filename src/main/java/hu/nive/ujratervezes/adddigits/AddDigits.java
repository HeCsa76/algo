package hu.nive.ujratervezes.adddigits;

public class AddDigits {

    public static int addDigits(String input) {
        int sum = 0;
        int num;
        char character;
        if (input == null || input == "") {
            return -1;
        }
        for (int i = 0; i < input.length(); i++) {
            character = input.charAt(i);
            if (Character.isDigit(character)) {
                num = Character.getNumericValue(character);
                sum += num;
            }
        }
        return sum;
    }
}