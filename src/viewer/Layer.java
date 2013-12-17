package viewer;

import item.Item;


public class Layer {
	
	private int size = 100;
	Item[] items;
	
	public Layer(){
		items = new Item[size];
	}
	
	public int add(Item newItem){
		int i = 0;
		while (i<size && items[i] != null){i++;}//positioning at the first empty slot
		items[i] = newItem;
		return i;
	}
	
	public void remove(int id){
		items[id] = null;
	}
	
	public Item get(int id){
		return items[id];
	}
	
	public void set(Item newItem, int pos){
		items[pos] = newItem;
	}
	
	public int getSize(){
		return this.size;
	}
}
