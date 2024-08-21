package Arrays;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "sriganth";
		String rev ="";
		for(int i =str.length()-1; i>=0;i--) {
			
			 rev+=str.charAt(i);
		}
		
		System.out.println("reverse string is :"+rev.toString());

	}

}
