package model;

import javax.swing.ImageIcon;

public class Recursos {

	ImageIcon loginBonecoIcon;
	
	public Recursos() {
		
		loginBonecoIcon = new ImageIcon(getClass().getResource("/loginboneco.png"));
	}

	public ImageIcon getLoginBonecoIcon() {
		return loginBonecoIcon;
	}
	
}
