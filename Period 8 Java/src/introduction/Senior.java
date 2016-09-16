package introduction;

public class Senior extends Student {

	public Senior(String name) {
		//super refers to the superclass Student
		super(name);//constructs a Student class first.
	}
	
	public void talk(){
		//the talk from the superclass will be done first, followed by a new talk
		super.talk();
		System.out.println(" and I am a senior!");
	}

}
