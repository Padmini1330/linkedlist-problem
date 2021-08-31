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
	
	public void add(INode newNode) 
	{
		if(this.tail == null) 
		{
			this.tail = newNode;
		}
		if(this.head == null) 
		{
			this.head = newNode;
		}
		else 
		{
			INode tempNode = this.head;
			this.head = newNode;
			this.head.setNext(tempNode);
			
		}
		
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
	

	public void insert(INode myNode, INode newNode )
	{
		INode tempNode=myNode.getNext();
		myNode.setNext(newNode);
		newNode.setNext(tempNode);
		
	}
	
	public void insertWithKey(int key, INode newNode) 
	{
		
		INode nodeWithKeyValue = search(key);
		if(nodeWithKeyValue.getKey().equals(key)) 
		{
			INode tempNode = nodeWithKeyValue.getNext();
			nodeWithKeyValue.setNext(newNode);
			newNode.setNext(tempNode);
		}
		else 
		{
			System.out.println("Key Node Found");
		}
		
	}
	
	public INode pop() 
	{
		INode tempNode=this.head;
		this.head=head.getNext();
		return tempNode;
		
	}
	
	public void popLast() 
	{
		INode previousNode = null, currentNode = head;
		while (currentNode.getNext() != null) 
		{
			previousNode = currentNode;
			currentNode = currentNode.getNext();
		}
		previousNode.setNext(null);
		tail = previousNode;
		System.out.println("Deleted key value: " + currentNode.getKey());
		currentNode = null;
	}
	
	public INode deleteNodeWithKey(int key) 
	{
		
		INode nodeWithKeyValue = search(key);
		
		if(nodeWithKeyValue != null) 
		{
			
			INode tempNode = head;
			while (tempNode!=null && tempNode.getNext() != nodeWithKeyValue) 
			{
				tempNode = tempNode.getNext();
			}
			tempNode.setNext(nodeWithKeyValue.getNext());
			return nodeWithKeyValue;
			
		}
		else 
		{
			System.out.println("Key Node Found");
			return null;
		}
	}
	
	public INode search(int key) {
		INode tempNode = head;
		boolean isFound = false;
		while (tempNode != null  && isFound == false) {
			if(tempNode.getKey().equals(key)) {
				isFound = true;
			}
			else {
				
				tempNode = tempNode.getNext();
			}
		}
		if(isFound)
			return tempNode;
		else 
		{
			return head;
		}
	}

	public int size() 
	{
		int numberOfNode = 0;
		INode tempNode = this.head;
		while(tempNode!=null ) 
		{
			
			tempNode = tempNode.getNext();
			numberOfNode++;
		}
		return numberOfNode;
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
