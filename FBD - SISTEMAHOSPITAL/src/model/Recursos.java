package model;

import javax.swing.ImageIcon;

public class Recursos {

	ImageIcon loginBonecoIcon, tempM, tempR, hosptZin, fundoBoard;
	
	public Recursos() {
		
		loginBonecoIcon = new ImageIcon(getClass().getResource("/loginboneco.png"));
		tempM = new ImageIcon(getClass().getResource("/tempM.png"));
		tempR = new ImageIcon(getClass().getResource("/tempR.png"));
		hosptZin = new ImageIcon(getClass().getResource("/hosptzin.png"));
		fundoBoard = new ImageIcon(getClass().getResource("/fundoBoard.jpg"));
	}

	public ImageIcon getLoginBonecoIcon() {
		return loginBonecoIcon;
	}

	public ImageIcon getTempM() {
		return tempM;
	}

	public ImageIcon getTempR() {
		return tempR;
	}

	public ImageIcon getHosptZin() {
		return hosptZin;
	}

	public ImageIcon getFundoBoard() {
		return fundoBoard;
	}
	
}
