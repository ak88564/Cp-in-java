package Simple;

public class BinaryToDecimal {
    public static void main(String[] args) {
        String var1 = "10101";
        int decimal = Integer.parseInt(var1, 2);
        System.out.println(decimal);

        // Decimal to Binary
        int[] binaryDigits = new int[1000];
        int var2 = decimal;
        int i = 0;
        while(var2>0){
            binaryDigits[i] = var2%2;
            var2 = var2/2;
            i++;
        }
        for(int j = i-1;j >= 0; j--){
            System.out.println(binaryDigits[j]);
        }
    }
}
