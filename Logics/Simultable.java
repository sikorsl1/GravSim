/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logics;

import java.util.Vector;

/**
 *
 * @author Leonard
 */
public class Simultable {
    public Vector <Float> position;
    public Vector <Float> velicoty;
    public float mass;
    public float radius;
    public float hardnes;
    public float fragility;
    public float springness; 
    
    public void setPosition(String s){
        position = new Vector();
        String [] values = s.split(" ");
        position.add(0, Float.valueOf(values[0]));
        position.add(1, Float.valueOf(values[1]));
        position.add(2, Float.valueOf(values[2]));
    }
    public void setPosition(int i, float f){
        position.remove(i);
        position.add(i, f);
    }
    public Vector getPosition(){
        return position;
    }
    
    public void setVelicoty(String s){
        velicoty = new Vector();
        String [] values = s.split(" ");
        velicoty.add(0, Float.valueOf(values[0]));
        velicoty.add(1, Float.valueOf(values[1]));
        velicoty.add(2, Float.valueOf(values[2])); 
    }
    public void setVelicoty(int i, float f){
        velicoty.remove(i);
        velicoty.add(i, f);
    }
    public Vector getVelicoty(){
        return velicoty;
    }
    
    public void setMass(String s){
        mass = Float.valueOf(s);
    }
    public float getMass(){
        return mass;
    }
    
    public void setRadius(String s){
        radius = Float.valueOf(s);
    }
    public float getRadius(){
        return radius;
    }
    
    public void setHardnes(String s){
        hardnes = Float.valueOf(s);
    }
    public float getHardnes(){
        return hardnes;
    }
    
    public void setFragility(String s){
        fragility = Float.valueOf(s);
    }
    public float getFragility(){
        return fragility;
    }
    
    public void setSpringness(String s){
        springness = Float.valueOf(s);
    }
    public float getSpringness(){
        return springness;
    }
    
}

