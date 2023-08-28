public class RecapDemo9 {
    public static void main(String[] args) {
        int num1 = 21;
        int num2 = 22;
        int num3 = 13;
        int max = num1;

        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
        System.out.println("largest number is "+max);
    }
}