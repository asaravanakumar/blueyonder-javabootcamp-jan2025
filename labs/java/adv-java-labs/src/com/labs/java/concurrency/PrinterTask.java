package com.labs.java.concurrency;

import java.util.concurrent.Callable;

public class PrinterTask implements Callable<String> {

    @Override
    public String call() throws Exception {
        // TODO: Processing logic goes here
        return Thread.currentThread().getName() + " - Hello BlueYonder!!!";
    }
}
