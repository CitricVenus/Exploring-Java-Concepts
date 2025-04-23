public class Part2 {
    public static void main(String[] args) {
        int counter = 10;
        counter++;
        System.out.println(counter);
        counter--;
        System.out.println(counter);

        for(int i = counter ; i < 15 ; i++) {
            counter++;
            System.out.println(counter);
        }

        while(counter > 10){
            counter--;
            System.out.println(counter);
        }

    }
}
