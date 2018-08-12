/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package md5hash;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author Alena
 */
public class MD5hash {

    
    public static void main(String[] args) throws NoSuchAlgorithmException, UnsupportedEncodingException {
       
        MD5Hesh hesh1= new MD5Hesh();
        String s="Hi!!!";
         
        
        System.out.println(hesh1.getHash(s));
       
     
    }
}
