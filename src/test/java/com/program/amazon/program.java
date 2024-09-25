package com.program.amazon;

import java.util.Scanner;

public class program {
public static void main(String[] args) {
		
		
		int a,num=0,count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		
	num= sc.nextInt();
		if(num==0||num==1) {
			System.out.println(num+" number is not prime number"); 
		
		}
			else {
				for(a=2;a<=num/2;a++) {
					if(num%a==0) {
						
						System.out.print(num+" number is not prime");
						count = 1;
						break;
						}}
					if(count==0) {
						System.out.println(num+" number is prime");}}
					
					}
	

}
