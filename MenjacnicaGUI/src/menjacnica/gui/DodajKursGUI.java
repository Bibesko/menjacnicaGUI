package menjacnica.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

import net.miginfocom.swing.MigLayout;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DodajKursGUI extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblNewLabel;
	private JTextField sifra;
	private JLabel lblNewLabel_1;
	private JTextField naziv;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JTextField prodajniKurs;
	private JTextField kupovniKurs;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JTextField srednjiKurs;
	private JTextField skraceniKurs;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	
	private MenjacnicaGUI menjacnica;

	

	/**
	 * Create the frame.
	 * @param menjacnica 
	 */
	public DodajKursGUI(MenjacnicaGUI menjacnica) {
		setTitle("Dodaj kurs");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 424, 342);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.add(getPanel(), BorderLayout.CENTER);
		
		this.menjacnica = menjacnica;
		
	}

	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setLayout(null);
			panel.add(getLblNewLabel());
			panel.add(getTextField_1());
			panel.add(getLblNewLabel_1());
			panel.add(getTextField_1_1());
			panel.add(getLblNewLabel_2());
			panel.add(getLblNewLabel_3());
			panel.add(getProdajniKurs());
			panel.add(getKupovniKurs());
			panel.add(getLblNewLabel_4());
			panel.add(getLblNewLabel_5());
			panel.add(getSrednjiKurs());
			panel.add(getSkraceniKurs());
			panel.add(getBtnNewButton());
			panel.add(getBtnNewButton_1());
		}
		return panel;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Sifra");
			lblNewLabel.setBounds(12, 26, 70, 15);
		}
		return lblNewLabel;
	}
	private JTextField getTextField_1() {
		if (sifra == null) {
			sifra = new JTextField();
			sifra.setBounds(12, 53, 199, 33);
			sifra.setColumns(10);
		}
		return sifra;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Naziv");
			lblNewLabel_1.setBounds(223, 26, 70, 15);
		}
		return lblNewLabel_1;
	}
	private JTextField getTextField_1_1() {
		if (naziv == null) {
			naziv = new JTextField();
			naziv.setBounds(223, 53, 181, 33);
			naziv.setColumns(10);
		}
		return naziv;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("Prodajni kurs");
			lblNewLabel_2.setBounds(12, 98, 173, 15);
		}
		return lblNewLabel_2;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("Kupovni kurs");
			lblNewLabel_3.setBounds(223, 98, 138, 15);
		}
		return lblNewLabel_3;
	}
	private JTextField getProdajniKurs() {
		if (prodajniKurs == null) {
			prodajniKurs = new JTextField();
			prodajniKurs.setBounds(12, 125, 199, 33);
			prodajniKurs.setColumns(10);
		}
		return prodajniKurs;
	}
	private JTextField getKupovniKurs() {
		if (kupovniKurs == null) {
			kupovniKurs = new JTextField();
			kupovniKurs.setBounds(223, 125, 180, 33);
			kupovniKurs.setColumns(10);
		}
		return kupovniKurs;
	}
	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("Srednji kurs");
			lblNewLabel_4.setBounds(12, 170, 199, 15);
		}
		return lblNewLabel_4;
	}
	private JLabel getLblNewLabel_5() {
		if (lblNewLabel_5 == null) {
			lblNewLabel_5 = new JLabel("Skraceni naziv");
			lblNewLabel_5.setBounds(223, 170, 181, 15);
		}
		return lblNewLabel_5;
	}
	private JTextField getSrednjiKurs() {
		if (srednjiKurs == null) {
			srednjiKurs = new JTextField();
			srednjiKurs.setBounds(12, 197, 199, 33);
			srednjiKurs.setColumns(10);
		}
		return srednjiKurs;
	}
	private JTextField getSkraceniKurs() {
		if (skraceniKurs == null) {
			skraceniKurs = new JTextField();
			skraceniKurs.setBounds(223, 197, 181, 33);
			skraceniKurs.setColumns(10);
		}
		return skraceniKurs;
	}
	private JButton getBtnNewButton() {
		
		
		
		if (btnNewButton == null) {
			btnNewButton = new JButton("Dodaj");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					menjacnica.statusProstor.setText("Sifra: "+sifra.getText()+"Naziv: "+naziv.getText()
							+"Prodajni kurs: "+prodajniKurs.getText()+"Kuponvi kurs: "+kupovniKurs.getText()+"Srednji kurs: "
							+srednjiKurs.getText()+"Skraceni nazvi: "+skraceniKurs.getText());
					
				}
			});
			btnNewButton.setBounds(12, 247, 199, 41);
		}
		return btnNewButton;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("Odustani");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					dispose();
				}
			});
			btnNewButton_1.setBounds(223, 247, 181, 41);
		}
		return btnNewButton_1;
	}
}
