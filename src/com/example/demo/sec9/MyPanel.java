package com.example.demo.sec9;

import java.awt.*;
import javax.swing.*;

public class MyPanel extends JPanel {
  public void paintComponent(Graphics g) {
    Dimension d = getSize();
    g.drawLine(0, 0, d.width, d.height);
    g.drawLine(0, d.height, d.width, 0);
  }
}
