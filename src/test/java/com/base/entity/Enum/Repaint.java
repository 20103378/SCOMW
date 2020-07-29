package com.base.entity.Enum;

import java.awt.Color;
import java.awt.Graphics;

//图形类
public class Repaint {
    private int x1,y1,x2,y2,x3,y3;
    private String name;
    private Color c;
    public Repaint(String name,Color c,int x1,int y1,int x2,int y2){
        this.name=name;
        this.x1=x1;
        this.x2=x2;
        this.y1=y1;
        this.y2=y2;
        this.c=c;
    }


    public void setsan(int x,int y){
        this.x3=x;
        this.y3=y;
    }
    public void Drawpaint(Graphics g){
        g.setColor(c);
        switch (name){
            case "直线":
                g.drawLine(x1, y1, x2, y2);
                break;
            case "多边形":
                g.drawLine(x1, y1, x2, y2);
                break;
            case "矩形":
                g.drawRect(Math.min(x2, x1), Math.min(y1, y2), Math.abs(x1-x2), Math.abs(y1-y2));
                break;
            case "圆":
                g.drawArc(Math.min(x1, x2), Math.min(y2, y1), Math.abs(x1 - x2), Math.abs(y1 - y2), 0, 360);
                break;
            case "三角形":
                g.drawLine(x1, y1, x2, y2);
                g.drawLine(x1, y1, x3, y3);
                g.drawLine(x3, y3, x2, y2);
                break;
            case "橡皮擦":
                g.clearRect(x1, y1, x2, y2);;
                break;
            case "曲线":
                g.drawLine(x1, y1, x2, y2);
                break;
        }
    }
}
