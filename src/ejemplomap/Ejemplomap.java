/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplomap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;
import modelo.personas;

/**
 *
 * @author juan.duque
 */
public class Ejemplomap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        LinkedList<personas> listap=new LinkedList<>();
        LinkedList<personas> listap2=new LinkedList<>();
        
        HashMap<Integer,LinkedList<personas>> map1 =
                new HashMap<>();
        LinkedHashMap<Integer,LinkedList<personas>> map2 =
                new LinkedHashMap<>();
        TreeMap<Integer,LinkedList<personas>> map3 =
                new TreeMap<>();
        
        listap.add(new personas("Juan", "2151851", 31));
        listap.add(new personas("Chorizo", "2151852", 30));
        listap.add(new personas("Iguanin", "2151853", 25));
        listap.add(new personas("UnTré", "2151854", 37));
                
        map1.put(3, listap);
        
        
        
        listap2.add(new personas("Camila", "2151855", 20));
        listap2.add(new personas("Amparo", "2151856", 21));
        listap2.add(new personas("Elfa", "2151857", 22));
        listap2.add(new personas("Mazorca", "215188", 31));
                
        map1.put(2, listap2);
                                            
       
        String m1=mostrar(map1);
//        String m2=mostrar(map2);
//        String m3=mostrar(map3);
        
        System.out.println(m1);
//        System.out.println("____________");
//        System.out.println(m2);
//        System.out.println("____________");
//        System.out.println(m3);
    }
    
    public static String mostrar (Map<Integer,LinkedList<personas>> m){
        
        String mostrar="";
        Iterator<Map.Entry<Integer,LinkedList<personas>>> it= 
                m.entrySet().iterator();
        
      while(it.hasNext()){
          
          Map.Entry<Integer,LinkedList<personas>> pair= 
                  it.next();
          
          mostrar += "\n"+pair.getKey();
          for (int i = 0; i < pair.getValue().size(); i++) {
              mostrar += " "+pair.getValue().get(i)+"\n";
              
          }                 
          
      }  
        return mostrar;
    }
    
}
