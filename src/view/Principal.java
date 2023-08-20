package view;
import controller.Fatorialdiv;
import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		Fatorialdiv ftdv = new Fatorialdiv();
		double n;
		
		
		n = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor de n: "));
		
		double fatd = ftdv.fatdiv(n);
		System.out.println(fatd);
		
	}

}
