/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utshamdany;

/**
 *
 * @author hp
 */
public class NO4 {
    public static void main(String[] args) {
        // TODO code application logic here
        
        for(int counter = 1; counter <= 100; counter++) {
            if(counter % 2 == 0) {
               continue;
            }
            
            System.out.println("Perulangan Genap" + counter);
        }
        
    }
    
}
