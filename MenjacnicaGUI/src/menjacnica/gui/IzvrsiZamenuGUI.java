package menjacnica.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
import java.beans.VetoableChangeListener;

import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class IzvrsiZamenuGUI extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JTextField textField;
	private JTextField textField_1;
	private JComboBox comboBox;
	private JLabel lblNewLabel_3;
	private JTextField iznos;
	private JLabel lblNewLabel_4;
	private JRadioButton kupovina;
	private JRadioButton prodaja;
	private JSlider slider;
	private JButton btnNewButton;
	private JButton btnNewButton_1;

	private MenjacnicaGUI menjacnica;

	/**
	 * Create the frame.
	 */
	public IzvrsiZamenuGUI(MenjacnicaGUI menjacnica) {
		setTitle("Izvrsi zamenu");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
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
			panel.add(getLblNewLabel_1());
			panel.add(getLblNewLabel_2());
			panel.add(getTextField());
			panel.add(getTextField_1());
			panel.add(getComboBox());
			panel.add(getLblNewLabel_3());
			panel.add(getIznos());
			panel.add(getLblNewLabel_4());
			panel.add(getKupovina());
			panel.add(getProdaja());
			panel.add(getSlider());
			panel.add(getBtnNewButton());
			panel.add(getBtnNewButton_1());
		}
		return panel;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Kupovni kurs");
			lblNewLabel.setBounds(23, 26, 132, 15);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Valuta");
			lblNewLabel_1.setBounds(182, 26, 70, 15);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("Prodajni kurs");
			lblNewLabel_2.setBounds(288, 26, 123, 15);
		}
		return lblNewLabel_2;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setEditable(false);
			textField.setBounds(12, 53, 154, 24);
			textField.setColumns(10);
		}
		return textField;
	}
	private JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setEditable(false);
			textField_1.setBounds(251, 53, 154, 24);
			textField_1.setColumns(10);
		}
		return textField_1;
	}
	private JComboBox getComboBox() {
		if (comboBox == null) {
			comboBox = new JComboBox();
			comboBox.setModel(new DefaultComboBoxModel(new String[] {"EUR", "USD", "CHF"}));
			comboBox.setBounds(182, 53, 57, 24);
		}
		return comboBox;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("Iznos");
			lblNewLabel_3.setBounds(23, 106, 70, 15);
		}
		return lblNewLabel_3;
	}
	private JTextField getIznos() {
		if (iznos == null) {
			iznos = new JTextField();
			iznos.setBounds(12, 133, 154, 24);
			iznos.setColumns(10);
		}
		return iznos;
	}
	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("Vrsta transakcije");
			lblNewLabel_4.setBounds(217, 89, 132, 15);
		}
		return lblNewLabel_4;
	}
	private JRadioButton getKupovina() {
		if (kupovina == null) {
			kupovina = new JRadioButton("Kupovina");
			kupovina.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					kupovina.setSelected(true);
					prodaja.setSelected(false);
				}
			});
			kupovina.setBounds(200, 112, 149, 23);
		}
		return kupovina;
	}
	private JRadioButton getProdaja() {
		if (prodaja == null) {
			prodaja = new JRadioButton("Prodaja");
			prodaja.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					kupovina.setSelected(false);
					prodaja.setSelected(true);
				}
			});
			prodaja.setBounds(200, 133, 149, 23);
		}
		return prodaja;
	}
	private JSlider getSlider() {
		if (slider == null) {
			slider = new JSlider();						
			slider.addChangeListener(new ChangeListener() {
				public void stateChanged(ChangeEvent arg0) {
					iznos.setText(""+slider.getValue());
				}
			});
			slider.setPaintTicks(true);
			slider.setPaintLabels(true);		
			slider.setMajorTickSpacing(10);
			slider.setMinorTickSpacing(5);
			slider.setBounds(12, 169, 399, 48);
		}
		return slider;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Izvrsi zamenu");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (!prodaja.isSelected()){
					menjacnica.statusProstor.setText(menjacnica.statusProstor.getText()+"\n"+"Izvrsi izmenu -->> Iznos: "+iznos.getText()+" Valuta: "+comboBox.getSelectedIndex()+
							"Kupovni.");}
					else {
						menjacnica.statusProstor.setText(menjacnica.statusProstor.getText()+"\n"+"Izvrsi izmenu -->> Iznos: "+iznos.getText()+" Valuta: "+comboBox.getSelectedIndex()+
								"Prodajni.");
					}
					
					dispose();
				}
			});
			btnNewButton.setBounds(39, 221, 149, 25);
		}
		return btnNewButton;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("Odustani");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			btnNewButton_1.setBounds(232, 221, 154, 25);
		}
		return btnNewButton_1;
	}
}
