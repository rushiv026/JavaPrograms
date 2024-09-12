package trees;

import java.util.LinkedList;
import java.util.Queue;

public class Binary {
    static class Node
    {
        int data;
        Node left;
        Node right;
        Node(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;

        }
    }
    static class binary
    {
        static int id=-1;
        public static Node buildtree(int node[])
        {
            id++;
            if(node[id]==-1)
            {
                return null;
            }
            Node newnode=new Node(node[id]);
            newnode.left=buildtree(node);
            newnode.right=buildtree(node);
            return newnode;
        }
        public static void preorder(Node root)
        {
            if(root==null)
            {
                return;
            }
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
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
            while (!q.isEmpty())
            {
                Node current=q.remove();
                if(current==null)
                {
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
                    System.out.print(current.data);
                    if(current.left!=null)
                    {
                        q.add(current.left);
                    }
                    if(current.right!=null)
                    {
                        q.add(current.right);
                    }
                }

            }

        }
        public static int count(Node root)
        {
            if(root==null)
            {
                return 0;
            }
            int countleft=count(root.left);
            int countright=count(root.right);
            //
            // System.out.println("countnodeele"+(countleft+countright+root.data));

            return countleft+countright+1;


        }
    }


    public static void main(String[] args) {
        int node[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        binary b=new binary();

        Node root=b.buildtree(node);
        System.out.println(root.data);
        b.preorder(root);
        System.out.println();
        System.out.println("level");
        b.level(root);
        System.out.println("count");
        System.out.println(b.count(root));
    }
}
