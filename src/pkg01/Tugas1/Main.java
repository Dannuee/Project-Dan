/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg01.Tugas1;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double cel;
        int pilih;
        Scanner input = new Scanner(System.in);
        System.out.println("-----------------------------");
        System.out.println("| PROGRAM KONVERSI SUHU AIR |");
        System.out.println("-----------------------------\n");
        System.out.println("Input Data");
        System.out.println("----------\n");
        System.out.println("Suhu Dalam Celcius : ");
        cel = input.nextDouble();
        
        do {
            System.out.println("\nOpsi");
            System.out.println("----\n");
            System.out.println("1. Lihat Data Konversi\n2. Edit Data Konversi\n3. Exit\nPilih : ");
            pilih = input.nextInt();
            Konversi awalCelcius = new Konversi(cel);

    //        Opsi pilihan
            if (pilih == 1) {
                System.out.println("Suhu dalam Celcius    : " + cel + "°C");
                System.out.println("Suhu dalam Fahrenheit : " + awalCelcius.fahrenheit() + "°F");
                System.out.println("Suhu dalam Reamur     : " + awalCelcius.reamur() + "°R");
                System.out.println("Suhu dalam Kelvin     : " + awalCelcius.kelvin() + "K");
                System.out.println("Kondisi air "+ awalCelcius.kondisiAir()+".");
            }
            else if (pilih == 2) {
                System.out.println("Input Data");
                System.out.println("---------- ");
                System.out.println("Suhu dalam Celcius : ");
                cel = input.nextDouble();
            }
            else if (pilih == 3) {
                System.out.println("------------");
                System.out.println("Terima Kasih");
            }
            else{
                System.out.println("Opsi tidak ada, mohon masukan opsi dengan benar!");
            }
        } while (pilih != 3);
    }
}
