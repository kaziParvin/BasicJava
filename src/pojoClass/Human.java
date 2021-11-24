package pojoClass;

public class Human {
	

	String name;
	int eyes;
	int ear;
	double hair;
	float money;
	

	
	public Human(String name, int eyes, int ear, double hair, float money) {
		super();
		this.name = name;
		this.eyes = eyes;
		this.ear = ear;
		this.hair = hair;
		this.money = money;
		
		System.out.println(
		"name is "+ name + " eyes are " +eyes + " ear are " + ear + " hair is " + hair + " money is " + money		
				);
	}
	
	
	public void age(int age) {
		if(age >= 25) {
			System.out.println("please get married");
		}else {
			System.out.println("please study hard");
		}
		
		
	}
}
