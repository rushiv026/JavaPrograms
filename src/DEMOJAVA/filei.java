package DEMOJAVA;

import java.io.FileInputStream;

public class filei {
    public static void main(String[] args) {
        try
        {
            FileInputStream e=new FileInputStream("C:\\Users\\HP\\IdeaProjects\\JAVA61\\src\\DEMOJAVA\\rushi.txt");
            int i=0;
                 while((i=e.read())!=-1)

                 {
                     System.out.print((char)i);

                 }

            e.close();


        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
