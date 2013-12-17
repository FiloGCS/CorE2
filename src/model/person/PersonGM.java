package model.person;

import java.io.IOException;

import sprites.SpriteSheet;
import item.graphicmodule.GraphicModule;
import item.graphicmodule.animation.Walk;
import item.graphicmodule.movement.StandardMM;
import item.graphicmodule.renderizable.Sprite;

public class PersonGM extends GraphicModule{

	public PersonGM(int x, int y) throws IOException{
		super(x,y);
		this.spriteSheet = new SpriteSheet("ss_ussoldier.png",10,10,32,32);
		this.renderizable = new Sprite(this.spriteSheet.getSprite(1));
		this.movement = new StandardMM();
		this.animation = new Walk(this,100);
	}
	
	public Sprite getSprite(){
		return (Sprite)this.getRenderizable();
	}

	public void animateWalk(int speed){
		this.animation.stopAnimation();
		this.animation = new Walk(this,speed);
		this.animation.loopAnimation();
	}
	
	public void animateIdle(int speed){
		this.animation.stopAnimation();
	}
	
	public StandardMM getMM(){
		return (StandardMM) this.movement;
	}

}
