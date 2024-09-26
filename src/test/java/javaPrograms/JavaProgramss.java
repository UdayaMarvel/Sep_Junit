package javaPrograms;

import java.util.Scanner;

public class JavaProgramss {
	
	public void armstrogNumber(int no) {
		
		int originalNumber = no;
		int numberOfDigits = 0 , result = 0;


        int temp = no;
        while (temp != 0) {
            temp = temp / 10;
            numberOfDigits++;
        }

        temp = no;
        while (temp != 0) {
            int remainder = temp % 10;
            int power = 1;
            for (int i = 0; i < numberOfDigits; i++) {
                power = power *remainder;
            }
            result = result + power;
            temp = temp / 10;
        }

        if (result == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }
        
     
    }


	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		JavaProgramss jp = new JavaProgramss();
		
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		jp.armstrogNumber(num);
		
		
		
	}

}
