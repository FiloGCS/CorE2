package item.graphicmodule.renderizable;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;

import sprites.SpriteSheet;


public class Sprite implements Renderizable {

	private BufferedImage sprite;
	
	public Sprite(){
	}
	
	public Sprite(BufferedImage sprite){
		this.sprite = sprite;
	}
	
	@Override
	public void render(Graphics g, ImageObserver io, int x, int y){
		g.drawImage(this.sprite, x, y, io);
	}

	public void setSprite(BufferedImage sprite){
		this.sprite = sprite;
	}
	
	public BufferedImage getSprite(){
		return this.sprite;
	}
	
}
