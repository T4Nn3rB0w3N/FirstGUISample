package gui.view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import gui.controller.GUIController;

public class FirstPanel extends JPanel
{
	private GUIController appController;
	private JButton myButton;
	private JLabel myLabel;
	
	public FirstPanel(GUIController appController)
	{
		super();
		this.appController = appController;
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}
}
