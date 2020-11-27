package mecanica.app;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import mecanica.frame.MecanicaFrame;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.net.*;

public class Splash extends JFrame {

	private static final long serialVersionUID = 1L;
	private static JLabel lbSplash;          
	private ImageIcon imSplash;

	public static void main(String arg[]){
		
    Splash s = new Splash();
    int a = 0;
          
    s.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    s.setSize(500,300);
    s.getContentPane().setBackground(new Color(51,178,255));
    s.setUndecorated(true);
    s.setLocationRelativeTo(null);
    s.setVisible(true);
    
    JProgressBar ProgressBar = new JProgressBar();
    ProgressBar.setStringPainted(true);
    ProgressBar.setBounds(0, 260, 500, 40);
    ProgressBar.setBackground(new Color(255,255,255));
    ProgressBar.setForeground(new Color(45,173,199));
    s.add(ProgressBar);
    
    JButton link1 = new JButton("Site Desenvolvedor");
    link1.setBounds(0,0,150,20);
    link1.setBackground(Color.WHITE);
    link1.setForeground(Color.BLACK);
    s.add(link1);
    
    link1.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			try{
		    	URI link = new URI("https://vinicius-faria.github.io/Profile/");
		    	Desktop.getDesktop().browse(link);
		    }catch(Exception erro){
		            System.out.println(erro);
		        }
		}
	});
         
    try {
	   for(a = 0; a <= 100; a++){
		   Thread.sleep (30);
		   ProgressBar.setValue(a);
		   if(a<=10){
			    TitledBorder border = BorderFactory.createTitledBorder("Carregando Tabelas");
			    ProgressBar.setBorder(border);
		   }
		   if(10<a){
			    TitledBorder border = BorderFactory.createTitledBorder("Carregando Clientes/Produtos");
			    ProgressBar.setBorder(border);
		   }
		   if(50<a){
			    TitledBorder border = BorderFactory.createTitledBorder("Carregando Veiculos");
			    ProgressBar.setBorder(border);
		   }
		   if(80<a){
			    TitledBorder border = BorderFactory.createTitledBorder("Carregando Contas a Receber");
			    ProgressBar.setBorder(border);
		   }
		   if(100 == a){
			    TitledBorder border = BorderFactory.createTitledBorder("Concluído");
			    ProgressBar.setBorder(border);
		   }
	   }
    }
    catch (InterruptedException ex) {}
   s.dispose();
  }
  
public Splash() {

	setLayout(null);
    imSplash = new ImageIcon(getClass().getResource("/Splash.png"));
    lbSplash = new JLabel(imSplash);
    lbSplash.setBounds(0,0,500,300);
    add(lbSplash);
    setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/mechanic.png")));
     
  }
  
@SuppressWarnings("deprecation")
public void dispose(){
	  
	  MecanicaFrame frame;
	  
	  try {
		frame = new MecanicaFrame();
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.show();
	}catch (SQLException e) {
		e.printStackTrace();
	}
    super.dispose();
  }
    
}
