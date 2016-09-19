package introduction;

public class Junior extends Student {

	String examType;
	
	public Junior(String name, String exam) {
		super(name);
		this.examType = exam;
	}
	
	public void talk(){
		super.talk();
		System.out.println("I am a Junior and I will be taking the "+examType+" this year");
	}

}
