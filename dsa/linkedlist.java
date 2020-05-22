import java.util.*;
import java.io.*;

class linkedlist
{
  static node head;

  static class node
  {
    int data;
    node next;

    node(int d){data=d;next=null;}
  }

  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the no. of nodes");
    int n=sc.nextInt();int temp;
    linkedlist ll=new linkedlist();
    node lnode=null;

    for(int i=0;i<n;i++)
    {
      temp=sc.nextInt();
      lnode=new node(temp);
      if(i==0)
      {
        ll.head=lnode;
        ll.head.next=lnode.next;
        System.out.println("node");
      }
      else
      {
        lnode.next=
        System.out.println("node");
      }
    }
      ll.print();
  }

  void print()
  {
    node l=head;
    while(l!=null)
    {
      System.out.println(l.data+" ");
      l=l.next;
    }
  }

}
