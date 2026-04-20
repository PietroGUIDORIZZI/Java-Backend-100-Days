package hundredDays.phase1.day2_TemperatureConverter;

public class TemperatureConverter {
    public static void main(String[] args){
        double celsius = 25.0;
        double fahrenheit = (celsius * 9.0/5.0)+32;
        double kelvin = celsius + 273.15;

        System.out.printf("%.2fºC = %.2fºF = %.2fK%n", celsius,fahrenheit,kelvin);

        if (celsius <= 0.0) {
            System.out.println("It's Freezing!");
        } else if (celsius <= 15.0) {
            System.out.println("It's Cold.");
        } else if (celsius <= 30.0) {
            System.out.println("It's Comfortable.");
        } else {
            System.out.println("It's Hot!");
        }


    }
}
