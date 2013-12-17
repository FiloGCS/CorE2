package model.person;

import java.io.IOException;

import viewer.Layer;
import controller.entity.Entity;

public class Person extends Entity{
	
	public Person(Layer layer, int x, int y) throws IOException{
		this.layer = layer;
		this.itemID = layer.add(new PersonItem(x,y));
		
	}
	
	public PersonItem getItem(){
		return (PersonItem) this.layer.get(itemID);
	}
}
