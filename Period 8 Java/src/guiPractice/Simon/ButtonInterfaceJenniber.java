package guiPractice.Simon;

import java.awt.Color;

import guiPractice.components.Action;
import guiPractice.components.Clickable;

public interface ButtonInterfaceJenniber extends Clickable {

	void setAction(Action action);
	
	void setColor(Color color);

	void setX(int i);

	void setY(int i);

	void highlight();

}
