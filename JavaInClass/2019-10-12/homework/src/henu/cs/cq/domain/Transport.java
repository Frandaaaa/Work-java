package henu.cs.cq.domain;

public class Transport {
	private String name;
	private String price;//�۸�
	private String comfort;//���ʶ�
	private String speed;//�ٶ�
	private int numsOfPassengers;
	
	public Transport() {
		this.name = "δ����Ľ�ͨ����";
	}
	public Transport(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getComfort() {
		return comfort;
	}
	public void setComfort(String comfort) {
		this.comfort = comfort;
	}
	public String getSpeed() {
		return speed;
	}
	public void setSpeed(String speed) {
		this.speed = speed;
	}
	public int getNumsOfPassengers() {
		return numsOfPassengers;
	}
	public void setNumsOfPassengers(int numsOfPassengers) throws Exception {
		if(numsOfPassengers<0) {
			throw new Exception("�˿���������Ϊ������");
		}
		this.numsOfPassengers = numsOfPassengers;
	}

	@Override
	public String toString() {
		if(numsOfPassengers==0) {
			return "Transport ["+name+":price=" + price + ", comfort=" + comfort + ", speed=" + speed + 
					",δ�������˿���]";
		} else {
			return "Transport ["+name+":price=" + price + ", comfort=" + comfort + ", speed=" + speed + ", numsOfPassengers="
					+ numsOfPassengers + "]";
		}
	}
}
