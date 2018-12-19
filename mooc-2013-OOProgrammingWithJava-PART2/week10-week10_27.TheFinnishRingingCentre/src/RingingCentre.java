
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Devon
 */
public class RingingCentre {
    private Map<Bird,List<String>> views;
    
    
    public RingingCentre() {
        this.views = new HashMap<Bird,List<String>>();
    }
//    /"Rose Starling", "Sturnus roseus", 2012), "Arabia"
    
    public void observe(Bird bird, String place){
        if(this.views.containsKey(bird)){
            List<String> list = this.views.get(bird);
            list.add(place);
        }else{
            List<String> list = new ArrayList<String>();
            list.add(place);
            this.views.put(bird, list);
        }
    }
    
    public void observations(Bird bird){
        int size = 0;
        if(this.views.containsKey(bird)){
            size = this.views.get(bird).size();
        }
        
        
         System.out.println(bird + " observations: "+size);
         if(size >= 1){
             for (String place : this.views.get(bird)) {
                 System.out.println(place);
             }
         }
        
    }
}
