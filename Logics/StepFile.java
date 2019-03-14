/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logics;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Vector;

/**
 *
 * @author Leonard
 */
public class StepFile {
    public String filename;
    public File file;
    public PrintWriter printwriter;
    
    public void openFile(String filename) throws FileNotFoundException{
        file = new File(filename);
        printwriter = new PrintWriter(file);
    }
    
    public void closeFile(PrintWriter p){
        p.close();
    }
 
    public void saveFile(PrintWriter p, Vector v){
        p.print(v.get(0));
        p.print(v.get(1) + " ");
        p.print(v.get(2));
        p.print('\n');
    }   
    
    public void setFilename(String s){
        filename = s;
    }
    
    public void setFile(String src){
        file = new File(src+".txt");
    }
    
    public void setPrintwriter(File f) throws FileNotFoundException{
        printwriter = new PrintWriter(f);
    }
}
