//
//            Collection ( interface )
//     Types :
//1.List  (interface)
//2.Set  (interface)
//3.Map  (seperated interface)
//
//1.list :
//	      * Its is index based 
//	      * It allow duplicate value 
//	      * It print Insertion order
//syntax:
//	List<WrapperClass> ref.name =new (Types of list)<WrapperClass>();
//
//Types of list :
//	i).ArrayList     ---|
//   ii).LinkedList     |--->( Class )
//  iii).VectorList  ---|
//
//i).ArrayList :
//	* Searching and retreiving is very easy.
//	* Insertion & Deletion is difficult Asynchronized.
//	* Thread is safe.
//	* Fast process.
//
//ii).LinkedList :
//	* Insertion & Deletion is easy.
//    * Searching & retriving is difficult.
//    * Asynchronized.
//    * Thread is not safe.
//    * fast process.
//
//iii).VectorList :
//	* Synchronized.
//	* Thread is safe.
//	* slow process.
//	
	
package com.collections;

import java.util.ArrayList;
import java.util.List;

public class List_Types {
	public static void main(String[] args) {
		List<Object> l=new ArrayList<Object>();
		
		// (i) add   ( add all the list )
		l.add("VIKEY");
		l.add(46);
		l.add('S');
		l.add("KUMAR");
		System.out.println("ADD the list :");
		System.out.println(l);
		
		//(ii) size    ( total size of list )
		System.out.println("\nsize of list :");
		int size = l.size();
		System.out.println(size);
		
		//(iii) get    ( to Get the list passed by index value )
		System.out.println("\nget the List :");
		Object object = l.get(3);
		System.out.println(object);
		
		//(iv) set     ( TO change the value for particular list )
		System.out.println("\nset the list :");
		l.set(0, "VIKNESH");
		System.out.println(l);
		
		//(v) remove   ( Remove the any list for using index or value )
		System.out.println("\nRemove the list :");
		l.remove("KUMAR");
		System.out.println(l);
		
		//(vi) indexof ( to find the index value using enter the list value )
		System.out.println("\nindexOf list :");
		int indexOf = l.indexOf('S');
		System.out.println(indexOf);
		
		//(vii) contains  ( to check the value for list like true or false)
		System.out.println("\ncontains list :");
		boolean contains = l.contains(46);
		System.out.println(contains);
		
		//(viii) clear  (remove the all value from the list )
//		l.clear();
//		System.out.println(l);
		
		//(ix) add all 
		System.out.println("\nAdd all value :");
		List<Object> l1=new ArrayList<Object>();
		l1.add("VIKNESH");
		l1.add(46);
		l1.add('V');
		l1.add("KUMAR");
		l.addAll(l1);
		System.out.println(l);
		
		//(X) retainall  ( select the same value for all list )
		System.out.println("\nRetain all :");
		l.retainAll(l1);
		System.out.println(l);
		
		//(xi) remove all ( remove all value for all list )
		System.out.println("\nRemove all:");
		l.removeAll(l1);
		System.out.println(l);
	}
	

}

