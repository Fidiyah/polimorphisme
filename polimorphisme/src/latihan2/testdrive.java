/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan2;

/**
 *
 * @author WINDOWS 10
 */
public class testdrive {
     public static void main(String [] args){
        Line L1 = new Line(10, 3, 6, 12);
        L1.isGreater(L1, L1);
        L1.isLess(L1, L1);
        L1.isEqual(L1, L1);
        System.out.println("isGreater: " + L1.isGreater(L1, L1));
        System.out.println("isLess: " + L1.isLess(L1, L1));
        System.out.println("isEqual: " + L1.isEqual(L1, L1));
     
        System.out.println("Length: " + L1.getLength());
        
    }
    
}
