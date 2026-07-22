package com.wipro.test;


import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.wipro.task.CheckPresence;

public class TestCheckPresence {

    @Test
    public void testValuePresent() {

        CheckPresence cp = new CheckPresence();

        int[] arr = {10, 20, 30, 40, 50};

        assertTrue(cp.checkPresence(arr, 30));
    }

    @Test
    public void testValueNotPresent() {

        CheckPresence cp = new CheckPresence();

        int[] arr = {10, 20, 30, 40, 50};

        assertFalse(cp.checkPresence(arr, 60));
    }
}