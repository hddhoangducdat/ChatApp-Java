package com.company.GUI;

import com.company.model.Message;

import javax.swing.*;
import java.awt.*;

public class MessageRenderer extends JPanel implements ListCellRenderer<Message> {
    private JLabel userName = new JLabel();
    private JLabel content = new JLabel();

    public MessageRenderer() {
        setLayout(new BorderLayout(5, 5));
        JPanel panelText = new JPanel(new GridLayout(0, 1));
        panelText.add(userName);
        panelText.add(content);
        add(panelText, BorderLayout.CENTER);
    }

    @Override
    public Component getListCellRendererComponent(JList<? extends Message> list, Message message, int index, boolean isSelected, boolean cellHasFocus) {
        userName.setText(message.getUserName());
        userName.setForeground(Color.blue);
        content.setText(message.getContent());

        userName.setOpaque(true);
        content.setOpaque(true);

        return this;
    }

}
