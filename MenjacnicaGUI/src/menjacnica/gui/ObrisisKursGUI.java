package menjacnica.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ObrisisKursGUI extends JFrame {

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
	private JTextField srednjiKurs;
	private JLabel lblNewLabel_5;
	private JTextField skraceniKurs;
	private JCheckBox chckbxNewCheckBox;
	private JButton obrisi;
	private JButton btnNewButton_1;

	private MenjacnicaGUI menjacnica;

	/**
	 * Create the frame.
	 */
	public ObrisisKursGUI() {
		setResizable(false);
		setTitle("Obrsi kurs");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 420, 340);
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
			panel.add(getSifra());
			panel.add(getLblNewLabel_1());
			panel.add(getNaziv());
			panel.add(getLblNewLabel_2());
			panel.add(getLblNewLabel_3());
			panel.add(getProdajniKurs());
			panel.add(getKupovniKurs());
			panel.add(getLblNewLabel_4());
			panel.add(getSrednjiKurs());
			panel.add(getLblNewLabel_5());
			panel.add(getSkraceniKurs());
			panel.add(getChckbxNewCheckBox());
			panel.add(getObrisi());
			panel.add(getBtnNewButton_1());
		}
		return panel;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Sifra");
			lblNewLabel.setBounds(12, 12, 70, 15);
		}
		return lblNewLabel;
	}
	private JTextField getSifra() {
		if (sifra == null) {
			sifra = new JTextField();
			sifra.setFocusable(false);
			sifra.setBounds(12, 39, 180, 28);
			sifra.setColumns(10);
		}
		return sifra;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Naziv");
			lblNewLabel_1.setBounds(203, 12, 70, 15);
		}
		return lblNewLabel_1;
	}
	private JTextField getNaziv() {
		if (naziv == null) {
			naziv = new JTextField();
			naziv.setFocusable(false);
			naziv.setBounds(203, 39, 180, 28);
			naziv.setColumns(10);
		}
		return naziv;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("Prodajni kurs");
			lblNewLabel_2.setBounds(12, 79, 180, 15);
		}
		return lblNewLabel_2;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("Kupovni kurs");
			lblNewLabel_3.setBounds(203, 79, 174, 15);
		}
		return lblNewLabel_3;
	}
	private JTextField getProdajniKurs() {
		if (prodajniKurs == null) {
			prodajniKurs = new JTextField();
			prodajniKurs.setFocusable(false);
			prodajniKurs.setBounds(12, 106, 180, 28);
			prodajniKurs.setColumns(10);
		}
		return prodajniKurs;
	}
	private JTextField getKupovniKurs() {
		if (kupovniKurs == null) {
			kupovniKurs = new JTextField();
			kupovniKurs.setFocusable(false);
			kupovniKurs.setBounds(203, 106, 180, 28);
			kupovniKurs.setColumns(10);
		}
		return kupovniKurs;
	}
	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("Srednji kurs");
			lblNewLabel_4.setBounds(12, 152, 174, 15);
		}
		return lblNewLabel_4;
	}
	private JTextField getSrednjiKurs() {
		if (srednjiKurs == null) {
			srednjiKurs = new JTextField();
			srednjiKurs.setFocusable(false);
			srednjiKurs.setBounds(12, 179, 180, 28);
			srednjiKurs.setColumns(10);
		}
		return srednjiKurs;
	}
	private JLabel getLblNewLabel_5() {
		if (lblNewLabel_5 == null) {
			lblNewLabel_5 = new JLabel("Skraceni naziv");
			lblNewLabel_5.setBounds(203, 152, 180, 15);
		}
		return lblNewLabel_5;
	}
	private JTextField getSkraceniKurs() {
		if (skraceniKurs == null) {
			skraceniKurs = new JTextField();
			skraceniKurs.setFocusable(false);
			skraceniKurs.setBounds(203, 179, 180, 28);
			skraceniKurs.setColumns(10);
		}
		return skraceniKurs;
	}
	private JCheckBox getChckbxNewCheckBox() {
		if (chckbxNewCheckBox == null) {
			chckbxNewCheckBox = new JCheckBox("Zaista obrisi kurs");
			chckbxNewCheckBox.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {	
					if (chckbxNewCheckBox.isSelected()) {
						obrisi.setEnabled(true);
					}
					else {
						obrisi.setEnabled(false);
					}
				}
			});
			chckbxNewCheckBox.setBounds(12, 215, 214, 23);
		}
		return chckbxNewCheckBox;
	}
	private JButton getObrisi() {
		if (obrisi == null) {
			obrisi = new JButton("Obrisi");
			obrisi.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					menjacnica.statusProstor.setText(menjacnica.statusProstor.getText()+"\n"+"Obrisi knjigu -- >> Sifra: "+
				sifra.getText()+"Naziv: "+naziv.getText()+"Prodajni kurs: "+prodajniKurs.getText()+
				"Kupovni kurs: "+kupovniKurs.getText()+"Srednji kurs: "+srednjiKurs.getText()
				+"Skraceni naziv: "+skraceniKurs.getText());
					dispose();
				}
			});
			obrisi.setEnabled(false);
			obrisi.setBounds(12, 246, 180, 40);
		}
		return obrisi;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("Odustani");
			btnNewButton_1.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			btnNewButton_1.setBounds(203, 246, 180, 40);
		}
		return btnNewButton_1;
	}
}
