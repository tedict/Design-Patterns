package com.tedict.learning.structural.decorator;

/**
 * Created by raghuteja on 05/11/17.
 */
public abstract class WindowDecorator implements Window {
  protected Window windowToBeDecorated; // the Window being decorated

  public WindowDecorator (Window windowToBeDecorated) {
    this.windowToBeDecorated = windowToBeDecorated;
  }

  public void draw() {
    windowToBeDecorated.draw(); //Delegation
  }

  public String getDescription() {
    return windowToBeDecorated.getDescription(); //Delegation
  }
}
