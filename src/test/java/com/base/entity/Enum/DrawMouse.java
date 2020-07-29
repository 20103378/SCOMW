//package com.base.entity.Enum;
//import java.awt.BasicStroke;
//import java.awt.Color;
//import java.awt.Graphics;
//import java.awt.Graphics2D;
//import java.awt.Shape;
//import java.awt.Stroke;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.awt.event.MouseEvent;
//import java.awt.event.MouseListener;
//import java.awt.event.MouseMotionListener;
//
//import javax.swing.JButton;
////import javax.swing.JPanel;
//
//public class DrawMouse implements MouseListener, ActionListener, MouseMotionListener {
//    Color color = Color.BLACK;
//    private int x1, y1, x2, y2, x3, y3, sx0, sy0, sx, sy, dx, dy, dx0, dy0;
//    private int san_flag = 0, duo_flag = 0;
//    private float wi = 1;
//    private String name = "直线";
//    private Repaint[] shape;
//    private int index = 0;
//    private Draw draw;
//    private Graphics2D g;// 保存传递的画笔
//
//    public DrawMouse(Draw draw) {
//        this.draw = draw;
//
//    }
//
//    public void setRepaint(Repaint[] shape) {
//        this.shape = shape;
//    }
//
//    public void actionPerformed(ActionEvent e) {// 按键监听器
//        // g=draw.getGraphics();
//        if (e.getActionCommand().equals("")) {
//            JButton jbu = (JButton) e.getSource();// 获取当前事件源
//            color = jbu.getBackground();
//            g.setColor(color);
//            // System.out.println(color);
//        } else if (e.getActionCommand().equals("1")) {
//            wi = 1.0f;
//        } else if (e.getActionCommand().equals("2")) {
//            wi = 2.0f;
//        } else if (e.getActionCommand().equals("3")) {
//            wi = 3.0f;
//        } else {
//            name = e.getActionCommand();
//        }
//    }
//
//    public void mouseClicked(MouseEvent e) {// 点击
//
//        // g=draw.getGraphics();
//        if (name.equals("三角形") && san_flag == 1) {
//            g.drawLine(e.getX(), e.getY(), sx0, sy0);
//            g.drawLine(e.getX(), e.getY(), sx, sy);
//            Repaint rp = new Repaint(name, g.getColor(), wi, sx0, sy0, sx, sy);
//            rp.setsan(e.getX(), e.getY());
//            shape[index++] = rp;
//            san_flag = 0;
//        } else if (name.equals("多边形") && duo_flag == 1) {
//            g.drawLine(x1, y1, dx, dy);
//            Repaint rp = new Repaint(name, g.getColor(), wi, x1, y1, dx, dy);
//            shape[index++] = rp;
//            if (dx == e.getX() && dy == e.getY()) {
//                g.drawLine(dx0, dy0, x1, y1);
//                Repaint rp0 = new Repaint(name, g.getColor(), wi, x1, y1, dx0, dy0);
//                shape[index++] = rp0;
//                duo_flag = 0;
//            } else {
//                dx = e.getX();
//                dy = e.getY();
//            }
//        }
//    }
//
//    public void mousePressed(MouseEvent e) {// 按下
//        // g = draw.getGraphics();
//        g.setColor(color);
//        x1 = e.getX();
//        y1 = e.getY();
//        System.out.println(x1 + " " + y1);
//
//    }
//
//    public void mouseReleased(MouseEvent e) {// 放开
//        // g=draw.getGraphics();
//        x2 = e.getX();
//        y2 = e.getY();
//        // g.setColor(color);
//        System.out.println(g.getColor());
//        System.out.println(x2 + " " + y2);
//
//        if (name.equals("直线")) {
//            g.drawLine(x1, y1, x2, y2);
//            Repaint rp = new Repaint(name, g.getColor(), wi, x1, y1, x2, y2);
//            shape[index++] = rp;
//        } else if (name.equals("矩形")) {
//            g.drawRect(Math.min(x1, x2), Math.min(y1, y2), Math.abs(x1 - x2), Math.abs(y1 - y2));
//            Repaint rp = new Repaint(name, g.getColor(), wi, x1, y1, x2, y2);
//            shape[index++] = rp;
//        } else if (name.equals("圆")) {
//            g.drawArc(Math.min(x1, x2), Math.min(y2, y1), Math.abs(x1 - x2), Math.abs(y1 - y2), 0, 360);
//            Repaint rp = new Repaint(name, g.getColor(), wi, x1, y1, x2, y2);
//            shape[index++] = rp;
//        } else if (name.equals("三角形") && san_flag == 0) {
//            san_flag = 1;
//            g.drawLine(x1, y1, x2, y2);
//            sx0 = x1;
//            sy0 = y1;
//            sx = x2;
//            sy = y2;
//
//        } else if (name.equals("多边形") && duo_flag == 0) {
//            duo_flag = 1;
//            g.drawLine(x1, y1, x2, y2);
//            Repaint rp = new Repaint(name, g.getColor(), wi, x1, y1, x2, y2);
//            shape[index++] = rp;
//            dx0 = x1;
//            dy0 = y1;
//            dx = x2;
//            dy = y2;
//        }
//    }
//
//    public void mouseEntered(MouseEvent e) {// 进入
//        g = (Graphics2D) draw.getGraphics();
//        g.setStroke(new BasicStroke(wi));
//
//    }
//
//    public void mouseExited(MouseEvent e) {// 退出
//    }
//
//    public void mouseDragged(MouseEvent e) {// 拖动
//        // g.setColor(color);
//        if (shape != null && (!name.equals("橡皮擦"))) {
//            for (int i = 0; i < shape.length; i++) {
//                Repaint rp = shape[i];
//                if (rp != null) {
//                    rp.Drawpaint(g);
//                } else
//                    break;
//            }
//        }
//        // Color c = g.getColor();
//        if (name.equals("直线") || name.equals("三角形")) {
//            g.setColor(Color.white);
//            g.drawLine(x1, y1, x3, y3);
//            x3 = e.getX();
//            y3 = e.getY();
//            g.setColor(color);
//            g.drawLine(x1, y1, x3, y3);
//        } else if (name.equals("矩形")) {
//            g.setColor(Color.white);
//            g.drawRect(Math.min(x1, x3), Math.min(y1, y3), Math.abs(x1 - x3), Math.abs(y1 - y3));
//            x3 = e.getX();
//            y3 = e.getY();
//            g.setColor(color);
//            g.drawRect(Math.min(x1, x3), Math.min(y1, y3), Math.abs(x1 - x3), Math.abs(y1 - y3));
//        } else if (name.equals("圆")) {
//            g.setColor(Color.white);
//            g.drawArc(Math.min(x1, x3), Math.min(y3, y1), Math.abs(x1 - x3), Math.abs(y1 - y3), 0, 360);
//            x3 = e.getX();
//            y3 = e.getY();
//            g.setColor(color);
//            g.drawArc(Math.min(x1, x3), Math.min(y3, y1), Math.abs(x1 - x3), Math.abs(y1 - y3), 0, 360);
//
//        } else if (name.equals("橡皮擦")) {
//            // Color c=g.getColor();
//            g.setColor(Color.white);
//            g.drawLine(e.getX(), e.getY(), x1, y1);
//            Repaint rp = new Repaint(name, g.getColor(), wi, e.getX(), e.getY(), x1, y1);
//            shape[index++] = rp;
//            // g.drawLine(x1, y1, x3, y3);
//            x1 = e.getX();
//            y1 = e.getY();
//        } else if (name.equals("曲线")) {
//            g.setColor(color);
//            g.drawLine(e.getX(), e.getY(), x1, y1);
//            Repaint rp = new Repaint(name, g.getColor(), wi, e.getX(), e.getY(), x1, y1);
//            shape[index++] = rp;
//            // g.drawLine(x1, y1, x3, y3);
//            x1 = e.getX();
//            y1 = e.getY();
//
//        }
//
//    }
//
//    public void mouseMoved(MouseEvent e) {// 移动
//
//        if (shape != null && name.equals("多边形")) {
//            for (int i = 0; i < shape.length; i++) {
//                Repaint rp = shape[i];
//                if (rp != null) {
//                    rp.Drawpaint(g);
//                } else
//                    break;
//            }
//        }
//        Color c = g.getColor();
//        if (name.equals("多边形") && duo_flag == 1) {
//            g.setColor(Color.white);
//            g.drawLine(dx, dy, x3, y3);
//            x3 = e.getX();
//            y3 = e.getY();
//            g.setColor(c);
//            g.drawLine(dx, dy, x3, y3);
//        }
//
//    }
//}
//
//
