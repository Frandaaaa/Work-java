package test;

import java.util.Scanner;

public class charl {
	public static void main(String[] args){ 
	    Scanner sc = new Scanner(System.in); 
	    System.out.println("ScannerTest, Please Enter Name:"); 
	    String name = sc.nextLine();  //��ȡ�ַ��������� 
	    System.out.println("ScannerTest, Please Enter Age:"); 
	    int age = sc.nextInt();    //��ȡ�������� 
	    System.out.println("ScannerTest, Please Enter Salary:"); 
	    float salary = sc.nextFloat(); //��ȡfloat������ 
	    System.out.println("Your Information is as below:"); 
	    System.out.println("Name:" + name +"\n" + "Age:"+age + "\n"+"Salary:"+salary); 
	  }
}
