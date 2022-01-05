package com.commande.command;

import com.commande.receiver.HomeElectronics;

import java.util.List;

public class OffCommand implements Command {
	
    private HomeElectronics homeElectronics;

    public OffCommand  (HomeElectronics homeElc){
        this.homeElectronics = homeElc;
    }

    @Override
    public void execute() {
        homeElectronics.off();
    }
    @Override
    public void undo() {
        homeElectronics.on();
    }
}
