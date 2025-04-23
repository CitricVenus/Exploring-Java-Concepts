import java.util.Scanner;
public class DragonCave {
    public static void main(String[] args) {
        int desicion;
        Scanner scanner = new Scanner(System.in);

        System.out.println("You are in a land full of dragons. In front of you,\n" +
                "You see two caves. In one cave, the dragon is friendly\n" +
                "and will share his treasure with you. The other dragon\n" +
                "is greedy and hungry and will eat you on sight.");


        System.out.println("Which cave will you go into? (1 or 2)");
        desicion = scanner.nextInt();
        if (desicion == 1){
            System.out.println("You approach the cave…");
            System.out.println("It is dark and spooky…");
            System.out.println("A large dragon jumps out in front of you!");
            System.out.println("He opens his jaws and…");
            System.out.println("Gobbles you down in one bite!");
        }else{
            System.out.println("You approach the cave…");
            System.out.println("It is dark and spooky…");
            System.out.println("A large dragon jumps out in front of you!");
            System.out.println("He smile and surprise! He give to you all the treasure");
        }
        scanner.close();
    }
}
