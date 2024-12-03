package github;

public class Prime {
		public static void main(String args) {
			int number=11;
			int count=0;
			for (int i=2;i<number/2;i++) {
				if (number%i==0) {
					count=1;
				}
			}
			
			if(count==0) {
				System.out.println("Prime Number:"+number);
			}
			else {
				System.out.println("Not a Prime Number:"+number);
			}
		}}

