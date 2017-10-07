/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.twworks.utils;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.util.stream.Stream;

/**
 *
 * @author cb-vaibhav
 */
public class ConsoleUtil {

//    public Stream<String> reader() throws Exception{
//        
//    }
    public void fileWriter(String fileName) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileOutputStream out = new FileOutputStream(fileName);
        if (reader.ready()) {
        }
    }

    public void read() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        System.out.println(line);
    }

    public void readFile(String fileName) throws Exception {
        FileInputStream reader = new FileInputStream(fileName);
        while (reader.available() != 0) {
            System.out.println((char) reader.read());
        }
    }

    public static void main(String[] args) throws Exception {
        new ConsoleUtil().readFile("f1.txt");
    }
}
