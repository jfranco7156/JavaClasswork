package guiPractice.whackAMole;

import java.util.ArrayList;

import guiPractice.components.Visible;
import guiPractice.sampleGames.ClickableScreen;

public class WhackAMoleScreen extends ClickableScreen {
	
	private ArrayList<MoleInterface> moles;
	private PlayerInterface player;
	private TextLabel label;
	private TextLabel timeLabel;
	private double timeLeft;

	public WhackAMoleScreen(int width, int height) {
		super(width, height);
		timeLeft = 60.0;
	}

	@Override
	public void initAllObjects(ArrayList<Visible> viewObjects) {
		//moles = ArrayList<MoleInterface>
		player = getAPlayer();
		label = "Ready...";
		timeLabel = ""+timeLeft;
	}
	
	private PlayerInterface getAPlayer(){
		return null;
	}
	
	private MoleInterface getAMole(){
		return null;
	}

}
