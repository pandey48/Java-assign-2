package assinment;
import java.util.*;
public class Assign2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Question no  1
       int a,b,c;
       System.out.println("enter a no 3 ");
       Scanner sc =new Scanner(System.in);
       
       a=sc.nextInt();
       b=sc.nextInt();
       c=sc.nextInt();
       
       if((a>b) &&(a>c) ) {
    	   System.out.println("A is greater  ");
    	   
       }
       else if((b>a && b>c)) {
    	   System.out.println(" B is greater ");
       }
       else {
    	   System.out.println(" C is greater");
       }
		
		//Question on no 2
		float a;
		Scanner sc =new Scanner(System.in);
		System.out.println("enter a studendt Marks");
		a=sc.nextFloat();
		if(a>=75 && a<=100) {
			System.out.println(" pass in A gread");
			
		}
		else if(a>=60 && a<75) {
			System.out.println(" Pass in B gread");
			}
		else if(a>=45 && a<60) {
			System.out.println(" pass in C gread");
		}
		else if(a>=33 && a<45 ) {
			System.out. println(" pass in D gread");
		}
		else if(a>=0 && a<33) {
			System.out.println(" Fail");
			
		}
		else {
			
			System.out.println(" enter a valid marks 0 to 100");
		}
		// Question no 3
		 Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the name of the month:");
	        String month = sc.nextLine().trim();

	        switch(month) {
	            case "January":
	                System.out.println("31 days");
	                break;
	            case "February":
	                System.out.println("28 or 29 days");
	                break;
	            case "March":
	                System.out.println("31 days");
	                break;
	            case "April":
	                System.out.println("30 days");
	                break;
	            case "May":
	                System.out.println("31 days");
	                break;
	            case "June":
	                System.out.println("30 days");
	                break;
	            case "July":
	                System.out.println("31 days");
	                break;
	            case "August":
	                System.out.println("31 days");
	                break;
	            case "September":
	                System.out.println("30 days");
	                break;
	            case "October":
	                System.out.println("31 days");
	                break;
	            case "November":
	                System.out.println("30 days");
	                break;
	            case "December":
	                System.out.println("31 days");
	                break;
	            default:
	                System.out.println("Invalid month name. Please enter a valid month.");
	                break;
	        }	}
		// Question no 4
		 Scanner sc =  new Scanner(System.in);
	        int a=sc.nextInt();
	         int temp=a;
	        int c=0;

	        while(temp!=0){
	            int x=temp%10;
	            c= c*10+x;
	            temp=temp/10;

	        }

	        if(a==c){
	            System.out.println("palindrom");
	        }else{
	            System.out.println("not palindrom");
	        }
	        
	        //Question no 5
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the value of n: ");
	        int n = sc.nextInt();

	        int a = 0;
	        int b = 1;

	        int nthFibonacci = 0;

	        if (n == 1) {
	            nthFibonacci = a;
	        } else if (n == 2) {
	            nthFibonacci = b;
	        } else {
	            for (int i = 3; i <= n; i++) {
	                nthFibonacci = a + b;
	                a = b;
	                b = nthFibonacci;
	            }
	        }

	        System.out.println("The " + n + "th Fibonacci number is: " + nthFibonacci);

	    }
	    //Question  no 6
	    
	    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int temp = n;
        int digit = 0;
        while(temp!=0){
            digit++;
            temp = temp/10;
        }
        temp = n;
        int sum=0;

        while(temp!=0){
            int c = temp%10;
            sum+=Math.pow(c,digit);
            temp/=10;
        }
        if (sum == n) {
            System.out.println( " is an Armstrong number.");
        } else {
            System.out.println(" is not an Armstrong number.");
        }
        Question no 7
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            System.out.println(n*i);
        }
        
        //Question no 8
         *  int n=5;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        Question no 9
         Scanner sc =  new Scanner(System.in);
        int a=sc.nextInt();
         int temp=a;
        int c=0;

        while(temp!=0){
            int x=temp%10;
            c= c*10+x;
            temp=temp/10;

        }

        if(a==c){
            System.out.println("palindrom");
        }else{
            System.out.println("not palindrom");
        }

	*/
		
       
	}

}
