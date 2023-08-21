package myapp;

public class AmountInWords {
    private static final String[] onesPlace = {
        "", "One", "Two", "Three", "Four",
        "Five", "Six", "Seven", "Eight", "Nine"
    };

    private static final String[] teens = {
        "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen",
        "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"
    };

    private static final String[] tensPlace = {
        "", "", "Twenty", "Thirty", "Forty",
        "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
    };

    private static String convertToWords(int num) {
        if (num < 10) {
            return onesPlace[num];
        } else if (num < 20) {
            return teens[num - 10];
        } else {
            return tensPlace[num / 10] + (num % 10 != 0 ? " " + onesPlace[num % 10] : "");
        }
    }

    public static String amountInWords(int amount) {
        if (amount < 0 || amount > 100000) {
            return "Invalid amount";
        }

        if (amount == 0) {
            return "Zero";
        }

        String words = "";
        if (amount >= 1000) {
            words += convertToWords(amount / 1000) + " Thousand";
            amount %= 1000;
        }

        if (amount > 0) {
            words += (words.isEmpty() ? "" : " ") + convertToWords(amount);
        }

        return words;
    }
}
