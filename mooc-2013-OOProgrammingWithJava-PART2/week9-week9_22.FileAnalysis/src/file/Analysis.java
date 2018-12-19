/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Devon
 */
public class Analysis {
    private File file;
    
    public Analysis(File file){
        this.file= file;
    }
    
    public int lines() throws Exception{
        Scanner reader = new Scanner(this.file,"UTF-8");
        int lines = 0;
        while(reader.hasNext()){
            reader.nextLine();
            lines ++;
        }
        return lines;
    }
     public int characters() throws Exception{
         Scanner reader = new Scanner(this.file,"UTF-8");
        int chara = 0;
        while(reader.hasNext()){
            //added 1 for the line break
            chara += reader.nextLine().length()+1;
        }
        return chara;
     }
}
