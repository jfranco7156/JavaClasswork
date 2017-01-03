package guiPractice.Simon;

import java.util.ArrayList;

import guiPractice.components.Visible;
import guiPractice.sampleGames.ClickableScreen;

public class SimonScreenJenniber extends ClickableScreen implements Runnable {

	public ProgressInterfaceJenniber progress;
	private ArrayList<MoveInterfaceJenniber> movables;
	public int roundNum;
	public boolean userInput;
	
	public SimonScreenJenniber(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

	@Override
	public void initAllObjects(ArrayList<Visible> viewObjects) {
		// TODO Auto-generated method stub

	}

}
