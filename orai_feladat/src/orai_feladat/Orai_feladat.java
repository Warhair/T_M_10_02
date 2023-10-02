
package orai_feladat;


public class Orai_feladat {
    
    public static String[] Pakli = {"0","Z_1","Z_2","Z_3","Z_4","Z_5","Z_6","M_1","M_2","M_3","M_4","M_5","M_6","P_1","P_2","P_3","P_4","P_5","P_6","T_1","T_2","T_3"};
    
    public static void main(String[] args) {
        jatek();
    }

    private static void jatek() {
        kiir();
        for (int i = 0; i < 3; i++) {
            
        }
    }

    private static void kiir() {
        for (int i = 1; i < Pakli.length; i++) {
            System.out.printf(Pakli[i]+" "); 
            if(i % 3 == 0){
                System.out.println();
                
            }
            
            
        }
        
    }
  
    
    
}
