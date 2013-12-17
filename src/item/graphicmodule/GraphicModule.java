package item.graphicmodule;
import item.graphicmodule.animation.Animation;
import item.graphicmodule.animation.Walk;
import item.graphicmodule.movement.MovementModule;
import item.graphicmodule.movement.StandardMM;
import item.graphicmodule.renderizable.Renderizable;
import item.graphicmodule.renderizable.Sprite;
import item.graphicmodule.renderizable.Text;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;

import sprites.SpriteSheet;



public class GraphicModule {
	
	protected int x, y;
	public SpriteSheet spriteSheet;
	protected MovementModule movement;
	protected Renderizable renderizable;
	public Animation animation;
	
	public GraphicModule(){
		
	}
	
	public GraphicModule(int x, int y){
		this.x = x;
		this.y = y;
		this.movement = new StandardMM();
	}
	
	public GraphicModule(int x, int y, MovementModule mm){
		this(x,y);
		this.movement = mm;
	}
	
	public GraphicModule(String string, int x, int y){
		this(x,y);
		this.renderizable = new Text(string);
	}

	public GraphicModule(BufferedImage sprite, int x, int y){
		this(x,y);
		this.renderizable = new Sprite(sprite);
	}

	public GraphicModule(BufferedImage sprite, int x, int y, MovementModule mm){
		this(sprite,x,y);
		this.movement = mm;
	}

	public void setRenderizable(Renderizable renderizable){
		this.renderizable = renderizable;
	}
	
	public Renderizable getRenderizable(){
		return this.renderizable;
	}
	
	public void render(Graphics g, ImageObserver io){
		this.renderizable.render(g, io, x, y);
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public MovementModule getMM(){
		return this.movement;
	}
	
	public SpriteSheet getSpriteSheet(){
		return this.spriteSheet;
	}
	
	public void setSprite(BufferedImage img){
		this.renderizable = new Sprite(img);
	}
	
}
