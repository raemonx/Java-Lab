import java.awt.Event.*;
import java.awt.*;
import java.applet.*;
class eventHandling extends Applet implements ActionListener{
    Button bttn;
    TextField txtfld;
    void init(){
        txtfld=new TextField();
        bttn=new Button("click me");
        txtfld.setBounds(30, 40, 240, 300);
        bttn.setBounds(30, 40, 230, 400);
        add(bttn);
        add(txtfld);
        bttn.addActionListener(this);
        setLayout(null);
    }
    public void actionPerformed(ActionEvent ae){
        txtfld.setText("welcome");
    }

}