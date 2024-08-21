package Arrays;

public class CompileTime {
	
	int a , b;
	float c,d;
	String name;
	
	void display(String name) {
		this.name=name;
		System.out.println(name);
	}
	
	void display(double a , double b) {
	
		System.out.println(a+" "+b);
	}
	
	void display(int c, int d) {
		
		System.out.println(c+" "+d);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CompileTime ct = new CompileTime();
		ct.display("sriganth");
		ct.display(1, 3);
		ct.display(45.6, 56.9);
		System.out.println();

	}

}
