/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package garment.shop;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class GarmentShop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner masuk=new Scanner(System.in);
    int pakaian;
    System.out.println("Selamat Datang di Riot Club ");
    System.out.println("Masukkan Jenis Pakaian");
    System.out.println("1.T-SHIRT");
    System.out.println("2.SWEATER");
    System.out.println("3.HOODIE");
    System.out.println("Jenis Pakaian");
    pakaian=masuk.nextInt();
     if (pakaian==1)
        System.out.println("Harga T-SHIRT = 50.000"); 
    else if (pakaian==2)
        System.out.println("Harga SWEATER = 100.000");
    else if (pakaian==3)
        System.out.println("Harga HOODIE = 200.000"); 
    else 
        System.out.println("MAAF KODE SALAH, SILAHKAN COBA LAGI");
     for (int x=1; x>0; x--)
     {
         for (int y=1; y>0; y++)
         {
    System.out.println("Apakah Anda Sudah Yakin?");
    System.out.println("1. YA");
    System.out.println("2. TIDAK");
    System.out.println("Pilih");
   pakaian=masuk.nextInt();
   if (pakaian==1)
        System.out.println("Terima Kasih atas pembeliannya, Selamat Menikmati");
   else if (pakaian==2)
        System.out.println("Jenis Pakaian"); 
    pakaian=masuk.nextInt();
    if (pakaian==1)
        System.out.println("Harga T-SHIRT = 50.000"); 
    else if (pakaian==2)
        System.out.println("Harga SWEATER = 100.000");
    else if (pakaian==3)
        System.out.println("Harga HOODIE = 200.000"); 
    else 
        System.out.println("MAAF KODE SALAH, SILAHKAN COBA LAGI");
         }
     }
    }
    
    
    
}

