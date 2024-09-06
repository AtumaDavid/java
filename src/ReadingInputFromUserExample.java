import java.util.Scanner;

public class ReadingInputFromUserExample   {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
//        name
        System.out.print("Enter Your Name: ");
        String name = scanner.nextLine();
//        age
        System.out.print("Enter Your Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
//        gender
        System.out.print("Enter Your Gender(M/F): ");
        char gender = scanner.nextLine().charAt(0);
//        phone number
        System.out.print("Enter Your Phone Number: ");
        double  contact = scanner.nextDouble();


        System.out.println("name: " + name);
        System.out.println("age: " + age);
        System.out.println("gender: " + gender);
        System.out.println("Number: " + contact);

        scanner.close();
    }
}
