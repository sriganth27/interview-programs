package Arrays;



class animal {
	void soud() {
		System.out.println("zzzz");
	}
}

class dog extends animal {
	void sound() {
		System.out.println("sss");
	}
}

class cat extends animal {
	void sound() {
		System.out.println("mmmm");
	}
	void eat() {
		System.out.println("food");
	}
}
public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cat c = new cat();
		c.soud();
		c.eat();

	}

}
