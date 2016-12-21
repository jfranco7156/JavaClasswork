package guiPractice.sampleGames;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import guiPractice.Screen;
import guiPractice.components.Action;
import guiPractice.components.Clickable;
import guiPractice.components.ClickableGraphic;
import guiPractice.components.Graphic;
import guiPractice.components.Visible;

public abstract class ClickableScreen extends Screen implements MouseListener {

	private ClickableGraphic pika;
	protected ArrayList<Clickable> clickables;
	
	public ClickableScreen(int width, int height) {
		super(width, height);
		
	}

	abstract void initAllObjects(ArrayList<Visible> viewObjects);
	
	@Override
	public void mouseClicked(MouseEvent e) {
//		if(pika.isHovered(e.getX(), e.getY())){
//			pika.act();
//		}
		
		for(Clickable c: clickables){
			if(c.isHovered(e.getX(), e.getY())){
				c.act();
				break;
			}
		}
	}

	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		initAllObjects(viewObjects);
		pika = new ClickableGraphic(50,50,1.3,"resources/sampleImages/cutePika.png");
		pika.setAction(new Action(){

			@Override
			public void act() {
				pika.setX(pika.getX() + 10);
				pika.setY(pika.getY() + 10);
				
			}
			
		});
		clickables.add(pika);
		
		for(int i=0; i<viewObjects.size();i++){
			if(viewObjects.get(i) instanceof Clickable)
				clickables.add((Clickable)viewObjects.get(i));
		}
		
	}
	
	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	public MouseListener getMouseListener(){
		return this;
	}
}
