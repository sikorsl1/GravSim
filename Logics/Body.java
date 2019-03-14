/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logics;

/**
 *
 * @author Leonard
 */
public class Body extends Simultable{
    public String name;
    
    public void Body(String name, Simultable sim){
        //Body body = new Body();
        this.name = name;
        this.position = sim.position;
        this.velicoty = sim.velicoty;
        this.mass = sim.mass;
        this.radius = sim.radius;
        this.hardnes = sim.hardnes;
        this.fragility = sim.fragility;
        this.springness = sim.springness;
    }

    
}
