import java.math.BigInteger;
import java.util.Scanner;
class bigtest {
BigInteger sum(String a, String b) {
BigInteger big1 = new BigInteger(a);
BigInteger big2 = new BigInteger(b);
return (big1.add(big2));
}
BigInteger sub(String a, String b) {
BigInteger big1 = new BigInteger(a);
BigInteger big2 = new BigInteger(b);
return (big1.subtract(big2));
}
BigInteger mul(String a, String b) {
BigInteger big1 = new BigInteger(a);
BigInteger big2 = new BigInteger(b);
return (big1.multiply(big2));
}
BigInteger div(String a, String b) {
BigInteger big1 = new BigInteger(a);
BigInteger big2 = new BigInteger(b);
return (big1.divide(big2));
}
public static void main(String ar[]) {
bigtest obj = new bigtest();
Scanner sc = new Scanner(System.in);
System.out.print("Enter Your Nuber :");
String s = sc.next();
System.out.print("Enter Your Nuber :");
String s1 = sc.next();
System.out.println("Addition :" + obj.sum(s, s1));
System.out.println("Subtraction :" + obj.sub(s, s1));
System.out.println("Multiplication :" + obj.mul(s, s1));
System.out.println("Division :" + obj.div(s, s1));
}
}