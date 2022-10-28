/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alfito septiano
 */
public class KpopFans extends Fans {

    public KpopFans(){
        
    }
    
    public KpopFans(String name){
        super(name);
    }
    
    public void watchingPerformances (Musician musician, String expression){
        showName();
        System.out.print(expression);
        System.out.print(" Melihat idolanya");
        musician.perform();
    }
}