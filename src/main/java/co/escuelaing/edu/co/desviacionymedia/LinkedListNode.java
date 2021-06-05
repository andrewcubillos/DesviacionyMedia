/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.escuelaing.edu.co.desviacionymedia;

/**
 *
 * @author Andrew
 */
public class LinkedListNode<T> {
    private T value;
    private LinkedListNode <T> next;
    LinkedListNode(T t){
        value = t;
        next = null;
       
    }
public void setNext(LinkedListNode nextNode){
    next = nextNode;
}
}
