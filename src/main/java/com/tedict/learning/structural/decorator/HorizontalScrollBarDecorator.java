package com.tedict.learning.structural.decorator;

/**
 * Created by raghuteja on 05/11/17.
 */
public class HorizontalScrollBarDecorator extends WindowDecorator{
  public HorizontalScrollBarDecorator (Window windowToBeDecorated) {
    super(windowToBeDecorated);
  }

  @Override
  public void draw() {
    super.draw();
    drawHorizontalScrollBar();
  }

  private void drawHorizontalScrollBar() {
    // Draw the horizontal scrollbar
  }

  @Override
  public String getDescription() {
    return super.getDescription() + ", including horizontal scrollbars";
  }
}
