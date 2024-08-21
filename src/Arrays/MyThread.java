package Arrays;

public class MyThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = Thread.currentThread();
        t.setName("main thread");
        t.setPriority(7);
        System.out.println(t);
        System.out.println(t.getName());
        System.out.println(t.getPriority());
	}

}
