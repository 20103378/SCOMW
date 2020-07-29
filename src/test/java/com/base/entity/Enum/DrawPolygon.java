package com.base.entity.Enum;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Component.*;
import java.awt.Point;
import java.awt.Shape;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Path2D;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.InputEvent;




import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class DrawPolygon extends JFrame{
    static int X, Y;
    private static BufferedImage bI = new BufferedImage(500,500, BufferedImage.TYPE_INT_RGB);


    public static void main(String[] args) {
        new DrawPolygon();
    }

    public DrawPolygon() {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException ex) {
                } catch (InstantiationException ex) {
                } catch (IllegalAccessException ex) {
                } catch (UnsupportedLookAndFeelException ex) {
                }

                JFrame frame = new JFrame("Test");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setLayout(new BorderLayout());
                frame.add(new PolyPane());
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }

        });
    }



    public static class PolyPane extends JPanel {

        private MouseHandler mouseHandler;
        private Path2D currentShape;
        private List<Path2D> lstPloys;
        private Point lastPoint;
        private Point currentPoint;

        private Image img;
        private boolean initialize = true;

        public PolyPane() {
            lstPloys = new ArrayList<>();
        }

        @Override
        public Dimension getPreferredSize() {
            return new Dimension(500, 500);
        }

        @Override
        public void addNotify() {
            super.addNotify();
            addMouseListener(getMouseHandler());
            addMouseMotionListener(getMouseHandler());
        }

        @Override
        public void removeNotify() {
            removeMouseListener(getMouseHandler());
            removeMouseMotionListener(getMouseHandler());
            super.removeNotify();
        }

        public MouseHandler getMouseHandler() {
            if (mouseHandler == null) {
                mouseHandler = new MouseHandler();
            }
            return mouseHandler;
        }

        ////////////akshay
        public void BoundaryFill(int x, int y, Color bColor, Color fColor){
            int current = bI.getRGB(x, y);
            if((current != bColor.getRGB()) && (current != fColor.getRGB())){
                //bI.setRGB(x, y, fColor.getRGB());
                bI.setRGB(x, y, fColor.getRGB());

                repaint();

                BoundaryFill(x+1, y, bColor, fColor);
                BoundaryFill(x-1, y, bColor, fColor);
                BoundaryFill(x, y-1, bColor, fColor);
                BoundaryFill(x, y+1, bColor, fColor);
                BoundaryFill(x+1, y, bColor, fColor);
                BoundaryFill(x-1, y, bColor, fColor);
                BoundaryFill(x, y-1, bColor, fColor);
                BoundaryFill(x, y+1, bColor, fColor);
            }
            else
                return;
        }

        /* @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g.create();
            if (lastPoint != null) {
                g2d.setColor(Color.RED);
                g2d.fillOval(lastPoint.x - 2, lastPoint.y - 2, 4, 4);
            }
            if (currentShape != null) {
                g2d.setColor(Color.RED);
                g2d.draw(currentShape);
                if (lastPoint != null && currentPoint != null) {
                    System.out.println(lastPoint + " - " + currentPoint);
                    g2d.setColor(new Color(255, 0, 0, 64));
                    g2d.draw(new Line2D.Float(lastPoint, currentPoint));
                }
            }
            g2d.setColor(Color.BLACK);
            for (Shape shape : lstPloys) {
                g2d.draw(shape);
            }
            g2d.dispose();
        }*/
        public void paint(Graphics g){
            super.paint(g);
            if(initialize){
                img = (Image) createPolygon();
                g.drawImage(img, 0, 0, null);
                //g.drawI
                //initialize = false;
            }else{
                g.drawImage((Image)bI, 0,0,null);
            }
        }
        public BufferedImage createPolygon(){
            Graphics2D g2d = bI.createGraphics();
            g2d.setColor(Color.white);
            g2d.fillRect(0, 0, 500, 500);
            g2d.setColor(Color.black);


            if (lastPoint != null) {
                g2d.setColor(Color.RED);
                g2d.fillOval(lastPoint.x - 2, lastPoint.y - 2, 4, 4);
            }
            if (currentShape != null) {
                g2d.setColor(Color.RED);
                g2d.draw(currentShape);
                if (lastPoint != null && currentPoint != null) {
                    System.out.println(lastPoint + " - " + currentPoint);
                    g2d.setColor(new Color(255, 0, 0, 64));
                    g2d.draw(new Line2D.Float(lastPoint, currentPoint));
                }
            }
            g2d.setColor(Color.BLACK);
            for (Shape shape : lstPloys) {
                g2d.draw(shape);
            }
            g2d.dispose();
            return bI;

        }




        public class MouseHandler extends MouseAdapter {

            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON1) {
                    if (e.getClickCount() == 1) {
                        System.out.println("first point");
                        Point p = e.getPoint();
                        lastPoint = p;
                        if (currentShape == null) {
                            currentShape = new Path2D.Float();
                            currentShape.moveTo(p.x, p.y);
                        } else {
                            currentShape.lineTo(p.x, p.y);
                        }
                        repaint();
                    } else if (e.getClickCount() == 2) {
                        System.out.println("closed");
                        currentShape.closePath();
                        lstPloys.add(currentShape);
                        currentShape = null;
                        lastPoint = null;
                        repaint();
                    }
                    else if (e.getClickCount() == 3) {
                        ////
//                        initialize = false;

                        X = e.getX();
                        Y = e.getY();
                        System.out.println("Right!!"+X+Y);

                        BoundaryFill(X, Y, Color.black, Color.blue);



                    }

                }
                else if (e.getButton() == MouseEvent.BUTTON3) {
                    if (e.getClickCount() == 1) {


                        System.out.println("Right!!");
                    }
                }
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                if (currentShape != null) {
                    currentPoint = e.getPoint();
                    repaint();
                } else {
                    currentPoint = null;
                }
            }

        }

    }

}
