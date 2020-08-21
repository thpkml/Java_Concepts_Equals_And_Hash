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
import java.util.HashSet;
import java.util.Set;
public class Fruit3EqualsandHash {
    private final Fruit3 f1 = new Fruit3("red", "apple");
    private final Fruit3 f2 = new Fruit3("pink", "peach");
    private final Fruit3 f3 = new Fruit3("red", "apple");
    private final Fruit3 f4 = new Fruit3("pink", "peach");
    
   public static void main(String[] args){
       final Fruit3EqualsandHash check = new Fruit3EqualsandHash();
       check.compareFruits();
       check.getHash();
       final Set<Fruit3> set = check.addToHashSet();
       System.out.println("=======THE ORIGINAL SET=========");
       System.out.println(set);
       check.removeFromHashSet(set);
       System.out.println("=======SET AFTER REMOVING=========");
       System.out.println(set);
   } 
   public void compareFruits(){
       System.out.println("======COMPARING FRUITS=========");
       System.out.println("f1.equals(f2): "+f1.equals(f2));
       System.out.println("f1.equals(f3): "+f1.equals(f3));
       System.out.println("f2.equals(f4): "+f2.equals(f4));
   }
   public void getHash(){
       System.out.println("======COMPARING HASHCODES=========");
       System.out.println("f1.hashCode(): "+f1.hashCode());
       System.out.println("f2.hashCode(): "+f2.hashCode());
       System.out.println("f3.hashCode(): "+f3.hashCode());
       System.out.println("f4.hashCode(): "+f4.hashCode());
   }
   public Set<Fruit3> addToHashSet(){
       System.out.println("======ADD FRUITS TO SET=========");
       final Set<Fruit3> set = new HashSet<Fruit3>();
       System.out.println("Set.add(f1): "+set.add(f1));
       System.out.println("Set.add(f2): "+set.add(f2));
       System.out.println("Set.add(f3): "+set.add(f3));
       System.out.println("Set.add(f4): "+set.add(f4));
       return set;
   }
   public void removeFromHashSet(final Set<Fruit3> set1){
        System.out.println("======REMOVE FRUITS FROM SET========="); 
        System.out.println("Set1.remove(f1): "+set1.remove(f1));
        System.out.println("Set1.remove(f2): "+set1.remove(f2));
        System.out.println("Set1.remove(f3): "+set1.remove(f3));
        System.out.println("Set1.remove(f4): "+set1.remove(f4));
   }
}
