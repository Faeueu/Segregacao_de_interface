package br.com.catolica.Model;
import br.com.catolica.Interface.*;
public class Perereca implements Pular, Nadar, AndarNaTerra, AndarNaParede, EmitirSom{

    @Override
    public void andarNaParede() {
        System.out.println("A perereca gruda na parede");
    }

    @Override
    public void andarNaTerra() {
        System.out.println("A perereca tambem anda na terra");
    }

    @Override
    public void nadar() {
        System.out.println("A perereca nada");
    }

    @Override
    public void pular() {
        System.out.println("A perereca pula");
    }

    @Override
    public void emitirSom() {
        System.out.println("A perereca coaxa");
    }
}
