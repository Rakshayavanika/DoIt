package com.doit;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TaskTest {

    @Test
    void shouldCreateTaskWithCurrentDate() {

        Task time_sheet = new Task("Time Sheet");

        assertEquals(LocalDate.now(), time_sheet.getDate());
    }
}