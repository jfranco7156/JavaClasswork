package guiPractice.whackAMole;

import java.util.ArrayList;

import guiPractice.components.TextLabel;
import guiPractice.components.Visible;
import guiPractice.sampleGames.ClickableScreen;

public class WhackAMoleScreen extends ClickableScreen implements Runnable {
	
	private ArrayList<MoleInterface> moles;
	private PlayerInterface player;
	private TextLabel label;
	private TextLabel timeLabel;
	private double timeLeft;

	public WhackAMoleScreen(int width, int height) {
		super(width, height);
		timeLeft = 30.0;
		Thread play = new Thread(this);
		play.start();
	}

	@Override
	public void initAllObjects(ArrayList<Visible> viewObjects) {
		moles = new ArrayList<MoleInterface>();
		player = getAPlayer();
		label = new TextLabel(getWidth()/2-60, getHeight()/20-30,120,60, "Ready...");
		timeLabel = new TextLabel(getWidth()/2-60, 50,120,60,"");
		viewObjects.add(label);
		viewObjects.add(player);
		viewObjects.add(timeLabel);
	}

	public void update(){
		super.update();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
	
	/**
	 * This is a placeholder because early in the game design process, the players are
	 * not designed yet, so we use the method later, once we learn how to create a
	 * player
	 * @return
	 */
	private PlayerInterface getAPlayer(){
		return null;
	}
	
	
	/**
	 * This is a placeholder because early in the game design process, the moles are
	 * not designed yet, so we use the method later, once we learn how to create a
	 * mole.
	 * @return
	 */
	private MoleInterface getAMole(){
		return null;
	}
}
