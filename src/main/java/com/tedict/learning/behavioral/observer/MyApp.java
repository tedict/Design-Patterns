package com.tedict.learning.behavioral.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by raghuteja on 14/10/17.
 */
public class MyApp {
  public static void main(String[] args) {
    System.out.println("Enter Text: ");
    EventSource eventSource = new EventSource();

    eventSource.addObserver(new Observer() {
      public void update(Observable obj, Object arg) {
        System.out.println("Received response: " + arg);
      }
    });

    new Thread(eventSource).start();
  }
}

/*
interface Observer{
    public void update(Observable obj, Object arg);
}*/