
package perpustakaanmodernxyz;

import java.util.ArrayList;
import java.util.Scanner;


public class PerpustakaanModernXYZ {

    public static void main(String[] args) {
        Admin admin=new Admin();
        AnggotaPerpustakaan anggota = new AnggotaPerpustakaan();
        Admin admin1=new Admin("Hamid","29");
        Admin admin2=new Admin("Ritski","10");
        ArrayList<Admin> ad = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        AnggotaPerpustakaan Anggota = null;
        Buku buku = null;
        int pilih_menu;
        int pilih_menu_anggota = 0;
        int user;
        do {
            System.out.println("Pilih User");
            System.out.println("1. Admin");
            System.out.println("2. Anggota");
            System.out.println("3. Keluar");
            System.out.print("User : ");
            user = input.nextInt();
            switch(user){
                case 1:
                    input.nextLine();
                    System.out.print("Masukkan Nama Admin: ");
                    String namaAdmin = input.nextLine();
                    System.out.print("Masukkan Password Admin: ");
                    String passwordAdmin = input.nextLine();
                    
                    if((admin1.getNama().equals(namaAdmin) && admin1.getPassword().equals(passwordAdmin)) || (admin2.getNama().equals(namaAdmin) && admin2.getPassword().equals(passwordAdmin))){
                    
                do{
                    System.out.println("-------Menu Admin-------");
                    System.out.println("1. Tambah Anggota");
                    System.out.println("2. Tambah Buku");
                    System.out.println("3. Hapus Anggota");
                    System.out.println("4. Hapus Buku");
                    System.out.println("5. Daftar Anggota");
                    System.out.println("6. Daftar Buku");
                    System.out.println("7. Transaksi peminjaman");
                    System.out.println("8. Transaksi Pengembalian");
                    System.out.println("9. kembali");
                    System.out.print("Pilih : ");
                    pilih_menu = input.nextInt();
                    
                    switch (pilih_menu) {
                        case 1:                                                   
                            admin.tambahAnggota(Anggota);
                            break;
                        case 2:
                            admin.TambahBuku(buku);
                            break;
                        case 3:
                            admin.HapusAnggota(Anggota);
                            break;
                        case 4:
                            admin.HapusBuku(buku);
                            break;
                        case 5:
                            admin.cetakanggota(Anggota);
                            break;
                        case 6:
                            admin.cetakbuku(buku);
                            break;
                        case 7:
                            //Transaksi peminjaman
                            break;
                        case 8:
                            //transaksi pengembalian
                            break;
                        case 9:
                            System.out.println("terima Kasih");
                            break;
                    }
                    
                }while(pilih_menu != 9);
                    
                    break; 
                    
                
                    
            }         
                
                    else{
                    System.out.println("Tidak Datap Login");
                }
                case 2:  
                    do{
                        System.out.println("Menu Anggota");
                        System.out.println("1. Cari Buku");
                        System.out.println("2. Pinjam Buku");
                        System.out.println("3. Kembalikan Buku");
                        System.out.println("4. Kembali");
                        System.out.print("Pilih : ");
                        pilih_menu_anggota = input.nextInt();
                        switch(pilih_menu_anggota){
                            case 1:
                                anggota.caribuku(buku);
                                break;
                            case 2:
                                anggota.PinjamBuku();
                                break;
                            case 3:
                                anggota.kembalikanBuku();
                                break;
                            case 4:
                                break;
                        }
                    }while(pilih_menu_anggota != 4);
                
                    
        }
            
    }  while(user != 3);
            input.close();
}
}
