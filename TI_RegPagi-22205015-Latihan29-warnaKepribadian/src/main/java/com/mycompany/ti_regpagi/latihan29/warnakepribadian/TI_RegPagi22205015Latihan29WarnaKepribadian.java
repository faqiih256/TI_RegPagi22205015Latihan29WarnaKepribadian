/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ti_regpagi.latihan29.warnakepribadian;

import java.util.Scanner;

/**
 * Nama         : Ahmad Nurfaqih
 * Nim          : 22205015
 * prodi        : Teknik Informatia
 * Deskripsi    : Program ini berisi tentang warna kepribadian
 * @author 62895
 */
public class TI_RegPagi22205015Latihan29WarnaKepribadian {

    public static final String BLACK = "\033[0;30m";   // BLACK
    public static final String RED = "\033[0;31m";     // RED
    public static final String GREEN = "\033[0;32m";   // GREEN
    public static final String YELLOW = "\033[0;33m";  // YELLOW
    public static final String BLUE = "\033[0;34m";    // BLUE
    public static final String PURPLE = "\033[0;35m";  // PURPLE
    public static final String CYAN = "\033[0;36m";    // CYAN
    public static final String WHITE = "\033[0;37m";   // WHITE

    public static final String ResetWarna = "\u001B[0m";
//    public static final String hurufHitam = "\u001B[30m";
//    public static final String hurufMerah = "\u001B[31m";
//    public static final String hurufHijau = "\u001B[32m";
//    public static final String hurufKuning = "\u001B[33m";
//    public static final String hurufBiru = "\u001B[34m";
//    public static final String hurufUngu = "\u001B[35m";
//    public static final String hurufCyan = "\u001B[36m";
//    public static final String hurufPutih = "\u001B[37m";

    public static final String backgroundHitam = "\u001B[40m";
    public static final String backgroundMerah = "\u001B[41m";
    public static final String backgroundHijau = "\u001B[42m";
    public static final String backgroundKuning = "\u001B[43m";
    public static final String backgroundBiru = "\u001B[44m";
    public static final String backgroundUngu = "\u001B[45m";
    public static final String backgroundCyan = "\u001B[46m";
    public static final String backgroundPutih = "\u001B[47m";

    public static void main(String[] args) {
        String warnaFav;
        String nama;
        Scanner inputan = new Scanner(System.in);
        
        System.out.print(RED + "YUK ");
        System.out.print(GREEN + "CEK ");
        System.out.print(YELLOW + "KEPRIBADIANMU ");
        System.out.print(CYAN + "DARI ");
        System.out.print(PURPLE + "WARNA ");
        System.out.print(BLUE + "FAVORITMU\n");

        System.out.print("\n" + backgroundMerah + WHITE + "\t MERAH \t\t\n"
                + ResetWarna);
        System.out.print(backgroundHijau + WHITE + "\t HIJAU \t\t\n"
                + ResetWarna);
        System.out.print(backgroundKuning + WHITE + "\t KUNING \t\n"
                + ResetWarna);
        System.out.print(backgroundBiru + WHITE + "\t BIRU \t\t\n"
                + ResetWarna);
        System.out.print(backgroundUngu + WHITE + "\t UNGU \t\t\n\n"
                + ResetWarna);

        System.out.print("PILIH WARNA FAVORITMU : ");
        warnaFav = inputan.next();
        System.out.print("NAMA KAMU : ");
        nama = inputan.next();

        System.out.println("\n====HASIL TEST KEPRIBADIAN " + nama.toUpperCase() + "====");
        hasilTest(warnaFav);
    }
    
    public static void hasilTest(String warnaFav) {
        String warna = warnaFav.toUpperCase();

        System.out.print("Warna Favoritmu adalah");
        switch (warna) {
            case "MERAH":
                System.out.print(RED + " MERAH \n");
                System.out.println("1. Periang,\n"
                        + "2. Pemberani,\n"
                        + "3. Berani mengambil risiko dalam setiap langkah,\n"
                        + "4. Menyukai tantangan,\n"
                        + "5. Kurang sabar,\n"
                        + "6. Dapat menahan marah namun jika sudah tahap puncak toleransi, kemarahannya akan sulit dikontrol,\n"
                        + "7. Memiliki energi kehangatan dan cinta."
                );
                break;
            case "HIJAU":
                System.out.print(GREEN + " HIJAU \n");
                System.out.println("1. Romantis,\n"
                        + "2. Menyukai hal yang berbau alami dan keindahan,\n"
                        + "3. Teguh pada prinsip,\n"
                        + "4. Menginginkan kesempurnaan,\n"
                        + "5. Mudah cemburu,\n"
                        + "6. Mudah merasa iri,\n"
                        + "7. Menjunjung tinggi suatu nilai toleransi dan kepercayaan."                        
                );
                break;
            case "KUNING":
                System.out.print(YELLOW + " KUNING \n" );
                System.out.println("1. Optimis,\n"
                        + "2. Suka bergaul,\n"
                        + "3. Periang,\n"
                        + "4. Senang menolong,\n"
                        + "5. Lincah dan aktif,\n"
                        + "6. Tidak suka meremehkan kekurangan orang lain,\n"
                        + "7. Loyal,\n"
                        + "8. Hangat,\n"
                        + "9. Meskipun karakternya optimis dan idealis, seringkali goyah dan tidak stabil,\n"                        
                        + "10. Cenderung penakut."
                );
                break;
            case "BIRU":
                System.out.print(BLUE + " BIRU \n" );
                System.out.println("1. Menyenangkan,\n"
                        + "2. Bijaksana,\n"
                        + "3. Pembawaan diri tenang saat menghadapi masalah,\n"
                        + "4. Dinamis,\n"
                        + "5. Senang berbagi,\n"
                        + "6. Bersahabat,\n"
                        + "7. Tidak terlalu suka menjadi sorotan banyak orang,\n"                        
                        + "8. Menyembunyikan perasaan karena karakternya yang cenderung mencari jalan damai."                                                
                );
                break;
            case "UNGU":
                System.out.print(PURPLE + " UNGU \n");
                System.out.println("1. Optimis,\n"
                        + "2. TIdak pernah ragu,\n"
                        + "3. Menurutnya pasangan yang ideal adalah yang memiliki mental yang kuat,\n"                        
                        + "4. Memiliki ambisi yang besar,\n"
                        + "5. Memiliki empati yang besar,\n"
                        + "6. Memiliki sisi misterius sebab seringkali menutupi perasaannya,\n"                        
                        + "7. Terkadang bersikap keras kepala dan angkuh."
                );
                break;
            default:
                System.out.println(" Ups Maaf, warna belum tersedia");
                break;
        }
    }
}
