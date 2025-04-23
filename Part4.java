import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Part4 {
    public static void main(String[] args) {
        int score1 = 80;
        int score2 = 90;
        int score3 = 60;
        int averageScore = (score1+score2+score3)/3;
        System.out.println("----------------------------------------------------------------");

        if(averageScore>=90){
            System.out.println("Excellent");
        }
        else if (averageScore>=70 && averageScore<=89) {
            System.out.println("Good");
        }
        else if (averageScore>= 50 && averageScore<=69) {
            System.out.println("Average");
        }
        else{
            System.out.println("Poor");
        }

        System.out.println("----------------------------------------------------------------");
        int day = 3;
        switch (day){
            case 1:
                System.out.println("Monday");
            case 2:
                System.out.println("Tuesday");
            case 3:
                System.out.println("Wednesday");
            case 4:
                System.out.println("Thursday");
            case 5:
                System.out.println("Friday");
            case 6:
                System.out.println("Saturday");
            case 7:
                System.out.println("Sunday");
        }


    }
}
