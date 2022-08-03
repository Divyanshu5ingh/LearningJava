import java.util.Scanner;

public class VowelOrConsonent_6 {

    public static void main(String[] args) {
        System.out.println("Enter Alphabet: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char ch = str.charAt(0);

        switch (ch) {
            case 'a':
            case 'A':
            case 'e':
            case 'E':
            case 'i':
            case 'I':
            case 'o':
            case 'O':
            case 'u':
            case 'U':
                System.out.println("Entered alphabet is a Vowel");
                break;
            default:
                System.out.println("Entered alphabet is a Consonent");

        }
    }
}
