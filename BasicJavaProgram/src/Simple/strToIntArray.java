package Simple;

// Program to convert String to int array

public class strToIntArray {
    public static void main(String[] args) {
        String str1 = "12345";
        int[] newGuess = new int[str1.length()];
        for (int i = 0; i < str1.length(); i++)
        {
            newGuess[i] = str1.charAt(i) - '0';
        }
        for (int guess : newGuess) {
            System.out.println(guess);
        }

    }
}
