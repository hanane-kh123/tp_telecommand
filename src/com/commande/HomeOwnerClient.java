package com.commande;

import com.commande.command.OffCommand;
import com.commande.command.OnCommand;
import com.commande.homeElect.ButtonInvoker;
import com.commande.homeElect.HomeRemote;
import com.commande.receiver.HomeElectronics;
import com.commande.receiver.LightSystemReceiver;
import com.commande.receiver.RadioReceiver;
import com.commande.receiver.TVReceiver;

import java.util.ArrayList;
import java.util.List;

public class HomeOwnerClient {
    public static void main(String[] args) {
    	
        HomeRemote remote = new HomeRemote();

        LightSystemReceiver light = new LightSystemReceiver();
        RadioReceiver radio = new RadioReceiver();
        TVReceiver tv = new TVReceiver();

        OnCommand lightOn = new OnCommand (light);
        OffCommand lightOff = new OffCommand (light);

        OnCommand radioOn = new OnCommand (radio);
        OffCommand radioOff = new OffCommand (radio);

        OnCommand tvOn = new OnCommand (tv);
        OffCommand tvOff = new OffCommand (tv);

        remote.setCommand(lightOn);
        remote.buttonWasPressed();
        remote.setCommand(lightOff);
        remote.buttonWasPressed();

        remote.setCommand(radioOn);
        remote.buttonWasPressed();
        remote.setCommand(radioOff);
        remote.buttonWasPressed();

        remote.setCommand(tvOn);
        remote.buttonWasPressed();
        remote.setCommand(tvOff);
        remote.buttonWasPressed();
        remote.buttonUndoWasPressed();//Cancel the previous command




    }

}
