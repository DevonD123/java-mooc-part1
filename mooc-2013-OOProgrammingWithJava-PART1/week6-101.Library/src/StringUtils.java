/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Devon
 */
public class StringUtils {
    public static boolean included(String main, String inside){
        return main.trim().toUpperCase().contains(inside.trim().toUpperCase());
    }
}
