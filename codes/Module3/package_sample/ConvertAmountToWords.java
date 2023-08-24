package myapp;

public class ConvertAmountToWords{
    public static void main(String[] args) {
        int amount = 189;
        String amountWords = AmountInWords.amountInWords(amount);
        System.out.println("Amount in words: " + amountWords);
    }
}

