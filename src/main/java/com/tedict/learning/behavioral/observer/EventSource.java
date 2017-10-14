package com.tedict.learning.behavioral.observer;

import java.util.Observable;
import java.util.Scanner;

/**
 * Created by raghuteja on 14/10/17.
 */
public class EventSource extends Observable implements Runnable{
  public void run() {
    while (true) {
      String response = new Scanner(System.in).next();
      setChanged();
      notifyObservers(response);
    }
  }
}
