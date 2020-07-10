package com.company.GUI;

import com.company.model.Message;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RoomRenderer extends JFrame  {
    private JPanel roomPanel = new JPanel();
    private JList<Message> messageList;
    private JTextArea messageTextField = new JTextArea();
    private JButton sendButton = new JButton("SEND");
    private JButton outButton = new JButton("<--");
    private JScrollPane scrollPane;
    private JLabel userName = new JLabel();
    private DefaultListModel<Message> model;

    public void onClickReturn() {
        outButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new Room();
            }
        });
    }

    public void messageRender() {
        model = new DefaultListModel<>();
        // add item to model
        model.addElement(new Message("C/C++ Programming", "A"));
        model.addElement(new Message("Java Programming",  "java"));
        model.addElement(new Message("C# Programming",  "cs"));
        model.addElement(new Message("IOS Programming",  "ios"));
        model.addElement(new Message("Windows Phone Programming",  "wp"));
        model.addElement(new Message("Android Programming",  "android"));

        messageList = new JList<>(model);
        messageList.setCellRenderer(new MessageRenderer());
    }

    public void render() {
        roomPanel.setLayout(null);

        outButton.setBounds(10, 10, 50 , 20);
        roomPanel.add(outButton);

        userName.setBounds(300,10, 100, 20);
        roomPanel.add(userName);

        messageList.setBounds(0, 30, 400, 430);
        messageList.setVisibleRowCount(10);
        scrollPane = new JScrollPane(messageList);
        scrollPane.setBounds(0, 30, 400, 430);
        roomPanel.add(scrollPane);
//
//        messageTextField.setBounds(470, 0, 300, 30);
//        roomPanel.add(messageTextField);
//
//        sendButton.setBounds(470, 300, 100, 30);
//        roomPanel.add(sendButton);
    }

    public RoomRenderer(String roomName, String userName) {
        this.userName.setText(userName);

        setTitle(roomName);
        setSize(400, 500);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(roomPanel);

        messageRender();
        render();

        onClickReturn();

        setVisible(true);
    }
}
