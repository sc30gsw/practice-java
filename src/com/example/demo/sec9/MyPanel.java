package com.example.demo.sec9;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import javax.swing.*;

public class MyPanel extends JPanel {
  public void paintComponent(Graphics g) {
    Graphics2D g2 = (Graphics2D) g;
    //アンチエイリアシングを有効にする
    g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    
    int width = getWidth() - 20;
    int height = getHeight() - 20;

    //円形のオブジェクトを生成
    //グラデーションの設定
    GradientPaint paint = new GradientPaint(0f, 10f, Color.WHITE, 0f, (float)height, Color.BLACK);
    g2.setPaint(paint);

    //グラデーションの設定
    Ellipse2D shape = new Ellipse2D.Double(10, 10, width, height);
    //円形のオブジェクトを描画
    g2.fill(shape);

    //描画色を黒に設定
    g2.setColor(Color.BLACK);
    //線の太さを3にする
    g2.setStroke(new BasicStroke(3));
    //円形のオブジェクトの輪郭線を描画
    g2.draw(shape);
  }
}
