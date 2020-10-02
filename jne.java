/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.praktikum;
import java.sql.Timestamp;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author ntb4world
 */
public class jne {
    public static void main(String[] args) {
        //DATA
        String NoResi[] = {"JNE598183","JNE995494","JNE688552","JNE778996","JNE266438","JNE736851","JNE458568","JNE573737","JNE284640","JNE884052","JNE441913","JNE746934","JNE598275","JNE511481","JNE655317","JNE478117","JNE755629"
};
        int jauh_prov[] = {0,4,3,3,3,3,3,3,3,3,2,2,2,2,2,2,2,2,1,2,3,3,3,3,3,3,3,3,3,3,3,3,4,4,4};
        String jenis_paket[][] = {
            {"JENIS","OKE", "REG", "YES"},
            {"ESTIMASI","3-6 Hari","2-3 Hari","1 Hari"}
            };
        int asuransi[] = {0,2000};
        String kota_pengirim = "Mataram";
        int harga_paket[] = {0,5000,6000,10000};
        int perkg,count_pelanggan = 1;
        int total_pemasukan = 0;
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        String nama_pengirim, nama_penerima, kota_penerima,alamat_penerima;
        int prov_penerima,jumlahUang,kembalian;
        boolean bner = true;
        boolean menu_return = false;
        int rnd = new Random().nextInt(NoResi.length);
        do {
            count_pelanggan = count_pelanggan++;
            System.out.println("Selamat datang!");
            System.out.print("Menu : \n"
                            + "1. Kirim Barang.\n"
                            + "2. Total Pemasukkan. (Laporan Harian)\n"
                            + "3. Keluar.\n"
                            + "Pilih : ");
            Scanner input = new Scanner(System.in);
            int menu = input.nextInt();

            switch (menu) {
                case 1 : 
                    do {
                        
                        System.out.println("Kirim Barang (Pelanggan ke #"+count_pelanggan+"): ");
                        System.out.println("Data Pengirim");
                        System.out.print("Nama Pengirim : ");
                        nama_pengirim = input.next();
                        System.out.print("Kota Pengirim : Mataram (default)");
                        System.out.println("");
                        System.out.println("Data Penerima");
                        System.out.print("Nama Penerima : ");
                        nama_penerima = input.next();
                        input.useDelimiter("\n");
                        System.out.print("Alamat Penerima : ");
                        alamat_penerima = input.next();
                        System.out.print("Kota Penerima : ");
                        kota_penerima = input.next();
                        System.out.print("Berat Paket /kg: ");
                        perkg = input.nextInt();
                        System.out.print("Prov Penerima : \n"
                                + "1. Aceh                       18. Nusa Tenggara Barat\n"
                                + "2. Sumatera Utara             19. Nusa Tenggara Timur\n"
                                + "3. Sumatera Barat             20. Kalimantan Utara\n"
                                + "4. Riau                       21. Kalimantan Barat\n"
                                + "5. Kepulauan Riau             22. Kalimantan Tengah\n"
                                + "6. Jambi                      23. Kalimantan Selatan\n"
                                + "7. Bengkulu                   24. Kalimantan Timur\n"
                                + "8. Sumatera Selatan           25. Gorontalo\n"
                                + "9. Kep. Bangka Belitung       26. Sulawesi Utara\n"
                                + "10. Lampung	Banda Lampung   27. Sulawesi Barat\n"
                                + "11. Banten                    28. Sulawesi Tengah\n"
                                + "12. Jawa Barat                29. Sulawesi Selatan\n"
                                + "13. DKI Jakarta               30. Sulawesi Tenggara\n"
                                + "14. Jawa Tengah               31. Maluku Utara\n"
                                + "15. DI Yogyakarta             32. Maluku\n"
                                + "16. Jawa Timur                33. Papua Barat\n"
                                + "17. Bali                      34. Papua\n"
                                + "Pilih Provinsi : ");
                        prov_penerima = input.nextInt();
                        System.out.println("");
                        System.out.println("Jenis Paket : \n"
                                + "1. OK ("+jenis_paket[1][1]+")\n"
                                + "2. REG ("+jenis_paket[1][2]+")\n"
                                + "3. YES ("+jenis_paket[1][3]+")");
                        System.out.print("Pilih jenis paket : ");
                        int paketan = input.nextInt();
                        System.out.print("Ingin Menambahkan Asuransi? (1 : ya/0 : no) : ");
                        int asuransikan = input.nextInt();
                        int biaya_total = harga_paket[paketan] * jauh_prov[prov_penerima] * perkg + asuransi[asuransikan];
                        System.out.print("================================\n"
                                        + "Nama Pengirim : "+nama_pengirim+"\n"
                                        + "Kota Pengirim : "+kota_pengirim+"\n"
                                        + "================================\n"
                                        + "Nama Penerima : "+nama_penerima+"\n"
                                        + "Alamat        : "+alamat_penerima+"\n"
                                        + "Kota Penerima : "+kota_penerima+"\n"
                                        + "Prov Penerima : "+provinsi[prov_penerima]+"\n"
                                        + "Berat Paket   : "+perkg+"kg\n"
                                        + "Asuransi      : Rp."+asuransi[asuransikan]+",-\n"
                                        + "Jenis Paket   : "+jenis_paket[0][paketan]+"\n"
                                        + "Biaya total   : "+biaya_total+"\n"
                                        + "================================\n");
                        System.out.print("Apakah data sudah benar? (Y/n) : ");
                        String return_value = input.next();
                        bner = true;
                        if (return_value.equalsIgnoreCase("y")) {
                            System.out.print("Masukkan jumlah uang : Rp.");
                            jumlahUang = input.nextInt();
                            kembalian = jumlahUang - biaya_total;
                            System.out.println("==================Struk Nota=================="); 
                            System.out.println("Nama Pengirim        : "+nama_pengirim+"\n"
                                             + "Kota Pengirim        : "+kota_pengirim+"\n"
                                             + "Nama Penerima        : "+nama_penerima+"\n"
                                             + "Alamat               : "+alamat_penerima+"\n"
                                             + "Kota & Prov Tujuan   : "+kota_penerima+","+provinsi[prov_penerima]+"\n"
                                             + "Tanggal & Waktu      : "+timestamp+"\n"
                                             + "Asuransi             : Rp."+asuransi[asuransikan]+",-\n"
                                             + "Servis               : "+jenis_paket[0][paketan]+"\n"
                                             + "Berat Paket          : "+perkg+"kg\n"
                                             + "Nomor Resi           : "+NoResi[rnd]+"\n"
                                             + "Biaya Total          : Rp."+biaya_total+",-\n"
                                             + "Jumlah Uang          : Rp."+jumlahUang+",-\n"
                                             + "Kembalian            : Rp."+kembalian+",-\n"
                                             + "==============================================");
                            total_pemasukan = total_pemasukan + biaya_total;
                            System.out.println("");
                            System.out.print("Kembali ke menu?(Y/n) : ");
                            String return_menu = input.next();
                            if (return_menu.equalsIgnoreCase("y")) {
                                menu_return = true;
                            }
                        }   else {
                            System.out.println("Silahkan isi ulang data dengan benar");
                            bner = false;
                        }
                    } while (bner == false);
                    break;
                case 2 :
                    System.out.println("================== LAPORAN HARIAN ==================\n"
                                        + "Total Pelanggan hari ini : #"+count_pelanggan+"\n"
                                        + "Total Pemasukkan Hari ini : Rp."+total_pemasukan+",-\n"
                                        + "====================================================");
                    System.out.println("");
                    System.out.print("Kembali ke menu?(Y/n) : ");
                            String return_menu = input.next();
                            if (return_menu.equalsIgnoreCase("y")) {
                                menu_return = true;
                            } else  {
                                break;
                            }
                    break;
                case 3 :
                    menu_return = false;
                    break;
            }
        } while (menu_return == true);
    }
}
