/* 14. Peça para o usuário digitar: Nome, salário bruto e o percentual de acréscimo de um funcionário. Após, mostre
no vídeo o nome digitado, salário bruto e o salário líquido a receber. */

package PrimeiroSemestreExs.S1Exs;

import javax.swing.JOptionPane;

public class Ex14d190822 {

    public static void main (String[] args ) {

        String nome, salario, acrescimo;

        nome = JOptionPane.showInputDialog(null, "Nome");
        salario = JOptionPane.showInputDialog(null, "Salario");
        acrescimo = JOptionPane.showInputDialog(null, "Acrescimo");

        int salarioInt, acrescimoInt;
        int total;

        salarioInt = Integer.parseInt(salario);
        acrescimoInt = Integer.parseInt(acrescimo);

        total = (acrescimoInt*salarioInt)/100;

        JOptionPane.showMessageDialog(null, "Funcionario(a): " + nome + " Salario bruto: R$" + salario + " Salario liquido: R$" + (salarioInt+total));

    }
    
}

