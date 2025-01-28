import java.util.Scanner;
public class EmployeeInfo {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter employee name: ");
String name = scanner.nextLine();
System.out.print("Enter employee age: ");
int age = scanner.nextInt();
scanner.nextLine(); // Consume the remaining newline character
System.out.print("Enter employee blood group: ");
String bloodGroup = scanner.nextLine();
System.out.print("Enter employee height (in cm): ");
double height = scanner.nextDouble();
System.out.println("\nEmployee Information");
System.out.println("Name: " + name);
System.out.println("Age: " + age);
System.out.println("Blood Group: " + bloodGroup);
System.out.println("Height: " + height + " cm");
scanner.close();
}
}