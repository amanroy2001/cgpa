package codewithaman;
import java.util.Scanner;
public class cgpa {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner (System.in);
		System.out.println("please enter your name");
		String name=sc.next();
		System.out.println("please enter the marks of subject 1");
		System.out.println("please enter the marks of subject 2");
		System.out.println("please enter the marks of subject 3");
		double s1=sc.nextDouble();
		double s2=sc.nextDouble();
		double s3=sc.nextDouble();
    
		double cgpa=(s1+s2+s3)/300;
		cgpa=cgpa*9.5;
		System.out.println("Name "+name);
		System.out.println("your converted cgpa is "+cgpa);
	}

}
