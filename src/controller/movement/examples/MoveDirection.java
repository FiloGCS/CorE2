package controller.movement.examples;

import controller.movement.Movement;
import item.graphicmodule.GraphicModule;

public class MoveDirection extends Movement{

	GraphicModule gm;
	int x, y;
	int stopTime;
	
	public MoveDirection(GraphicModule gm, int x, int y, int speed){
		this.gm = gm;
		this.stopTime = 50*100/speed;
		this.x = x;
		this.y = y;
	}
	
	public void run(){
		while(true){
			gm.setX(gm.getX()+x);
			gm.setY(gm.getY()+y);
			try{Thread.sleep(stopTime);} catch(InterruptedException e){e.printStackTrace();}
		}
	}
	
}
