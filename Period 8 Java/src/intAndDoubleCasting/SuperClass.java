package intAndDoubleCasting;

public class SuperClass {
	
	private String mssg;
	
	public SuperClass(String mssg){
		this.mssg = mssg;
	}
	
	public void say(){
		System.out.println("Am I a SuperClass? " + mssg);
	}
	
}
