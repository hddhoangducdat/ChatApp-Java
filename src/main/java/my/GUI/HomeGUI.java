package my.GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.MessageModel;

import java.awt.List;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JTextPane;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class HomeGUI extends JFrame {

	private JPanel contentPane;
	private final JTextField searchField = new JTextField();
	private JTextField chatField;
	
	private JList userList;
	private JList chatBoxList;
	
	private JScrollPane userScrollPane;
	private JScrollPane chatBoxScrollPane;
	
	private DefaultListModel<String> modelUser;
	private DefaultListModel<MessageModel> modelMessage;

	/**
	 * Launch the application.
	 */
	public void run() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomeGUI frame = new HomeGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void messageRender() {
		 modelMessage = new DefaultListModel<MessageModel>();
		 modelMessage.addElement(new MessageModel("C/C++ Programming", true, "Hoang Duc Dat", "20/07/2020"));
		 modelMessage.addElement(new MessageModel("Java Programming",  true, "Nguyen Trong Binh", "20/07/2020"));
		 modelMessage.addElement(new MessageModel("C# Programming", true, "Hoang Duc Dat", "20/07/2020"));
		 modelMessage.addElement(new MessageModel("IOS Programming",  true, "Phan Bao", "20/07/2020"));
		 modelMessage.addElement(new MessageModel("Windows Phone Programming",  true, "Phan Bao", "20/07/2020"));
		 modelMessage.addElement(new MessageModel("Android Programming",  true, "Chung Minh Chanh", "20/07/2020"));
		 modelMessage.addElement(new MessageModel("C/C++ Programming", true, "Hoang Duc Dat", "20/07/2020"));
		 modelMessage.addElement(new MessageModel("Java Programming",  true, "Nguyen Trong Binh", "20/07/2020"));
		 modelMessage.addElement(new MessageModel("C# Programming", true, "Hoang Duc Dat", "20/07/2020"));
		 modelMessage.addElement(new MessageModel("IOS Programming",  true, "Phan Bao", "20/07/2020"));
		 modelMessage.addElement(new MessageModel("Windows Phone Programming",  true, "Phan Bao", "20/07/2020"));
		 modelMessage.addElement(new MessageModel("Android Programming",  true, "Chung Minh Chanh", "20/07/2020"));

	     chatBoxList = new JList<>(modelMessage);
	     chatBoxScrollPane.setViewportView(chatBoxList);
	     chatBoxList.setCellRenderer(new MessageRenderer("Phan Bao"));
	}
	
	public void userRender() {
		modelUser = new DefaultListModel<String>();
		modelUser.addElement("Nguyen Trong Binh");
		modelUser.addElement("Chung Minh Chanh");
		modelUser.addElement("Phan Bao");
		modelUser.addElement("Do Dat");
		modelUser.addElement("Hoang Duc Dat");
		modelUser.addElement("Hoang Duc Dat");
		modelUser.addElement("Nguyen Trong Binh");
		modelUser.addElement("Chung Minh Chanh");
		modelUser.addElement("Phan Bao");
		modelUser.addElement("Do Dat");
		modelUser.addElement("Hoang Duc Dat");
		modelUser.addElement("Hoang Duc Dat");
		
		userList = new JList<>(modelUser);
		userList.setSelectedIndex(0);
		userScrollPane.setViewportView(userList);
	}
	
	public void FieldPlaceHolder() {
		chatField.addFocusListener(new FocusListener() {
			@Override
		    public void focusGained(FocusEvent e) {
		        if (chatField.getText().equals("Write what is on your mind")) {
		        	chatField.setText("");
		        	searchField.setForeground(Color.WHITE);
		        }
		    }
		    @Override
		    public void focusLost(FocusEvent e) {
		        if (chatField.getText().isEmpty()) {
		        	chatField.setForeground(Color.GRAY);
		        	chatField.setText("Write what is on your mind");
		        }
		    }
		});
		
		searchField.addFocusListener(new FocusListener() {
			@Override
		    public void focusGained(FocusEvent e) {
		        if (searchField.getText().equals("Search")) {
		        	searchField.setText("");
		        	searchField.setForeground(Color.WHITE);
		        }
		    }
		    @Override
		    public void focusLost(FocusEvent e) {
		        if (searchField.getText().isEmpty()) {
		        	searchField.setForeground(Color.GRAY);
		        	searchField.setText("Search");
		        }
		    }
		});
	}

	/**
	 * Create the frame.
	 */
	public HomeGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		searchField.setForeground(Color.GRAY);
    	searchField.setText("Search");
		searchField.setBounds(0, 0, 151, 39);
		contentPane.add(searchField);
		searchField.setColumns(10);
		
		userScrollPane = new JScrollPane();
		userScrollPane.setBounds(0, 37, 151, 237);
		contentPane.add(userScrollPane);
		
		
		Image img = new ImageIcon(this.getClass().getResource("/logout.png")).getImage();
		img = img.getScaledInstance(30, 20, Image.SCALE_SMOOTH);
		JButton logOutBtn = new JButton("");
		logOutBtn.setIcon(new ImageIcon(img));
		logOutBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		logOutBtn.setBounds(391, 0, 57, 39);
		contentPane.add(logOutBtn);
		
		chatBoxScrollPane = new JScrollPane();
		chatBoxScrollPane.setBounds(160, 37, 288, 179);
		contentPane.add(chatBoxScrollPane);	
		
		chatField = new JTextField();
		chatField.setForeground(Color.GRAY);
    	chatField.setText("Write what is on your mind");
		chatField.setBounds(160, 228, 189, 46);
		contentPane.add(chatField);
		chatField.setColumns(10);
		
		img = new ImageIcon(this.getClass().getResource("/videoCall.png")).getImage();
		img = img.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		JButton videoCallBtn = new JButton("");
		videoCallBtn.setIcon(new ImageIcon(img));
		videoCallBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		videoCallBtn.setBounds(337, 0, 57, 39);
		contentPane.add(videoCallBtn);
		
		img = new ImageIcon(this.getClass().getResource("/file.png")).getImage();
		img = img.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		JButton fileBtn = new JButton("");
		fileBtn.setIcon(new ImageIcon(img));
		fileBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		fileBtn.setBounds(391, 228, 57, 46);
		contentPane.add(fileBtn);
		
		img = new ImageIcon(this.getClass().getResource("/emoji.png")).getImage();
		img = img.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		JButton emojiBtn = new JButton("");
		emojiBtn.setIcon(new ImageIcon(img));
		emojiBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		emojiBtn.setBounds(346, 228, 47, 46);
		contentPane.add(emojiBtn);
		
		JLabel nameLabel = new JLabel("Hoang Duc Dat");
		nameLabel.setBounds(160, 3, 120, 33);
		contentPane.add(nameLabel);
		
		userRender();
		messageRender();
		FieldPlaceHolder();
	}
}
