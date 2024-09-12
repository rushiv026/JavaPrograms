package collectionframework.queue;

import jdk.dynalink.beans.StaticClass;

public class Arrayqueue
{
    static class queue {
        static int rear = -1;
        static int arr[];
        static int size;

        queue(int n) {
            this.size = n;
            arr = new int[n];
        }

        public static boolean isEmpty() {
            return rear == -1;
        }

        //equeue
        public static void add(int data) {
            if (rear == size) {
                System.out.println("array full");
                return;
            }
            rear++;
            arr[rear] = data;
        }

        //dequeue
        public static void remove() {
            if (isEmpty()) {
                System.out.println("array empty");
                return;
            }
            int front = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear--;
            System.out.println(front);
        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("array is empty");
                return -1;
            }
            return arr[0];
        }
    }
    public static void main(String[] args) {

        queue a=new queue(5);
        a.add(3);
        a.add(4);
        a.add(5);
        while(!a.isEmpty())
        {
            System.out.println(a.peek());
            a.remove();
        }



    }
}

