/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication1;
import java.util.*;

/**
 *
 * @author js710_000
 */
public class Stat extends BaseStat{
    
    protected ArrayList<BaseBonus> basebonus = new ArrayList<BaseBonus>();
    protected ArrayList<Multiplier> multiple = new ArrayList<Multiplier>();
    
    Stat(int i){
    
        super(i);
        
     
       
    
    }
    
    public void addBaseB(BaseBonus a){
        basebonus.add(a);
        
    }
    
    public int getbaseB(){
        
        int sum = 0;
        
        for( BaseBonus a : basebonus) sum += a.bonusV;
        
        return sum;
    
    }
    
    public void addM(Multiplier a){
    
            multiple.add(a);
    
    }
    
    public void removeM(double a){
    
          for(Multiplier x : multiple)
              if(x.bMul == a){
                  multiple.remove(x);
                  return;
              }
    }
    
    public double getM(){
        
        double sum =0;
        
        for(Multiplier a : multiple) sum += a.bMul;
        
        return sum;
    
    }
    
    
}
