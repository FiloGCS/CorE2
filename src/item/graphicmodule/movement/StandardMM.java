package item.graphicmodule.movement;

import item.graphicmodule.GraphicModule;
import controller.movement.Movement;
import controller.movement.examples.MoveDirection;
import controller.movement.examples.MoveToXY;

public class StandardMM extends MovementModule{
	
	Movement currentMovement;
	
	public StandardMM(){
		currentMovement = new Movement();
	}
	
	public void moveTo(GraphicModule gm, int x, int y, int speed){
		if(currentMovement.isAlive())
			currentMovement.stop();
		currentMovement = new MoveToXY(gm,x,y,speed);
		currentMovement.start();
	}
	
	public void moveDirection(GraphicModule gm, int x, int y, int speed){
		if(currentMovement.isAlive())
			currentMovement.stop();
		currentMovement = new MoveDirection(gm,x,y,speed);
		currentMovement.start();
	}
	
	public void stop(){
		currentMovement.stop();
	}

}
