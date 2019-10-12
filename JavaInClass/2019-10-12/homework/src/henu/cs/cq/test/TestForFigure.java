package henu.cs.cq.test;

import henu.cs.cq.domain.Circle;
import henu.cs.cq.domain.Square;
import henu.cs.cq.domain.Triangle;

public class TestForFigure {
	public static void main(String[] args) throws Exception{
		//����Բ��
		Circle circle = new Circle();
		circle.setR(9);
		System.out.println(circle.toString());
		
		//����������
		Triangle triangle = new Triangle();
		triangle.setLen(2,2,2);
		System.out.println(triangle.toString());
		
		//����������
		Square square = new Square();
		square.setL(2);
		System.out.println(square.toString());
	}
}
