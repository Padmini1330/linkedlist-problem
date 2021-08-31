package com.bridgelabz.linkedlist;

public class SortedLinkedList<K extends Comparable<K>> 
{
	private K key;
	private INode head,tail;
	
	public SortedLinkedList() 
	{
		this.tail=null;
		this.head=null;
	}
	
	public void sort() 
	{
		INode<K> current = head, index = null;
		  
	    K temp;
	
	    if (head == null) 
	    {
	        return;
	    }
	    else 
	    {
	        while (current != null) 
	        {
	            index = current.getNext();
	
	            while (index != null) 
	            {
	                if (current.getKey().compareTo(index.getKey())>0) 
	                {
	                    temp = current.getKey();
	                    current.setKey(index.getKey());
	                    index.setKey(temp);
	                }
	
	                index = index.getNext();
	            }
	            current = current.getNext();
	        }
	    }
	}
	
	public void append(INode<K> newNode) 
	{
		if (tail == null)
			this.tail = newNode;
		if (head == null)
			this.head = newNode;
		else
			tail.setNext(newNode);
		tail = newNode;
		
		sort();
	}
	
	public void printNodes() 
	{
		INode tempNode = head;
		while (tempNode != null) 
		{
			System.out.print(tempNode.getKey() + "->");
			tempNode = tempNode.getNext();
		}
		System.out.print("null");
	}

}
