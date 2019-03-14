/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logics;

import java.util.Vector; 
import Logics.Body;
import static java.lang.Math.pow;
/**
 *
 * @author Leonard
 */
public class Scene {
    float timeStep;
   
    public Vector simulateStep(Vector<Body> bds){
        int amount = bds.size();
        float force [] = {0, 0, 0};
        float h;
        for(int current=0; current<amount; current++){
            for(int i=0; i<amount; i++){
                if(i!=current){
                    h=(float)(bds.get(current).mass*0.0000000000667408*0.01296*bds.get(i).mass/
                    pow(pow(bds.get(i).position.get(0)-bds.get(current).position.get(0), 2.0)+
                    pow(bds.get(i).position.get(1)-bds.get(current).position.get(1), 2.0)+
                    pow(bds.get(i).position.get(2)-bds.get(current).position.get(2), 2.0), 1.5));
                    force[0]+=(bds.get(i).position.get(0)-bds.get(current).position.get(0))*h;
                    force[1]+=(bds.get(i).position.get(1)-bds.get(current).position.get(1))*h;
                    force[2]+=(bds.get(i).position.get(2)-bds.get(current).position.get(2))*h;      
                }
            }
            float vx = bds.get(current).velicoty.get(0);
            float vy = bds.get(current).velicoty.get(1);
            float vz = bds.get(current).velicoty.get(2);
            vx+=(force[0]/bds.get(current).mass)*timeStep;
            vy+=force[1]/bds.get(current).mass*timeStep;
            vz+=force[2]/bds.get(current).mass*timeStep;
            bds.get(current).setVelicoty(0, vx);
            bds.get(current).setVelicoty(1, vy);
            bds.get(current).setVelicoty(2, vz);
        }
        for(int k=0; k<amount; k++){
            float x = bds.get(k).position.get(0);
            float y = bds.get(k).position.get(1);
            float z = bds.get(k).position.get(2);
            x+=bds.get(k).velicoty.get(0)*timeStep;
            y+=bds.get(k).velicoty.get(1)*timeStep;
            z+=bds.get(k).velicoty.get(2)*timeStep;
            bds.get(k).setPosition(0, x);
            bds.get(k).setPosition(1, y);
            bds.get(k).setPosition(2, z);
        }
        return bds;
    }
    
    public Vector calculateColisions(){
        Vector x = new Vector();
        return x;
    }
    
    public void setTimeStep(String s){
        timeStep = Float.valueOf(s);
    }
    
}
