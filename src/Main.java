import java.util.Date;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");

//        primitive data types
        byte age = 23;
        long viewsCount = 1_112_345_678;
        float price = 234.56F;
        char gender = 'M';
        boolean isValid = true;
        System.out.println(age);
        System.out.println(viewsCount);
        System.out.println(gender);
        System.out.println(price);
        System.out.println(isValid);

//        Non-primitive Data Types
        String name = "David Atuma";
        System.out.println(name);
        Date now = new Date();
        System.out.println(now);
    }
}