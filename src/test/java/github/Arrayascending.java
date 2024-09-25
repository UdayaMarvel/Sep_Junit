package github;

public class Arrayascending {
	public static void main(String[]args) {
		int a[]= {60,100,200,400};//4-1=400
		int c;
	for(int i=0;i<a.length;i++) {
		for(int j=i+1;j<a.length;j++) {
			if(a[i]>a[j]) {//100>60,>ascending,<descending order
				c=a[i];
				a[i]=a[j];//a[i]=60
				a[j]=c;//a[j]=100
				
				}
				
		}
		System.out.println(a[i]);
	}
		
	System.out.println("minimum"+a[a.length-1]);
	}
	}

