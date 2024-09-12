package collectionframework.queue;

public class circularqueue {

    static class queue
    {
        static int front=-1;
        static int rear=-1;
        static int arr[];
        static int size;
        queue(int size)
        {
            this.size=size;
            arr=new int[size];
        }
        public static boolean isEmpty()
        {
         return rear==-1 && front==-1;

        }
        public static boolean isFull()
        {
          return (rear+1)%size==front;
        }
        public static void add(int data)
        {
            if(isFull())
            {
                System.out.println("full");
                return ;
            }
            if(front==-1)
            {
                front++;
            }
            rear=(rear+1)%size;
            arr[rear]=data;

        }
        public static void remove()
        {
            if(isEmpty())
            {
                System.out.println("empty");
                return;
            }
            int result=arr[front];
            if(front==rear)
            {
                front=-1;
                rear=-1;
            }
            else {
                front=(front+1)%size;
            }
        }
        public static int peek()
        {
            if(isEmpty())
            {
                System.out.println("empty");
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String[] args) {
        queue q=new queue(4);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.remove();
        q.add(5);
        
    }
}

