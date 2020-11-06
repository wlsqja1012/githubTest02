package common;

public class Person {
	String name;
	int age;
//<<<<<<< HEAD
	String nickName;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
//=======
//	public Person(String name, int age) {
//		super();
//		this.name = name;
//		this.age = age;
//	}
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
	
//>>>>>>> branch 'master' of https://github.com/wlsqja1012/githubTest02.git
	
}
