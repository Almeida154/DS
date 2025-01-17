package Screen;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ToDoList extends JFrame {

	private DefaultListModel listModelToDo = new DefaultListModel();
	private DefaultListModel listModelDone = new DefaultListModel();

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ToDoList frame = new ToDoList();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ToDoList() {
		
		// Background
		
		setTitle("ToDo");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 492, 640);
		
		// Components
		
		JPanel contentPane = new JPanel();
		contentPane.setForeground(Color.DARK_GRAY);
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		JPanel panelNewTask = new JPanel();
		panelNewTask.setBackground(Color.DARK_GRAY);
		panelNewTask.setBorder(new TitledBorder(new LineBorder(new Color(51, 51, 51), 2, true), "   New Task   ", TitledBorder.RIGHT, TitledBorder.TOP, null, new Color(128, 128, 128)));
		panelNewTask.setBounds(10, 11, 454, 214);
		contentPane.add(panelNewTask);
		panelNewTask.setLayout(null);
		
		JPanel panelToDo = new JPanel();
		panelToDo.setBorder(new TitledBorder(new LineBorder(new Color(51, 51, 51), 2, true), "   Tasks   ", TitledBorder.RIGHT, TitledBorder.TOP, null, new Color(128, 128, 128)));
		panelToDo.setBackground(Color.DARK_GRAY);
		panelToDo.setBounds(10, 243, 200, 310);
		contentPane.add(panelToDo);
		
		JPanel panelDone = new JPanel();
		panelDone.setBorder(new TitledBorder(new LineBorder(new Color(51, 51, 51), 2, true), "   Tasks Done   ", TitledBorder.RIGHT, TitledBorder.TOP, null, new Color(128, 128, 128)));
		panelDone.setBackground(Color.DARK_GRAY);
		panelDone.setBounds(264, 243, 200, 310);
		contentPane.add(panelDone);
		
		JTextField tfNewTask = new JTextField();
		tfNewTask.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 15));
		tfNewTask.setForeground(Color.LIGHT_GRAY);
		tfNewTask.setBackground(new Color(51, 51, 51));
		tfNewTask.setBounds(23, 53, 206, 25);
		tfNewTask.setBorder(null);
		panelNewTask.add(tfNewTask);
		
		JLabel lblSelectTheCategory = new JLabel("Select a category:");
		lblSelectTheCategory.setForeground(Color.LIGHT_GRAY);
		lblSelectTheCategory.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 15));
		lblSelectTheCategory.setBounds(23, 84, 109, 20);
		panelNewTask.add(lblSelectTheCategory);
		
		JLabel lblIcon = new JLabel("");
		lblIcon.setIcon(new ImageIcon(ToDoList.class.getResource("/Img/lista-de-afazeres.png")));
		lblIcon.setBounds(319, 60, 64, 64);
		panelNewTask.add(lblIcon);
		
		JLabel lblTypeTheTask = new JLabel("Type the task:");
		lblTypeTheTask.setForeground(Color.LIGHT_GRAY);
		lblTypeTheTask.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 15));
		lblTypeTheTask.setBounds(23, 23, 86, 20);
		panelNewTask.add(lblTypeTheTask);
		panelToDo.setLayout(null);
		
		JLabel lblError = new JLabel("Error");
		lblError.setForeground(new Color(204, 0, 51));
		lblError.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblError.setBounds(32, 170, 197, 14);
		lblError.setVisible(false);
		panelNewTask.add(lblError);
				
		JComboBox<String> cbxCategory = new JComboBox();
		cbxCategory.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 15));
		cbxCategory.setForeground(Color.LIGHT_GRAY);
		cbxCategory.setBackground(new Color(51, 51, 51));
		cbxCategory.setBounds(23, 113, 206, 25);
		cbxCategory.setBorder(null);
		cbxCategory.addItem(" Choose");
		cbxCategory.addItem(" School");
		cbxCategory.addItem(" Work");
		cbxCategory.addItem(" Others");
		panelNewTask.add(cbxCategory);
		
		JList listTasks = new JList();
		listTasks.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 13));
		listTasks.setForeground(Color.LIGHT_GRAY);
		listTasks.setBackground(Color.DARK_GRAY);
		listTasks.setBounds(10, 18, 180, 281);
		listTasks.setModel(listModelToDo);
		panelToDo.add(listTasks);
		panelDone.setLayout(null);
		
		JList listTasksDone = new JList();
		listTasksDone.setBounds(10, 18, 180, 281);
		listTasksDone.setForeground(Color.LIGHT_GRAY);
		listTasksDone.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 13));
		listTasksDone.setBackground(Color.DARK_GRAY);
		listTasksDone.setModel(listModelDone);
		panelDone.add(listTasksDone);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				// Add Tasks
				
				lblError.setVisible(false);
				
				if(tfNewTask.getText().toString().trim().isEmpty()) {
					lblError.setVisible(true);
					lblError.setText("Type a task name, please!");
				}else if(cbxCategory.getSelectedItem().toString().trim().equals("Choose")) {
					lblError.setVisible(true);
					lblError.setText("Choose a category, please!");
				}else{
					String newTask = tfNewTask.getText().toString().trim() + " | " + cbxCategory.getSelectedItem().toString().trim();
					listModelToDo.addElement(newTask);
					tfNewTask.setText(null);
					tfNewTask.requestFocus();
					cbxCategory.setSelectedIndex(0);
				}

			}
		});
		btnAdd.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 15));
		btnAdd.setBounds(358, 164, 64, 25);
		btnBackground(btnAdd);
		panelNewTask.add(btnAdd);
		
		JButton btnClean = new JButton("Clean");
		btnClean.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				// Clean Insert Tasks Panel
				
				tfNewTask.setText(null);
				cbxCategory.setSelectedIndex(0);
			}
		});
		btnClean.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 15));
		btnClean.setBounds(268, 164, 80, 25);
		btnBackground(btnClean);
		panelNewTask.add(btnClean);
		
		JButton btnTaskDone = new JButton(">>");
		btnTaskDone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				// To do -> Done
				
				lblError.setVisible(false);
				boolean selected = false;
				
				for(int i = 0; i < listModelToDo.getSize(); i++) {
					if(listTasks.isSelectedIndex(i)) selected = true;
				}

				if(listModelToDo.getSize() > 0) {
					if(!selected) {
						lblError.setVisible(true);
						lblError.setText("Select some task!");
					}else{
						listModelDone.addElement(listTasks.getSelectedValue());
						int index = listTasks.getSelectedIndex();
						if(index != -1) listModelToDo.remove(index);
					}
				}else{
					lblError.setVisible(true);
					lblError.setText("There is nothing in the To Do List");
				}

			}
		});
		btnTaskDone.setForeground(new Color(102, 102, 102));
		btnTaskDone.setFont(new Font("Agency FB", Font.BOLD, 25));
		btnTaskDone.setBorderPainted(false);
		btnTaskDone.setBackground(Color.DARK_GRAY);
		btnTaskDone.setBounds(209, 352, 56, 35);
		btnBackgroundArrows(btnTaskDone);
		contentPane.add(btnTaskDone);
		
		JButton btnUndone = new JButton("<<");
		btnUndone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				// Done -> To do
				
				lblError.setVisible(false);
				boolean selected = false;
				
				for(int i = 0; i < listModelDone.getSize(); i++) {
					if(listTasksDone.isSelectedIndex(i)) selected = true;
				}
				
				if(listModelDone.getSize() > 0) {
					if(!selected) {
						lblError.setVisible(true);
						lblError.setText("Select some task!");
					}else{
						listModelToDo.addElement(listTasksDone.getSelectedValue());
						int index = listTasksDone.getSelectedIndex();
						if(index != -1) listModelDone.remove(index);
					}
				}else{
					lblError.setVisible(true);
					lblError.setText("There is nothing in the Done List");
				}
			}
		});
		btnUndone.setForeground(new Color(102, 102, 102));
		btnUndone.setFont(new Font("Agency FB", Font.BOLD, 25));
		btnUndone.setFocusPainted(false);
		btnUndone.setBorderPainted(false);
		btnUndone.setBackground(Color.DARK_GRAY);
		btnUndone.setBounds(209, 400, 56, 35);
		btnBackgroundArrows(btnUndone);
		contentPane.add(btnUndone);
		
		JButton btnCleanTasks = new JButton("Clean Tasks List");
		btnCleanTasks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				// Clean Tasks To Do List
				
				listModelToDo.clear();
			}
		});
		btnCleanTasks.setForeground(Color.LIGHT_GRAY);
		btnCleanTasks.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 15));
		btnCleanTasks.setFocusPainted(false);
		btnCleanTasks.setBorderPainted(false);
		btnCleanTasks.setBackground(new Color(51, 51, 51));
		btnCleanTasks.setBounds(12, 558, 196, 25);
		btnBackground(btnCleanTasks);
		contentPane.add(btnCleanTasks);
		
		JButton btnCleanTasksDone = new JButton("Clean Tasks Done List");
		btnCleanTasksDone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				// Clean Tasks To Do List
				
				listModelDone.clear();
			}
		});
		btnCleanTasksDone.setForeground(Color.LIGHT_GRAY);
		btnCleanTasksDone.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 15));
		btnCleanTasksDone.setFocusPainted(false);
		btnCleanTasksDone.setBorderPainted(false);
		btnCleanTasksDone.setBackground(new Color(51, 51, 51));
		btnCleanTasksDone.setBounds(266, 558, 196, 25);
		btnBackground(btnCleanTasksDone);
		contentPane.add(btnCleanTasksDone);
			
	}
	
	// Methods
	
	private void btnBackground(JButton btn) {
		btn.setBackground(new Color(51, 51, 51));
		btn.setForeground(Color.LIGHT_GRAY);
		btn.setFocusPainted(false);
		btn.setBorderPainted(false);
		btn.addMouseListener(new MouseAdapter() {
	        public void mouseEntered(MouseEvent e) {
	        	btn.setBackground(new Color(60, 60, 60));
	        }

	        public void mouseExited(MouseEvent e) {
	    		btn.setBackground(new Color(51, 51, 51));
	        }
		});
	}
	
	private void btnBackgroundArrows(JButton btn) {
		btn.setForeground(new Color(102, 102, 102));
		btn.setFocusPainted(false);
		btn.setBorderPainted(false);
		btn.addMouseListener(new MouseAdapter() {
	        public void mouseEntered(MouseEvent e) {
	    		btn.setForeground(new Color(51, 51, 51));
	        }

	        public void mouseExited(MouseEvent e) {
	    		btn.setForeground(new Color(102, 102, 102));
	        }
		});
	}
}