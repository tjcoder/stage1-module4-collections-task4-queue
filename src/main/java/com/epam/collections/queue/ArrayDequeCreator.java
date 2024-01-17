package com.epam.collections.queue;

import java.util.*;

public class ArrayDequeCreator extends PriorityQueue<String> {

    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer> resultQueue = new ArrayDeque<>();

        secondMove(firstQueue, resultQueue);
        secondMove(secondQueue, resultQueue);

        while (!firstQueue.isEmpty()) {
            firstMove(firstQueue, resultQueue);
            secondMove(firstQueue, resultQueue);

            firstMove(secondQueue, resultQueue);
            secondMove(secondQueue, resultQueue);
        }

        return resultQueue;
    }

    private void firstMove(Queue<Integer> queue, ArrayDeque<Integer> resultQueue) {
        Integer card = resultQueue.pollLast();
        if (card != null) {
            queue.add(card);
        }
    }

    private void secondMove(Queue<Integer> queue, ArrayDeque<Integer> resultQueue) {
        Integer card1 = queue.poll();
        if (card1 != null) {
            resultQueue.add(card1);
        }

        Integer card2 = queue.poll();
        if (card2 != null) {
            resultQueue.add(card2);
        }
    }
}