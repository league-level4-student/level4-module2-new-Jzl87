package _02_Generics_Store;
import javax.swing.JLabel;

public class CandyCorn extends Cereal{
	public CandyCorn() {
		
			this.item = "candy1.jpeg";
	
	}

	@Override
	public JLabel getFood() {
		// TODO Auto-generated method stub
		return new JLabel(loadImage(this.item));
	}
}

