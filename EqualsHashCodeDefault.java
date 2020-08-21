/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equalsAndHashCode;

/**
 *
 * @author admin
 */
public class EqualsHashCodeDefault {
   public static void main(String[] args){
       String string1 = "hello";
       String string2 = "hola";
       String string3 = "aloha";
       String string4 = "hello";
       
       boolean b13 = string1.equals(string3);
       boolean b14 = string1.equals(string4);
       
       int hash1 = string1.hashCode();
       int hash2 = string2.hashCode();
       int hash3 = string3.hashCode();
       int hash4 = string4.hashCode();
       
       System.out.println("string1.equals(string3): "+b13);
       System.out.println("string1.hashCode(): "+hash1);
       System.out.println("string3.hashCode(): "+hash3);
       System.out.println("string1.equals(string4): "+b14);
       System.out.println("string1.hashCode(): "+hash1);
       System.out.println("string4.hashCode(): "+hash4);
   } 
}
