package guiPractice.sampleGames;

import java.util.ArrayList;

import guiPractice.Screen;
import guiPractice.components.Graphic;
import guiPractice.components.Visible;

public class MyScreen extends Screen {

	public MyScreen(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		Graphic picture = new Graphic(50,50,.35,"resources/sampleImages/pikachuFam.jpg");
		viewObjects.add(picture);
	}

}
