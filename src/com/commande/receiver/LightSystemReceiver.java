package com.commande.receiver;

public class LightSystemReceiver implements HomeElectronics {

    @Override
    public void on() {
        System.out.println("LightSystem is on!");
    }

    
    @Override
    public void off() {
        System.out.println("LightSystem is off!");
    }
}
