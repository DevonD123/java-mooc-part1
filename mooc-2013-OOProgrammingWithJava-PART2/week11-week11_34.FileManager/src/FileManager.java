
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileManager {

    public List<String> read(String file){
        try{
        File fileRead = new File(file);
        Scanner reader = new Scanner(fileRead);
        ArrayList<String> list = new ArrayList<String>();
        while(reader.hasNext()){
            String line = reader.nextLine();
            list.add(line);
        }
        return list;
        }catch(Exception e){
            return null;
        }
    }

    public void save(String file, String text){
        try{    
            FileWriter writeFile = new FileWriter(file);
            writeFile.write(text);
            writeFile.close();
        }catch(Exception e){
            
        }
    }

    public void save(String file, List<String> texts){
        try{
            FileWriter writeFile = new FileWriter(file);
            for (String text : texts) {
                writeFile.write(text+"\n");
            }
            writeFile.close();
        }catch(Exception e){
            
        }
        
    }
}
