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
import modelo.Persona;

/**
 *
 * @author carlos.barbosa
 */
public class Ejemplomap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList<Persona> listaP= new LinkedList<>();
        LinkedList<Persona> listaP2= new LinkedList<>();
        LinkedList<Persona> listaP3= new LinkedList<>();
        
       HashMap<Integer,LinkedList<Persona>> map1= new HashMap<>();
       LinkedHashMap<Integer, LinkedList<Persona>> map2 = new LinkedHashMap<>();
       TreeMap<Integer, LinkedList<Persona>> map3= new TreeMap<>();
       
       listaP.add(new Persona("David","1130",31));
       listaP.add(new Persona("David","1131",32));
       listaP.add(new Persona("David","1132",33));
       listaP.add(new Persona("David","1133",34));
       
       map1.put(3,listaP);
       
       listaP2.add(new Persona("Camila","1134",35));
       listaP2.add(new Persona("Amparo","1135",36));
       listaP2.add(new Persona("Rodrigo","1136",37));
       listaP2.add(new Persona("Sandra","1137",30));
       
       map1.put(2,listaP2);
       
//       listaP3.add(new Persona("Camila","1138",41));
//       listaP3.add(new Persona("Amparo","1139",33));
//       listaP3.add(new Persona("Rodrigo","1140",55));
//       listaP3.add(new Persona("Sandra","1141",60));
//       
//       map1.put(2,listaP3);
       
      
       
        
       String m1= mostrar(map1);
       String m2= mostrar(map2);
       String m3= mostrar(map3);
       
       System.out.println(m1);
//       System.out.println(m2);
//       System.out.println(m3);
       
    }
    public static String mostrar(Map<Integer,LinkedList<Persona>>m){
        String mostrar="";
        Iterator<Map.Entry<Integer,LinkedList<Persona>>> it= 
                m.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<Integer,LinkedList<Persona>> pair = it.next();
            
             mostrar+= pair.getKey();
            for(int i=0; i<pair.getValue().size(); i++){
            mostrar+=  " " + pair.getValue().get(i) + "\n";
        }
            
        
        }
        
        
        return mostrar;
    }
    
}
