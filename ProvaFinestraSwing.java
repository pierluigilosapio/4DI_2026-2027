import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class ProvaFinestraSwing {

	public static void main(String[] args) {
		System.out.println("Sto aprendo la finestra");
		
		// Crea un nuovo frame
		JFrame f=new JFrame("PRIMA FINESTRA");
		f.setSize(600, 400);
		
		// crea e aggiunge un nuovo panel
		JPanel p=new JPanel();
		p.setBackground(Color.WHITE);
		
		JLabel lblCognome=new JLabel("COGNOME");
		lblCognome.setSize(100,20);
		lblCognome.setLocation(10,10);
		lblCognome.setBackground(Color.BLACK);
		lblCognome.setForeground(Color.WHITE);
		lblCognome.setOpaque(true);
		lblCognome.setFont(new Font("Arial", Font.BOLD, 14));
		p.add(lblCognome);
		
		JLabel lblNome=new JLabel("NOME");
		lblNome.setSize(100,20);
		lblNome.setLocation(112,10);
		lblNome.setBackground(Color.BLACK);
		lblNome.setForeground(Color.WHITE);
		lblNome.setOpaque(true);
		lblNome.setFont(new Font("Arial", Font.BOLD, 14));
		lblNome.setHorizontalAlignment(SwingConstants.RIGHT);
		p.add(lblNome);
		
		
		JButton btnOK=new JButton();
		btnOK.setSize(50,50);
		System.out.println("x="+(f.getWidth()-btnOK.getWidth()-20));
		System.out.println("y="+(f.getHeight()-btnOK.getHeight()));
		btnOK.setLocation(f.getWidth()-btnOK.getWidth()-20,f.getHeight()-btnOK.getHeight()-50);
		//btnOK.setText("OK");
		//btnOK.setEnabled(false);
		//btnOK.setHorizontalAlignment(SwingConstants.LEFT);
		//btnOK.setBackground(Color.blue);
		btnOK.setBorder(null);
		btnOK.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("actionPerformed");
				
			}
		});
		
		
		Image imageIcon=new ImageIcon(ProvaFinestraSwing.class.getResource("java-coffee-cup-logo.jpg")).getImage();
		Image scaledInstance=imageIcon.getScaledInstance(50,50, Image.SCALE_SMOOTH);
		btnOK.setIcon(new ImageIcon(scaledInstance));
		p.add(btnOK);
		

		// JTextField
		JTextField txtTesto=new JTextField();
		txtTesto.setText("VUOTO");
		txtTesto.setSize(100,50);
		txtTesto.setFont(new Font("VERDANA",Font.BOLD,15));
		txtTesto.setForeground(Color.RED);
		txtTesto.setBackground(Color.GREEN);
		txtTesto.setLocation(0,f.getHeight()-txtTesto.getHeight()-50);
		p.add(txtTesto);
		
		// JTextArea
		JTextArea txaTesto=new JTextArea();
		txaTesto.setSize(100, 100);
		txaTesto.setBackground(Color.GRAY);
		txaTesto.setLocation(0,f.getHeight()-txaTesto.getHeight()-txtTesto.getHeight()-50);
		p.add(txaTesto);
		
		f.setContentPane(p);
		Image icona = new ImageIcon(ProvaFinestraSwing.class.getResource("java-coffee-cup-logo.jpg")).getImage();
		f.setIconImage(icona);
		f.setResizable(true);
		f.setLayout(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		
		
	}

}
