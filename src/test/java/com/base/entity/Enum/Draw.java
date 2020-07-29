//package com.base.entity.Enum;
//
//import java.awt.BorderLayout;
//import java.awt.Color;
//import java.awt.Dimension;
//import java.awt.Graphics;
//import java.awt.Graphics2D;
//
//import javax.swing.ImageIcon;
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JPanel;
//
//public class Draw extends JPanel{
//    private Repaint[] repaint=new Repaint[100000];//重绘对象数组
////	Graphics g;
////	private Graphics2D g=(Graphics2D) this.getGraphics();
//
//    public static void main(String [] args){
//        Draw draw=new Draw();
//        draw.showUI();
//    }
//
//    public void showUI(){
//        //创建窗体对象
//        JFrame jf=new JFrame(); //改成this 子类
//        jf.setSize(800, 600);
//        jf.setTitle("画板界面");
//        //设置退出进程方法
//        jf.setDefaultCloseOperation(3);
//        //设置居中
//        jf.setLocationRelativeTo(null);
//        //设置背景色
//        jf.getContentPane().setBackground(Color.white);
//        jf.setLayout(new BorderLayout());//设置边框布局
//        //三
//        JPanel northPlane = new JPanel();  //容器
//        northPlane.setBackground(Color.white); //
//        northPlane.setPreferredSize(new Dimension(0, 40));
//        jf.add(northPlane,BorderLayout.NORTH);
//
//        //	JPanel centerPlane = new JPanel();
//        this.setBackground(Color.WHITE);
//        jf.add(this,BorderLayout.CENTER);
//        //san
//
//        DrawMouse mouse=new DrawMouse(this);//新建鼠标监听器
//        //事件监听器
//        //1.事件源：当前动作所发生的组件
//        //2.确定监听器方法：鼠标监听器方法
//        //3.绑定事件处理类
//        String[] shape={"直线","曲线","矩形","圆","三角形","多边形","放射线","橡皮擦","1","2","3"};
//        for(int i=0;i<shape.length;i++){
//            ImageIcon image=new ImageIcon(this.getClass().getResource(shape[i]+".png"));
//            JButton jbu =new JButton(image);
//            jbu.setActionCommand(shape[i]);//添加字符串
//            jbu.setPreferredSize(new Dimension(25, 25));
//            northPlane.add(jbu);
//            jbu.addActionListener(mouse);
//        }
//        Color[] color={Color.BLUE,Color.red,Color.green};
//        for(int i=0;i<color.length;i++){
//            JButton jbu =new JButton();
//            jbu.setBackground(color[i]);
//            jbu.setPreferredSize(new Dimension(30,30));
//            northPlane.add(jbu);
//            jbu.addActionListener(mouse);
//        }
//        jf.setVisible(true);
//
//        //	mouse.setgra(g);
//        mouse.setRepaint(repaint);
//        this.addMouseListener(mouse);//鼠标监听方法
//        this.addMouseMotionListener(mouse);//鼠标拖动事件
//
//
//
//    }
//    /**
//     * 重写绘制组件的方法
//     */
//    public void paint(Graphics g){
//
//        Graphics2D g0=(Graphics2D)g;
//        super.paint(g);
//        //取出数组中的图形对象
//        System.out.println("重绘函数");
//        for(int i=0;i<repaint.length;i++){
//            Repaint rp=repaint[i];
//            if(rp!=null){
//                rp.Drawpaint(g0);
//            }else break;
//        }
//
//    }
//}
//
//
