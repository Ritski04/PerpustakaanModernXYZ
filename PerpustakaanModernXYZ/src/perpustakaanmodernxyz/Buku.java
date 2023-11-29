
package perpustakaanmodernxyz;

import java.util.ArrayList;

public class Buku {
    //atribut class Buku
    private String noISBN;
    private String judul;
    private String penulis;
    private boolean tersedia = true;
    private ArrayList<Buku> buku = new ArrayList<>();
    
    //construktor
    public Buku(String noISBN, String judul, String penulis) {
        this.noISBN = noISBN;
        this.judul = judul;
        this.penulis = penulis;
    }

    public Buku() {
    }

    public String getNoISBN() {
        return noISBN;
    }

    public void setNoISBN(String noISBN) {
        this.noISBN = noISBN;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public boolean isTersedia() {
        return tersedia;
    }

    public void setTersedia(boolean tersedia) {
        this.tersedia = tersedia;
    }
    
    public ArrayList<Buku> getBuku() {
        return buku;
    }
    
    public void addBuku(Buku buku) {
        this.buku.add(buku);
    }
}
