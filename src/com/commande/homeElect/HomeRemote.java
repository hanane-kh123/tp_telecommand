package com.commande.homeElect;

import com.commande.command.Command;
import com.commande.command.OffCommand;
import com.commande.command.OnCommand;
import com.commande.receiver.HomeElectronics;
import com.commande.receiver.LightSystemReceiver;

import java.util.List;
import java.util.Set;

public class HomeRemote {
    Command slot;
    Command undoCommand;
    public HomeRemote(){}


    public void setCommand(Command command){
        slot = command;
    }
    public void buttonWasPressed(){
        slot.execute();
        undoCommand=slot;
    }
    public void buttonUndoWasPressed(){
        undoCommand.undo();
    }



}
