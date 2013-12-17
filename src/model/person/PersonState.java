package model.person;

import java.awt.event.KeyEvent;


public interface PersonState{

	public void keyPressed(KeyEvent e, PersonItem item);
	public void keyReleased(KeyEvent e, PersonItem item);
	
}
