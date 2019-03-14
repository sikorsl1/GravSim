/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logics;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Vector;


/**
 *
 * @author Leonard
 */
public class BodyFile {
    static Vector importing(String src) throws FileNotFoundException, IOException{
        int linie = lines(src);
        Vector vector = new Vector();
        File file = new File(src);
        Scanner scanner = new Scanner(file);
        String textLine;
        for(int i=0; i<linie; i++){
            textLine = scanner.nextLine();
            vector.add(i, textLine);
        }
        scanner.close();
        return vector;
    }

    
    public static void export(String src, Vector<Body> bds) throws FileNotFoundException{
        File file = new File(src);
        if(file.exists())
            ;//cos sie dzieje, gdy juz istnieje
        PrintWriter writer = new PrintWriter(file);
        int amount = bds.size();
        for(int i=0; i<amount; i++){
            writer.println(bds.get(i).name);
            writer.println(bds.get(i).mass + " " + bds.get(i).radius);
            writer.println(bds.get(i).position.get(0) + " " +
                           bds.get(i).position.get(1) + " " + 
                           bds.get(i).position.get(2));
            writer.println(bds.get(i).velicoty.get(0) + " " +
                           bds.get(i).velicoty.get(1) + " " + 
                           bds.get(i).velicoty.get(2));
            writer.println(bds.get(i).springness + " " +
                           bds.get(i).hardnes + " " +
                           bds.get(i).fragility);
        }
        writer.close();
    }
    
    private static int lines(String s) throws FileNotFoundException, IOException{
        int licznik = 0;
        String linia = "";
        FileReader fr = new FileReader(s);
        BufferedReader bfr = new BufferedReader(fr);
        while((linia=bfr.readLine()) != null){
            licznik++;
        }
        return licznik;
    }
}
