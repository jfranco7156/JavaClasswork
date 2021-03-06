package ChatBot;

public class JenniberSchool implements ChatBot{

	private boolean inSchoolLoop;
	private String schoolResponse;
	
	@Override
	public void talk() {
		inSchoolLoop = true;
		while(inSchoolLoop){
			JenniberMain.print("(Type 'quit' to go back)");
			//static call on promptInput from JenniberMain
			schoolResponse = JenniberMain.promptInput();
			if(schoolResponse.indexOf("quit")>=0){
				inSchoolLoop = false;
				JenniberMain.promptForeve();
			}
			
			JenniberMain.print("That's my favorite part about school");
		}
	}

	@Override
	public boolean isTriggered(String userInput) {
		//String[] triggers = {"school", "class", "teacher"};
		//create for loop to iterate through your array
		
		if(JenniberMain.findKeyword(userInput, "school", 0)>=0){
			return true;
		}
		if(JenniberMain.findKeyword(userInput, "class", 0)>=0){
			return true;
		}
		
		
		return false;
	}
	
}
