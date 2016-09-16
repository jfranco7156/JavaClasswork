package introduction;

public class Junior extends Student {

	String examType;
	
	public Junior(String name, String exam) {
		super(name);
		this.examType = exam;
	}
	
	public void talkExamType(){
		super.talk();
		System.out.println(" I will be taking the "+examType);
	}

}
