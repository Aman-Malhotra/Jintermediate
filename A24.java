import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
class A24 extends JFrame 
{
    private JSlider slider ;
    
    private A23 myPanel;
    
    public A24()
    {
    super("The title ");
    myPanel=new A23();
    myPanel.setBackground(Color.ORANGE);

    slider = new JSlider(SwingConstants.HORIZONTAL,0,200,10);
    slider.setMajorTickSpacing(10);
    slider.setPaintTicks(true);
    
    slider.addChangeListener(
    new ChangeListener (){
        public void stateChanged(ChangeEvent e){
        myPanel.setD(slider.getValue());
        }
        }
    );
    
    add(slider,BorderLayout.SOUTH);
    add(myPanel,BorderLayout.CENTER);
    }
    
}