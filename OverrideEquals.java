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
public class OverrideEquals {
    public static void main(String[] args){
        Fruit1 apple = new Fruit1(2, "red");
        Fruit1 pear = new Fruit1(2, "red");
       
        System.out.println("apple hash: "+apple.hashCode());
        System.out.println("pear hash: "+pear.hashCode());
        System.out.println("apple.equals(pear): "+apple.equals(pear));
    }
}
