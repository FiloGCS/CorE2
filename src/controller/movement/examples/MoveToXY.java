package controller.movement.examples;

import controller.movement.Movement;
import item.graphicmodule.GraphicModule;

public class MoveToXY extends Movement{

	GraphicModule gm;
	int distanceX, distanceY;
	double currentX, currentY;
	double stepX, stepY;
	double steps = 51;
	int stopTime;
	
	public MoveToXY(GraphicModule gm, int x, int y, int speed){
		this.distanceX = x-gm.getX();
		this.distanceY = y-gm.getY();
		this.stepX = distanceX/steps;
		this.stepY = distanceY/steps;
		this.gm = gm;
		this.currentX = gm.getX();
		this.currentY = gm.getY();
		this.stopTime = 50*100/speed;
		
	}
	
	public void run(){
		for(int i=0;i<steps;i++){
			currentX = currentX + stepX;
			currentY = currentY + stepY;
			gm.setX((int)Math.rint(currentX)); //Rounds currentX into a printable integer position
			gm.setY((int)Math.rint(currentY)); //Rounds currentY into a printable integer position
			try{Thread.sleep(stopTime);} catch(InterruptedException e){e.printStackTrace();}
		}
	}
	
}
