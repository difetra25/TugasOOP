/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterfacePopUp;

/**
 *
 * @author Admin
 */
public class SpotifyPopUp implements PopUp {
    
    @Override
    public void sendMessage(String receiver, String content) {
        System.out.println("MENGIRIM NOTIFIKASI KE AKUN " + receiver + " DENGAN ISI:");
        System.out.println(content);
    }
    
}
