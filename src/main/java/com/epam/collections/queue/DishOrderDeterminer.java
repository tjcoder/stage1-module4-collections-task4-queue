package com.epam.collections.queue;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        List<Integer> resultList = new ArrayList<>();

        Deque<Integer> dishQueue = new LinkedList<>();
        for (int i = 1; i <= numberOfDishes; i++) {
            dishQueue.add(i);
        }

        int index = 0;
        while (!dishQueue.isEmpty()) {
            Integer dish = dishQueue.poll();
            index++;
            if (index == everyDishNumberToEat) {
                resultList.add(dish);
                index = 0;
            } else {
                dishQueue.add(dish);
            }
        }

        return resultList;
    }
}
