/* 12. Peça para o usuário digitar: Nome, salário bruto e o percentual de desconto de um funcionário. Após, mostre
no vídeo o nome digitado, salário bruto e o salário líquido a receber. */

package PrimeiroSemestreExs.S1Exs;

import javax.swing.JOptionPane;

public class Ex12d190822 {

    public static void main (String[] args) {

        String nome, salario, desconto;

        nome = JOptionPane.showInputDialog(null, "Digite o Nome do funcionario");
        salario = JOptionPane.showInputDialog(null, "Digite o Salario do funcionario");
        desconto = JOptionPane.showInputDialog(null, "DIgite o Percentual de Desconto do funcionario");

        int salarioInt, descontoInt;
        int total;

        salarioInt = Integer.parseInt(salario);
        descontoInt = Integer.parseInt(desconto);

        total = (salarioInt*descontoInt)/100;

        JOptionPane.showMessageDialog(null, "O Funcionario(a) " + nome + " recebe um salario bruto de R$" + salario + " que com o desconto mensal fica R$" + (salarioInt-total) );
    }
    
}
