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
public class BaseStat {
    
   protected int bValue;
   protected int bonusV;
   protected double bMul;
    
   BaseStat(int a){
        
        bValue = a;
        //bonusv = 0;
        //bMul = 0;
        
    }
    
   public int get_bval(){
       
       return bValue;
   
   }
   
   public double get_bMul(){
       
       return bMul;
   }
   }
   
    

