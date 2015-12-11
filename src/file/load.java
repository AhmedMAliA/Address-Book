package file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class load {
    
    String record="k";
    public void print() throws Exception {
            
     FileReader fr = new FileReader("F:\\ahmed.txt");
     Scanner s = new Scanner(fr);
     int i=1;
    while(s.hasNext())
    {
     record = s.nextLine();
     System.out.println(i+") "+record);
     i++;
        
    }
    System.out.println("____________________________________________");
    
            

    }
}
    
