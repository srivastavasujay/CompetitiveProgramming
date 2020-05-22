import java.io.*;
import java.util.*;
class Node
{
	int key, height;
	Node left, right;

	Node(int d)
	{
		key = d;
		height = 1;
	}
}

class avl
{
	Node root;

	int height(Node N)
	{
		if (N == null)
			return 0;
		return N.height;
	}

	int max(int a, int b)
	{
		return (a > b) ? a : b;
	}

	Node rightRotate(Node y)
	{
		Node x = y.left;
		Node T2 = x.right;

		x.right = y;
		y.left = T2;

		y.height = max(height(y.left), height(y.right)) + 1;
		x.height = max(height(x.left), height(x.right)) + 1;

		return x;
	}

	Node leftRotate(Node x)
	{
		Node y = x.right;
		Node T2 = y.left;

		y.left = x;
		x.right = T2;

		x.height = max(height(x.left), height(x.right)) + 1;
		y.height = max(height(y.left), height(y.right)) + 1;

		return y;
	}

	int getbal(Node N)
	{
		if (N == null)
			return 0;
		return height(N.left) - height(N.right);
	}

	Node insert(Node node, int key)
	{
		if (node == null)
			return (new Node(key));

		if (key < node.key)
			node.left = insert(node.left, key);
		else if (key > node.key)
			node.right = insert(node.right, key);
		else
			return node;

		node.height = 1 + max(height(node.left),
							height(node.right));

		int bal = getbal(node);

		if (bal > 1 && key < node.left.key)
		{
			System.out.println(node.key);
			return rightRotate(node);
		}
		if (bal < -1 && key > node.right.key)
		{
			System.out.println(node.key);
			return leftRotate(node);
		}
		if (bal > 1 && key > node.left.key)
		{
			System.out.println(node.key);
			node.left = leftRotate(node.left);
			return rightRotate(node);
		}

		if (bal < -1 && key < node.right.key)
		{
			System.out.println(node.key);
			node.right = rightRotate(node.right);
			return leftRotate(node);
		}

		return node;
	}

	Node minValueNode(Node node)
	{
		Node current = node;

		while (current.left != null)
		current = current.left;

		return current;
	}

	Node delete(Node root, int key)
	{
		if (root == null)
			return root;

		if (key < root.key)
			root.left = delete(root.left, key);

		else if (key > root.key)
			root.right = delete(root.right, key);

		else
		{

			if ((root.left == null) || (root.right == null))
			{
				Node temp = null;
				if (temp == root.left)
					temp = root.right;
				else
					temp = root.left;

				if (temp == null)
				{
					temp = root;
					root = null;
				}
				else
					root = temp;
			}
			else
			{

				Node temp = minValueNode(root.right);

				root.key = temp.key;

				root.right = delete(root.right, temp.key);
			}
		}

		if (root == null)
			return root;

		root.height = max(height(root.left), height(root.right)) + 1;

		int bal = getbal(root);

		if (bal > 1 && getbal(root.left) >= 0)
		{
			System.out.println(root.key);
			return rightRotate(root);
		}
		if (bal > 1 && getbal(root.left) < 0)
		{
			System.out.println(root.key);
			root.left = leftRotate(root.left);
			return rightRotate(root);
		}

		if (bal < -1 && getbal(root.right) <= 0)
		{
			System.out.println(root.key);
			return leftRotate(root);
		}
		if (bal < -1 && getbal(root.right) > 0)
		{
			System.out.println(root.key);
			root.right = rightRotate(root.right);
			return leftRotate(root);
		}

		return root;
	}

	void pre(Node node)
	{
		if (node!= null)
		{
			System.out.print(node.key+" ");
			pre(node.left);
			pre(node.right);
		}
	}
	void in(Node node)
	{
		if(node!=null)
		{
			in(node.left);
			System.out.print(node.key+" ");
			in(node.right);
		}
	}
	void post(Node node)
	{
		if(node!=null)
		{
			post(node.left);
			post(node.right);
			System.out.print(node.key+" ");
		}
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		avl ob = new avl();
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			char c=sc.next().charAt(0);
			int x=sc.nextInt();
			if(c=='i')
			{
				ob.root=ob.insert(ob.root,x);
			}
			else if(c=='d')
			{
				ob.root=ob.delete(ob.root,x);
			}
		}

			ob.pre(ob.root);
			System.out.println();
			ob.in(ob.root);
			System.out.println();
			ob.post(ob.root);
	}
}
