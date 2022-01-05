package com.commande.receiver;

public class RadioReceiver implements HomeElectronics {

    @Override
    public void on() {
        System.out.println("Radio is on!");
    }

    @Override
    public void off() {
        System.out.println("Radio is off!");
    }

}
