public class Main {
// switch statements for: byte, short, char, int
    public static void main(String[] args) {

        char inputVariable = 'f';
        char validatedVariable = Character.toUpperCase(inputVariable);

        switch (validatedVariable) {
            case 'A' : case 'B' : case 'C' : case 'D' : case 'E':
                System.out.println("You found the capital letter " + validatedVariable);
                break;

            default:
                System.out.println("You did not find a capital A, B, C, D or E");
                break;
        }
    }
}
