package item;
import item.graphicmodule.GraphicModule;
import item.soundmodule.SoundModule;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.image.ImageObserver;

public class Item {

	protected GraphicModule graphics;
	protected SoundModule sound;
	public boolean keyboardListener;
	
	public Item(){
	}
	
	public Item(GraphicModule gm, SoundModule sm){
		this.graphics = gm;
		this.sound = sm;
	}
	
	public void render(Graphics g, ImageObserver io){
		if(graphics != null){
			graphics.render(g, io);
		}
	}
	
	public void keyPressed(KeyEvent e){
	}

	public void keyReleased(KeyEvent e){
	}
}
