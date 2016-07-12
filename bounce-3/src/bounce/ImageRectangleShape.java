package bounce;

import java.awt.Image;

/**
 * Class to represent a rectangle that displays an image.
 * 
 * @author Ian Warren
 * 
 */
public class ImageRectangleShape extends RectangleShape {

	private Image _picture;
	
	public ImageRectangleShape(int deltaX, int deltaY, Image image) {
		// Derive the shape's width and height from the image.
		super(0, 0, deltaX, deltaY, image.getWidth(null), image.getHeight(null));
		
		_picture = image;
	}
	
	@Override
	protected void doPaint(Painter painter) {
		painter.drawImage(_picture,_x,_y,_width,_height);
	}
}

