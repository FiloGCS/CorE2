package model.person.states;

import java.awt.event.KeyEvent;

import model.person.PersonItem;
import model.person.PersonState;

public class StateRunning implements PersonState{
	
	int currentKey;

	@Override
	public void keyPressed(KeyEvent e, PersonItem item) {

		if(currentKey != e.getKeyCode()){
			if(e.getKeyCode() == KeyEvent.VK_LEFT){
				currentKey = e.getKeyCode();
				item.startMoving(-1, 0, 500);
				System.out.println("Start"+ e.getKeyCode() + "/" + currentKey);
			}
			
			if(e.getKeyCode() == KeyEvent.VK_RIGHT){
				currentKey = e.getKeyCode();
				item.startMoving(1, 0, 500);
				System.out.println("Start"+ e.getKeyCode() + "/" + currentKey);
			}
	
			if(e.getKeyCode() == KeyEvent.VK_UP){
				currentKey = e.getKeyCode();
				item.startMoving(0, -1, 500);
				System.out.println("Start"+ e.getKeyCode() + "/" + currentKey);
			}
	
			if(e.getKeyCode() == KeyEvent.VK_DOWN){
				currentKey = e.getKeyCode();
				item.startMoving(0, 1, 500);
				System.out.println("Start"+ e.getKeyCode() + "/" + currentKey);
			}
		}
	}

	@Override
	public void keyReleased(KeyEvent e, PersonItem item) {
		if(e.getKeyCode() == currentKey){
			item.stopMoving();
			System.out.println("STAHP"+ e.getKeyCode() + "/" + currentKey);
		}
		currentKey = -1;
	}

}
