package controller;



import item.Item;
import item.graphicmodule.renderizable.Renderizable;
import item.graphicmodule.renderizable.Sprite;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.swing.JFrame;

import model.person.Person;

import controller.keyboard.Keyboard;


import sprites.SpriteSheet;
import viewer.Layer;



public class Main extends JFrame implements Runnable{
	public static boolean keys[] = new boolean[500];
	int fps = 60;
	long lastLoopMilis;
	int frame = 0;
	int xDirection, yDirection;
	public static ArrayList<Layer> layers = new ArrayList<Layer>();
	private Image dbImage;
	private Graphics dbg;
	Font font = new Font("Arial", Font.BOLD, 15);
	
	
	public void run(){
		try{
			while(true){
				Thread.sleep(10);
				
			}
		}
		catch(Exception e){
			System.out.println("Error");
		}
	}
	
	public Main(){
		//Configuration

		addKeyListener(new Keyboard());
		setTitle("CorEngine 1.1");
		setSize(320,320);
		setResizable(false);
		setVisible(true);
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void paint(Graphics g){
		dbImage = createImage(getWidth(), getHeight());
		dbg = dbImage.getGraphics();
		paintComponent(dbg);
		g.drawImage(dbImage,0,0,this);
	}
	
	
	public void paintComponent(Graphics g){
		g.setFont(font);
		
		for(int i=0;i<layers.size();i++){
			for(int j=0;j<layers.get(i).getSize();j++){
				if(layers.get(i).get(j)!=null)
					layers.get(i).get(j).render(g, this);
			}
		}
		
		long frameDiff = System.currentTimeMillis()-lastLoopMilis;
		lastLoopMilis = System.currentTimeMillis();
		long framerateController = (frameDiff>17)?0:(int)Math.rint(1000/fps); //Am I on time?
		
		try {Thread.sleep(framerateController);} catch (InterruptedException e) {e.printStackTrace();}
//		System.out.println("frame: " + frame++);
		repaint();
		
	}
	
	public static void main(String[] args) throws IOException, InterruptedException{
		Main jg = new Main();
		
		/*START CODING***********************************************/
		
		SpriteSheet sheetMap = new SpriteSheet("sst_map1.png",10,10,32,32);
		BufferedImage sprite1 = sheetMap.getSprite(1);
		
		Layer capa1 = new Layer();
		
		layers.add(capa1);
		
		Person personita1 = new Person(capa1, 50,50);
		
		/*END CODING*************************************************/
		
		//Threads
		Thread t1 = new Thread(jg);
		t1.start();
	}
	
}
