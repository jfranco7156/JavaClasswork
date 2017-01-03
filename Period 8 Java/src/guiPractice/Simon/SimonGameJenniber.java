package guiPractice.Simon;

import guiPractice.GUIApplication;
import guiPractice.Simon.SimonGameJenniber;
import guiPractice.Simon.SimonScreenJenniber;

public class SimonGameJenniber extends GUIApplication {

	public SimonGameJenniber() {
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void initScreen() {
		SimonScreenJenniber click = new SimonScreenJenniber(getWidth(),getHeight());
		setScreen(click);

	}

	public static void main(String[] args) {
		SimonGameJenniber game = new SimonGameJenniber();
		Thread app = new Thread(game);
		app.start();
	}

}
