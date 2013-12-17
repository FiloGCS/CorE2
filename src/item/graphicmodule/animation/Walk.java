package item.graphicmodule.animation;

import item.graphicmodule.GraphicModule;

import java.awt.image.BufferedImage;





public class Walk extends Thread implements Animation {

	int size;
	GraphicModule gm;
	int stopTime;
	BufferedImage[] frames;
	
	public Walk(GraphicModule gm, int speed){
		this.gm = gm;
		this.size = 6;
		this.stopTime = 300 * 100/speed;
		this.frames = new BufferedImage[6];
		this.frames[0] = gm.getSpriteSheet().getSprite(11);
		this.frames[1] = gm.getSpriteSheet().getSprite(12);
		this.frames[2] = gm.getSpriteSheet().getSprite(13);
		this.frames[3] = gm.getSpriteSheet().getSprite(14);
		this.frames[4] = gm.getSpriteSheet().getSprite(15);
		this.frames[5] = gm.getSpriteSheet().getSprite(16);
	}

	public void run(){
		int i = 0;
		while(true){
			gm.setSprite(frames[i]);
			i++;
			if(i==size)i=0;
			try{Thread.sleep(stopTime);} catch(InterruptedException ie){}
		}
	}
	
	
	@Override
	public void startAnimation() {
		
	}


	@Override
	public void loopAnimation() {
		this.start();
	}

	@Override
	public void stopAnimation() {
		this.stop();		
	}
}
