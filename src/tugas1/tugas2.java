/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas1;

/**
 *
 * @author ASUS
 */
public class tugas2 {
    public static void main(String[] args) {
        char abjad = 'A';
        char x;
        char y;
        for ( x = 5; x >= 1; x--) {
            for ( y = 1; y <= x; y++) {
                System.out.print((char)(64+y)+ "");
                abjad++;
            }
            System.out.println();
        }
        
        
}
}
    

