/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author js710_000
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(19); 
        Stat x = new Stat(9);
        System.out.println(x.bValue);
        BaseBonus y = new BaseBonus(12);
        BaseBonus z = new BaseBonus(12);
        x.addBaseB(y);
        x.addBaseB(z);
        System.out.println(x.getbaseB());
        Multiplier b = new Multiplier(6.0);
        
        
        x.addM(b);
        System.out.println(x.getM());
        Hp t = new Hp(100, 50);
        System.out.println(t.bValue);
        Multiplier c = new Multiplier(6.0);
        x.addM(c);
        
        x.removeM(6.0);
        System.out.println(x.getM());
        StatList stats = new StatList();
        stats.sl.put("Strength", t);
        System.out.println(stats.sl.get("Strength").bValue);
        
        
    }
    
}
