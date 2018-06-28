package shubh;
import java.util.Scanner;
public class puzzleOfFRIENDS {

	public static void main(String[] args) {
int a,b;
String x,y;
Scanner sc=new Scanner(System.in);
System.out.println("Welcome to the Quiz of F.R.I.E.N.D.S");
System.out.println();
System.out.println("There are  two simple one word question");
System.out.println();
System.out.println("Let's start");


System.out.println();
System.out.println("How many Thanksgiving are in whole serial");
a=sc.nextInt();
if(a==10) {
	System.out.println("Your answer is correct");
}
else
	System.out.println("sorry answer is incorrect. you loose ");
System.out.println();

System.out.println("How many episode in  season 10");
b=sc.nextInt();
if(b==18) {
	System.out.println("Your answer is correct");
}
else
	System.out.println("sorry answer is incorrect. you loose ");
System.out.println();
System.out.println("END");
System.out.println();
System.out.println("Thank you for playing");
	
}
	

}
