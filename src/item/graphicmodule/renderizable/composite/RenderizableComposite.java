package item.graphicmodule.renderizable.composite;

import item.graphicmodule.renderizable.Renderizable;

import java.awt.Graphics;
import java.awt.image.ImageObserver;
import java.util.ArrayList;


public class RenderizableComposite implements Renderizable{

	ArrayList<Renderizable> components;
	
	public RenderizableComposite(){
		
		this.components = new ArrayList<Renderizable>();
	}

	public void add(Renderizable newRend){
		this.components.add(newRend);
	}	

	@Override
	public void render(Graphics g, ImageObserver io, int x, int y) {
		for(int i=0;i<components.size();i++){
			components.get(i).render(g, io, x, y);
		}
	}
	
}
