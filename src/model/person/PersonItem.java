package model.person;

import java.awt.event.KeyEvent;
import java.io.IOException;

import model.person.states.StateDefault;

import item.Item;
import item.graphicmodule.movement.StandardMM;

public class PersonItem extends Item{

	public PersonState state;
	
	public PersonItem(int x, int y) throws IOException{
		this.graphics = new PersonGM(x,y);
		this.state = new StateDefault();
		this.keyboardListener = true;
	}
	
	public void setState(PersonState newState){
		this.state = newState;
	}
	
	public void startMoving(int x, int y, int speed){
		
		getGM().animateWalk(200);
		getMM().moveDirection(getGM(), x, y, speed);
	}
	
	public void stopMoving(){
		getGM().animateIdle(10);
		getMM().stop();
	}
	
	public PersonGM getGM(){
		return (PersonGM) this.graphics;
	}
	
	public StandardMM getMM(){
		return (StandardMM) this.graphics.getMM();
	}
	
	@Override
	public void keyPressed(KeyEvent e){
		this.state.keyPressed(e, this);
	}

	@Override
	public void keyReleased(KeyEvent e){
		this.state.keyReleased(e, this);
	}
}
