
package perpustakaanmodernxyz;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Scanner;
public class Admin{
    Scanner input = new Scanner(System.in);
    //atribut class admin
    private String nama;
    private String password;
    
    //object class AnggotaPerpustakaan
    AnggotaPerpustakaan anggotaperpustakaan = new AnggotaPerpustakaan();
    ArrayList<AnggotaPerpustakaan> anggotaList=new ArrayList<>();
    Buku buku=new Buku();
    ArrayList<Buku> bukuList = new ArrayList<>();
    
    public Admin() {
    }
    
    //construktor
    public Admin(String nama, String password) {
        this.nama = nama;
        this.password = password;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public void addBuku(Buku buku) {
        bukuList.add(buku);
    }
    public ArrayList<Buku> getBuku() {
        return bukuList;
    }
    public void addAnggota(AnggotaPerpustakaan Anggota) {
        anggotaList.add(Anggota);
    }
    
    public ArrayList<AnggotaPerpustakaan> getAnggotalist() {
        return anggotaList;
    }
    
    public void tambahAnggota(AnggotaPerpustakaan Anggota){    
                    System.out.print("ID : ");
                    String idanggota = input.nextLine();

                    System.out.print("Nama : ");
                    String Nama = input.nextLine();
                    

                    System.out.print("Alamat : ");
                    String alamat = input.nextLine();

                    AnggotaPerpustakaan ap = new AnggotaPerpustakaan(idanggota, Nama, alamat);
                    if (buku != null) {
        this.addAnggota(Anggota);
        System.out.println("Buku berhasil ditambahkan.");
    } else {
        System.out.println("Gagal menambahkan buku. Objek buku null.");
    }

                    
                   
    }
    public void HapusAnggota(AnggotaPerpustakaan Anggota){
        if (anggotaList.isEmpty()) {
            System.out.println("Anggota Kosong");
        } else {
            System.out.print("Masukkan ID Anggota yang ingin dihapus: ");
            String idAnggotaDihapus = input.nextLine();

            Iterator<AnggotaPerpustakaan> iterator = anggotaList.iterator();
            boolean found = false;

            while (iterator.hasNext()) {
                AnggotaPerpustakaan anggota = iterator.next();
                if (anggota.getIdAnggota().equals(idAnggotaDihapus)) {
                    iterator.remove();
                    found = true;
                    System.out.println("Anggota dengan ID " + idAnggotaDihapus + " berhasil dihapus.");
                    System.out.println("");
                    break;
                }
            }

            if (!found) {
                System.out.println("Anggota dengan ID " + idAnggotaDihapus + " tidak ditemukan.");
            }
        }
    }
    
    
    public void cetakanggota(AnggotaPerpustakaan Anggota){
        if(anggotaList.isEmpty()){
            System.out.println("");
            System.out.println("Belum ada anggota");
        }else{
        System.out.println("");
        System.out.println("-----Daftar Anggota Perpustakaan-----");
        for (AnggotaPerpustakaan anggota : anggotaList) {
                System.out.println("ID Anggota : " + anggota.getIdAnggota());
                System.out.println("Nama : " + anggota.getNama());
                System.out.println("Alamat : " + anggota.getAlamat());
                System.out.println("");
            }
        }
    }
    public void TambahBuku(Buku buku){       
                    System.out.print("ISBN : ");
                    String isbn = input.nextLine();
                                      
                    System.out.print("Judul : ");
                    String judul=input.nextLine();
                    
                    System.out.print("Penulis : ");
                    String penulis=input.nextLine();
                    
                    
                    Buku bukubaru=new Buku(isbn,judul,penulis);
                    if (bukubaru != null) {
        this.addBuku(bukubaru);
        System.out.println("Buku berhasil ditambahkan.");
    } else {
        System.out.println("Gagal menambahkan buku. Objek buku null.");
    }
                    
                    
    }
    public void HapusBuku(Buku buku){
            if (bukuList.isEmpty()) {
            System.out.println("Buku Kosong");
        } else {
            System.out.print("Masukkan ISBN buku yang ingin dihapus: ");
            String ISBNbuku = input.nextLine();

            Iterator<Buku> iterator = bukuList.iterator();
            boolean found = false;

            while (iterator.hasNext()) {
                Buku hapusBuku = iterator.next();
                if (hapusBuku.getNoISBN().equals(ISBNbuku)) {
                    iterator.remove();
                    found = true;
                    System.out.println("Buku dengan ISBN " + ISBNbuku + " berhasil dihapus.");
                    System.out.println("");
                    break;
                }
            }

            if (!found) {
                System.out.println("Buku dengan ISBN " + ISBNbuku + " tidak ditemukan.");
            }
        }
    }
    public void cetakbuku(Buku buku){
        if(bukuList.isEmpty()){
            System.out.println("");
            System.out.println("Belum ada Buku");
        }else{
        System.out.println("");
        System.out.println("-----Daftar Buku Perpustakaan-----");
                for (Buku daftar : bukuList) {
                if(daftar!=null){
                System.out.println("ISBN : " + daftar.getNoISBN());
                System.out.println("Judul : " + daftar.getJudul());
                System.out.println("Penulis : " + daftar.getPenulis());
                System.out.println("");
            }
                }        
        }
    }
}

