package com.example.demo.sec8;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class CheckBoxExample extends JFrame implements ActionListener {
  public static void main(String[] args) {
    new CheckBoxExample();
  }

  JCheckBox checkBox;

  CheckBoxExample() {
    getContentPane().setLayout(new FlowLayout());
    JButton button = new JButton("OK");
    checkBox = new JCheckBox("チェックボックス");
    checkBox.addActionListener(this);
    getContentPane().add(checkBox);
    getContentPane().add(button);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(250, 80);
    setVisible(true);
  }

  public void actionPerformed(ActionEvent ae) {
    if(checkBox.isSelected()) {
      System.out.println("チェックボックスはONです");
    } else {
      System.out.println("チェックボックスはOFFです");
    }
  }
}
