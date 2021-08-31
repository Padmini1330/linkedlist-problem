package com.bridgelabz.linkedlist;

public class NodeMain 
{

	public static void main(String[] args) 
	{
		
		Node<Integer> myFirstNode = new Node(56);
		Node<Integer> mySecondNode = new Node(30);
		Node<Integer> myThirdNode = new Node(70);
		Node<Integer> myFourthNode=new Node(40);
		SortedLinkedList<Integer> sortedLinkedList= new SortedLinkedList<Integer>();
		
		sortedLinkedList.append(myFirstNode);
		sortedLinkedList.append(mySecondNode);
		sortedLinkedList.append(myThirdNode);
		sortedLinkedList.append(myFourthNode);
		sortedLinkedList.sort();
		sortedLinkedList.printNodes();
	}
}

