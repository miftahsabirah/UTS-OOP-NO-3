public class Penduduk {
    String nama;
    int pendapatan;

    public Penduduk(String nama, int pendapatan) {
        this.nama = nama;
        this.pendapatan = pendapatan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getPendapatan() {
        return pendapatan;
    }

    public void setPendapatan(int pendapatan) {
        this.pendapatan = pendapatan;
    }
    public int getPajak(){
        return 0.18 * getPendapatan()
    }
    public int getBayar(){
        return getPendapatan() + getPajak()
    }
}
