package br.com.exercicios.poo.sistema.bancario;

import javax.swing.JOptionPane;

public class InterfaceUsuario {

    public int exibirMenu(){
        int choiceCliente =
                Integer.parseInt(JOptionPane.showInputDialog("Escolha:\n1. Sacar\n2. Depositar\n3. Ver saldo\n4. Sair"));
        return choiceCliente;
    }
}
