package com.bridgelabz.linkedlist;

public class NodeMain 
{

	public static void main(String[] args) 
	{
		
		Node<Integer> myFirstNode = new Node<>(56);
		Node<Integer> mySecondNode = new Node<>(30);
		Node<Integer> myThirdNode = new Node<>(70);
		LinkedList linkedlist=new LinkedList();
		linkedlist.append(myFirstNode);
		linkedlist.append(mySecondNode);
		linkedlist.append(myThirdNode);
		linkedlist.printNodes();
		
	}
}
