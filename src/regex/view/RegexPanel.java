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
import regex.model.EmailAnalyzer;
import regex.model.FirstNameAnalyzer;
import regex.model.LastNameAnalyzer;
import regex.model.PhoneAnalyzer;

public class RegexPanel extends JPanel
{
	private RegexController baseController;
	private SpringLayout baseLayout;
	
	//text analyzer declaration
	private FirstNameAnalyzer firstNameChecker;
	private LastNameAnalyzer lastNameChecker;
	private PhoneAnalyzer phoneNumberChecker;
	private EmailAnalyzer emailNumberChecker;

	// text area declaration
	private JTextArea firstNameBox;
	private JTextArea lastNameBox;
	private JTextArea phoneNumberBox;
	private JTextArea emailBox;

	// buttons declaration
	private JButton checkFirstNameButton;
	private JButton checkLastNameButton;
	private JButton checkPhoneNumberButton;
	private JButton checkEmailButton;

	public RegexPanel(RegexController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		
		//string analyzer instantiation 
		firstNameChecker = new FirstNameAnalyzer();
		lastNameChecker = new LastNameAnalyzer();
		phoneNumberChecker = new PhoneAnalyzer();
		emailNumberChecker = new EmailAnalyzer();

		// Text area instantiation 
		firstNameBox = new JTextArea();
		firstNameBox.setText("first name here");
		
		lastNameBox = new JTextArea();
		lastNameBox.setText("last name here");
		
		phoneNumberBox = new JTextArea();
		phoneNumberBox.setText("Phone Number");

		emailBox = new JTextArea();
		emailBox.setText("email");
		
		//buttons instantiation 
		checkFirstNameButton = new JButton();
		checkFirstNameButton.setText("check first name");
		
		checkLastNameButton = new JButton();
		checkLastNameButton.setText("check last name");
		
		
		checkPhoneNumberButton = new JButton();
		checkPhoneNumberButton.setText("check Phone Number");

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
		this.add(phoneNumberBox);
		this.add(emailBox);

		// Buttons
		this.add(checkFirstNameButton);
		this.add(checkLastNameButton);
		this.add(checkPhoneNumberButton);
		this.add(checkEmailButton);
	}

	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.WEST, checkEmailButton, 153, SpringLayout.EAST, checkFirstNameButton);
		baseLayout.putConstraint(SpringLayout.EAST, emailBox, -10, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, checkLastNameButton, 19, SpringLayout.SOUTH, lastNameBox);
		baseLayout.putConstraint(SpringLayout.WEST, checkLastNameButton, 91, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.WEST, lastNameBox, -81, SpringLayout.WEST, phoneNumberBox);
		baseLayout.putConstraint(SpringLayout.EAST, lastNameBox, 116, SpringLayout.WEST, phoneNumberBox);
		baseLayout.putConstraint(SpringLayout.WEST, firstNameBox, 9, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, firstNameBox, -89, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, phoneNumberBox, 152, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, firstNameBox, -6, SpringLayout.WEST, phoneNumberBox);
		baseLayout.putConstraint(SpringLayout.NORTH, phoneNumberBox, 0, SpringLayout.NORTH, firstNameBox);
		baseLayout.putConstraint(SpringLayout.EAST, phoneNumberBox, -182, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, emailBox, 0, SpringLayout.NORTH, firstNameBox);
		baseLayout.putConstraint(SpringLayout.WEST, emailBox, 32, SpringLayout.EAST, phoneNumberBox);
		baseLayout.putConstraint(SpringLayout.NORTH, checkFirstNameButton, 30, SpringLayout.SOUTH, firstNameBox);
		baseLayout.putConstraint(SpringLayout.WEST, checkFirstNameButton, 0, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, checkPhoneNumberButton, 0, SpringLayout.NORTH, checkFirstNameButton);
		baseLayout.putConstraint(SpringLayout.WEST, checkPhoneNumberButton, 9, SpringLayout.EAST, checkFirstNameButton);
		baseLayout.putConstraint(SpringLayout.NORTH, checkEmailButton, 0, SpringLayout.NORTH, checkFirstNameButton);
		baseLayout.putConstraint(SpringLayout.SOUTH, lastNameBox, -202, SpringLayout.SOUTH, this);
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
		
		checkLastNameButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent Clicked)
			{
				lastNameChecker.lastNameAnalyzer(lastNameBox.getText());
				if(lastNameChecker.equals(false))
				{
					
				}
			}
		});
		
		checkPhoneNumberButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent Clicked)
			{
				phoneNumberChecker.phoneNumberAnalyzer(phoneNumberBox.getText());
				if(lastNameChecker.equals(false))
				{
					
				}
			}
		});
		
		checkEmailButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent Clicked)
			{
				emailNumberChecker.checkEmail(emailBox.getText());
				if(emailNumberChecker.equals(false))
				{
					
				}
			}
		});
	}

}
