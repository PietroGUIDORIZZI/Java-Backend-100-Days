package hundredDays.phase1.day4_GradeCalculator;
import java.util.Scanner;
public class GradeCalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input your test score: ");
        int score = sc.nextInt();
        char grade;
        boolean atRisk = score<=60;
        if (score >= 90){
            grade = 'A';

        }else if(score >= 80 ){
            grade = 'B';

        }else if(score >= 70){
            grade = 'C';

        }else if(score >= 60){
            grade = 'D';

        }else {
            grade = 'F';

        }
        System.out.println("Score: " + score);
        System.out.println("Grade: " + grade);
        System.out.println("At risk: " + atRisk);
    }
}
