package Arrays;


abstract class mobilee {
	abstract void message();
	abstract void call();
	void display() {
		System.out.println("display printed");
	}
}

class smartphonee extends mobilee {

	@Override
	void message() {
		// TODO Auto-generated method stub
		System.out.println("Message printed in smartphone" );
	}

	@Override
	void call() {
		// TODO Auto-generated method stub
		System.out.println("can able to call phone");
	}
	
	
	
	
}

class tabb extends mobilee{

	@Override
	void message() {
		// TODO Auto-generated method stub
		System.out.println("Message printed in tab");
	}

	@Override
	void call() {
		// TODO Auto-generated method stub
		System.out.println("Message printed in tab");
	}
	
}

public class AbstractExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		smartphonee sm = new smartphonee();
		tabb tb = new tabb();
		
		sm.call();
		sm.display();
		tb.call();
		tb.message();

	}

}
