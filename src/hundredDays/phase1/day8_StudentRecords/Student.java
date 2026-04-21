package hundredDays.phase1.day8_StudentRecords;

public class Student {
    private final String name;
    private int age;
    private double gpa;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gpa=" + gpa +
                '}';
    }

    public Student(String name, int age, double gpa) {
        this.name = name;
        if (age >= 16 && age <= 100) {
            this.age = age;
        }
        if (gpa >= 0.0 && gpa <= 4.0) {
            this.gpa = gpa;
        }

    }

    public String getName() {
        return name;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 16 && age <= 100) {
            this.age = age;
        } else {
            System.out.println("Invalid age: " + age);
        }
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        if (gpa >= 0.0 && gpa <= 4.0) {
            this.gpa = gpa;
        } else {
            System.out.println("Invalid GPA: " + gpa);
        }
    }
}
