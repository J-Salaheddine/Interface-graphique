package com.image.interfaceG.application;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Frame extends JFrame{

	public Frame(){
		this .setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		//this.add(background, gbc);
		JLabel fermer = new JLabel(new ImageIcon("Interface\\Bar icones\\cross.png"));;
		
		gbc.gridx = gbc.gridy = GridBagConstraints.REMAINDER;
		gbc.gridheight = gbc.gridwidth = 1;
		gbc.anchor = GridBagConstraints.BASELINE_LEADING;
		gbc.insets = new Insets(0, 10, 0, 0);
		this.add(fermer, gbc);
		
		this.setSize(840, 576);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setVisible(true);
	}
}
