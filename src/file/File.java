package file;

import java.io.*;
import java.util.Scanner;
public class File {

    public static void main(String[] args) throws Exception {
        
       
        Scanner s = new Scanner(System.in);
        int x=0;
        while(x != 8)
        {
             System.out.println("1.Add an entry");
            System.out.println("2.Remove an entry");
            System.out.println("3.Edit an existing entry");
            System.out.println("4.Search for a specific entry");
            System.out.println("5.save ");
        System.out.println("6.load");
         System.out.println("8.exit");
        x=s.nextInt();
        switch(x)
        {
            case 1:
                save add=new save(null, null, null, null);
                add.Add_Entry();
                break;
            case 2:
                save re=new save(null, null, null, null);
                re.remove_entry();
                break;
            case 3:
                save edit =new save(null, null, null, null);
                edit.edit_entry();
                break;
            case 4:
                save search=new save(null, null, null, null);
                search.search_for_item();
                break;
            case 5:
                save sa=new save(null, null, null, null);
                sa.save_file();
                break;
            case 6:
                load l = new load();
                l.print();
                break;
        }
        
        
        }
     
           
    }
    
}
