package br.com.catolica.Model;
import br.com.catolica.Interface.AndarNaTerra;
import br.com.catolica.Interface.Pular;
import br.com.catolica.Interface.EmitirSom;

public class Sapo implements AndarNaTerra, Pular, EmitirSom{
    @Override
    public void andarNaTerra() {
        System.out.println("O sapo anda na terra");
    }

    @Override
    public void pular() {
        System.out.println("O sapo pula");
    }

    @Override
    public void emitirSom() {
        System.out.println("O sapo Coaxa");
    }
}
