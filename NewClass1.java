/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.uts;

import java.io.PrintWriter;
import java.io.FileReader;

/**
 *
 * @author C-12
 */
public class NewClass1 {
     public static void main(String[] args) throws Exception {
        // instansiasi class pembaca file
        PrintWriter read = new PrintWriter("data.txt");
        Identitas data = new Identitas();
        int[] NilaiInt = {1, 45, 75, 100, 2, 4, 4, 6, 7, 10};
        String[] nama = {"nama 1", "nama 2", "nama 3", "nama 4", "nama 5"};

        for(int n : NilaiInt){
            read.print(n + ", ");
        }
        read.println();
        for(String n : nama){
            read.print(n + ", ");
        }
        read.println();
        read.println("Nama         : " + data.nama);
        read.println("NIM          : " + data.NIM);
        read.println("Alamat       : " + data.Alamat);
        read.println("Usia         : " + data.usia);
        read.println("Tinggi badan : " + data.tinggi);
        read.close();

        try (
            FileReader file = new FileReader("data.txt")) {
            int character;
            while ((character = file.read()) != -1) {
                System.out.print((char) character);
            }
        }
    }
}

class Identitas{
    String nama = "Maulana Baktiar Ramadhan";
    int NIM = 22201304;
    String Alamat = "jl soekarno hatta";
    int usia = 20;
    Double tinggi = 165.5;
}

