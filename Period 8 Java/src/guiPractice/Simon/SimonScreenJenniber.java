package guiPractice.Simon;

import java.awt.Color;
import java.util.ArrayList;

import guiPractice.components.Action;
import guiPractice.components.Button;
import guiPractice.components.TextLabel;
import guiPractice.components.Visible;
import guiPractice.sampleGames.ClickableScreen;

public class SimonScreenJenniber extends ClickableScreen implements Runnable {

	private TextLabel label;
	private ButtonInterfaceJenniber[] button;
	private ProgressInterfaceJenniber progress;
	private ArrayList<MoveInterfaceJenniber> sequence;
	
	private int roundNumber;
	private boolean acceptingInput;
	private int sequenceIndex;
	private int lastSelectedButton;
	
	public SimonScreenJenniber(int width, int height) {
		super(width, height);
		Thread app = new Thread(this);
		app.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

	@Override
	public void initAllObjects(ArrayList<Visible> viewObjects) {
		addButtons();
		progress = getProgress();
		label = new TextLabel(130,230,300,40,"Let's play Simon!");
		sequence = new ArrayList<MoveInterfaceJenniber>();
		//add 2 moves to start
		lastSelectedButton = -1;
		sequence.add(randomMove());
		sequence.add(randomMove());
		roundNumber = 0;
		viewObjects.add(progress);
		viewObjects.add(label);
	}

	private MoveInterfaceJenniber randomMove() {
		ButtonInterfaceJenniber b = null;
		int randNum = (int)(Math.random()*button.length);
		while(randNum==lastSelectedButton){
			randNum = (int)(Math.random()*button.length);
		}
		b = button[randNum];
		lastSelectedButton = randNum;
		return getMove(b);
	}

	public MoveInterfaceJenniber getMove(ButtonInterfaceJenniber b) {
		// TODO Auto-generated method stub
		return null;
	}

	public ProgressInterfaceJenniber getProgress() {
		// Wait for partner's code
		return null;
	}

	public void addButtons() {
		int numOfButtons = 6;
		Color[] colors= {Color.blue,Color.red,Color.magenta, Color.yellow, 
				Color.green, Color.orange};
		for(int i= 0; i<numOfButtons; i++){
			final ButtonInterfaceJenniber b = getAButton();
			b.setColor(colors[i]);
			b.setX(50);
			b.setY(50);
			b.setAction(new Action(){
				public void act() {
					if(acceptingInput){
						Thread blink = new Thread(new Runnable(){
							public void run() {
								b.highlight();
								try {
									Thread.sleep(800);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							}
							
						});
						blink.start();
					}
				}
				
			});
		}
		
	}

	public ButtonInterfaceJenniber getAButton() {
		//get partner's code
		return null;
	}

}
