package com.example.demo.sec9;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import org.w3c.dom.events.MouseEvent;

class MyPanel extends JPanel implements MouseListener, MouseMotionListener{

  public MyPanel() {
    addMouseListener(this);
    addMouseMotionListener(this);
  }

  @Override
  public void mouseDragged(java.awt.event.MouseEvent e) {
    Graphics g = getGraphics();
    g.setColor(Color.BLACK);
    g.fillOval(e.getX() -2, e.getY() - 2, 5, 5);
  }

  @Override
  public void mouseMoved(java.awt.event.MouseEvent e) {
    System.out.println("マウスが移動しました（" + e.getX() + "、" + e.getY() + "）");
  }

  @Override
  public void mouseClicked(java.awt.event.MouseEvent e) {
    System.out.println("マウスがクリックされました（" + e.getX() +"、" + e.getY() + "）");
  }

  @Override
  public void mousePressed(java.awt.event.MouseEvent e) {
    System.out.println("マウスのボタンが押されました");
  }

  @Override
  public void mouseReleased(java.awt.event.MouseEvent e) {
    System.out.println("マウスのボタンが離されました");
  }

  @Override
  public void mouseEntered(java.awt.event.MouseEvent e) {
    System.out.println("マウスがパネル内に入りました");
  }

  @Override
  public void mouseExited(java.awt.event.MouseEvent e) {
    System.out.println("マウスがパネルの外に入りました");
  }
}

public class MouseEventExample extends JFrame {
  public static void main(String[] args) {
    new MouseEventExample();
  }

  MouseEventExample() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    getContentPane().add(new MyPanel());
    setSize(300, 200);
    setVisible(true);
  }
}
