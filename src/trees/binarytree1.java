package trees;

import java.util.LinkedList;
import java.util.Queue;

public class binarytree1 {
    static class Node{
        int num;
        Node left;
        Node right;
        Node(int num)
        {
            this.num=num;
            this.left=null;
            this.right=null;
        }

    }
    public static int inx=-1;
    public static Node buildtree(int node[])
    {
        inx++;
        if(node[inx]==-1)
        {
            return null;
        }
        Node newnode=new Node(node[inx]);
        newnode.left=buildtree(node);
        newnode.right=buildtree(node);
        return newnode;

    }
    public static void preorder(Node root)
    {//root,left,right
        if(root==null)
        {
            return;

        }
        System.out.print(root.num+" ");
        preorder(root.left);
        preorder(root.right);

    }
    public static void inorder(Node root)
            //left,root,right;
    {
        if(root==null)
        {
            return;
        }
        inorder(root.left);
        System.out.print(root.num+" ");
        inorder(root.right);

    }
    public static void postorder(Node root)
    {
        if(root==null)
        {
            return;

        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.num+" ");

    }
    public static void level(Node root)
    {
       if(root==null)
       {
           return;
       }
       Queue<Node> q=new LinkedList<>();
       q.add(root);
       q.add(null);
       int x=0;
       int count=0;
       while (!q.isEmpty())
       {
           Node curent=q.remove();

           if(curent==null)
           {
               x++;
               System.out.println();
               if(q.isEmpty())
               {
                   break;
               }
               else
               {
                   q.add(null);
               }
           }
           else
           {
               System.out.print(curent.num+" ");
               if(curent.left!=null)
               {
                   q.add(curent.left);
               }
               if(curent.right!=null)
               {
                   q.add(curent.right);
               }
           }
       }
    }
    public static void main(String[] args) {
        int node[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        binarytree1 b=new binarytree1();
       Node root=b.buildtree(node);
        System.out.println("preorder");
       preorder(root);
        System.out.println();
        System.out.println("inorder");
       inorder(root);
        System.out.println();
        System.out.println("postorder");
        postorder(root);
        System.out.println();
        System.out.println("level");
        level(root);


    }
}
