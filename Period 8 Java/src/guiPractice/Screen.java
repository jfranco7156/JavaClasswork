package guiPractice;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

public class Screen {

	private int height;
	private int width;
	protected BufferedImage image;
	
	public Screen(int width, int height) {
		this.width = width;
		this.height = height;
		initImage();
	}

	private void initImage() {
		image = new BufferedImage(width,height,BufferedImage.TYPE_INT_ARGB);
		update();
	}

	public void update() {
		//this is where you draw stuff
		Graphics2D g = image.createGraphics();
		g.drawString(iterator, x, y);
	}
	
	public BufferedImage getImage(){
		return image;
	}

}
