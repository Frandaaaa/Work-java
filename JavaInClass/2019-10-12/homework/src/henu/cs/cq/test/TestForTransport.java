package henu.cs.cq.test;

import henu.cs.cq.domain.*;

public class TestForTransport {
	public static void main(String[] args) throws Exception {
		//����car
		Car car = new Car();
		car.setNumsOfPassengers(12);
		System.out.println(car.toString());
		
		//���Ի�
		Train train = new Train();
		train.setNumsOfPassengers(1000);
		System.out.println(train.toString());
		
		//�ɻ�
		Plane plane = new Plane();
		System.out.println(plane.toString());
	}
}
