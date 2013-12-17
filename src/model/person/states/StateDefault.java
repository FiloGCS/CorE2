package model.person.states;

import java.awt.event.KeyEvent;

import model.person.PersonItem;
import model.person.PersonState;

public class StateDefault implements PersonState{

	
	public StateDefault(){
		
	}
	@Override
	public void keyPressed(KeyEvent e, PersonItem item) {
		if(e.getKeyCode() == KeyEvent.VK_UP){
			item.setState(new StateRunning());
		}else{
			System.out.println("Press UP to start");
		}
	}

	@Override
	public void keyReleased(KeyEvent e, PersonItem item) {
		
	}

}
