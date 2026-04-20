package hundredDays.phase1.day6_DogClass;

public class Dog {
    String name;
    String breed;
    int age;

    void bark(){
        System.out.println(this.name + " says: woof!");
    }

    void describe(){
        System.out.println(this.name + " is a " + this.age +"-year-old " + this.breed);
    }
}
