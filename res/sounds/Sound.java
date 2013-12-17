package sounds;

import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;

public class Sound extends Thread{
	private AudioClip song; // Sound player
	boolean loop;
	
	public Sound(String filename, boolean loop){
		this.loop = loop;
	  try{
	 	 song = Applet.newAudioClip(Sound.class.getResource(filename)); // Load the Sound
	  }catch(Exception e){e.printStackTrace();} // Satisfy the catch
	}
	
	public void setLoop(boolean loop){
		this.loop = loop;
	}
	
	public void run(){
		if(loop){
			song.loop();
		}else{
			song.play();
		}
		while(true){}
	}
}