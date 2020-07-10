package com.company.GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Room extends JFrame{
    private JTextField userName;
    private JButton createButton;
    private JButton joinButton;
    private JPanel rootPanel;
    private JTextField roomName;

    public Room() {
        add(rootPanel);

        setTitle("Chat App");
        setSize(400, 300);

        setVisible(true);

        createButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (roomName.getText().equalsIgnoreCase("") || userName.getText().equalsIgnoreCase("")) {
                    JOptionPane.showMessageDialog(new JFrame(), "Please write your name and the room you want to join");
                } else {
                    dispose();
                    new RoomRenderer( roomName.getText(), userName.getText());
                }
            }
        });
        joinButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (roomName.getText().equalsIgnoreCase("") || userName.getText().equalsIgnoreCase("")) {
                    JOptionPane.showMessageDialog(new JFrame(), "Please write your name and the room you want to join");
                } else {
                    dispose();
                    new RoomRenderer(roomName.getText(), userName.getText());
                }
            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
