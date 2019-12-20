package com.sethjava;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {

    public static void main(String[] args) {
        // There are 3 ways to create vector
        // Method 1 - It creates an empty Vector with the default initial capacity of 10.
        Vector vec1 = new Vector();
        System.out.println(" Vector 1 - initial size "+ vec1.size());
        System.out.println(" Vector 1 - initial capacity "+ vec1.capacity());

        // Method 2 - It will create a Vector of initial capacity of 3.
        Vector<String> vec2 = new Vector(3);
        System.out.println(" Vector 2 - initial size "+ vec2.size());
        System.out.println(" Vector 2 - initial capacity "+ vec2.capacity());

        // Method 3 - The initial capacity is 4 and capacityIncrement is 6
        Vector vec3 = new Vector(4, 6);
        System.out.println(" Vector 3 - initial size "+ vec3.size());
        System.out.println(" Vector 3 - initial capacity "+ vec3.capacity());

        /* Adding elements to a vector*/
        vec2.addElement("Apple");
        vec2.addElement("Orange");
        vec2.addElement("Mango");
        vec2.addElement("Fig");

        System.out.println(" Vector 2 - initial size "+ vec2.size());
        System.out.println(" Vector 2 - initial capacity "+ vec2.capacity());

        vec2.addElement("fruit1");
        vec2.addElement("fruit2");
        vec2.addElement("fruit3");


        // Watch out here for capacity
        System.out.println(" Vector 2 - initial size "+ vec2.size());
        System.out.println(" Vector 2 - initial capacity "+ vec2.capacity());

        Enumeration enumeration = vec2.elements();
        System.out.println("\nElements are:");
        while(enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }
    }
}
