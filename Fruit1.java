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
public class Fruit1 {
    private int id;
    private String color;
    public Fruit1 (int id, String color){
        this.id = id;
        this.color = color;
    }
    public int getId(){
        return id;
    }
    @Override
    public boolean equals(Object object){
        if(object == null) return false;
        if(!(object instanceof Fruit1)) return false;
        if(object == this) return true;
        return this.getId() ==((Fruit1)object).getId();
        }
    
}
