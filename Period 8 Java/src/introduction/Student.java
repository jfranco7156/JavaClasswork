package introduction;

public class Student {
	
	//fields
	private String name;
	
	//constructor - return type is the name
	//constructor MUST ALWAYS match the class name
	//constructor initializes fields 
	public Student(String name){
		this.name = name;
	}
	
	//method
	public void talk(){
		System.out.println("Hello, my name is " + name);
	}
}
