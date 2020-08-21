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
public class Fruit3 {
    private final String color;
    private final String name;
    public Fruit3(final String color, final String name){
        this.color = color;
        this.name = name;
    }
    @Override
    public int hashCode(){
        return color.hashCode() + name.hashCode();
    }
    @Override
    public boolean equals(Object object){
        if(object==null) return false;
        if(this==object) return true;
        if(this.getClass()!=object.getClass())return false;
        final Fruit3 unique = (Fruit3)object;
        if(this.name==null? unique.name!=null:!this.name.equals(unique.name))
            return false;
        if(this.color==null? unique.color!=null:!this.color.equals(unique.color))
            return false;
        return true;
    }
    @Override
    public String toString(){
        return this.color+" "+this.name;
    }
}
