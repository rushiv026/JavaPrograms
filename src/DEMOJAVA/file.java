package DEMOJAVA;

import java.io.FileOutputStream;

public class file {

    public static void main(String[] args) {
        try {


            FileOutputStream o = new FileOutputStream("C:\\Users\\HP\\IdeaProjects\\JAVA61\\src\\DEMOJAVA\\rushi.txt");
            //writing the B in file
            o.write(66);
            o.close();
            System.out.println("suceess");
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}


