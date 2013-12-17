package item.graphicmodule.renderizable;

import java.awt.Graphics;
import java.awt.image.ImageObserver;


public class Text implements Renderizable{

	private String caption;
	
	public Text(String caption){
		this.caption = caption;
	}
	
	@Override
	public void render(Graphics g, ImageObserver io, int x, int y) {
		g.drawString(this.caption, x, y);
	}

	public String getCaption(){
		return this.caption;
	}
	
	public void setCaption(String caption){
		this.caption = caption;
	}

}
