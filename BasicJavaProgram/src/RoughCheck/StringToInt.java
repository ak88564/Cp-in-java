package RoughCheck;

public class StringToInt {
    public static void main(String[] args) {
//        String extHr = "07";
//        int temp = 12+Integer.parseInt(extHr);
//        System.out.println(temp);
//        System.out.println(String.valueOf(temp));
//        if((Integer.parseInt(extHr)) >= 1){
//            System.out.println("Executed");
//        }
        String s="12:45:54PM";
//        String timeZone = s.substring(8);
//        System.out.println(timeZone);
        System.out.println(timeConversion(s));
    }
    public static String timeConversion(String s) {
        // Write your code here
        String extHr = s.substring(0,2);
        String extMin = s.substring(3,5);
        String extSec = s.substring(6, 8);
        String timeZone = s.substring(8);
        StringBuilder result = new StringBuilder();
        result.append(extHr);
        result.append(":");
        result.append(extMin);
        result.append(":");
        result.append(extSec);
        if(timeZone.equals("PM")){
            System.out.println("Under if block");
            if((Integer.parseInt(extHr)) >= 1 && (Integer.parseInt(extHr))<12) {
                int temp = 12+Integer.parseInt(extHr);
                // System.out.println(temp);
                result.replace(0,2, String.valueOf(temp));
            }
        }

        if(timeZone.equals("AM")){
            if((Integer.parseInt(extHr))== 12){
                result.replace(0, 2, String.valueOf(00));
            }
        }

        return result.toString();
    }
}
