package regex.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SpringLayout;

import regex.controller.RegexController;
import regex.model.FirstNameAnalyzer;

public class RegexPanel extends JPanel
{
	private RegexController baseController;
	private SpringLayout baseLayout;
	
	private FirstNameAnalyzer firstNameChecker;
	
	private String windowMessage =("Wrong");

	// text
	private JTextArea firstNameBox;
	private JTextArea lastNameBox;
	private JTextArea passwordBox;
	private JTextArea emailBox;

	// buttons
	private JButton checkFirstNameButton;
	private JButton checkLastNameButton;
	private JButton checkPasswordButton;
	private JButton checkEmailButton;

	public RegexPanel(RegexController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		
		firstNameChecker = new FirstNameAnalyzer();

		// Text area
		firstNameBox = new JTextArea();
		firstNameBox.setText("first name here");
		
		lastNameBox = new JTextArea();
		lastNameBox.setText("last name here");
		
		passwordBox = new JTextArea();
		passwordBox.setText("password");

		emailBox = new JTextArea();
		emailBox.setText("email");
		
		//buttons
		checkFirstNameButton = new JButton();
		checkFirstNameButton.setText("check first name");
		
		checkLastNameButton = new JButton();
		checkLastNameButton.setText("check last name");
		
		
		checkPasswordButton = new JButton();
		checkPasswordButton.setText("check password");

		checkEmailButton = new JButton();
		checkEmailButton.setText("check email");

		setupPanel();
		setupLayout();
		setupListeners();
	}

	private void setupPanel()
	{
		// panel stuff
		this.setLayout(baseLayout);
		this.setBackground(Color.YELLOW);

		// JText area's
		this.add(firstNameBox);
		this.add(lastNameBox);
		this.add(passwordBox);
		this.add(emailBox);

		// Buttons
		this.add(checkFirstNameButton);
		this.add(checkLastNameButton);
		this.add(checkPasswordButton);
		this.add(checkEmailButton);
	}

	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.WEST, firstNameBox, 9, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, firstNameBox, -89, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, passwordBox, 152, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, firstNameBox, -6, SpringLayout.WEST, passwordBox);
		baseLayout.putConstraint(SpringLayout.NORTH, passwordBox, 0, SpringLayout.NORTH, firstNameBox);
		baseLayout.putConstraint(SpringLayout.EAST, passwordBox, -182, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, emailBox, 0, SpringLayout.NORTH, firstNameBox);
		baseLayout.putConstraint(SpringLayout.WEST, emailBox, 32, SpringLayout.EAST, passwordBox);
		baseLayout.putConstraint(SpringLayout.EAST, emailBox, -58, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, checkFirstNameButton, 30, SpringLayout.SOUTH, firstNameBox);
		baseLayout.putConstraint(SpringLayout.WEST, checkFirstNameButton, 0, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, checkPasswordButton, 0, SpringLayout.NORTH, checkFirstNameButton);
		baseLayout.putConstraint(SpringLayout.WEST, checkPasswordButton, 9, SpringLayout.EAST, checkFirstNameButton);
		baseLayout.putConstraint(SpringLayout.NORTH, checkEmailButton, 0, SpringLayout.NORTH, checkFirstNameButton);
		baseLayout.putConstraint(SpringLayout.WEST, checkEmailButton, 0, SpringLayout.WEST, emailBox);
		baseLayout.putConstraint(SpringLayout.WEST, lastNameBox, 0, SpringLayout.WEST, passwordBox);
		baseLayout.putConstraint(SpringLayout.NORTH, checkLastNameButton, 112, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, lastNameBox, -14, SpringLayout.NORTH, checkLastNameButton);
		baseLayout.putConstraint(SpringLayout.EAST, checkLastNameButton, 0, SpringLayout.EAST, passwordBox);
	}

	private void setupListeners()
	{
		checkFirstNameButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent Clicked)
			{
				firstNameChecker.firstNameAnalyzer(firstNameBox.getText());
				if(firstNameChecker.equals(false))
				{
					
				}
			}
		});
	}

}
