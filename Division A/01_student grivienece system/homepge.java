
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class homepge extends JFrame {
    Container c;
    
    JButton btn;
    JPanel homepge;

    public void initialize()  {
        setTitle ( "Home_page");
setSize (500 , 375);
setLocation (100 , 100);
setDefaultCloseOperation(DISPOSE_ON_CLOSE);


c=getContentPane();
c.setLayout(null);

btn=new JButton ("Teacher login") ;
btn.setBounds (150,120,150 ,20);
btn.addActionListener(new ActionListener(){

    

    @Override
    public void actionPerformed(ActionEvent e2) {
        dispose();
        Tlogin tlogin= new Tlogin();
        tlogin.initialize();
        
        
        // TODO Auto-generated method stub
        
    } 
  
});


c.add (btn);


btn=new JButton ("Student Login") ;
btn.setBounds (150,180,150 ,20);
btn.addActionListener(new ActionListener(){

    

    @Override
    public void actionPerformed(ActionEvent e) {
        dispose();
        Signin signin= new Signin();
        signin.initialize();
        
        // TODO Auto-generated method stub
        
    } 
  
});

c.add (btn);


setVisible (true) ;






 
    
}
public static void main(String[] args) {
    homepge Homepge= new homepge();
    Homepge.initialize();
}
}
