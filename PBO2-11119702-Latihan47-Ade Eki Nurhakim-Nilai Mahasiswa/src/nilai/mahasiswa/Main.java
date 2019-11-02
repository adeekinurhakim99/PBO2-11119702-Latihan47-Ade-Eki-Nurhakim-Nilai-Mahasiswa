/*Nama 	 : Ade Eki Nurhakim
NIM 	 : 10119702
Fakultas : Teknik Dan Ilmu Komputer
Prodi 	 : Teknik Informatika
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nilai.mahasiswa;

/**
 *
 * @author Ekiw
 */
public class Main {
    public static void main(String[] args) {
        Nilai n = new Nilai();
        n.setQuiz(75);
        n.setUts(45);
        n.setUas(34);
        
        System.out.println("Quiz : "+n.getQuiz());
        System.out.println("UTS : "+n.getUts());
        System.out.println("UAS : "+n.getUas());
        n.nilaiAkhir();

    }
}
