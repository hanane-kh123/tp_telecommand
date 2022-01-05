package com.commande.receiver;

public class TVReceiver implements HomeElectronics {

    @Override
    public void on() {
        System.out.println("TV is on!");
    }

    
    @Override
    public void off() {
        System.out.println("TV is off!");
    }
}
