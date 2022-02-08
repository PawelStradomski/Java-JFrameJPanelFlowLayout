
package jframe.panele.flowlayout;
import javax.swing.*;
import java.awt.*;
/**
 * 
 * @author pawelstradomski
 */

public class JFramePaneleFlowLayout extends JFrame
{

    public JFramePaneleFlowLayout() 
    {
        super("nowy menedzer - Layout");
        this.setBounds(600, 300, 400, 400);
        initComponent();
        this.setDefaultCloseOperation(3);
        this.pack();
        
    }
    public void initComponent()
    {
        button1.setPreferredSize(new Dimension(100, 200));        
        button2.setPreferredSize(button2.getPreferredSize());
        button3.setSize(button3.getPreferredSize());
        
        panel1.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);//ustawia orientacje paneli
        
        panel1.add(button1);                                        //dodajemy do panelu nasze button1-3
        panel1.add(button2);
        this.getContentPane().add(panel1, BorderLayout.CENTER); //dodajemy panel do szybki i ustawiamy jako PAGE_START
        
        //Przyklad - menedzer BorderLayout z poprzedniej lekcji
        this.getContentPane().add(button3, BorderLayout.PAGE_START);
        this.getContentPane().add(new JButton("component4"), BorderLayout.PAGE_END);//pobiera szybke, dodaje nowy JB, ukl.obramowania.npPAGE_END
    
       
    }
    JPanel panel1 = new JPanel(new FlowLayout(FlowLayout.CENTER));//tworzymy panel sluzacy do przytrzymywania componentow.Domyslnie w()mamy ukl.menedzerow FlowLayout()
    
    JButton button1 = new JButton("component1");
    JButton button2 = new JButton("component2");
    JButton button3 = new JButton("component3");
    
    public static void main(String[] args) {
        
       new JFramePaneleFlowLayout().setVisible(true);
    }
    
}
