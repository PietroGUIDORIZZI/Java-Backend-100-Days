package hundredDays.phase1.day1_PersonalPrinter;



public class PersonalInfoPrinter {
    static void main(String[] args) {
        String name = "Pietro";
        int ageYears = 31;
        int heightCm = 177;
        boolean isStudent = false;
        boolean birthDayThisYear = true;
        char grade = 'A';
        boolean internshipAble = ableToInternship(grade);
        int birthYear = calculate(ageYears, birthDayThisYear);
        System.out.println("===========Personal Info Printer==========");
        System.out.printf("Name: %-30s\n", name);
        System.out.printf("Birth Year: %-30d\n", birthYear);
        System.out.printf("Age: %-30d\n", ageYears);
        System.out.printf("Height: %-30d\n", heightCm);
        System.out.printf("Enrolled: %-30b\n", isStudent);
        System.out.printf("Grade: %-30c\n", grade);
        System.out.printf("Able to Internship: %-30b\n", internshipAble);
        //'%n' is better than unix hardcoded '\n' for all OS's
        if(internshipAble){
            System.out.println(name+ ", you are eligible for this opportunity.\nMake it worth!");
        }


    }

    static int calculate(int ageYears, boolean birthDayThisYear) {
        int birthYear = 2026 - ageYears;
        if(!birthDayThisYear){
            birthYear -= 1;
        }
        return birthYear;
    }
    static boolean ableToInternship(char grade){
        //simplified logic
        return grade == 'A'|| grade == 'a';
    }

}
