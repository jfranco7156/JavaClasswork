package guiPractice.sampleGames;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import guiPractice.Screen;
import guiPractice.components.Action;
import guiPractice.components.Button;
import guiPractice.components.ClickableGraphic;
import guiPractice.components.Graphic;
import guiPractice.components.Visible;

public class MyScreen extends Screen implements MouseMotionListener, MouseListener {

	//private Graphic pikaF;
	private Button back;
	private ClickableGraphic pika;
	
	public MyScreen(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		//pikaF = new Graphic(50,50,.35,"resources/sampleImages/pikachuFam.jpg");
		pika = new ClickableGraphic(50,50,.35,"resources/sampleImages/cutePika.png");
		pika.setAction(new Action(){
			public void act(){
				pika.setX(pika.getX()+10);
			}
		});
		back = new Button(50,50,100,60,"Back",Color.GRAY,new Action(){
			public void act(){
				MouseFollower.game.setScreen(MouseFollower.coordScreen);
			}
		});
		viewObjects.add(pika);
		viewObjects.add(back);
		
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		if(back.isHovered(e.getX(), e.getY())){
			back.act();
		}
		else if(pika.isHovered(e.getX(), e.getY())){
			pika.act();
		}
	}
	
	public MouseMotionListener getMouseMotionListener(){
		return this;
	}
	
	public MouseListener getMouseListener(){
		return this;
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
