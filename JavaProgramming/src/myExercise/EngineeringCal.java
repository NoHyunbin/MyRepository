package myExercise;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.Toolkit;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import java.io.IOException;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;


public class EngineeringCal extends JFrame implements ActionListener,MouseListener
 {
     
  private JButton      jb_one,jb_two,jb_three,jb_four,jb_five,jb_six,jb_seven,jb_eight,jb_nine,jb_zero;
  private JButton      jb_plus,jb_minus,jb_divide,jb_multiply;
  private JButton      jb_sin,jb_cos,jb_tan,jb_asin,jb_acos,jb_atan,jb_pie,jb_E;
  private JButton      jb_decimalpoint,jb_equalto,jb_fact,jb_power,jb_changesign,jb_reciporcal;
  private JButton      jb_todeg,jb_torad,jb_round,jb_CA,jb_CE,jb_Backspace;
  private JRadioButton jrb_deg,jrb_rad;
  private ButtonGroup  jrb_group;
  private JTextField   jtf_display;
  private JLabel       jl_url;

  private double       tempdisplayNum;
  boolean              plusPressed,minusPressed,mulPressed,divPressed,equalPressed,powerPressed;

  public EngineeringCal()
  {

      super("Engineering Calculator ");

//	  setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);

  
 //     addWindowListener(new WindowAdapter()
 //     {
 //        public void windowClosing(WindowEvent e)
 //           {
 //       	 EngineeringCal.this.dispose();
 //              System.runFinalization();
 //              System.gc();
 //              System.exit(0);
 //           }
 //     });

      tempdisplayNum = 0;
      resetAllButton();
      equalPressed = false;

      JPanel jp_main = new JPanel();
      jp_main.setLayout(new BorderLayout());
      jp_main.setBorder(new EmptyBorder(new Insets(3,5,5,5)));
      
	  JPanel jp_top = new JPanel();
      jp_top.setLayout(new BorderLayout());
      
	  JPanel jp_top_down = new JPanel();
      jp_top_down.setLayout(new BorderLayout());
      
	  JPanel jp_top_west = new JPanel();
      jb_Backspace = new JButton("BackSpace");
      jp_top_west.setLayout(new FlowLayout(FlowLayout.LEFT,0,5));
      jp_top_west.add(jb_Backspace);
      
	  JPanel jp_top_east = new JPanel();
      jp_top_east.setLayout(new FlowLayout(FlowLayout.RIGHT));
      jtf_display = new JTextField();
      jtf_display.setEditable(false);
      jtf_display.setHorizontalAlignment( JTextField.RIGHT );
      
	  jtf_display.setRequestFocusEnabled(false);
      jtf_display.setBackground(Color.white);
      jrb_deg = new JRadioButton("Degrees");
      jrb_rad = new JRadioButton("Radian");
      jrb_deg.setSelected(true);
      jrb_group = new ButtonGroup();
      jrb_group.add(jrb_deg);
      jrb_group.add(jrb_rad);
      jp_top_east.add(jrb_deg);
      jp_top_east.add(jrb_rad);
      jp_top_down.add(jp_top_east,BorderLayout.EAST);
      jp_top_down.add(jp_top_west,BorderLayout.WEST);
      jp_top.setLayout(new BorderLayout());

      JPanel jp_top_top = new JPanel();
      jp_top_top.setLayout(new BorderLayout());

      jp_top_top.add(new JLabel("Press the buttons."),BorderLayout.WEST);

      jp_top.add(jp_top_top,BorderLayout.NORTH);
      jp_top.add(jtf_display,BorderLayout.CENTER);
      jp_top.add(jp_top_down,BorderLayout.SOUTH);
      
	  JPanel jp_center = new JPanel();
      jp_center.setLayout(new GridLayout(5,7,5,5));
      jb_one = new JButton("1");
      jb_two = new JButton("2");
      jb_three = new JButton("3");
      jb_four = new JButton("4");
      jb_five = new JButton("5");
      jb_six  = new JButton("6");
      jb_seven = new JButton("7");
      jb_eight = new JButton("8");
      jb_nine = new JButton("9");
      jb_zero = new JButton("0");
      jb_plus = new JButton("+");
      jb_minus = new JButton("-");
      jb_divide = new JButton("/");
      jb_multiply = new JButton("*");
      jb_sin = new JButton("Sin");
      jb_cos = new JButton("Cos");
      jb_tan = new JButton("Tan");
      jb_asin = new JButton("aSin");
      jb_acos = new JButton("aCos");
      jb_atan = new JButton("aTan");
      jb_pie = new JButton("PI");
      jb_E = new JButton("E");
      jb_decimalpoint = new JButton(".");
      jb_equalto = new JButton("=");
      jb_fact = new JButton("x!");
      jb_power = new JButton("x^n");
      jb_changesign = new JButton("+/-");
      jb_reciporcal = new JButton("1/x");
      jb_todeg = new JButton("toDeg");
      jb_torad = new JButton("toRad");
      jb_round = new JButton("Round");
      jb_CA = new JButton("CA");
      jb_CE = new JButton("CE");

       jb_one.addActionListener(EngineeringCal.this);
       jb_two.addActionListener(EngineeringCal.this);
       jb_three.addActionListener(EngineeringCal.this);
       jb_four.addActionListener(EngineeringCal.this);
       jb_five.addActionListener(EngineeringCal.this);
       jb_six.addActionListener(EngineeringCal.this);
       jb_seven.addActionListener(EngineeringCal.this);
       jb_eight.addActionListener(EngineeringCal.this);
       jb_nine.addActionListener(EngineeringCal.this);
       jb_zero.addActionListener(EngineeringCal.this);
       jb_plus.addActionListener(EngineeringCal.this);
       jb_minus.addActionListener(EngineeringCal.this);
       jb_divide.addActionListener(EngineeringCal.this);
       jb_multiply.addActionListener(EngineeringCal.this);
       jb_sin.addActionListener(EngineeringCal.this);
       jb_cos.addActionListener(EngineeringCal.this);
       jb_tan.addActionListener(EngineeringCal.this);
       jb_asin.addActionListener(EngineeringCal.this);
       jb_acos.addActionListener(EngineeringCal.this);
       jb_atan.addActionListener(EngineeringCal.this);
       jb_pie.addActionListener(EngineeringCal.this);
       jb_E.addActionListener(EngineeringCal.this);
       jb_decimalpoint.addActionListener(EngineeringCal.this);
       jb_equalto.addActionListener(EngineeringCal.this);
       jb_fact.addActionListener(EngineeringCal.this);
       jb_power.addActionListener(EngineeringCal.this);
       jb_changesign.addActionListener(EngineeringCal.this);
       jb_reciporcal.addActionListener(EngineeringCal.this);
       jb_todeg.addActionListener(EngineeringCal.this);
       jb_torad.addActionListener(EngineeringCal.this);
       jb_round.addActionListener(EngineeringCal.this);
       jb_CA.addActionListener(EngineeringCal.this);
       jb_CE.addActionListener(EngineeringCal.this);
       jb_Backspace.addActionListener(EngineeringCal.this);

       jp_center.add(jb_one);
       jp_center.add(jb_two);
       jp_center.add(jb_three);
       jp_center.add(jb_multiply);
       jp_center.add(jb_reciporcal);
       jp_center.add(jb_sin);
       jp_center.add(jb_asin);
       jp_center.add(jb_four);
       jp_center.add(jb_five);
       jp_center.add(jb_six);
       jp_center.add(jb_divide);
       jp_center.add(jb_power);
       jp_center.add(jb_cos);
       jp_center.add(jb_acos);
       jp_center.add(jb_seven);
       jp_center.add(jb_eight);
       jp_center.add(jb_nine);
       jp_center.add(jb_plus);
       jp_center.add(jb_changesign);
       jp_center.add(jb_tan);
       jp_center.add(jb_atan);
       jp_center.add(jb_zero);
       jp_center.add(jb_decimalpoint);
       jp_center.add(jb_equalto);
       jp_center.add(jb_minus);
       jp_center.add(jb_fact);
       jp_center.add(jb_pie);
       jp_center.add(jb_E);
       jp_center.add(jb_CA);
       jp_center.add(jb_CE);
       jp_center.add(jb_round);
       jp_center.add(jb_todeg);
       jp_center.add(jb_torad);

       Container cp = this.getContentPane();
       jp_main.add(jp_top,BorderLayout.NORTH);
       jp_main.add(jp_center,BorderLayout.CENTER);
       cp.add(jp_main,BorderLayout.CENTER);
       setSize(520,250);
     
       pack();
       //ȭ���� ����� �߰��ϴ� ��
       Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
       Dimension frameSize = this.getPreferredSize();
       setLocation(screenSize.width/2 - (frameSize.width/2),screenSize.height/2 - (frameSize.height/2));
       setVisible(true);

       this.requestFocus();
   }


  public void resetAllButton()
  {
     plusPressed  = false;
     minusPressed = false;
     mulPressed   = false;
     divPressed   = false;
     powerPressed = false;
  }

  public String factorial(double num)
  {
   int theNum = (int)num;

     if (theNum < 1)
     {
       JOptionPane.showMessageDialog(EngineeringCal.this,"Cannot find the factorial of numbers less than 1.","Facorial Error",JOptionPane.WARNING_MESSAGE);
         return ("0");
      }
      else
      {
         for (int i=(theNum -1); i > 1; --i)
         theNum *= i;
         return Integer.toString(theNum);
       }
    }

   private void doShowURL(String urlSpec)
   {
       String commandLine;
        if (System.getProperty("os.name").startsWith("Windows"))
        {
            commandLine = "rundll32.exe url.dll,FileProtocolHandler " + urlSpec;
        }
        else
        {
            commandLine = "netscape " + urlSpec;
        }
        try
        {
            Runtime.getRuntime().exec(commandLine);
        }
        catch (IOException ex) {}
    }
 
   public void actionPerformed(ActionEvent e)
   {
     String s = e.getActionCommand();
     String temptext  = jtf_display.getText();
     boolean decimalPointFound = false;
     double displayNumber = 0;
    
     try
     {
       displayNumber = Double.valueOf(jtf_display.getText()).doubleValue();
     }
    catch(NumberFormatException nfe) {}

    if(equalPressed)
    {
      jtf_display.setText("");
      equalPressed = false;
    }


     if(s.equals("1"))
      jtf_display.setText(jtf_display.getText()+"1");
     if(s.equals("2"))
      jtf_display.setText(jtf_display.getText()+"2");
     if(s.equals("3"))
      jtf_display.setText(jtf_display.getText()+"3");
     if(s.equals("4"))
      jtf_display.setText(jtf_display.getText()+"4");
     if(s.equals("5"))
      jtf_display.setText(jtf_display.getText()+"5");
     if(s.equals("6"))
      jtf_display.setText(jtf_display.getText()+"6");
     if(s.equals("7"))
      jtf_display.setText(jtf_display.getText()+"7");
     if(s.equals("8"))
      jtf_display.setText(jtf_display.getText()+"8");
     if(s.equals("9"))
      jtf_display.setText(jtf_display.getText()+"9");

     if(s.equals("0") && !temptext.equals(""))
      jtf_display.setText(jtf_display.getText()+"0");

     if(s.equals("E"))
      jtf_display.setText(Double.toString(Math.E));
     if(s.equals("PI"))
      jtf_display.setText(Double.toString(Math.PI));
     if(s.equals("toDeg"))
     jtf_display.setText(Double.toString(Math.toDegrees(displayNumber)));
     if(s.equals("toRad"))
     jtf_display.setText(Double.toString(Math.toRadians(displayNumber)));

     if(s.equals("CE"))
      jtf_display.setText("");
     if(s.equals("CA"))
     {
       resetAllButton();
       jtf_display.setText("");
     }

    if(s.equals("."))
    {
        for (int i =0; i < temptext.length(); ++i)
        {
          if(temptext.charAt(i) == '.')
          {
            decimalPointFound = true;
            continue;
          }
        }
         if(!decimalPointFound && temptext.length()==0)
          jtf_display.setText("0.");
         if(!decimalPointFound && temptext.length()!=0)
          jtf_display.setText(jtf_display.getText()+".");
     }

   if(s.equals("Sin"))
   {
    if(jrb_deg.isSelected())
      jtf_display.setText(Double.toString(Math.sin((displayNumber*Math.PI)/180)));
    else
    {
      jtf_display.setText(Double.toString(Math.sin(displayNumber)));
  
     }
   }

  if(s.equals("Cos"))
   {
    if(jrb_deg.isSelected())
      jtf_display.setText(Double.toString(Math.cos((displayNumber*Math.PI)/180)));
    else
    {
      jtf_display.setText(Double.toString(Math.cos(displayNumber)));
    
     }
   }

if(s.equals("Tan"))
   {
    if(jrb_deg.isSelected())
      jtf_display.setText(Double.toString(Math.tan((displayNumber*Math.PI)/180)));
    else
    {
      jtf_display.setText(Double.toString(Math.tan(displayNumber)));
     
     }
   }

   if(s.equals("aSin"))
   {
    if(jrb_deg.isSelected())
      jtf_display.setText(Double.toString(Math.asin((displayNumber*Math.PI)/180)));
    else
    {
      jtf_display.setText(Double.toString(Math.asin(displayNumber)));
   
     }
   }

if(s.equals("aCos"))
   {
    if(jrb_deg.isSelected())
      jtf_display.setText(Double.toString(Math.acos((displayNumber*Math.PI)/180)));
    else
    {
      jtf_display.setText(Double.toString(Math.acos(displayNumber)));
   
     }
   }

  if(s.equals("aTan"))
   {
    if(jrb_deg.isSelected())
      jtf_display.setText(Double.toString(Math.atan((displayNumber*Math.PI)/180)));
    else
    {
      jtf_display.setText(Double.toString(Math.atan(displayNumber)));
     
     }
   }

  if(s.equals("*"))
  {
   resetAllButton();
   mulPressed = true;
   try
   {
    tempdisplayNum = displayNumber;
   }
   catch(NumberFormatException mule)
    { tempdisplayNum = 0; }
   jtf_display.setText("");
  }

  if(s.equals("+"))
  {
   resetAllButton();
   plusPressed = true;
   try
   {
   tempdisplayNum = displayNumber;
   }
   catch(NumberFormatException pluse)
    { tempdisplayNum = 0; }
   jtf_display.setText("");
  }

  if(s.equals("-"))
  {
   resetAllButton();
   minusPressed = true;
   try
   {
   tempdisplayNum = displayNumber;
   }
   catch(NumberFormatException sube)
    { tempdisplayNum = 0; }
   jtf_display.setText("");
  }

  if(s.equals("/"))
  {
   resetAllButton();
   divPressed = true;
   try
   {
   tempdisplayNum = displayNumber;
   }
   catch(NumberFormatException dive)
    { tempdisplayNum = 0; }
   jtf_display.setText("");
  }

  if(s.equals("x^n"))
  {
   powerPressed = true;
   try
   {
   tempdisplayNum = displayNumber;
   }
   catch(NumberFormatException dive)
    { tempdisplayNum = 0; }
   jtf_display.setText("");
  }

  if(s.equals("="))
  {
    if(mulPressed)
    jtf_display.setText(Double.toString(tempdisplayNum*displayNumber));
    if(plusPressed)
    jtf_display.setText(Double.toString(tempdisplayNum+displayNumber));
    if(minusPressed)
    jtf_display.setText(Double.toString(tempdisplayNum-displayNumber));
    if(divPressed)
    jtf_display.setText(Double.toString(tempdisplayNum/displayNumber));
    if(powerPressed)
    jtf_display.setText(Double.toString(Math.pow(tempdisplayNum,displayNumber)));

    resetAllButton();
    equalPressed = true;
   }

  if(s.equals("1/x"))
  jtf_display.setText(Double.toString(1/displayNumber));
  if(s.equals("+/-") && displayNumber!=0)
  jtf_display.setText(Double.toString(-displayNumber));
  if(s.equals("x!"))
  jtf_display.setText(factorial(displayNumber));
  if(s.equals("Round"))
  jtf_display.setText(Double.toString(Math.round(displayNumber)));

  if(s.equals("BackSpace"))
  {
  String temptextt = jtf_display.getText();
  if(!temptextt.equals(""))
  jtf_display.setText(temptextt.substring(0, temptextt.length() - 1));
  }

 }

  public void mouseClicked(MouseEvent me)
  {
	doShowURL("http://www.pvphs.com");
  }

  public void mouseEntered(MouseEvent me)
  {
	  jl_url.setForeground(Color.red);
	  setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
  }

  public void mouseExited(MouseEvent me)
  {
	  jl_url.setForeground(Color.blue);
	  setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
  }

  public void mouseReleased(MouseEvent me) {}
  public void mousePressed(MouseEvent me) {}

 
  public static void main(String args[])
   {
    
	 try
	 {
	   UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
   	 }
   	 catch(Exception e)
   	 {}
     new EngineeringCal();
   }
}