/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas1;

/**
 *
 * @author ASUS
 */
public class tugas3 {
      public static void main(String[] args) {
        String nama1 = "Andi";
        String nama2 = "Budi";
        long gajiandri = 10000000;
        long gajibudi = 5000000;
        double pajak, gajibersih;

        //gaji besar dari 6 juta maka pajak 3%
        //gaji kecil dari 6 juta maka pajak 2%
        pajak = 0.03 * gajiandri;
        gajibersih = gajiandri - pajak;
        
        System.out.println("pajak andri =" + pajak);
        System.out.println("gaji bersih andri =" + gajibersih);

        pajak = 0.02 * gajibudi;
        gajibersih = gajibudi - pajak;
        System.out.println("pajak budi =" + pajak);
        System.out.println("gaji bersih andi =" + gajibersih);
    }
}