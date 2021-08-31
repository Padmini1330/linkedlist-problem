package com.bridgelabz.linkedlist;

public class LinkedList 
{
	private INode head;
	private INode tail;
	
	public LinkedList() 
	{
		this.head=null;
		this.tail=null;
	}
	public void append(INode newNode)
	{
		if(this.tail ==null)
		{
			this.tail=newNode;
		}
		if(this.head ==null)
		{
			this.head=newNode;
		}
		else
		{
			this.tail.setNext(newNode);
			this.tail=newNode;
		}
		
	}
	
	public void printNodes()
	{
		StringBuffer myNodes=new StringBuffer();
		INode tempNode=head;
		while(tempNode.getNext()!=null)
		{
			myNodes.append(tempNode.getKey());
			if(!tempNode.equals(tail))
				myNodes.append("->");
			tempNode=tempNode.getNext();
		}
		myNodes.append(tempNode.getKey());
		System.out.println(myNodes);
	}
}
