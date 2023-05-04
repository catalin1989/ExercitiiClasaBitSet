package org.example;


import java.io.*;
import java.sql.SQLOutput;
import java.util.BitSet;

public class App {
    public static void main(String[] args) throws IOException {

        CautareFisier f= new CautareFisier();
        f.setBounds(200,100,400,150);
        f.interfataGrafica();
        f.setTitle("Cautare in fisier");
        f.setVisible(true);



        }
    }


