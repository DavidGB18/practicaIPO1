package presentacion;

import java.awt.BorderLayout;

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
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Toolkit;

public class UI_Calendario extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5816561387594361557L;
	private JPanel contentPane;
	private JPanel panelCalendario;
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
	private JComboBox<String> comboBox;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JButton btn2;
	private JButton btn1;

	/**
	 * Create the frame.
	 */

	public UI_Calendario() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(UI_Calendario.class.getResource("/recursos/logo.png"))); //$NON-NLS-1$
		addWindowListener(new ThisWindowListener());
		setResizable(false);
		setTitle(MessagesUI_Calendario.getString("UI_Calendario.this.title")); //$NON-NLS-1$
		setBounds(100, 100, 505, 460);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		{
			panelCalendario = new JPanel();
			contentPane.add(panelCalendario, BorderLayout.CENTER);
			GridBagLayout gbl_panelCalendario = new GridBagLayout();
			gbl_panelCalendario.columnWidths = new int[]{0, 0, 39, 0, 0, 0, 0, 0, 0, 0, 0};
			gbl_panelCalendario.rowHeights = new int[]{0, 0, 44, 54, 54, 54, 54, 54, 0, 0};
			gbl_panelCalendario.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
			gbl_panelCalendario.rowWeights = new double[]{1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
			panelCalendario.setLayout(gbl_panelCalendario);
			{
				comboBox = new JComboBox<String>();
				comboBox.setEnabled(false);
				comboBox.setModel(new DefaultComboBoxModel<String>(new String[] {MessagesUI_Calendario.getString("UI_Calendario.1"), MessagesUI_Calendario.getString("UI_Calendario.2"), MessagesUI_Calendario.getString("UI_Calendario.3"), MessagesUI_Calendario.getString("UI_Calendario.4"), MessagesUI_Calendario.getString("UI_Calendario.5"), MessagesUI_Calendario.getString("UI_Calendario.6"), MessagesUI_Calendario.getString("UI_Calendario.7"), MessagesUI_Calendario.getString("UI_Calendario.8"), MessagesUI_Calendario.getString("UI_Calendario.9"), MessagesUI_Calendario.getString("UI_Calendario.10"), MessagesUI_Calendario.getString("UI_Calendario.11"), MessagesUI_Calendario.getString("UI_Calendario.12")})); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ //$NON-NLS-7$ //$NON-NLS-8$ //$NON-NLS-9$ //$NON-NLS-10$ //$NON-NLS-11$ //$NON-NLS-12$
				GridBagConstraints gbc_comboBox = new GridBagConstraints();
				gbc_comboBox.gridwidth = 2;
				gbc_comboBox.insets = new Insets(0, 0, 5, 5);
				gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
				gbc_comboBox.gridx = 2;
				gbc_comboBox.gridy = 1;
				panelCalendario.add(comboBox, gbc_comboBox);
			}
			{
				spinner = new JSpinner();
				spinner.setEnabled(false);
				spinner.setModel(new SpinnerNumberModel(2021, null, null, 0));
				GridBagConstraints gbc_spinner = new GridBagConstraints();
				gbc_spinner.fill = GridBagConstraints.HORIZONTAL;
				gbc_spinner.gridwidth = 2;
				gbc_spinner.insets = new Insets(0, 0, 5, 5);
				gbc_spinner.gridx = 7;
				gbc_spinner.gridy = 1;
				panelCalendario.add(spinner, gbc_spinner);
			}
			{
				lblL = new JLabel(MessagesUI_Calendario.getString("UI_Calendario.lblL.text")); //$NON-NLS-1$
				GridBagConstraints gbc_lblL = new GridBagConstraints();
				gbc_lblL.insets = new Insets(0, 0, 5, 5);
				gbc_lblL.gridx = 2;
				gbc_lblL.gridy = 2;
				panelCalendario.add(lblL, gbc_lblL);
			}
			{
				lblM = new JLabel(MessagesUI_Calendario.getString("UI_Calendario.lblM.text")); //$NON-NLS-1$
				GridBagConstraints gbc_lblM = new GridBagConstraints();
				gbc_lblM.insets = new Insets(0, 0, 5, 5);
				gbc_lblM.gridx = 3;
				gbc_lblM.gridy = 2;
				panelCalendario.add(lblM, gbc_lblM);
			}
			{
				lblX = new JLabel(MessagesUI_Calendario.getString("UI_Calendario.lblX.text")); //$NON-NLS-1$
				GridBagConstraints gbc_lblX = new GridBagConstraints();
				gbc_lblX.insets = new Insets(0, 0, 5, 5);
				gbc_lblX.gridx = 4;
				gbc_lblX.gridy = 2;
				panelCalendario.add(lblX, gbc_lblX);
			}
			{
				lblJ = new JLabel(MessagesUI_Calendario.getString("UI_Calendario.lblJ.text")); //$NON-NLS-1$
				GridBagConstraints gbc_lblJ = new GridBagConstraints();
				gbc_lblJ.insets = new Insets(0, 0, 5, 5);
				gbc_lblJ.gridx = 5;
				gbc_lblJ.gridy = 2;
				panelCalendario.add(lblJ, gbc_lblJ);
			}
			{
				lblV = new JLabel(MessagesUI_Calendario.getString("UI_Calendario.lblV.text")); //$NON-NLS-1$
				GridBagConstraints gbc_lblV = new GridBagConstraints();
				gbc_lblV.insets = new Insets(0, 0, 5, 5);
				gbc_lblV.gridx = 6;
				gbc_lblV.gridy = 2;
				panelCalendario.add(lblV, gbc_lblV);
			}
			{
				lblS = new JLabel(MessagesUI_Calendario.getString("UI_Calendario.lblS.text")); //$NON-NLS-1$
				GridBagConstraints gbc_lblS = new GridBagConstraints();
				gbc_lblS.insets = new Insets(0, 0, 5, 5);
				gbc_lblS.gridx = 7;
				gbc_lblS.gridy = 2;
				panelCalendario.add(lblS, gbc_lblS);
			}
			{
				lblD = new JLabel(MessagesUI_Calendario.getString("UI_Calendario.lblD.text")); //$NON-NLS-1$
				GridBagConstraints gbc_lblD = new GridBagConstraints();
				gbc_lblD.insets = new Insets(0, 0, 5, 5);
				gbc_lblD.gridx = 8;
				gbc_lblD.gridy = 2;
				panelCalendario.add(lblD, gbc_lblD);
			}
			{
				lblNewLabel = new JLabel(MessagesUI_Calendario.getString("UI_Calendario.lblNewLabel.text")); //$NON-NLS-1$
				GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
				gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
				gbc_lblNewLabel.gridx = 1;
				gbc_lblNewLabel.gridy = 3;
				panelCalendario.add(lblNewLabel, gbc_lblNewLabel);
			}
			{
				btn1 = new JButton(MessagesUI_Calendario.getString("UI_Calendario.btn1.text")); //$NON-NLS-1$
				GridBagConstraints gbc_btn1 = new GridBagConstraints();
				gbc_btn1.fill = GridBagConstraints.BOTH;
				gbc_btn1.insets = new Insets(0, 0, 5, 5);
				gbc_btn1.gridx = 6;
				gbc_btn1.gridy = 3;
				panelCalendario.add(btn1, gbc_btn1);
			}
			{
				btn2 = new JButton(MessagesUI_Calendario.getString("UI_Calendario.btn2.text")); //$NON-NLS-1$
				GridBagConstraints gbc_btn2 = new GridBagConstraints();
				gbc_btn2.fill = GridBagConstraints.BOTH;
				gbc_btn2.insets = new Insets(0, 0, 5, 5);
				gbc_btn2.gridx = 7;
				gbc_btn2.gridy = 3;
				panelCalendario.add(btn2, gbc_btn2);
			}
			{
				btn3 = new JButton(MessagesUI_Calendario.getString("UI_Calendario.btn3.text")); //$NON-NLS-1$
				GridBagConstraints gbc_btn3 = new GridBagConstraints();
				gbc_btn3.fill = GridBagConstraints.BOTH;
				gbc_btn3.insets = new Insets(0, 0, 5, 5);
				gbc_btn3.gridx = 8;
				gbc_btn3.gridy = 3;
				panelCalendario.add(btn3, gbc_btn3);
			}
			{
				lblNewLabel_1 = new JLabel(MessagesUI_Calendario.getString("UI_Calendario.lblNewLabel_1.text")); //$NON-NLS-1$
				GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
				gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
				gbc_lblNewLabel_1.gridx = 1;
				gbc_lblNewLabel_1.gridy = 4;
				panelCalendario.add(lblNewLabel_1, gbc_lblNewLabel_1);
			}
			{
				btn4 = new JButton(MessagesUI_Calendario.getString("UI_Calendario.btn4.text")); //$NON-NLS-1$
				GridBagConstraints gbc_btn4 = new GridBagConstraints();
				gbc_btn4.fill = GridBagConstraints.BOTH;
				gbc_btn4.insets = new Insets(0, 0, 5, 5);
				gbc_btn4.gridx = 2;
				gbc_btn4.gridy = 4;
				panelCalendario.add(btn4, gbc_btn4);
			}
			{
				btn5 = new JButton(MessagesUI_Calendario.getString("UI_Calendario.btn5.text")); //$NON-NLS-1$
				GridBagConstraints gbc_btn5 = new GridBagConstraints();
				gbc_btn5.fill = GridBagConstraints.BOTH;
				gbc_btn5.insets = new Insets(0, 0, 5, 5);
				gbc_btn5.gridx = 3;
				gbc_btn5.gridy = 4;
				panelCalendario.add(btn5, gbc_btn5);
			}
			{
				btn6 = new JButton(MessagesUI_Calendario.getString("UI_Calendario.btn6.text")); //$NON-NLS-1$
				GridBagConstraints gbc_btn6 = new GridBagConstraints();
				gbc_btn6.fill = GridBagConstraints.BOTH;
				gbc_btn6.insets = new Insets(0, 0, 5, 5);
				gbc_btn6.gridx = 4;
				gbc_btn6.gridy = 4;
				panelCalendario.add(btn6, gbc_btn6);
			}
			{
				btn7 = new JButton(MessagesUI_Calendario.getString("UI_Calendario.btn7.text")); //$NON-NLS-1$
				GridBagConstraints gbc_btn7 = new GridBagConstraints();
				gbc_btn7.fill = GridBagConstraints.BOTH;
				gbc_btn7.insets = new Insets(0, 0, 5, 5);
				gbc_btn7.gridx = 5;
				gbc_btn7.gridy = 4;
				panelCalendario.add(btn7, gbc_btn7);
			}
			{
				btn8 = new JButton(MessagesUI_Calendario.getString("UI_Calendario.btn8.text")); //$NON-NLS-1$
				GridBagConstraints gbc_btn8 = new GridBagConstraints();
				gbc_btn8.fill = GridBagConstraints.BOTH;
				gbc_btn8.insets = new Insets(0, 0, 5, 5);
				gbc_btn8.gridx = 6;
				gbc_btn8.gridy = 4;
				panelCalendario.add(btn8, gbc_btn8);
			}
			{
				btn9 = new JButton(MessagesUI_Calendario.getString("UI_Calendario.btn9.text")); //$NON-NLS-1$
				GridBagConstraints gbc_btn9 = new GridBagConstraints();
				gbc_btn9.fill = GridBagConstraints.BOTH;
				gbc_btn9.insets = new Insets(0, 0, 5, 5);
				gbc_btn9.gridx = 7;
				gbc_btn9.gridy = 4;
				panelCalendario.add(btn9, gbc_btn9);
			}
			{
				btn10 = new JButton(MessagesUI_Calendario.getString("UI_Calendario.btn10.text")); //$NON-NLS-1$
				GridBagConstraints gbc_btn10 = new GridBagConstraints();
				gbc_btn10.fill = GridBagConstraints.BOTH;
				gbc_btn10.insets = new Insets(0, 0, 5, 5);
				gbc_btn10.gridx = 8;
				gbc_btn10.gridy = 4;
				panelCalendario.add(btn10, gbc_btn10);
			}
			{
				lblNewLabel_2 = new JLabel(MessagesUI_Calendario.getString("UI_Calendario.lblNewLabel_2.text")); //$NON-NLS-1$
				GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
				gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
				gbc_lblNewLabel_2.gridx = 1;
				gbc_lblNewLabel_2.gridy = 5;
				panelCalendario.add(lblNewLabel_2, gbc_lblNewLabel_2);
			}
			{
				btn11 = new JButton(MessagesUI_Calendario.getString("UI_Calendario.btn11.text")); //$NON-NLS-1$
				GridBagConstraints gbc_btn11 = new GridBagConstraints();
				gbc_btn11.fill = GridBagConstraints.BOTH;
				gbc_btn11.insets = new Insets(0, 0, 5, 5);
				gbc_btn11.gridx = 2;
				gbc_btn11.gridy = 5;
				panelCalendario.add(btn11, gbc_btn11);
			}
			{
				btn12 = new JButton(MessagesUI_Calendario.getString("UI_Calendario.btn12.text")); //$NON-NLS-1$
				GridBagConstraints gbc_btn12 = new GridBagConstraints();
				gbc_btn12.fill = GridBagConstraints.BOTH;
				gbc_btn12.insets = new Insets(0, 0, 5, 5);
				gbc_btn12.gridx = 3;
				gbc_btn12.gridy = 5;
				panelCalendario.add(btn12, gbc_btn12);
			}
			{
				btn13 = new JButton(MessagesUI_Calendario.getString("UI_Calendario.btn13.text")); //$NON-NLS-1$
				GridBagConstraints gbc_btn13 = new GridBagConstraints();
				gbc_btn13.fill = GridBagConstraints.BOTH;
				gbc_btn13.insets = new Insets(0, 0, 5, 5);
				gbc_btn13.gridx = 4;
				gbc_btn13.gridy = 5;
				panelCalendario.add(btn13, gbc_btn13);
			}
			{
				btn14 = new JButton(MessagesUI_Calendario.getString("UI_Calendario.btn14.text")); //$NON-NLS-1$
				GridBagConstraints gbc_btn14 = new GridBagConstraints();
				gbc_btn14.fill = GridBagConstraints.BOTH;
				gbc_btn14.insets = new Insets(0, 0, 5, 5);
				gbc_btn14.gridx = 5;
				gbc_btn14.gridy = 5;
				panelCalendario.add(btn14, gbc_btn14);
			}
			{
				btn15 = new JButton(MessagesUI_Calendario.getString("UI_Calendario.btn15.text")); //$NON-NLS-1$
				GridBagConstraints gbc_btn15 = new GridBagConstraints();
				gbc_btn15.fill = GridBagConstraints.BOTH;
				gbc_btn15.insets = new Insets(0, 0, 5, 5);
				gbc_btn15.gridx = 6;
				gbc_btn15.gridy = 5;
				panelCalendario.add(btn15, gbc_btn15);
			}
			{
				btn16 = new JButton(MessagesUI_Calendario.getString("UI_Calendario.btn16.text")); //$NON-NLS-1$
				GridBagConstraints gbc_btn16 = new GridBagConstraints();
				gbc_btn16.fill = GridBagConstraints.BOTH;
				gbc_btn16.insets = new Insets(0, 0, 5, 5);
				gbc_btn16.gridx = 7;
				gbc_btn16.gridy = 5;
				panelCalendario.add(btn16, gbc_btn16);
			}
			{
				btn17 = new JButton(MessagesUI_Calendario.getString("UI_Calendario.btn17.text")); //$NON-NLS-1$
				GridBagConstraints gbc_btn17 = new GridBagConstraints();
				gbc_btn17.fill = GridBagConstraints.BOTH;
				gbc_btn17.insets = new Insets(0, 0, 5, 5);
				gbc_btn17.gridx = 8;
				gbc_btn17.gridy = 5;
				panelCalendario.add(btn17, gbc_btn17);
			}
			{
				lblNewLabel_3 = new JLabel(MessagesUI_Calendario.getString("UI_Calendario.lblNewLabel_3.text")); //$NON-NLS-1$
				GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
				gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
				gbc_lblNewLabel_3.gridx = 1;
				gbc_lblNewLabel_3.gridy = 6;
				panelCalendario.add(lblNewLabel_3, gbc_lblNewLabel_3);
			}
			{
				btn18 = new JButton(MessagesUI_Calendario.getString("UI_Calendario.btn18.text")); //$NON-NLS-1$
				GridBagConstraints gbc_btn18 = new GridBagConstraints();
				gbc_btn18.fill = GridBagConstraints.BOTH;
				gbc_btn18.insets = new Insets(0, 0, 5, 5);
				gbc_btn18.gridx = 2;
				gbc_btn18.gridy = 6;
				panelCalendario.add(btn18, gbc_btn18);
			}
			{
				btn19 = new JButton(MessagesUI_Calendario.getString("UI_Calendario.btn19.text")); //$NON-NLS-1$
				GridBagConstraints gbc_btn19 = new GridBagConstraints();
				gbc_btn19.fill = GridBagConstraints.BOTH;
				gbc_btn19.insets = new Insets(0, 0, 5, 5);
				gbc_btn19.gridx = 3;
				gbc_btn19.gridy = 6;
				panelCalendario.add(btn19, gbc_btn19);
			}
			{
				btn20 = new JButton(MessagesUI_Calendario.getString("UI_Calendario.btn20.text")); //$NON-NLS-1$
				GridBagConstraints gbc_btn20 = new GridBagConstraints();
				gbc_btn20.fill = GridBagConstraints.BOTH;
				gbc_btn20.insets = new Insets(0, 0, 5, 5);
				gbc_btn20.gridx = 4;
				gbc_btn20.gridy = 6;
				panelCalendario.add(btn20, gbc_btn20);
			}
			{
				btn21 = new JButton(MessagesUI_Calendario.getString("UI_Calendario.btn21.text")); //$NON-NLS-1$
				GridBagConstraints gbc_btn21 = new GridBagConstraints();
				gbc_btn21.fill = GridBagConstraints.BOTH;
				gbc_btn21.insets = new Insets(0, 0, 5, 5);
				gbc_btn21.gridx = 5;
				gbc_btn21.gridy = 6;
				panelCalendario.add(btn21, gbc_btn21);
			}
			{
				btn22 = new JButton(MessagesUI_Calendario.getString("UI_Calendario.btn22.text")); //$NON-NLS-1$
				GridBagConstraints gbc_btn22 = new GridBagConstraints();
				gbc_btn22.fill = GridBagConstraints.BOTH;
				gbc_btn22.insets = new Insets(0, 0, 5, 5);
				gbc_btn22.gridx = 6;
				gbc_btn22.gridy = 6;
				panelCalendario.add(btn22, gbc_btn22);
			}
			{
				btn23 = new JButton(MessagesUI_Calendario.getString("UI_Calendario.btn23.text")); //$NON-NLS-1$
				GridBagConstraints gbc_btn23 = new GridBagConstraints();
				gbc_btn23.fill = GridBagConstraints.BOTH;
				gbc_btn23.insets = new Insets(0, 0, 5, 5);
				gbc_btn23.gridx = 7;
				gbc_btn23.gridy = 6;
				panelCalendario.add(btn23, gbc_btn23);
			}
			{
				btn24 = new JButton(MessagesUI_Calendario.getString("UI_Calendario.btn24.text")); //$NON-NLS-1$
				GridBagConstraints gbc_btn24 = new GridBagConstraints();
				gbc_btn24.fill = GridBagConstraints.BOTH;
				gbc_btn24.insets = new Insets(0, 0, 5, 5);
				gbc_btn24.gridx = 8;
				gbc_btn24.gridy = 6;
				panelCalendario.add(btn24, gbc_btn24);
			}
			{
				lblNewLabel_4 = new JLabel(MessagesUI_Calendario.getString("UI_Calendario.lblNewLabel_4.text")); //$NON-NLS-1$
				GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
				gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
				gbc_lblNewLabel_4.gridx = 1;
				gbc_lblNewLabel_4.gridy = 7;
				panelCalendario.add(lblNewLabel_4, gbc_lblNewLabel_4);
			}
			{
				btn25 = new JButton(MessagesUI_Calendario.getString("UI_Calendario.btn25.text")); //$NON-NLS-1$
				GridBagConstraints gbc_btn25 = new GridBagConstraints();
				gbc_btn25.fill = GridBagConstraints.BOTH;
				gbc_btn25.insets = new Insets(0, 0, 5, 5);
				gbc_btn25.gridx = 2;
				gbc_btn25.gridy = 7;
				panelCalendario.add(btn25, gbc_btn25);
			}
			{
				btn26 = new JButton(MessagesUI_Calendario.getString("UI_Calendario.btn26.text")); //$NON-NLS-1$
				GridBagConstraints gbc_btn26 = new GridBagConstraints();
				gbc_btn26.fill = GridBagConstraints.BOTH;
				gbc_btn26.insets = new Insets(0, 0, 5, 5);
				gbc_btn26.gridx = 3;
				gbc_btn26.gridy = 7;
				panelCalendario.add(btn26, gbc_btn26);
			}
			{
				btn27 = new JButton(MessagesUI_Calendario.getString("UI_Calendario.btn27.text")); //$NON-NLS-1$
				GridBagConstraints gbc_btn27 = new GridBagConstraints();
				gbc_btn27.fill = GridBagConstraints.BOTH;
				gbc_btn27.insets = new Insets(0, 0, 5, 5);
				gbc_btn27.gridx = 4;
				gbc_btn27.gridy = 7;
				panelCalendario.add(btn27, gbc_btn27);
			}
			{
				btn28 = new JButton(MessagesUI_Calendario.getString("UI_Calendario.btn28.text")); //$NON-NLS-1$
				GridBagConstraints gbc_btn28 = new GridBagConstraints();
				gbc_btn28.fill = GridBagConstraints.BOTH;
				gbc_btn28.insets = new Insets(0, 0, 5, 5);
				gbc_btn28.gridx = 5;
				gbc_btn28.gridy = 7;
				panelCalendario.add(btn28, gbc_btn28);
			}
			{
				btn29 = new JButton(MessagesUI_Calendario.getString("UI_Calendario.btn29.text")); //$NON-NLS-1$
				GridBagConstraints gbc_btn29 = new GridBagConstraints();
				gbc_btn29.fill = GridBagConstraints.BOTH;
				gbc_btn29.insets = new Insets(0, 0, 5, 5);
				gbc_btn29.gridx = 6;
				gbc_btn29.gridy = 7;
				panelCalendario.add(btn29, gbc_btn29);
			}
			{
				btn30 = new JButton(MessagesUI_Calendario.getString("UI_Calendario.btn30.text")); //$NON-NLS-1$
				GridBagConstraints gbc_btn30 = new GridBagConstraints();
				gbc_btn30.fill = GridBagConstraints.BOTH;
				gbc_btn30.insets = new Insets(0, 0, 5, 5);
				gbc_btn30.gridx = 7;
				gbc_btn30.gridy = 7;
				panelCalendario.add(btn30, gbc_btn30);
			}
			{
				btn31 = new JButton(MessagesUI_Calendario.getString("UI_Calendario.btn31.text")); //$NON-NLS-1$
				GridBagConstraints gbc_btn31 = new GridBagConstraints();
				gbc_btn31.fill = GridBagConstraints.BOTH;
				gbc_btn31.insets = new Insets(0, 0, 5, 5);
				gbc_btn31.gridx = 8;
				gbc_btn31.gridy = 7;
				panelCalendario.add(btn31, gbc_btn31);
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
