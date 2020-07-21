package my.GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListCellRenderer;

import model.MessageModel;

public class MessageRenderer extends JPanel implements ListCellRenderer<MessageModel>{
	private JLabel userName = new JLabel();
    private JLabel content = new JLabel();
    private JPanel panelText;

    public MessageRenderer(String from) {
        setLayout(new BorderLayout(5, 5));
        panelText = new JPanel(new GridLayout(0, 1));
        panelText.add(userName);
        panelText.add(content);
        
       	
        
    }

    @Override
    public Component getListCellRendererComponent(JList<? extends MessageModel> list, MessageModel message, int index, boolean isSelected, boolean cellHasFocus) {
    	if (message.getFrom().equalsIgnoreCase("Phan Bao")) {
    		add(panelText, BorderLayout.EAST);
    		userName.setText(message.getFrom());
    		userName.setForeground(Color.ORANGE);
    	    content.setText(message.getText());
    	} else {
    		add(panelText, BorderLayout.CENTER);
    		userName.setText(message.getFrom());
    		userName.setForeground(Color.GRAY);
    		content.setText("   " + message.getText());
    	}

        userName.setOpaque(true);
        content.setOpaque(true);

        return this;
    }
}
