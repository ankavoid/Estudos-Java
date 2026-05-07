package br.com.exercicios.poo.sistema.bancario;

import javax.swing.JOptionPane;

/* Regras:
O saldo não pode ser alterado diretamente (deve ser private).
Crie métodos depositar(double valor) e sacar(double valor).
No método sacar, impeça a operação se o saldo for insuficiente e exiba uma mensagem de erro.
Crie um método para exibir os dados da conta e o saldo atual. */


public class ContaBancaria {
    private int numeroConta;
    private String titular;
    private double saldo;

    public ContaBancaria (int numeroConta, String titular, double saldo){
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.titular = titular;
    }

    public boolean sacar(double valor){
        if (valor > 0 && valor <= saldo){
            saldo -= valor;
            return true;
        }
        return false;
    }
    public boolean depositar(double valor){
        if (valor == 0){
            return false;
        } else if (valor < 0) {
            return false;
        } else{
            saldo += valor;
            return true;
        }
    }
    public double verificarSaldo (){
        return saldo;
    }
}

