package collectionframework.queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class collectionframedemo {
    public static void main(String[] args) {
        //Queue<Integer> q=new LinkedList<>();
        Queue<Integer> q=new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(41);
        q.add(3);
        q.add(5);
        while (!q.isEmpty())
        {
            System.out.println(q.peek());
            q.remove();
        }


    }
}
