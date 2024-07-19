package Programs;

public class gcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int num1 =10;
         int num2 =36;
         int gcdResult = gcd(num1 , num2);
         int lcmResult=lcm(num1, num2);
         
         
         System.out.println("gcd of "+num1+" and "+num2+" is "+gcdResult);
         System.out.println("gcd of "+num1+" and "+num2+" is "+lcmResult);
	}
	
	public static int gcd(int a , int b) {
		
		if(b==0) {
			return a;
		}
		return gcd(b,a%b);
	}
	
	public static int lcm(int a , int b) {
		return (a*b)/gcd(a,b);
	}
	
	
	

}
