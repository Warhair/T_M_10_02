
package orai_feladat;

import java.util.Scanner;


public class Orai_feladat {
   
    public static String[] pakli = {"0","Z_1","Z_2","Z_3","Z_4","Z_5","Z_6","M_1","M_2","M_3","M_4","M_5","M_6","P_1","P_2","P_3","P_4","P_5","P_6","T_1","T_2","T_3"};
    
    public static void main(String[] args) {
        jatek();
    }

    private static void jatek() {
        kiir();
        for (int i = 0; i < 3; i++) {
           kiir();
           kever();
        }
        ezvolt();
    }

    private static void kiir() {
        for (int i = 1; i < pakli.length; i++) {
            System.out.printf(pakli[i]+" "); 
            if(i % 3 == 0){
                System.out.println();
                
            }
            
            
        }
        
    }

    private static void kever() {
        switch(melyik()){
            case 1:{
                for (int i = 1; i < pakli.length; i++) {
                if(i <= 7){
                    pakli[i] = pakli[20-(i-1)*3];
                }
                
                }
            }
             case 2:{
                for (int i = 1; i < pakli.length; i++) {
               if(i <= 7){
                    pakli[i] = pakli[20-(i-1)*3];
                }
                
                }
            } case 3:{
                for (int i = 1; i < pakli.length; i++) {
                if(i <= 7){
                    pakli[i] = pakli[20-(i-1)*3];
                }
               
                }
            }
             
        }
    }

    private static int melyik() { 
        int oszlop  = 1;
        do{
            System.out.println("Melyik oszlopot választod");
        }
        while(oszlop <= 1 && oszlop >= 3);
        return oszlop;
        
    }

    private static void ezvolt() {
        System.out.println("Ez volt a válsaztott elem"+pakli[11]);
    }
    
  
    
    
}
