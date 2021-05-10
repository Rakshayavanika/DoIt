package com.doit;

import java.time.LocalDate;

public class Task {

    private final String name;
    private final LocalDate date;

    public Task(String name) {
        this.name = name;
        this.date = LocalDate.now();
    }

    public LocalDate getDate() {
        return date;
    }
}
