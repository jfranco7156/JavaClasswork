package introduction;

public class OOPExample {

	public static void main(String[] args) {
		//Use 'new' to refer to a constructor
		Student jillian = new Senior("Jillian");
		Student josh = new Sophomore("Josh","Polar Bear");
		Student jordan = new Junior("Jordan","ACT");
		
		jillian.talk();
		josh.talk();
		jordan.talk();
	}

}
