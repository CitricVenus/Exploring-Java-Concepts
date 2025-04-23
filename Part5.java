import java.util.Scanner;
public class Part5 {
    public static void main(String[] args) {
        int num1;
        int num2;
        int result = 0;
        String operation;


        Scanner scanner = new Scanner(System.in);

        System.out.println("Write the first number:");
        num1 = scanner.nextInt();
        System.out.println("Write the second number");
        num2 = scanner.nextInt();
        System.out.println("What operation do you want to do? (+,-,*,/)");
        operation = scanner.next();
        if(operation.equals("+") || operation.equals("-") || operation.equals("*") || operation.equals("/")){
            switch (operation){
                case "+":
                    result = num1 + num2;
                    System.out.println(num1 + "+" + num2 + "=" +result);
                    break;
                case "-":
                    result = num1 - num2;
                    System.out.println(num1 + "-" + num2 + "=" +result);
                    break;
                case "*":
                    result = num1 * num2;
                    System.out.println(num1 + "*" + num2 + "=" +result);
                    break;
                case "/":
                    result = num1 / num2;
                    System.out.println(num1 + "/" + num2 + "=" +result);
                    break;

            }
            String aux;
            System.out.println("Do you want to decrease or increase the result? write '++' to increase or '--' to decrease");
            aux = scanner.next();
            if (aux.equals("--") || aux.equals("++")){
                switch (aux){
                    case "++":
                        System.out.printf("Increased %d ", result);
                        result++;
                        System.out.println("by 1 : " + result);
                        break;
                    case "--":
                        System.out.printf("Decrease %d ", result);
                        result--;
                        System.out.println("by 1 : " + result);
                        break;
                }
            }
        }
        scanner.close();
    }




}
