package br.com.catolica.Main;

import br.com.catolica.Model.Perereca;
import br.com.catolica.Model.Ra;
import br.com.catolica.Model.Sapo;

public class Main {
    public static void main(String[] args) {
        Perereca perereca = new Perereca();
        perereca.andarNaParede();
        perereca.andarNaTerra();
        perereca.nadar();
        perereca.pular();
        perereca.emitirSom();

        System.out.println("_____________________________________");
        Ra ra = new Ra();
        ra.nadar();
        ra.emitirSom();

        System.out.println("_____________________________________");
        Sapo sapo = new Sapo();
        sapo.andarNaTerra();
        sapo.pular();
        sapo.emitirSom();
    }
}