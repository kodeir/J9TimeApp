package com.example.timeapp;

import com.example.timelocal.TimeLocal;

/**
 * Created by Sergei "Kodeir" Riabinin on 26/03/17.
 */
public final class Main {

    public static void main(String[] args) {
        System.out.format("Current time: %s%n", TimeLocal.now());
    }
}
