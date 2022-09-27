/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class Array_Didalam_Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[][] members ={
            {"Eko", "Kurniawan","Khannedy"},
            {"Budi", "Nugraha"},
            {"Joko", "Morro"}
        };
        String[] member1 = members[0];
        System.out.println(member1[0]);
        
        System.out.println(members[1][0]);
        System.out.println(members[2][0]);
    }
    
}
