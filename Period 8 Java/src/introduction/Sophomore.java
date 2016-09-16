package introduction;

public class Sophomore extends Student {
	
	String favAnimal;

	public Sophomore(String name, String animal) {
		super(name);
		this.favAnimal = animal;
	}
	
	public void talk(){
		super.talk();
		System.out.println(" I am a Sophomore and my favorite animal is a "+favAnimal);
	}

}
