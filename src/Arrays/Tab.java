package Arrays;

interface mobile {
	   void call();
	}

	interface smartphone {
		void message();
	}


public class Tab  implements mobile , smartphone{

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("can able to call");
	}

	@Override
	public void message() {
		// TODO Auto-generated method stub
		System.out.println("can able to message");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tab t = new Tab();
		t.message();
		t.call();
	}

	

}
