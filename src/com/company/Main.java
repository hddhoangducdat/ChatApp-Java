package com.company;

import com.company.GUI.RoomRenderer;

import javax.swing.*;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {
	// write your code here
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

//        new Room();

        new RoomRenderer("sgsdg", "sdgsdgs");
    }
}
