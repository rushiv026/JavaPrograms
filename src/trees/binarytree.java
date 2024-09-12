package trees;

import org.w3c.dom.Node;

public class binarytree {
    static class Node
    {
        int data;
        Node right;
        Node left;
        Node(int data)
        {
            this.data=data;
            this.right=null;
            this.left=null;

        }
    }
    static class binary
    {
        static int inx=-1;
        public static Node buildNode(int node[])
        {
            inx++;
            if(node[inx]==-1)
            {
                return null;
            }
            Node newnode=new Node(node[inx]);
            newnode.left=buildNode(node);
            newnode.right=buildNode(node);
            return newnode;

        }

    }
    public static void preorder(Node root)
    {
        if(root==null)
        {
           // System.out.print(-1+" ");
            return;

        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args) {
        int node[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        binary b=new binary();
       Node root= b.buildNode(node);
        preorder(root);
    }
}

