/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterfacePopUp;

/**
 *
 * @author Admin
 */
public class Main {
    
    public static void main(String[] args) {
        String akunPenerima = "Dimas Febrian";
        String iklanAcc = "085772765697";
        String lokasiId = "Bekasi";

        SpotifyPopUp akunNotif = new SpotifyPopUp();
        AdvertisementPopUp iklanNotif = new AdvertisementPopUp();
        LocationPopUp lokasiNotif = new LocationPopUp();

        String message = "SELAMAT ANDA TELAH BERHASIL MELAKUKAN TUTORIAL POLIMORFISME";
        
        akunNotif.sendMessage(akunPenerima, message);
        iklanNotif.sendMessage(iklanAcc, message);
        lokasiNotif.sendMessage(lokasiId, message);
    }
}
