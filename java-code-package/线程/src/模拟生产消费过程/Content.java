package ģ���������ѹ���;

public class Content {
	public static void main(String[] args) {
		Queue queue = new Queue();
		new Thread(new Productor(queue)).start();
		new Thread(new Customer(queue)).start();
	}
}
