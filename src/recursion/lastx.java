package recursion;

public class lastx {
    public static void sort(String str,int index,int count,String empty)
    {

        if(index==str.length())
        {
            for (int i=0;i<count;i++)
            {
               empty=empty+'x';
            }
            System.out.println(empty);
            return;
        }

        if(str.charAt(index)=='x')
        {
            count++;
            sort(str,index+1,count,empty);
        }
        else {
            empty=empty+str.charAt(index);
            sort(str,index+1,count,empty);
        }


    }
    public static void main(String[] args) {
        String str="axbxcx";
        int count=0;
        String empty="";
        sort(str,0,count,"");

    }
}
