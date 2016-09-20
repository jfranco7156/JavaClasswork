package intAndDoubleCasting;

public class SubClass extends SuperClass {

	String extraMssg;

	public SubClass(String mssg, String extraMssg) {
		super(mssg);
		this.extraMssg = extraMssg;
	}
	
	public void say(){
		super.say();
		System.out.println(extraMssg);
	}

}
