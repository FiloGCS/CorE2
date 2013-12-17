package controller.entity;

import item.Item;
import viewer.Layer;

public class Entity {

	protected Layer layer;
	protected int itemID;
	
	public Entity(){
		
	}
	
	public Entity(Item item, Layer layer){
		this.layer = layer;
		this.itemID = layer.add(item);
	}
	
	public Item getItem(){
		return this.layer.get(itemID);
	}
	
}
