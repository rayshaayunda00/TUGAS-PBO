/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas1;

/**
 *
 * @author ASUS
 */
public class Tugas1 {
  public static void main(String[] args) {
        int x, y;

        for (x = 0; x <= 3; x++) {
            for (y = 3; y >= x; y--) {
                System.out.print(" ");
            }

            for (y = 1; y <= x * 2 - 1; y++) {

                System.out.print("*");
            }
            System.out.println();
        }

    }
}