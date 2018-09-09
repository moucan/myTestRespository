package training1.mc.example01;

public class Sdudent {
	private String name;
	private int age;
	public Sdudent() {
		
	}
	public Sdudent(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void sayHellow(String name) {
		System.out.println(this.name+"say Hellow to"+name);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
