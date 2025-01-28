import java.util.Scanner;
class banktrasaction {
String user, pswd;
double amount;
double deposit[] = new double[10];
double withdraw[] = new double[10];
banktrasaction() {
Scanner s1 = new Scanner(System.in);
System.out.print("Enter Username :");
this.user = s1.next();
System.out.print("Enter Password :");
this.pswd = s1.next();
System.out.print("Enter opening Amount :");
this.amount = s1.nextDouble();
this.deposit[0] = this.amount;
}
}
class banktransaction {
public static void main(String args[]) {
String c, user_name, pass;


int ch, user_no = 0, i;
int l[] = new int[10];
int m[] = new int[10];
banktrasaction a[] = new banktrasaction[5];
Scanner sc = new Scanner(System.in);
do {
System.out.println("********Welcome to Banking********");
System.out.println("-----------Transaction-----------");
System.out.println(" ********* ");
System.out.println("\n1. Manager\n2. Account User");
System.out.print("Enter your Choice :");
ch = sc.nextInt();
switch (ch) {
case 1: {
System.out.println(" *********** ");
System.out.println(" Manager Action ");
System.out.println(" ************ ");
System.out.print("Enter Number of Users You want to add :");
user_no = sc.nextInt();
for (i = 0; i < user_no; i++) {
System.out.println("Enter Details of User " + (i + 1));
a[i] = new banktrasaction();
l[i] = 1;
m[i] = 0;
}
break;
}
case 2: {
System.out.println(" ******** ");
System.out.println(" Login Menu ");
System.out.println(" ******** ");
System.out.print("Enter Username:");
user_name = sc.next();
System.out.print("Enter Password:");
pass = sc.next();
for (i = 0; i < user_no; i++) {
if ((a[i].user.equals(user_name)) && (a[i].pswd.equals(pass))) {
do {
System.out.println(" ******* ");
System.out.println(" User Menu ");
System.out.println(" ******* ");
System.out.println("\n1.Balance Check\n2. Withdraw Amount\n3.Deposit Amount\n4.Mini
Statement\n5. Exit");
System.out.print("Enter your Choice :");
ch = sc.nextInt();
switch (ch) {
case 1: {
System.out.println("Your Balance is : +a[i].amount);
break;
}
case 2: {
double w;
System.out.println("Enter Amount you want to Withdraw : ");
w = sc.nextDouble();
if (w <= a[i].amount) {
a[i].withdraw[m[i]] = w;
a[i].amount = a[i].amount - a[i].withdraw[m[i]];
System.out.println("Transaction is Successfull.");
m[i]++;
} else {
System.out.println("Insufficient Amount.");
}
break;
}
case 3: {
System.out.println("Enter Amount you want to Deposit : ");
a[i].deposit[l[i]] = sc.nextDouble();
a[i].amount = a[i].amount + a[i].deposit[l[i]];
System.out.println("Transaction is Successfull.");
l[i]++;
break;
}
case 4: {
System.out.println(" Mini Statement ");
System.out.println("User Name : " + a[i].user);
System.out.println("\nWithdraw Transactions : ");
for (int s = 0; s < m[i]; s++) {
System.out.println("\t Withdraw Amount : " + (s + 1) + "\t" a[i].withdraw[s]);
}
System.out.println("\nDeposit Transactions : ");
for (int s = 0; s < l[i]; s++) {
System.out.println("\t Deposit Amount : " + (s + 1) + "\t" + a[i].deposit[s]);
}
System.out.println("\nAvailable Amount : " + a[i].amount);
break;
}
case 5: {
System.exit(0);
break;
}
default:
System.out.println("Wrong Choice...");
}
System.out.print("Do you want to Log Out...(Y/N)");
c = sc.next();
} while ((c.equalsIgnoreCase("n")) ||
(c.equalsIgnoreCase("N")));
} else {

System.out.println("Wrong Username or Password");
}
}
break;
}
default:
System.out.println("Wrong Choice.");
}
System.out.println("Do You Continue Main Menu..(Y/N)");
c = sc.next();
}
while ((c.equalsIgnoreCase("y")) || (c.equalsIgnoreCase("Y")));
}
}
