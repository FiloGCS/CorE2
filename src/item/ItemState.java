package item;

import java.awt.event.KeyEvent;

import model.person.PersonItem;

public interface ItemState {
	public void keyPressed(KeyEvent e, ItemSM item);
	public void keyReleased(KeyEvent e, ItemSM item);
}
