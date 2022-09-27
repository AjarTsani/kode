/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class KonversiNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here\
        byte iniByte = 10;
        short iniShort = iniByte;
        int iniInt = iniShort;
        long iniLong = iniInt;
        double iniDouble = iniLong;
        
        float iniFloat = (float) iniDouble;
        long iniLong2 = (long) iniFloat;
        int iniInt2 = (int) iniLong2;
        short iniShort2 = (short) iniInt2;
    }
    
}
