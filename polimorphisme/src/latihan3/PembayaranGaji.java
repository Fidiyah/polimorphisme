/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan3;

/**
 *
 * @author WINDOWS 10
 */
public class PembayaranGaji {
    public int hitungGaji(Pegawai peg) {
        int uang = peg.gaji();
        if(peg instanceof Direktur)
            uang += ((Direktur)peg).tunjangan();
        if(peg instanceof Staf)
            uang += ((Staf)peg).Bonus();
        return uang;
    }
    public static void main(String []args) {
        PembayaranGaji pg = new PembayaranGaji();
        Staf ali = new Staf();
        Direktur tony = new Direktur();
        System.out.println("Gaji yang dibayarkan untuk Staf = " + pg.hitungGaji(ali));
        System.out.println("Gaji yang dibayarkan kepada Direktur = " + pg.hitungGaji(tony));
    }
    
}
