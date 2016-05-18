package regex.view;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.SpringLayout;

import regex.controller.RegexController;

public class RegexPanel extends JPanel
{
	private RegexController baseController;
	private SpringLayout baseLayout;
	
	public RegexPanel(RegexController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.YELLOW);
		
	}
	private void setupLayout()
	{

	}
	private void setupListeners()
	{
		// TODO Auto-generated method stub
		
	}

}
