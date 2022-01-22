package com.example.demo.sec9;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyPanel2 extends JPanel implements MouseListener, MouseMotionListener {
  public MyPanel2() {
    addMouseListener(this);
    addMouseMotionListener(this);
    setBackground(Color.WHITE);
  }

  @Override
  public void mouseClicked(MouseEvent e) {
    Graphics g = getGraphics();
    g.setColor(new Color(
      (int) (Math.random() * 256),
      (int) (Math.random() * 256),
      (int) (Math.random() * 256)
    ));
    g.fillRect(e.getX() - 5, e.getY() - 5, 10, 10);
  }

  @Override
  public void mouseDragged(MouseEvent e) {
    Graphics g = getGraphics();
    g.setColor(Color.BLACK);
    g.fillOval(e.getX() - 2, e.getY() - 2, 5, 5);
  }

  @Override
  public void mouseMoved(MouseEvent e) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void mousePressed(MouseEvent e) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void mouseReleased(MouseEvent e) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void mouseEntered(MouseEvent e) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void mouseExited(MouseEvent e) {
    // TODO Auto-generated method stub
    
  }

}
public class SimpleDraw extends JFrame {
  public static void main(String[] args) {
    new SimpleDraw();
  }

  SimpleDraw() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    getContentPane().add(new MyPanel2());
    setSize(600, 400);
    setVisible(true);
  }
}
