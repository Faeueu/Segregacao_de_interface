package br.com.catolica.Model;
import br.com.catolica.Interface.Nadar;
import br.com.catolica.Interface.EmitirSom;

public class Ra implements Nadar, EmitirSom{

    @Override
    public void nadar() {
        System.out.println("A rã nada");
    }

    @Override
    public void emitirSom() {
        System.out.println("A rã canta e/ou grita");
    }
}
