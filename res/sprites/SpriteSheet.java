package sprites;


import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class SpriteSheet {

	private String url;
	private BufferedImage[] sprites;
	private int cols, rows, height, width;
	
	public SpriteSheet(String inputUrl, int cols, int rows, int height, int width) throws IOException{
		this.sprites = new BufferedImage[cols*rows];
		this.url = inputUrl;
		this.cols = cols;
		this.rows = rows;
		this.height = height;
		this.width = width;
		BufferedImage sheet = ImageIO.read(SpriteSheet.class.getResource(inputUrl));
		
		for(int i=0; i<cols;i++){
			for(int j=0; j<rows;j++){
				sprites[cols*j+i]=sheet.getSubimage(i*width, j*height, width, height);
			}
		}
		
	}
	
	public SpriteSheet() throws IOException{
		this("ss_ussoldier.png",10,10,32,32);
	}
	
	public BufferedImage getSprite(int i){
		return this.sprites[i-1];
	}
	
	public BufferedImage[] getSprites(){
		return this.sprites;
	}
	
	public String getPath(){
		return this.url;
	}
	
	public int getColumns(){
		return this.cols;
	}

	public int getRows(){
		return this.rows;
	}
	
	public int getWidth(){
		return this.width;
	}
	
	public int getHeight(){
		return this.height;
	}
}
