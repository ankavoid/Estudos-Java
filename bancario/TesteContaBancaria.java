package br.com.exercicios.poo.sistema.bancario;

import javax.swing.JOptionPane;
public class TesteContaBancaria {
    public static void main(String[] args) {
        ContaBancaria contabancaria = new ContaBancaria(1245,"Bianca", 1500);
        InterfaceUsuario iu = new InterfaceUsuario();

        boolean sair = false;
        while (!sair){
            switch (iu.exibirMenu()){
                case 1:
                    double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o quanto você quer sacar"));
                    if (contabancaria.sacar(valor)){
                        JOptionPane.showMessageDialog(null, "Saque realizado com sucesso!"+"\nSaldo atual: R$"+contabancaria.verificarSaldo());
                    } else{
                        JOptionPane.showMessageDialog(null, "Erro: Saldo Insuficiente ou Entrada Inválida!"+"\nSaldo atual: R$"+contabancaria.verificarSaldo());
                    }
                    break;
                case 2:
                    double valorDepositar = Double.parseDouble(JOptionPane.showInputDialog("Digite o quanto você quer depositar"));
                    boolean sucesso = contabancaria.depositar(valorDepositar);
                    if(sucesso){
                        JOptionPane.showMessageDialog(null, "Depósito feito com sucesso." + "\nSaldo atual: R$" + contabancaria.verificarSaldo());
                    } else {
                        JOptionPane.showMessageDialog(null, "Valor de depósito inválido (deve ser maior que zero).");
                    }
                        break;
                case 3:
                    JOptionPane.showMessageDialog(null,"Saldo atual: R$"+contabancaria.verificarSaldo());
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null," Obrigada por usar nosso sistema!");
                    sair = true;
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Erro: Entrada inválida.");
            }
        }
    }
}
