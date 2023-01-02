/* 13. Refaça o exercício anterior considerando que o funcionario receberá um acréscimo ao invés de um desconto. */

package PrimeiroSemestreExs.S1Exs;

import javax.swing.JOptionPane;

public class Ex13d190822 {

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
