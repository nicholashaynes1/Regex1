package regex.view;

import javax.swing.JFrame;

import regex.controller.RegexController;
public class RegexFrame extends JFrame
{
	private RegexController baseController;
	private RegexPanel basePanel;
	
	public RegexFrame(RegexController baseController)
	{
		this.baseController = baseController;
		basePanel = new RegexPanel(baseController);
		
		setupFrame();
	}

	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setResizable(false);
		this.setSize(800,800);
		this.setVisible(true);
		
	}
}
