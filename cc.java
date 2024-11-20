public class bb {  
     public static void main(String[] args) {  
         int grenze = 10;  
         int summe = 0;  
 
         for (int i = 1; i < grenze; i++) {  
             if (i % 3 == 0 || i % 5 == 0) {  
                 summe += i;  
             }
         }
 
         System.out.println("Die Summe ist: " + summe);  
     }
  }  