
import java.io.Serializable;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johno-gel
 */
public class PlayerData implements Serializable{
private int hp, stamina;
private ArrayList<Item> items;
    public PlayerData(){
        items = new ArrayList();
        hp = 10;
        stamina = 9;
    }
    
    public int getHP(){
        return hp;
    }
    
    public int getStamina(){
        return stamina;
    }
    
    public ArrayList<Item> getItems(){
        return items;
    }
    
    public void addItem(Item item){
        items.add(item);
    }
    
}
