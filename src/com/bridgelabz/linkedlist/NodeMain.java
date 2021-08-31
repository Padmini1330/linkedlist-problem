package com.bridgelabz.linkedlist;

public class NodeMain 
{

	public static void main(String[] args) 
	{
		
		Node<Integer> myFirstNode = new Node<>(56);
		Node<Integer> mySecondNode = new Node<>(30);
		Node<Integer> myThirdNode = new Node<>(70);
		LinkedList linkedlist=new LinkedList();
		linkedlist.add(myFirstNode);
		linkedlist.append(myThirdNode);
		linkedlist.insert(myFirstNode,mySecondNode);
		System.out.println("Before deletion:");
		linkedlist.printNodes();
		
		linkedlist.popLast();
		System.out.println("After deletion:");
		linkedlist.printNodes();
		
		
	}
}
