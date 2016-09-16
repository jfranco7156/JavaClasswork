package introduction;

public class Senior extends Student {

	public Senior(String name) {
		//super refers to the superclass Student
		super(name);//constructs a Student class first.
	}
	
	public void talk(){
		System.out.println("I am a senior!");
	}

}
