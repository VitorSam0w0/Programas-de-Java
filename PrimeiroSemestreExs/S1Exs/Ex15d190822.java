/* 15. Peça para o usuário digitar: Nome, quantidade de horas trabalhadas, o valor pago pôr hora de trabalho e o
percentual de desconto de um funcionário. Após, mostre no vídeo o nome digitado, salário bruto, o salário
líquido a receber e o valor descontado. */

package PrimeiroSemestreExs.S1Exs;

import javax.swing.JOptionPane;

public class Ex15d190822 {

    public static void main (String[] args ) { 

        String nome, horas, salarioHora, desconto;

        nome = JOptionPane.showInputDialog(null, "Nome");
        horas = JOptionPane.showInputDialog(null, "Horas Trabalhadas");
        salarioHora = JOptionPane.showInputDialog(null, "Salario por Hora");
        desconto =  JOptionPane.showInputDialog(null, "Desconto");

        int horasInt, salarioHoraInt, descontoInt;
        int total1, total2;


        horasInt = Integer.parseInt(horas);
        salarioHoraInt = Integer.parseInt(salarioHora);
        descontoInt = Integer.parseInt(desconto);

        total1 = horasInt*salarioHoraInt;
        total2 = (total1*descontoInt)/100;

        JOptionPane.showMessageDialog(null, "O Funcionario(a) " + nome + " ganha R$" + salarioHora + " por hora e trabalhou " + horas + " horas, ganhou o salario bruto de R$" + total1 + " e com o  desconrto de " + desconto + "% ficou com o salario liquido de R$" + (total1-total2));

    }
     
}
