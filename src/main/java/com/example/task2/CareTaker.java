package com.example.task2;

import java.util.ArrayDeque;
import java.util.Queue;

public class CareTaker {
    private Queue<Memento> mementoList = new ArrayDeque<>();

    public void push(Memento state) {
        mementoList.add(state);
    }

    public Memento poll() {
        return mementoList.poll();
    }
}