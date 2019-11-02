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
public class Nilai {
    protected double quiz;
    protected double uts;
    protected double uas;

    public double getQuiz() {
        return quiz;
    }

    public void setQuiz(double quiz) {
        this.quiz = quiz;
    }

    public double getUts() {
        return uts;
    }

    public void setUts(double uts) {
        this.uts = uts;
    }

    public double getUas() {
        return uas;
    }

    public void setUas(double uas) {
        this.uas = uas;
    }

    public double nilaiAkhir(double nilaiAkhir){
        if(nilaiAkhir>=80){
            System.out.println("Nilai Akhir :"+nilaiAkhir);
            System.out.println("Index : A");
            System.out.println("Keterangan : Sangat Baik");}
        else if(nilaiAkhir>=68){
            System.out.println("Nilai Akhir :"+nilaiAkhir);
            System.out.println("Index : B");
            System.out.println("Keterangan : Baik");}
        else if(nilaiAkhir>=56){
            System.out.println("Nilai Akhir :"+nilaiAkhir);
            System.out.println("Index : C");
            System.out.println("Keterangan : Cukup");}
        else if(nilaiAkhir>=45){
            System.out.println("Nilai Akhir :"+nilaiAkhir);
            System.out.println("Index : D");
            System.out.println("Keterangan : Kurang");}
        else if(nilaiAkhir>=0){
            System.out.println("Nilai Akhir :"+nilaiAkhir);
            System.out.println("Index : E");
            System.out.println("Keterangan : Sangat Kurang");}
        return 0.20*quiz+ 0.30*uts + 0.35*uas;
        
    }

    void nilaiAkhir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
