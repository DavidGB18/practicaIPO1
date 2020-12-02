package presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.Calendar;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class UI_Calendario extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btn7;
	private JButton btn8;
	private JButton btn9;
	private JButton btn10;
	private JButton btn11;
	private JButton btn12;
	private JButton btn13;
	private JButton btn14;
	private JButton btn15;
	private JButton btn16;
	private JButton btn17;
	private JButton btn24;
	private JButton btn23;
	private JButton btn22;
	private JButton btn21;
	private JButton btn20;
	private JButton btn19;
	private JButton btn18;
	private JButton btn25;
	private JButton btn26;
	private JButton btn27;
	private JButton btn28;
	private JButton btn29;
	private JButton btn30;
	private JButton btn31;
	private JButton btn3;
	private JLabel lblL;
	private JLabel lblM;
	private JLabel lblX;
	private JLabel lblJ;
	private JLabel lblV;
	private JLabel lblS;
	private JLabel lblD;
	private JSpinner spinner;
	private JComboBox comboBox;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JButton btn2;
	private JButton btn1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UI_Calendario frame = new UI_Calendario();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public UI_Calendario() {
		addWindowListener(new ThisWindowListener());
		setResizable(false);
		setTitle("Calendario");
		setBounds(100, 100, 505, 460);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		{
			panel = new JPanel();
			contentPane.add(panel, BorderLayout.CENTER);
			GridBagLayout gbl_panel = new GridBagLayout();
			gbl_panel.columnWidths = new int[]{0, 0, 39, 0, 0, 0, 0, 0, 0, 0, 0};
			gbl_panel.rowHeights = new int[]{0, 0, 44, 54, 54, 54, 54, 54, 0, 0};
			gbl_panel.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
			gbl_panel.rowWeights = new double[]{1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
			panel.setLayout(gbl_panel);
			{
				comboBox = new JComboBox();
				comboBox.setEnabled(false);
				comboBox.setModel(new DefaultComboBoxModel(new String[] {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"}));
				GridBagConstraints gbc_comboBox = new GridBagConstraints();
				gbc_comboBox.gridwidth = 2;
				gbc_comboBox.insets = new Insets(0, 0, 5, 5);
				gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
				gbc_comboBox.gridx = 2;
				gbc_comboBox.gridy = 1;
				panel.add(comboBox, gbc_comboBox);
			}
			{
				spinner = new JSpinner();
				spinner.setEnabled(false);
				spinner.setModel(new SpinnerNumberModel(new Integer(2021), null, null, new Integer(0)));
				GridBagConstraints gbc_spinner = new GridBagConstraints();
				gbc_spinner.fill = GridBagConstraints.HORIZONTAL;
				gbc_spinner.gridwidth = 2;
				gbc_spinner.insets = new Insets(0, 0, 5, 5);
				gbc_spinner.gridx = 7;
				gbc_spinner.gridy = 1;
				panel.add(spinner, gbc_spinner);
			}
			{
				lblL = new JLabel("L");
				GridBagConstraints gbc_lblL = new GridBagConstraints();
				gbc_lblL.insets = new Insets(0, 0, 5, 5);
				gbc_lblL.gridx = 2;
				gbc_lblL.gridy = 2;
				panel.add(lblL, gbc_lblL);
			}
			{
				lblM = new JLabel("M");
				GridBagConstraints gbc_lblM = new GridBagConstraints();
				gbc_lblM.insets = new Insets(0, 0, 5, 5);
				gbc_lblM.gridx = 3;
				gbc_lblM.gridy = 2;
				panel.add(lblM, gbc_lblM);
			}
			{
				lblX = new JLabel("X");
				GridBagConstraints gbc_lblX = new GridBagConstraints();
				gbc_lblX.insets = new Insets(0, 0, 5, 5);
				gbc_lblX.gridx = 4;
				gbc_lblX.gridy = 2;
				panel.add(lblX, gbc_lblX);
			}
			{
				lblJ = new JLabel("J");
				GridBagConstraints gbc_lblJ = new GridBagConstraints();
				gbc_lblJ.insets = new Insets(0, 0, 5, 5);
				gbc_lblJ.gridx = 5;
				gbc_lblJ.gridy = 2;
				panel.add(lblJ, gbc_lblJ);
			}
			{
				lblV = new JLabel("V");
				GridBagConstraints gbc_lblV = new GridBagConstraints();
				gbc_lblV.insets = new Insets(0, 0, 5, 5);
				gbc_lblV.gridx = 6;
				gbc_lblV.gridy = 2;
				panel.add(lblV, gbc_lblV);
			}
			{
				lblS = new JLabel("S");
				GridBagConstraints gbc_lblS = new GridBagConstraints();
				gbc_lblS.insets = new Insets(0, 0, 5, 5);
				gbc_lblS.gridx = 7;
				gbc_lblS.gridy = 2;
				panel.add(lblS, gbc_lblS);
			}
			{
				lblD = new JLabel("D");
				GridBagConstraints gbc_lblD = new GridBagConstraints();
				gbc_lblD.insets = new Insets(0, 0, 5, 5);
				gbc_lblD.gridx = 8;
				gbc_lblD.gridy = 2;
				panel.add(lblD, gbc_lblD);
			}
			{
				lblNewLabel = new JLabel("s1");
				GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
				gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
				gbc_lblNewLabel.gridx = 1;
				gbc_lblNewLabel.gridy = 3;
				panel.add(lblNewLabel, gbc_lblNewLabel);
			}
			{
				btn1 = new JButton("1");
				GridBagConstraints gbc_btn1 = new GridBagConstraints();
				gbc_btn1.fill = GridBagConstraints.BOTH;
				gbc_btn1.insets = new Insets(0, 0, 5, 5);
				gbc_btn1.gridx = 6;
				gbc_btn1.gridy = 3;
				panel.add(btn1, gbc_btn1);
			}
			{
				btn2 = new JButton("2");
				GridBagConstraints gbc_btn2 = new GridBagConstraints();
				gbc_btn2.fill = GridBagConstraints.BOTH;
				gbc_btn2.insets = new Insets(0, 0, 5, 5);
				gbc_btn2.gridx = 7;
				gbc_btn2.gridy = 3;
				panel.add(btn2, gbc_btn2);
			}
			{
				btn3 = new JButton("3");
				GridBagConstraints gbc_btn3 = new GridBagConstraints();
				gbc_btn3.fill = GridBagConstraints.BOTH;
				gbc_btn3.insets = new Insets(0, 0, 5, 5);
				gbc_btn3.gridx = 8;
				gbc_btn3.gridy = 3;
				panel.add(btn3, gbc_btn3);
			}
			{
				lblNewLabel_1 = new JLabel("s2");
				GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
				gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
				gbc_lblNewLabel_1.gridx = 1;
				gbc_lblNewLabel_1.gridy = 4;
				panel.add(lblNewLabel_1, gbc_lblNewLabel_1);
			}
			{
				btn4 = new JButton("4");
				GridBagConstraints gbc_btn4 = new GridBagConstraints();
				gbc_btn4.fill = GridBagConstraints.BOTH;
				gbc_btn4.insets = new Insets(0, 0, 5, 5);
				gbc_btn4.gridx = 2;
				gbc_btn4.gridy = 4;
				panel.add(btn4, gbc_btn4);
			}
			{
				btn5 = new JButton("5");
				GridBagConstraints gbc_btn5 = new GridBagConstraints();
				gbc_btn5.fill = GridBagConstraints.BOTH;
				gbc_btn5.insets = new Insets(0, 0, 5, 5);
				gbc_btn5.gridx = 3;
				gbc_btn5.gridy = 4;
				panel.add(btn5, gbc_btn5);
			}
			{
				btn6 = new JButton("6");
				GridBagConstraints gbc_btn6 = new GridBagConstraints();
				gbc_btn6.fill = GridBagConstraints.BOTH;
				gbc_btn6.insets = new Insets(0, 0, 5, 5);
				gbc_btn6.gridx = 4;
				gbc_btn6.gridy = 4;
				panel.add(btn6, gbc_btn6);
			}
			{
				btn7 = new JButton("7");
				GridBagConstraints gbc_btn7 = new GridBagConstraints();
				gbc_btn7.fill = GridBagConstraints.BOTH;
				gbc_btn7.insets = new Insets(0, 0, 5, 5);
				gbc_btn7.gridx = 5;
				gbc_btn7.gridy = 4;
				panel.add(btn7, gbc_btn7);
			}
			{
				btn8 = new JButton("8");
				GridBagConstraints gbc_btn8 = new GridBagConstraints();
				gbc_btn8.fill = GridBagConstraints.BOTH;
				gbc_btn8.insets = new Insets(0, 0, 5, 5);
				gbc_btn8.gridx = 6;
				gbc_btn8.gridy = 4;
				panel.add(btn8, gbc_btn8);
			}
			{
				btn9 = new JButton("9");
				GridBagConstraints gbc_btn9 = new GridBagConstraints();
				gbc_btn9.fill = GridBagConstraints.BOTH;
				gbc_btn9.insets = new Insets(0, 0, 5, 5);
				gbc_btn9.gridx = 7;
				gbc_btn9.gridy = 4;
				panel.add(btn9, gbc_btn9);
			}
			{
				btn10 = new JButton("10");
				GridBagConstraints gbc_btn10 = new GridBagConstraints();
				gbc_btn10.fill = GridBagConstraints.BOTH;
				gbc_btn10.insets = new Insets(0, 0, 5, 5);
				gbc_btn10.gridx = 8;
				gbc_btn10.gridy = 4;
				panel.add(btn10, gbc_btn10);
			}
			{
				lblNewLabel_2 = new JLabel("s3");
				GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
				gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
				gbc_lblNewLabel_2.gridx = 1;
				gbc_lblNewLabel_2.gridy = 5;
				panel.add(lblNewLabel_2, gbc_lblNewLabel_2);
			}
			{
				btn11 = new JButton("11");
				GridBagConstraints gbc_btn11 = new GridBagConstraints();
				gbc_btn11.fill = GridBagConstraints.BOTH;
				gbc_btn11.insets = new Insets(0, 0, 5, 5);
				gbc_btn11.gridx = 2;
				gbc_btn11.gridy = 5;
				panel.add(btn11, gbc_btn11);
			}
			{
				btn12 = new JButton("12");
				GridBagConstraints gbc_btn12 = new GridBagConstraints();
				gbc_btn12.fill = GridBagConstraints.BOTH;
				gbc_btn12.insets = new Insets(0, 0, 5, 5);
				gbc_btn12.gridx = 3;
				gbc_btn12.gridy = 5;
				panel.add(btn12, gbc_btn12);
			}
			{
				btn13 = new JButton("13");
				GridBagConstraints gbc_btn13 = new GridBagConstraints();
				gbc_btn13.fill = GridBagConstraints.BOTH;
				gbc_btn13.insets = new Insets(0, 0, 5, 5);
				gbc_btn13.gridx = 4;
				gbc_btn13.gridy = 5;
				panel.add(btn13, gbc_btn13);
			}
			{
				btn14 = new JButton("14");
				GridBagConstraints gbc_btn14 = new GridBagConstraints();
				gbc_btn14.fill = GridBagConstraints.BOTH;
				gbc_btn14.insets = new Insets(0, 0, 5, 5);
				gbc_btn14.gridx = 5;
				gbc_btn14.gridy = 5;
				panel.add(btn14, gbc_btn14);
			}
			{
				btn15 = new JButton("15");
				GridBagConstraints gbc_btn15 = new GridBagConstraints();
				gbc_btn15.fill = GridBagConstraints.BOTH;
				gbc_btn15.insets = new Insets(0, 0, 5, 5);
				gbc_btn15.gridx = 6;
				gbc_btn15.gridy = 5;
				panel.add(btn15, gbc_btn15);
			}
			{
				btn16 = new JButton("16");
				GridBagConstraints gbc_btn16 = new GridBagConstraints();
				gbc_btn16.fill = GridBagConstraints.BOTH;
				gbc_btn16.insets = new Insets(0, 0, 5, 5);
				gbc_btn16.gridx = 7;
				gbc_btn16.gridy = 5;
				panel.add(btn16, gbc_btn16);
			}
			{
				btn17 = new JButton("17");
				GridBagConstraints gbc_btn17 = new GridBagConstraints();
				gbc_btn17.fill = GridBagConstraints.BOTH;
				gbc_btn17.insets = new Insets(0, 0, 5, 5);
				gbc_btn17.gridx = 8;
				gbc_btn17.gridy = 5;
				panel.add(btn17, gbc_btn17);
			}
			{
				lblNewLabel_3 = new JLabel("s4");
				GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
				gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
				gbc_lblNewLabel_3.gridx = 1;
				gbc_lblNewLabel_3.gridy = 6;
				panel.add(lblNewLabel_3, gbc_lblNewLabel_3);
			}
			{
				btn18 = new JButton("18");
				GridBagConstraints gbc_btn18 = new GridBagConstraints();
				gbc_btn18.fill = GridBagConstraints.BOTH;
				gbc_btn18.insets = new Insets(0, 0, 5, 5);
				gbc_btn18.gridx = 2;
				gbc_btn18.gridy = 6;
				panel.add(btn18, gbc_btn18);
			}
			{
				btn19 = new JButton("19");
				GridBagConstraints gbc_btn19 = new GridBagConstraints();
				gbc_btn19.fill = GridBagConstraints.BOTH;
				gbc_btn19.insets = new Insets(0, 0, 5, 5);
				gbc_btn19.gridx = 3;
				gbc_btn19.gridy = 6;
				panel.add(btn19, gbc_btn19);
			}
			{
				btn20 = new JButton("20");
				GridBagConstraints gbc_btn20 = new GridBagConstraints();
				gbc_btn20.fill = GridBagConstraints.BOTH;
				gbc_btn20.insets = new Insets(0, 0, 5, 5);
				gbc_btn20.gridx = 4;
				gbc_btn20.gridy = 6;
				panel.add(btn20, gbc_btn20);
			}
			{
				btn21 = new JButton("21");
				GridBagConstraints gbc_btn21 = new GridBagConstraints();
				gbc_btn21.fill = GridBagConstraints.BOTH;
				gbc_btn21.insets = new Insets(0, 0, 5, 5);
				gbc_btn21.gridx = 5;
				gbc_btn21.gridy = 6;
				panel.add(btn21, gbc_btn21);
			}
			{
				btn22 = new JButton("22");
				GridBagConstraints gbc_btn22 = new GridBagConstraints();
				gbc_btn22.fill = GridBagConstraints.BOTH;
				gbc_btn22.insets = new Insets(0, 0, 5, 5);
				gbc_btn22.gridx = 6;
				gbc_btn22.gridy = 6;
				panel.add(btn22, gbc_btn22);
			}
			{
				btn23 = new JButton("23");
				GridBagConstraints gbc_btn23 = new GridBagConstraints();
				gbc_btn23.fill = GridBagConstraints.BOTH;
				gbc_btn23.insets = new Insets(0, 0, 5, 5);
				gbc_btn23.gridx = 7;
				gbc_btn23.gridy = 6;
				panel.add(btn23, gbc_btn23);
			}
			{
				btn24 = new JButton("24");
				GridBagConstraints gbc_btn24 = new GridBagConstraints();
				gbc_btn24.fill = GridBagConstraints.BOTH;
				gbc_btn24.insets = new Insets(0, 0, 5, 5);
				gbc_btn24.gridx = 8;
				gbc_btn24.gridy = 6;
				panel.add(btn24, gbc_btn24);
			}
			{
				lblNewLabel_4 = new JLabel("s5");
				GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
				gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
				gbc_lblNewLabel_4.gridx = 1;
				gbc_lblNewLabel_4.gridy = 7;
				panel.add(lblNewLabel_4, gbc_lblNewLabel_4);
			}
			{
				btn25 = new JButton("25");
				GridBagConstraints gbc_btn25 = new GridBagConstraints();
				gbc_btn25.fill = GridBagConstraints.BOTH;
				gbc_btn25.insets = new Insets(0, 0, 5, 5);
				gbc_btn25.gridx = 2;
				gbc_btn25.gridy = 7;
				panel.add(btn25, gbc_btn25);
			}
			{
				btn26 = new JButton("26");
				GridBagConstraints gbc_btn26 = new GridBagConstraints();
				gbc_btn26.fill = GridBagConstraints.BOTH;
				gbc_btn26.insets = new Insets(0, 0, 5, 5);
				gbc_btn26.gridx = 3;
				gbc_btn26.gridy = 7;
				panel.add(btn26, gbc_btn26);
			}
			{
				btn27 = new JButton("27");
				GridBagConstraints gbc_btn27 = new GridBagConstraints();
				gbc_btn27.fill = GridBagConstraints.BOTH;
				gbc_btn27.insets = new Insets(0, 0, 5, 5);
				gbc_btn27.gridx = 4;
				gbc_btn27.gridy = 7;
				panel.add(btn27, gbc_btn27);
			}
			{
				btn28 = new JButton("28");
				GridBagConstraints gbc_btn28 = new GridBagConstraints();
				gbc_btn28.fill = GridBagConstraints.BOTH;
				gbc_btn28.insets = new Insets(0, 0, 5, 5);
				gbc_btn28.gridx = 5;
				gbc_btn28.gridy = 7;
				panel.add(btn28, gbc_btn28);
			}
			{
				btn29 = new JButton("29");
				GridBagConstraints gbc_btn29 = new GridBagConstraints();
				gbc_btn29.fill = GridBagConstraints.BOTH;
				gbc_btn29.insets = new Insets(0, 0, 5, 5);
				gbc_btn29.gridx = 6;
				gbc_btn29.gridy = 7;
				panel.add(btn29, gbc_btn29);
			}
			{
				btn30 = new JButton("30");
				GridBagConstraints gbc_btn30 = new GridBagConstraints();
				gbc_btn30.fill = GridBagConstraints.BOTH;
				gbc_btn30.insets = new Insets(0, 0, 5, 5);
				gbc_btn30.gridx = 7;
				gbc_btn30.gridy = 7;
				panel.add(btn30, gbc_btn30);
			}
			{
				btn31 = new JButton("31");
				GridBagConstraints gbc_btn31 = new GridBagConstraints();
				gbc_btn31.fill = GridBagConstraints.BOTH;
				gbc_btn31.insets = new Insets(0, 0, 5, 5);
				gbc_btn31.gridx = 8;
				gbc_btn31.gridy = 7;
				panel.add(btn31, gbc_btn31);
			}
		}
	}
	
	private class ThisWindowListener extends WindowAdapter {
		public void windowClosing(WindowEvent e) {
			UI_Gestor.setComprobadorCalendario(0);
			dispose();
		}
	}

}
