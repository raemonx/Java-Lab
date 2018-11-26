import java.applet.*;
import java.applet.Applet;

import java.awt.*;
import java.awt.Graphics;
import java.awt.event.*;
import java.lang.*;

 
public class javaApplet extends Applet implements ActionListener
 {
        Button bttn;
                TextField fieldOne;
                TextField fieldTwo;
                // TextField fieldThree;

        public void init(){
              bttn=new Button("Click Me");
               fieldOne = new TextField();
                 fieldTwo = new TextField();
                  // TextField fieldThree = new TextField();

                bttn.setBounds(10,10,100,50);
                fieldOne.setBounds(10,60,100,50);
                fieldTwo.setBounds(10,110,100,50);
                // fieldThree.setBounds(10,160,50,50);
                add(bttn);
        add(fieldOne);
        add(fieldTwo);
        // add(fieldThree);

        bttn.addActionListener(this);
        setLayout(null);
        }

        public void actionPerformed(ActionEvent ae){
            String sOne= fieldOne.getText();
            String sTwo=fieldTwo.getText();
            // String temp= new String(sOne+sTwo);
            // String temp=new String();
            fieldOne.setText(sTwo);
            fieldTwo.setText(sOne);
            // fieldThree.setText(temp);
        }
        
 }
// <applet code="javaApplet.class" width=1200 height=1200>
// </applet>




