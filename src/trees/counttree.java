package trees;

public class counttree {
    static class Node
    {
        int data;
        Node l;
        Node r;
        Node(int data)
        {
            this.data=data;
            this.l=null;
            this.r=null;
        }
    }
    public static int index=-1;
    static class binary
    {
       public static Node bulitree(int node[])
       {
           index++;

           if(node[index]==-1)
           {
               return null;
           }
           Node n=new Node(node[index]);
           n.l=bulitree(node);
           n.r=bulitree(node);
           return n;



       }
       public static int count(Node root)
       {
           if(root==null)
           {
               return 0;
           }
           int leftcount=count(root.l);
           int rigthcount=count(root.r);
           return leftcount+rigthcount+1;
       }
       public static int sumofnode(Node root)
       {
           if(root==null)
           {
               return 0;

           }
           int leftsum=sumofnode(root.l);
           int rightsum=sumofnode(root.r);
           return leftsum+rightsum+root.data;
       }
       public static int heigth(Node root)
       {
           if(root==null)
           {
               return 0;

           }
           int leftheight=heigth(root.l);
           int rightheight=heigth(root.r);
           int h=Math.max(leftheight,rightheight)+1;
           return h;
       }
    }

    public static void main(String[] args) {
        int node[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        binary b=new binary();
        Node root=b.bulitree(node);
        System.out.println(root.data);
        System.out.println(b.count(root));
        System.out.println(b.sumofnode(root));
        System.out.println(b.heigth(root));

    }
}
