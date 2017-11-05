package com.tedict.learning.structural.decorator;

/**
 * Created by raghuteja on 05/11/17.
 */
public class VerticalScrollBarDecorator extends WindowDecorator {
  public VerticalScrollBarDecorator (Window windowToBeDecorated) {
    super(windowToBeDecorated);
  }

  @Override
  public void draw() {
    super.draw();
    drawVerticalScrollBar();
  }

  private void drawVerticalScrollBar() {
    // Draw the vertical scrollbar
  }

  @Override
  public String getDescription() {
    return super.getDescription() + ", including vertical scrollbars";
  }
}
