package DEMOJAVA;

import java.io.FileOutputStream;

public class filew {

    public static void main(String[] args) {
        try
        {
            FileOutputStream o=new FileOutputStream("C:\\Users\\HP\\IdeaProjects\\JAVA61\\src\\DEMOJAVA\\rushi.txt");
           String s="welcome good morning";
            byte b[]=s.getBytes();
            o.write(b);
            o.close();
            System.out.println("suuceess");

        }
        catch (Exception e)

        {
            System.out.println(e);
        }
    }
}
