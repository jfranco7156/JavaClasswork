package guiPractice;

import java.awt.Graphics;

import javax.swing.JFrame;

public abstract class GUIApplication extends JFrame implements Runnable{

	private Screen currentScreen;
	
//You can NOT instantiate an abstract class	
//	main method for practice only
//	public static void main(String[] args) {
//		new GUIApplication();
//
//	}
	
	public GUIApplication(){
		//terminate program when windows is closed
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//gets rid off the automatic border
		//setUndecorated(true);
		int x = 40;
		int y = 40;
		int width = 600;
		int height = 400;
		setBounds(x,y,width,height);
		initScreen();
		setVisible(true);
	}

	protected abstract void initScreen();
//	{
//		Screen startScreen = new Screen(getWidth(), getHeight());
//		currentScreen = startScreen;
//	}
	
	public void setScreen(Screen screen){
		//Stops control from last screen
		if(currentScreen!=null){
			if(currentScreen.getMouseListener()!=null){
				removeMouseListener(currentScreen.getMouseListener());
			}
			if(currentScreen.getMouseMotionListener()!=null){
				removeMouseMotionListener(currentScreen.getMouseMotionListener());
			}
		}
		currentScreen = screen;
		//Add controls for new screen
		if(currentScreen!=null){
				addMouseListener(currentScreen.getMouseListener());
				addMouseMotionListener(currentScreen.getMouseMotionListener());
		}
	}

	public void paint(Graphics g){
		g.drawImage(currentScreen.getImage(), 0, 0, null);
	}
	
	public void run(){
		while(true){
			currentScreen.update();
			//updates the Window
			repaint();
			try {
				Thread.sleep(40);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
