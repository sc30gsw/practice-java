package com.example.demo.sec9;

import java.awt.*;
import javax.swing.*;

public class MyPanel extends JPanel {
  public void paintComponent(Graphics g) {
    g.setColor(Color.RED);
    g.fillRect(10, 10, 100, 200);
    g.setColor(new Color(128, 200, 255));
    g.fillRect(120, 10, 100, 100);
  }
}
