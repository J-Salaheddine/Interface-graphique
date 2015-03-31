package com.image.interfaceG.application;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelCommun extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel background;
	private JLabel fermer;
	private JLabel agrandir;
	private JLabel reduir;
	private JLabel home;
	private JLabel recherche;
	private JLabel chargerImage;
	private JLabel chargerDossier;
	private JLabel miseAJour;
	private JLabel info;
	

	
	public PanelCommun(){
		init();
		this .setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		//this.add(background, gbc);
		
		
		gbc.gridx = gbc.gridy = GridBagConstraints.REMAINDER;
		gbc.gridheight = gbc.gridwidth = 1;
		gbc.anchor = GridBagConstraints.BASELINE_LEADING;
		gbc.insets = new Insets(0, 10, 0, 0);
		this.add(fermer, gbc);
	}
	
	private void init(){
		fermer = new JLabel(new ImageIcon("Interface\\Bar icones\\cross.png"));
		background= new JLabel(new ImageIcon("Interface\\Background"));
		agrandir= new JLabel(new ImageIcon("Interface\\"));
		reduir= new JLabel(new ImageIcon("Interface\\"));
		home= new JLabel(new ImageIcon("Interface\\"));
		recherche= new JLabel(new ImageIcon("Interface\\"));
		chargerImage= new JLabel(new ImageIcon("Interface\\"));
		chargerDossier= new JLabel(new ImageIcon("Interface\\"));
		miseAJour= new JLabel(new ImageIcon("Interface\\"));
		info= new JLabel(new ImageIcon("Interface\\"));

	}
	
}
