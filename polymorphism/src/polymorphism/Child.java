package polymorphism;

public class Child extends Parent {

	public static void marry() {
		// Override with static method
		System.out.println("I want to marry Kiara");
		System.out.println("Love marriage ");
	}


	public static void main(String[] args) {
		//parent reference  & parent object
		
		Parent p =new Parent();
		p.marry();
				
		//child reference & child object
				
		Child c =new Child();
				
		c.marry();
				
				
		//Parent reference & child OBject
		Parent p1 =new Child();
				
	    p1.marry();
				

	}

}
