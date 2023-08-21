package myapp;

public class ConvertAmountToWords{
    public static void main(String[] args) {
        int amount = 56789;
        String amountWords = AmountInWords.amountInWords(amount);
        System.out.println("Amount in words: " + amountWords);
    }
}

