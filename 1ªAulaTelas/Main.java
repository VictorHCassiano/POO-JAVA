import javax.swing.*;
import java.awt.*;


public class Telas {

	public static void main(String[] args) {
		 
		JButton btBotao,btBotao2,btBotao3,btBotao4;
		JTextField TEXTO;
		JLabel l1,l2;
		TEXTO = new JTextField("Nome: ");
		String s1[] = { "Jalpaiguri", "Mumbai", "Noida", "Kolkata", "New Delhi" };
		l1 = new JLabel("GP Botao1");
		l2 = new JLabel("GP Botao2");
		
		
		
		 JComboBox c1,c2;
		 c1 = new JComboBox(s1);
		btBotao = new JButton("Salvar");
		btBotao2 = new JButton("Inserir");
		btBotao3 = new JButton("Excluir");
		btBotao4 = new JButton("Alterar");
		JFrame janela = new JFrame("Primeira janela v1");
		janela.setSize(570,440);
		janela.setLocation(300,300);
		janela.setVisible(true);
		janela.getContentPane()	.setLayout(new GridLayout(3,3));//FlowLayout
		
		janela.getContentPane().add(l1);
		janela.getContentPane().add(btBotao);
		janela.getContentPane().add(btBotao2);
		janela.getContentPane().add(l2);
		janela.getContentPane().add(btBotao3);
		janela.getContentPane().add(btBotao4);
		
		janela.getContentPane().add(TEXTO);
		janela.getContentPane().add(c1);
		
	      
	        
	        
	}
	
}
