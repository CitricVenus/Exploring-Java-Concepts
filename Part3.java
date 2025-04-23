import java.util.Scanner;
public class Part3 {
    public static void main(String[] args) {

        String firstName;
        String lastName;
        String fullName;
        String fullNameUppercase;
        int counter = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first name:");
        firstName = scanner.nextLine();
        System.out.println("Enter your last name:");
        lastName = scanner.nextLine();

        fullName = firstName +" "+ lastName;
        fullNameUppercase = fullName.toUpperCase();

        char firstCharacter = fullNameUppercase.charAt(0);

        for (int i = 0; i < fullNameUppercase.length(); i++) {
            if (fullNameUppercase.charAt(i) == firstCharacter){
                counter++;
            }
        }
        System.out.printf("Full name: %s\nUppercase full name: %s\nNumber of times %s appears: %d",fullName, fullNameUppercase,firstCharacter,counter);
        scanner.close();
    }
}
