package file;
import java.io.*;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
public class save extends info{
        
    public static List<info> arr = new ArrayList<info>();
     Scanner s =new Scanner(System.in);
    public save(String f, String l, String i, String ad) {
        super(f, l, i, ad);
    }
    public void Add_Entry() throws Exception {
    
     info inf=new info(null, null, null, null);
    System.out.println("enter the first name : ");
    inf.setFname(s.next()); 
     System.out.println("enter the last name : ");
     inf.setLname(s.next());
     System.out.println("enter the id : ");
     inf.setId(s.next());
     
     System.out.println("enter the address : ");
     inf.setAddress(s.next());
     arr.add(inf);
     //arr.clear();
    
}
    
    public void remove_entry() throws FileNotFoundException, IOException, Exception
    {
        
        FileReader fr = new FileReader("F:\\ahmed.txt");
        Scanner s = new Scanner(fr);
        Scanner ss = new Scanner(System.in);
        System.out.println("enter the id which you want to remove : ");
        String str_id=ss.next();
        info inf=new info("", "", "", "");
        while(s.hasNext())
        {
            inf.setFname(s.next());
            inf.setLname(s.next());
            inf.setId(s.next());
            inf.setAddress(s.next());
            arr.add(inf);
        }
        
        FileWriter fw=new FileWriter("F:\\ahmed.txt");
        PrintWriter pw=new PrintWriter(fw);
        for(info f:arr)
        {
            if(f.getId().equals(str_id)==false )
            {
                pw.print(f.getFname());
                pw.print(" ");
                pw.print(f.getLname());
                pw.print(" ");
                pw.print(f.getId());
                pw.print(" ");
                pw.print(f.getAddress());
                pw.print("\n");
            }
            
           
        }
       arr.clear();
        pw.close();
            fw.close();
         //   save_file();
    }
    public void edit_entry () throws FileNotFoundException, IOException, Exception
    {
        FileReader fr = new FileReader("F:\\ahmed.txt");
        Scanner s = new Scanner(fr);
        Scanner ss = new Scanner(System.in);
        System.out.println("enter the id which you want to Edit : ");
        
        String id = ss.next();
       
        info f=new info("", "", "", "");
        while (s.hasNext()) {
            
            f.setFname(s.next());
            f.setLname(s.next());
            f.setId(s.next());
            f.setAddress(s.next());
            arr.add(f);
            
            
        }
        
        FileWriter fw=new FileWriter("F:\\ahmed.txt");
        PrintWriter pw=new PrintWriter(fw);
        //int x=0;
       // info tmp = new info("", "", "", "");
       // System.out.println(arr.size());
      //  info ff = new info("","","","");
        for(info ff:arr)
        {
            
          if(ff.getId().equals(id))
          {
              
             // arr.remove(ff);
              //info fff=new info(" ", "", "", "");
              
         //     System.out.println(arr.size());
              System.out.println("enter the first name : ");
              ff.setFname(ss.next());
              System.out.println("enter the last name : ");
              ff.setLname(ss.next());
              System.out.println("enter the id : ");
              ff.setId(ss.next());
              System.out.println("enter the address : ");
              ff.setAddress(ss.next());
              //arr.add(ff);
              break;
          } 
          
        }
        
        
        for(info record :arr)
      {
          pw.print(record.getFname());
          pw.print(" ");
          pw.print(record.getLname());
          pw.print(" ");
          pw.print(record.getId());
          pw.print(" ");
          pw.print(record.getAddress());
          pw.print("\n");
                 
         // System.out.println(record);
      }
        
            pw.close();
            fw.close();
            
            arr.clear();
    }
   
    public boolean search_for_item() throws FileNotFoundException
    {
        
        FileReader fr = new FileReader("F:\\ahmed.txt");
        Scanner s = new Scanner(fr);
        Scanner ss = new Scanner(System.in);
        System.out.println("enter the id which you want to search : ");
        
        String id = ss.next();
       
        info f=new info("", "", "", "");
        while (s.hasNext()) {
            
            f.setFname(s.next());
            f.setLname(s.next());
            f.setId(s.next());
            f.setAddress(s.next());
            arr.add(f); 
        }
        
        for(info inf:arr)
        {
            if(inf.getId().equals(id))
            {
                System.out.println("=>"+inf.getFname()+" "+inf.getLname()+" "+inf.getId()+" "+inf.getAddress());
                arr.clear();
                return true;
            }
        }
        
        return false;
    }
    
    
    
  public void save_file() throws Exception {
      
     FileWriter fw=new FileWriter("F:\\ahmed.txt",true);
     PrintWriter pw=new PrintWriter(fw);
      for(info record :arr)
      {
          pw.print(record.getFname());
          pw.print(" ");
          pw.print(record.getLname());
          pw.print(" ");
          pw.print(record.getId());
          pw.print(" ");
          pw.print(record.getAddress());
          pw.print("\n");
      }
      pw.close();
      fw.close();
     arr.clear();
 }
  
}
