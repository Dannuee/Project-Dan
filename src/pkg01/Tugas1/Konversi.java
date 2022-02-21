/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg01.Tugas1;

/**
 *
 * @author LENOVO
 */
public class Konversi {
    double celcius;
    Main data = new Main();
    public Konversi(double celcius){
        this.celcius = celcius;
    }
    double fahrenheit(){
        return (((9*celcius)/5)+32);
    }
    double reamur (){
        return (4*celcius)/5;
    }
    double kelvin (){
        return celcius + 273.15;
    }
    
    String kondisiAir(){
        if (celcius <= 0) {
           return "Beku";
        }
        else if (celcius >= 100) {
            return "Mendidih";
        }
        else {
            return "Normal";
        }
    }
}
