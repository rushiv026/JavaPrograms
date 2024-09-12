package trees;

public class Binaryserchtree {
    static class Node
    {
        int data;
        Node left;
        Node right;
        Node(int data)
        {
            this.data=data;
        }

    }
    public static Node add(Node root,int val)
    {
        if(root==null)
        {
            Node newnode=new Node(val);
            root=newnode;
            return root;
        }
        if(root.data>val)
        {
            root.left=add(root.left,val);

        }
        else
        {
            root.right=add(root.right,val);

        }
        return root;
    }
    public static void pre(Node root)
    {
        if(root==null)
        {
            return;
        }

        pre(root.left);
        System.out.print(root.data+" ");
        pre(root.right);

    }
    public static void main(String[] args) {
        int node[]={5,4,6,8,3,1,2,7,9};
        Node root=null;
        for(int i=0;i<node.length;i++)
        {
            root=add(root,node[i]);
        }
        Binaryserchtree b=new Binaryserchtree();
        b.pre(root);
    }
}
