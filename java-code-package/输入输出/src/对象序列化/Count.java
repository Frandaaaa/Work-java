package �������л�;

import java.io.Serializable;

public class Count implements Serializable{
	private String name;
	private int age;
	private String sex;
	Count(String name,int age,String sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public long getAge() {
		return age;
	}
	
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public String getSex() {
		return sex;
	}
	
	@Override
	public String toString() {
		return "���û�����"+ name +", ���䣺" + age + ", �Ա�" + sex +"��";
	}
}
		


