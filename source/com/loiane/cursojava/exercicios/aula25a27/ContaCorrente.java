package com.loiane.cursojava.exercicios.aula25a27;

public class ContaCorrente {

    String numero;
    String agencia;
    boolean especial;
    double limiteEspecial;
    double valorEspecialUsado;
    double saldo;

    boolean realizarSaque(double quantiaSacar) {

        //tem saldo na conta
        if (saldo >= quantiaSacar) {
            saldo -= quantiaSacar;
            return true;
        } else { //não tem saldo na conta
            if (especial) {
                //verificando se tem saldo no limite especial
                double limite = limiteEspecial + saldo;
                if (limite >= quantiaSacar) {
                    saldo -= quantiaSacar;
                    return true;
                } else {
                    return false;
                }
            } else {
                return false; //não é especial e não tem saldo suficiente
            }
        }
    }

    void depositar(double quantiaDepositar) {
            saldo += quantiaDepositar;
        }

    void consultarSaldo() {
        System.out.println("Saldo atual da conta = " + saldo);
    }

    boolean verificarUsoChequeEspecial() {
        return especial && saldo < 0;
    }

}
