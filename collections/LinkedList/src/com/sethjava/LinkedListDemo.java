package com.sethjava;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {

    public static void main(String[] args) {
	    /*Customer customer = new Customer("Tim", 54.96);
	    Customer anotherCustomer;
	    anotherCustomer = customer;
	    anotherCustomer.setBalance(12.18);
        System.out.println("Balance for customer "+ customer.getName() + " is "+ customer.getBalance());*/


		LinkedList<String> placesToVisit = new LinkedList<>();
		placesToVisit.add("Sydney");
		placesToVisit.add("Melbourne");
		placesToVisit.add("Brisbane");
		placesToVisit.add("Perth");
		placesToVisit.add("Canberra");
		placesToVisit.add("Adelaid");
		placesToVisit.add("Darwin");

		printList(placesToVisit);

		placesToVisit.add(1, "Alice Spring");
		printList(placesToVisit);

		placesToVisit.remove(4);
		printList(placesToVisit);

		LinkedList<String> placesToVisit1 = new LinkedList<>();
		addInOrder(placesToVisit1,"Sydney");
		addInOrder(placesToVisit1,"Melbourne");
		addInOrder(placesToVisit1,"Brisbane");
		addInOrder(placesToVisit1,"Adelaide");
		printList(placesToVisit1);
    }

	private static void printList(LinkedList<String> placesToVisit) {
		Iterator<String> iterator = placesToVisit.iterator();
		while(iterator.hasNext()){
			System.out.println("Now visiting "+ iterator.next());
		}
		System.out.println("==================");
	}

	private static boolean addInOrder(LinkedList<String> linkedList, String newCity){
		ListIterator<String> listIterator = linkedList.listIterator();
		while(listIterator.hasNext()){
			int comparison = listIterator.next().compareTo(newCity);
			if(comparison == 0){
				// equal do not add
				System.out.println(newCity + " is already included as a destination" );
				return false;
			}else if (comparison > 0){
				// newcity should appear before this one
				listIterator.previous();
				listIterator.add(newCity);
				return true;
			}else if(comparison < 0){
				// move to the next city
			}
		}
		listIterator.add(newCity);
		return true;
	}
}
