package com.commande.command;

import com.commande.receiver.HomeElectronics;

public class OnCommand implements Command {
    private HomeElectronics homeElectronics;

    public OnCommand (HomeElectronics homeElc){
        this.homeElectronics = homeElc;
    }

    @Override
    public void execute() {
        homeElectronics.on();
    }
    @Override
    public void undo() {
        homeElectronics.off();
    }
}
