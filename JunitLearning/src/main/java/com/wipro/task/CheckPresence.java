package com.wipro.task;
public class CheckPresence {

    public boolean checkPresence(int[] arr, int value) {

        for (int num : arr) {
            if (num == value) {
                return true;
            }
        }

        return false;
    }
}