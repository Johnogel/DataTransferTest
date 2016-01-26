
import java.util.Map;
import org.json.simple.JSONObject;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johno-gel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JSONObject obj = new JSONObject();
        
        PlayerData d = new PlayerData();
        d.addItem(new Sword());
        d.addItem(new Shield());
        d.addItem(new Shield());
        d.addItem(new Sword());
        
        obj.put("Object", d);
        obj.put("HP", d.getHP());
        obj.put("Stamina", d.getStamina());
        obj.put("Items", d.getItems());
        
        
        
        System.out.println(obj.toJSONString());
        System.out.println("");
        System.out.println(obj.toString());
        System.out.println("");
        System.out.println(obj);
        System.out.println("");
        System.out.println(System.getProperty("os.name"));
        System.out.println("");
        System.out.println(System.getProperty("user.home"));
        System.out.println("");
        System.out.println(System.getProperty("java.version"));
        System.out.println("");
        System.out.println(System.getProperty("user.name"));
        
        
    }
    
}
