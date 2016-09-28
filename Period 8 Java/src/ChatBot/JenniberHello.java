package ChatBot;

public class JenniberHello implements ChatBot {
	
	private String helloResponse;
	private boolean inHelloLoop;
	
	private String[] calmResponses = {"We already said hello. Let's move the conversation"
			+ "along. You said hello already, did you forget?"};
	
	private String[] angryResponses = {"Okay seriously. Stop saying hi. What is wrong "
			+"with you and saying hello?"};
	
	private int helloCount;
	
	public JenniberHello(){
		helloCount = 0;
	}
	
	public void talk(){
		while(inHelloLoop){
			helloCount++;
			printResponse(); //helper method
			helloResponse = JenniberMain.promptInput();
			//negate use !
			if(!isTriggered(helloResponse)){
				inHelloLoop = false;
				JenniberMain.promptForeve();
			}
		}
	}

	private void printResponse() {
		if(helloCount>4){
			int responseSelection = (int)(Math.random()*angryResponses.length);
			JenniberMain.print(angryResponses[responseSelection]);
		}else{
			int responseSelection = (int)(Math.random()*calmResponses.length);
			JenniberMain.print(calmResponses[responseSelection]);
		}
		
	}

	public boolean isTriggered(String userInput) {
		if(JenniberMain.findKeyword(userInput, "hello", 0)>=0){
			return true;
		}
		if(JenniberMain.findKeyword(userInput, "hey", 0)>=0){
			return true;
		}
		if(JenniberMain.findKeyword(userInput, "hi", 0)>=0){
			return true;
		}
			
		return false;
	}
}
