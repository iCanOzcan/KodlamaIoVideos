public class MiniProject20 {
    public static void main(String[] args) {
        char letter = 'İ';
        switch (letter) {
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Girilen harf kalin unlu harftir");
                break;
            case 'E':
            case 'İ':
            case 'Ö':
            case 'Ü':
                System.out.println("Girilen harf ince unlu harftir");
                break;
            default:
                System.out.println("Girilen harf sessiz harftir");
        }

    }
}
