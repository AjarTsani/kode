/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class Operasi_Boolean {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        var absen = 78;
        var nilaiAkhir = 80;
        
        var lulusAbsen = absen >=75;
        var lulusNilaiAkhir = nilaiAkhir >=75;
        
        var lulus = lulusAbsen && lulusNilaiAkhir;
        System.out.println(lulus);
    }
    
}
