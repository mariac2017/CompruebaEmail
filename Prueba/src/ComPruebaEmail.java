import java.awt.EventQueue;

import javax.swing.JOptionPane;

public class ComPruebaEmail {

	public static void main(String[] args) {
		boolean arroba = false;
		String mail = JOptionPane.showInputDialog("Intorduce Email");
		
		for (int i=0; i < mail.length(); i++){
			if(mail.charAt(i) == '@' ){
			arroba = true;	
			}
		}
		if(arroba == true){
			System.out.println("Es Correcto");	
		}else {
			System.out.println("Es InCorrecto");
		}
		
	}	
}
