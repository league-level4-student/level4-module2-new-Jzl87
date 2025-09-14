package _02_Generics_Store;

import javax.swing.JLabel;

public class Cheerios extends Cereal{
	public Cheerios() {
		
			this.item = "cereal1.jpeg";
	
	}

	@Override
	public JLabel getFood() {
		// TODO Auto-generated method stub
		return new JLabel(loadImage(this.item));
	}
}
