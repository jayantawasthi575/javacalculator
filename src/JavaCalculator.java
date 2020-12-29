import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import java.util.ArrayList;

public class JavaCalculator extends JFrame implements ActionListener {
    JPanel p1;
    JTextField t1;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;
    String out="",kfc;
    ArrayList<Integer> myy = new ArrayList<Integer>();
    int lk,bim=0,lc=0,m,n;
    JavaCalculator()
    {
        p1=new JPanel();
        p1.setLayout(null);
        setLayout(null);
        setSize(700,390);
        setLocation(400,200);
        setResizable(false);
        getContentPane().setBackground(Color.black);
        t1=new JTextField();
        t1.setBounds(10,10,680,40);
        t1.setFont(new Font("Arial",Font.PLAIN,30));
        add(t1);
        b1=new JButton("1");
        b1.setBounds(10,60,150,50);
        b1.setFont(new Font("Arial",Font.PLAIN,30));
        b1.setBackground(Color.GRAY);
        b1.addActionListener(this);
        add(b1);
        b2=new JButton("2");
        b2.setBounds(170,60,150,50);
        b2.setFont(new Font("Arial",Font.PLAIN,30));
        b2.setBackground(Color.GRAY);
        b2.addActionListener(this);
        add(b2);
        b3=new JButton("3");
        b3.setBounds(340,60,150,50);
        b3.setFont(new Font("Arial",Font.PLAIN,30));
        b3.setBackground(Color.GRAY);
        b3.addActionListener(this);
        add(b3);
        b4=new JButton("+");
        b4.setBounds(510,60,180,50);
        b4.setFont(new Font("Arial",Font.PLAIN,30));
        b4.setBackground(Color.GRAY);
        b4.addActionListener(this);
        add(b4);
        b5=new JButton("4");
        b5.setBounds(10,130,150,50);
        b5.setFont(new Font("Arial",Font.PLAIN,30));
        b5.setBackground(Color.GRAY);
        b5.addActionListener(this);
        add(b5);
        b6=new JButton("5");
        b6.setBounds(170,130,150,50);
        b6.setFont(new Font("Arial",Font.PLAIN,30));
        b6.setBackground(Color.GRAY);
        b6.addActionListener(this);
        add(b6);
        b7=new JButton("6");
        b7.setBounds(340,130,150,50);
        b7.setFont(new Font("Arial",Font.PLAIN,30));
        b7.setBackground(Color.GRAY);
        b7.addActionListener(this);
        add(b7);
        b8=new JButton("-");
        b8.setBounds(510,130,180,50);
        b8.setFont(new Font("Arial",Font.PLAIN,30));
        b8.setBackground(Color.GRAY);
        b8.addActionListener(this);
        add(b8);
        b9=new JButton("7");
        b9.setBounds(10,200,150,50);
        b9.setFont(new Font("Arial",Font.PLAIN,30));
        b9.setBackground(Color.GRAY);
        b9.addActionListener(this);
        add(b9);
        b10=new JButton("8");
        b10.setBounds(170,200,150,50);
        b10.setFont(new Font("Arial",Font.PLAIN,30));
        b10.setBackground(Color.GRAY);
        b10.addActionListener(this);
        add(b10);
        b11=new JButton("9");
        b11.setBounds(340,200,150,50);
        b11.setFont(new Font("Arial",Font.PLAIN,30));
        b11.setBackground(Color.GRAY);
        b11.addActionListener(this);
        add(b11);
        b12=new JButton("*");
        b12.setBounds(510,200,180,50);
        b12.setFont(new Font("Arial",Font.PLAIN,30));
        b12.setBackground(Color.GRAY);
        b12.addActionListener(this);
        add(b12);
        b13=new JButton("/");
        b13.setBounds(10,270,150,50);
        b13.setFont(new Font("Arial",Font.PLAIN,30));
        b13.setBackground(Color.GRAY);
        b13.addActionListener(this);
        add(b13);
        b14=new JButton("!");
        b14.setBounds(170,270,150,50);
        b14.setFont(new Font("Arial",Font.PLAIN,30));
        b14.setBackground(Color.GRAY);
        b14.addActionListener(this);
        add(b14);
        b15=new JButton("<");
        b15.setBounds(340,270,150,50);
        b15.setFont(new Font("Arial",Font.PLAIN,30));
        b15.setBackground(Color.GRAY);
        b15.addActionListener(this);
        add(b15);
        b16=new JButton("=");
        b16.setBounds(510,270,180,50);
        b16.setFont(new Font("Arial",Font.PLAIN,30));
        b16.setBackground(Color.GRAY);
        b16.addActionListener(this);
        add(b16);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        JavaCalculator j1=new JavaCalculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getActionCommand() == "=") {

                for (int kpp = 0; kpp < out.length(); kpp++) {
                    if (kpp > 0) {
                        Character mlp = new Character(out.charAt(kpp));
                        Character mnp = new Character('+');
                        Character mep = new Character('-');
                        Character mkp = new Character('*');
                        Character mcp = new Character('/');
                        if (mlp.equals(mnp) || mlp.equals(mep) || mlp.equals(mkp) || mlp.equals(mcp)) {
                            myy.add(kpp);
                        }
                    }
                }
                int yur = myy.size();
                for (int k = 0; k < out.length(); k++) {
                    if (k > 0) {
                        Character ml = new Character(out.charAt(k));
                        Character mn = new Character('+');
                        Character me = new Character('-');
                        Character mk = new Character('*');
                        Character mc = new Character('/');
                        if (ml.equals(mn) || ml.equals(me) || ml.equals(mk) || ml.equals(mc)) {
                            if (lc == 0) {
                                m = Integer.parseInt(out.substring(0, k));
                                lc = lc + 1;
                            } else {
                                m = lk;
                            }
                            if (yur == 1) {
                                n = Integer.parseInt(out.substring(k + 1));
                            } else if (yur >= 3) {
                                System.out.println(myy.get(bim) + 1);
                                n = Integer.parseInt(out.substring(myy.get(bim) + 1, myy.get(bim + 1)));
                                yur = yur - 1;
                                bim = bim + 1;
                            } else if (yur > 1) {
                                n = Integer.parseInt(out.substring(myy.get(bim) + 1, myy.get(bim + 1)));
                                System.out.println(n);
                                yur = yur - 1;
                            }
                            if (ml == '+') {
                                lk = m + n;
                            } else if (ml == '-') {
                                lk = m - n;
                            } else if (ml == '*') {
                                lk = m * n;
                            } else if (ml == '/') {
                                lk = m / n;
                            }
                        }
                    }
                }
                t1.setText(Integer.toString(lk));
                out = Integer.toString(lk);
                lc = 0;
                bim = 0;
                myy.clear();
            } else if (e.getActionCommand() == "<") {
                out = out.substring(0, out.length() - 1);
                t1.setText(out);
            } else {
                out = out + e.getActionCommand();
                t1.setText(out);
            }
        } catch (Exception e1)
        {
            System.out.println(e1);
            t1.setText("Please do correct manipulation");
            out="";
            bim=0;
            lc=0;
            myy.clear();
        }

    }

}
