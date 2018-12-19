/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Devon
 */
import java.util.Scanner;
public class Reader {
    private Scanner scan;
    public Reader() {
        this.scan = new Scanner(System.in);
    }
    public String readString(){
        String txt = this.scan.nextLine();
        return txt;
    }
    public int readInteger(){
        int numb = Integer.parseInt(this.scan.nextLine());
        return numb;
    }
    
}
