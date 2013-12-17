package item.graphicmodule.renderizable;

import java.awt.Graphics;
import java.awt.image.ImageObserver;

public interface Renderizable {

	public void render(Graphics g, ImageObserver io, int x, int y);
}
