package com.tedict.learning.structural.decorator;

/**
 * Created by raghuteja on 05/11/17.
 */
public class DecoratedWindowTest {
  public static void main(String[] args) {
    // Create a decorated Window with horizontal and vertical scrollbars
    Window decoratedWindow = new HorizontalScrollBarDecorator (
        new VerticalScrollBarDecorator (
            new SimpleWindow()
        )
    );

    // Print the Window's description
    System.out.println(decoratedWindow.getDescription());
  }
}
