package polymorphism;

public class Person {
	//compile time polymorphism
	//Method overloading
		public void behaviour() {
			
			System.out.println("Bahviour with family");
		}
		
		public void behaviour(int x) {
			
			System.out.println("Bahviour with friends");
			
		}
		public void behaviour(String s) {
			
			System.out.println("Bahviour with professional");
		}

	public static void main(String[] args) {
        Person p =new Person();
		
		p.behaviour("Hello");

	}

}
