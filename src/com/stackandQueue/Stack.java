package com.stackandQueue;


public class Stack {
    Node top;
    Node next;
    //Represent a node of the singly linked list
    public class Node {
        int data;
        Node next;
    }
    public void Node() {
        this.top = null;
    }
    /*
      create a method name as push and passing parameter
      the push is Adds an item in the stack. If the stack is full, then it is said to be an Overflow condition.
     */
    public void push(int number) {
        Node node = new Node();
        node.data = number;
        node.next = top;
        top = node;
    }

    /*
     *  create method name as printStack
     */
    public void printStack() {

        Node node = top;

        /*
         * using while loop
         * node is not null then print node data
         */

        while (node != null) {

            System.out.println(node.data);

            node = node.next;

        }
    }
    /*
     * main method all program execute in main method
     */

    public static void main(String[] args) {

        /*
         * create object for Stack class.
         * object name is stackoperation
         */

        Stack stackoperation = new Stack();

        /*
         * calling the method from object name
         * objectname.methodname();
         */

        stackoperation.push(56);   //push operation add 1st element

        stackoperation.push(30);   //push operation add 2nd element

        stackoperation.push(70);   //push operation add 3rd element
        
        stackoperation.printStack();      // print operation

    }
}




