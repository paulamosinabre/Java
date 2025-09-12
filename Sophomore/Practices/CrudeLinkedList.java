package com.mycompany.linkedlist;

import java.util.Scanner;

public class CrudeLinkedList {

    static class node {

        int data;
        node next;

        node(int value) {
            data = value;
            next = null;
        }
    }

    static node head;

    static void insertAtBegin(int value) {
        node list = new node(value);
        list.next = head;
        head = list;
    }

    static void printList() {
        // start from the head
        node temp = head;

        while (temp != null) {
            System.out.print(" " + temp.data + " ");
            temp = temp.next;
        }
        System.out.println(" ");
    }

    static void delete(int value) {
        node temp = head;
        node prev = null;

        if (temp.data == value) {
            head = temp.next;
            return;
        }

        while (temp != null && temp.data != value) {
            prev = temp;
            temp = temp.next;
        }

        //case 3: if key is not found, exit
        if (temp == null) {
            return;
        }

        //case 4: found + remove the node by skipping it
        prev.next = temp.next;
    }

    static int searchList(int key) {
        node temp = head;

        while (temp != null) {
            if (temp.data == key) {
                return 1;
            }
            temp = temp.next;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a number (-1 to stop): ");
            int num = scan.nextInt();

            if (num == -1) {
                break;
            }

            insertAtBegin(num);
        }
        System.out.println("Linked List: ");
        printList();

        while (true) {
            System.out.println("\nChoose an action: ");
            System.out.println("[1] Add");
            System.out.println("[2] Search");
            System.out.println("[3] Delete");
            System.out.println("[4] Exit");
            System.out.println("Enter your choice: ");
            int action = scan.nextInt();
            
            switch (action) {
                case 1:
                    System.out.println("\nEnter a number: ");
                    int add = scan.nextInt();
                    insertAtBegin(add);
                    System.out.println("Updated List: ");
                    printList();
                    break;
                case 2:
                    System.out.println("\nEnter a number to search: ");
                    int search = scan.nextInt();

                    if (searchList(search) == 1) {
                        System.out.println(search + " is found!");
                    } else {
                        System.out.println(search + " is not found.");
                    }
                    break;
                case 3:
                    System.out.println("\nEnter a number to delete: ");
                    int del = scan.nextInt();
                    delete(del);
                    System.out.println("Updated List: ");
                    printList();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);
            }
        }
    }
}
