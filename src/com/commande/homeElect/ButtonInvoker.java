package com.commande.homeElect;

import com.commande.command.Command;

public class ButtonInvoker {
	    Command c;
	    Command undo;

    public  ButtonInvoker(Command c) {
        this.c = c;

    }

    public void click(){
        c.execute();
    }




}
