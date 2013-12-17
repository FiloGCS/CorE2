package controller.keyboard;


import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import controller.Main;


import sounds.Sound;

public class Keyboard extends KeyAdapter{
	
	public Keyboard(){
		
	}
	
	public void keyPressed(KeyEvent e){
		for(int i=0;i<Main.layers.size();i++){
			for(int j=0;j<Main.layers.get(i).getSize();j++){
				if(Main.layers.get(i).get(j)!=null && Main.layers.get(i).get(j).keyboardListener)
					Main.layers.get(i).get(j).keyPressed(e);
			}
		}
	}
	
	public void keyReleased(KeyEvent e){
		for(int i=0;i<Main.layers.size();i++){
			for(int j=0;j<Main.layers.get(i).getSize();j++){
				if(Main.layers.get(i).get(j)!=null && Main.layers.get(i).get(j).keyboardListener)
					Main.layers.get(i).get(j).keyReleased(e);
			}
		}
		
	}
	
}
