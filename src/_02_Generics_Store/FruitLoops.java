package _02_Generics_Store;

import javax.swing.JLabel;

public class FruitLoops extends Cereal{
	public FruitLoops() {
		
			this.item = "cereal2.jpeg";
	
	}

	@Override
	public JLabel getFood() {
		// TODO Auto-generated method stub
		return new JLabel(loadImage(this.item));
	}
}
