public class SwitchCase10 {
    public static void main(String[] args) {

        char grade = 'H';

        switch (grade) {
            case 'A':
                System.out.println("Excellent : you passed");
                break;
            case 'B':
                System.out.println("Very nice : you passed");
                break;
            case 'C':
                System.out.println("Good : you passed");
                break;
            case 'D':
                System.out.println("not bad : you passed");
                break;
            case 'F':
                System.out.println("You did not passed");
                break;
            default:
                System.out.println("You entered an invalid grade");

        }

    }
}
