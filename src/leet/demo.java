package leet;
import javax.naming.InsufficientResourcesException;
import java.util.*;
public class demo {

    public static void main(String[] args) {
        int nums[]={1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,3,4,5,6,7,8,9};
        float a=nums.length/3;
        int count;

       Set<Integer> s=new HashSet<>();
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
           count=1;

           for(int j=i+1;j<nums.length;j++)
           {
               if(nums[i]==nums[j])
               {
                   count++;
               }
           }

           if(count>a)
           {
               if(s.contains(nums[i])) {
               continue;
               }
               else {
                   s.add(nums[i]);

                   al.add(nums[i]);
               }
           }

        }
        System.out.println(al);
    }
}
