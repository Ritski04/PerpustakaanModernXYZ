
package perpustakaanmodernxyz;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
public class AnggotaPerpustakaan {
   
    private String idAnggota;
    private String nama;
    private String alamat;

    private ArrayList<AnggotaPerpustakaan> Anggota = new ArrayList<>();
    Buku buku=new Buku();
    ArrayList<Buku> bukuList=new ArrayList<>();
    Scanner input=new Scanner(System.in);
    public AnggotaPerpustakaan() {
    }
    
  
    public AnggotaPerpustakaan(String idAnggota, String nama, String alamat) {
        this.idAnggota = idAnggota;
        this.nama = nama;
        this.alamat = alamat;
    }

    public String getIdAnggota() {
        return idAnggota;
    }

    public void setIdAnggota(String idAnggota) {
        this.idAnggota = idAnggota;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }



    public ArrayList<AnggotaPerpustakaan> getAnggota() {
        return Anggota;
    }

    public void addAnggota(AnggotaPerpustakaan anggota) {
        this.Anggota.add(anggota);
    }
    
    public void caribuku(Buku buku){
            if (bukuList.isEmpty()) {
            System.out.println("Buku Kosong");
            } else {
            System.out.print("Masukkan ISBN buku yang ingin dicari ");
            String ISBNbuku = input.nextLine();

            Iterator<Buku> iterator = bukuList.iterator();
            boolean found = false;

            while (iterator.hasNext()) {
                Buku cariBuku = iterator.next();
                if (cariBuku.getNoISBN().equals(ISBNbuku)) {
                    found = true;
                    System.out.println("Buku dengan NO ISBN "+ ISBNbuku);
                System.out.println("ISBN : " + cariBuku.getNoISBN());
                System.out.println("Judul : " + cariBuku.getJudul());
                System.out.println("Penulis : " + cariBuku.getPenulis());
                System.out.println("");
            
                    break;
                }
            }

            if (!found) {
                System.out.println("Buku dengan ISBN " + ISBNbuku + " tidak ditemukan.");
            }
        }
    }
    
    public void PinjamBuku() {
        if (bukuList.isEmpty()) {
            System.out.println("Buku Kosong");
        } else {
            System.out.println("----- Daftar Buku Tersedia -----");
            for (Buku daftar : bukuList) {
                System.out.println("ISBN : " + daftar.getNoISBN());
                System.out.println("Judul : " + daftar.getJudul());
                System.out.println("Penulis : " + daftar.getPenulis());
                System.out.println();
            }
            
            System.out.print("Masukkan ISBN Buku yang akan dipinjam: ");
            String isbnBukuDipinjam = input.nextLine();
            
            // Mencari buku yang akan dipinjam
            Iterator<Buku> iterator = bukuList.iterator();
            Buku bukuDipinjam = null;
            
            while (iterator.hasNext()) {
                Buku daftar = iterator.next();
                if (daftar.getNoISBN().equals(isbnBukuDipinjam)) {
                    bukuDipinjam = daftar;
                    iterator.remove();  
                    break;
                }
            }

            if (bukuDipinjam != null) {
                System.out.println("Buku dengan ISBN " + isbnBukuDipinjam + " berhasil dipinjam.");
            } else {
                System.out.println("Buku dengan ISBN " + isbnBukuDipinjam + " tidak ditemukan.");
            }
        }
    }
    public void kembalikanBuku() {
    if (!bukuList.isEmpty()) {
        System.out.println("----- Daftar Buku Dipinjam -----");
        for (Buku daftar : bukuList) {
            System.out.println("ISBN : " + daftar.getNoISBN());
            System.out.println("Judul : " + daftar.getJudul());
            System.out.println("Penulis : " + daftar.getPenulis());
            System.out.println();
        }

        System.out.print("Masukkan ISBN Buku yang akan dikembalikan: ");
        String isbnBukuDikembalikan = input.nextLine();

        // Mencari buku yang akan dikembalikan
        Iterator<Buku> iterator = bukuList.iterator();
        boolean found = false;

        while (iterator.hasNext()) {
            Buku daftar = iterator.next();
            if (daftar.getNoISBN().equals(isbnBukuDikembalikan)) {
                found = true;
                iterator.remove();
                System.out.println("Buku dengan ISBN " + isbnBukuDikembalikan + " berhasil dikembalikan.");
                break;
            }
        }

        if (!found) {
            System.out.println("Buku dengan ISBN " + isbnBukuDikembalikan + " tidak ditemukan atau tidak sedang dipinjam.");
        }
    } else {
        System.out.println("Tidak ada buku yang sedang dipinjam.");
    }
}

    
    
 }   

