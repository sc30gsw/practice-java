package com.example.demo.sec9;

import java.awt.*;
import javax.swing.*;

public class MyPanel extends JPanel {
  public void paintComponent(Graphics g) {
    int N = 20; //円周上の点の数
    int r = 200; //円の半径
    int[] arrayX = new int[N];
    int[] arrayY = new int[N];

    //円周上のx,y座標値を計算して配列に格納
    for (int i = 0; i < N; i++) {
      arrayX[i] = (int) (250 + r * Math.cos(2 * Math.PI * i / N));
      arrayY[i] = (int) (250 + r * Math.sin(2 * Math.PI * i / N));
    }

    //円周上の2点を結ぶ直線を描画
    for (int i = 0; i < N; i++) {
      for (int j = i + 1; j < N; j++) {
        g.drawLine(arrayX[i], arrayY[i], arrayX[j], arrayY[j]);
      }
    }
  }
}
