/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.twworks.utils;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.stream.Stream;

/**
 *
 * @author cb-vaibhav
 */
public class ConsoleReader implements InputReader {

    @Override
    public Stream reader() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return br.lines();
    }
}
