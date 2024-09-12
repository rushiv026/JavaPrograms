package trees;
///search the element in bst

public class binarysearch {

    static class Node
    {
        int data;
        Node left,rigth;
        Node(int data)
        {
            this.data=data;
            left=null;
            rigth=null;
        }
    }
    public static Node bulidtree(int data,Node root)
    {
        if(root==null)
        {
            Node newnode=new Node(data);
            root=newnode;
            return root;
        }
        if(root.data>data)
        {
            root.left=bulidtree(data,root.left);
        }
        else
        {
            root.rigth=bulidtree(data,root.rigth);
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
        pre(root.rigth);
    }
    public static void main(String[] args) {
        int[] arrr={10,9,11,8,12,3,4,15,16};
        Node root=null;
        for(int i=0;i<arrr.length-1;i++)
        {
            root=bulidtree(arrr[i],root);
        }
        binarysearch b=new binarysearch();
        b.pre(root);
    }


}
