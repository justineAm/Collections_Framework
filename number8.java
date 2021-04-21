/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise8;
import java.util.*;

/**
 *
 * @author 2ndyrGroupA
 */
public class number8 {
    public static void main(String[] args){
    Map<String, String> map1 = new HashMap<>();
    map1.put("concordia", "Univeristy"); 
    map1.put("acconcordia", "Nort america”");
    map1.put("condensada", "sweet");
    map1.put("concordialist","Harmony");
     map1.put("concordiaCost","Peace");
    System.out.println(map1); 
    int count = 0; 
    Iterator it = map1.entrySet().iterator();
    while (it.hasNext()) { Map.Entry<String, String> pairs = (Map.Entry) it.next();
    if (pairs.getKey().substring(0, 9).contains("concordia")) {
        count++; 
    } 
    }
    System.out.println("There are " + count + " which begin Concordia in array");
    
}

}
