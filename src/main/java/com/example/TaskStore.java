package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TaskStore {
    private static final List<String> tasks = new ArrayList<>();

    public static void addTask(String task) {
        tasks.add(task);
    }

    public static List<String> getTasks() {
        return Collections.unmodifiableList(tasks);
    }
}
