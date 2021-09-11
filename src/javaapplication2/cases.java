
package javaapplication2;
import java.util.Scanner;
public class cases {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		System.out.println("1.Factorial of an Integer Number");
		System.out.println("2.Reverse of an Integer Number");
		System.out.println("3.Check for Armstrong Number");
		System.out.println("4.Check for Number Palindrome");
		System.out.println("5.Check whether Number is Prime or not");
		System.out.println("6.Print Fibonacci series");
		System.out.println("Enter your choice");
		int choice=sc.nextInt();
                switch(choice)
		{
			case 1:int n,fact=1,i;
					System.out.println("Enter the number");
					n=sc.nextInt();
					for(i=1;i<=n;i++)
					{
						fact=fact*i;
					}
					System.out.println("Factorial="+fact);
					//break;
            case 2:int rev=0,temp;
					System.out.println("Enter the number");
					n=sc.nextInt();
					while(n!=0)
					{
						temp=n%10;
						rev=(rev*10)+temp;
						n=n/10;
												
					}
					System.out.println("Reversed number="+rev);
					//break;
            case 3:int c=0,a;  
					 
					System.out.println("Enter the number");
					n=sc.nextInt();
					temp=n;
					while(n>0)  
					{  
					a=n%10;  
					n=n/10;  
					c=c+(a*a*a);  
					}  
					if(temp==c)  
					System.out.println("armstrong number");   
					else  
					System.out.println("Not armstrong number");   
					//break;
            case 4:	int org,r=0;
					System.out.println("Enter the number");
					n=sc.nextInt();
					org=n;
					while(n!=0)
					{
						temp=n%10;
						r=(r*10)+temp;
						n=n/10;
												
					}
					if(org==r)
					System.out.println("Number is a palindrome");
					else
						System.out.println("Number is not a palindrome");
					// break;
            case 5:  int m=0,flag=0; 
					System.out.println("Enter the number");
					n=sc.nextInt();  
					m=n/2;    
					for(i=2;i<=m;i++){    
					if(n%i==0){    
					System.out.println("Number is not prime");    
					flag=1;    
					break;    
					}    
					}    
					if(flag==0)    
					System.out.println("Number is prime");   
					//break;
			case 6:	System.out.println("Enter the series");
					n=sc.nextInt();
					int n1=0,n2=1,n3=0;
					System.out.println(n1+"\t"+n2+"\t");
					for(i=0;i<n-2;i++)
					{
						n3=n1+n2;
						System.out.print(n3);
						n1=n2;
						n2=n3;
					}
					//break;
			default:System.out.println("Enter the correct choice");
                }
    }
}