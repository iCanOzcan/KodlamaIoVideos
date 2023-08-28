public class MiniProject19 {
    public static void main(String[] args) {
        int num = 29;
        boolean isPrime = true;

        if(num==1){
            System.out.println("number is not prime");
            return;
        }
        if(num<1){
            System.out.println("invalid number");
            return;
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime = false;
            }
        }
        if(isPrime){
            System.out.println("number is prime");
        }
        else {
            System.out.println("number is not prime");
        }

    }
}
