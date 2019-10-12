package henu.cs.cq.domain;

public class Circle extends Figure{
	private double r;
	public Circle() {
		super("circle");
	}
	public Circle(double r) {
		super.setArea(calArea(r));
		super.setGrith(calGrith(r));
	}
	
	/**
	 * �������
	 * @param r
	 * @return
	 */
	
	public double calArea(double r) {
		return Math.PI*Math.pow(r, 2);
	}
	
	/**
	 * �����ܳ�
	 * @param r
	 * @return
	 */
	public double calGrith(double r) {
		return 2*Math.PI*r;
	}
	
	public void setGrith(double r) {
		super.setGrith(calGrith(r));
	}
	
	public void setArea(double r) {
		super.setArea(calArea(r));
	}
	public double getR() {
		return r;
	}
	public void setR(double r) {
		this.r = r;
		setArea(r);
		setGrith(r);
	}
	
	@Override
	public String toString() {
		return "Circle [�뾶Ϊ" + getR() + ", �����" + getArea()
				+ ", �ܳ���" + getGrith() + "]";
	}
	
}
