package _02_Generics_Store;

import javax.swing.JLabel;

public class GummyWorm extends Cereal{
	public GummyWorm() {
		
			this.item = "candy2.jpeg";
	
	}

	@Override
	public JLabel getFood() {
		// TODO Auto-generated method stub
		return new JLabel(loadImage(this.item));
	}
}

