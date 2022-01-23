package com.rusin.QueueInterfaceEx1;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListEx1 {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Zaur");
        queue.add("Oleg");
        queue.add("Ivan");
        queue.add("Mariya");
        queue.add("Aleksandr");
        System.out.println(queue);
        System.out.println(queue.remove());
        System.out.println(queue);
    }
}
