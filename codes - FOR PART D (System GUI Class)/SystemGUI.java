
// Import swing toolkit functions, buttons, event selection etc.
import javax.swing.JOptionPane;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.ProgressBar;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.DateTime;
import org.eclipse.swt.widgets.Canvas;

/* Create a SystemGUI class that imports or 
 * extends the methods and functions of the 
 * restructured Systems class file.
 */
public class SystemGUI {

	protected Shell shlSystemApplication;
	Systems system = new Systems();

	/**
	 * Launch the application.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		try {
			SystemGUI window = new SystemGUI();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shlSystemApplication.open();
		shlSystemApplication.layout();
		while (!shlSystemApplication.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlSystemApplication = new Shell();
		shlSystemApplication.setSize(542, 230);
		shlSystemApplication.setText("System Application");
		
//		System Details Button
		Button btn_PrintSysDetails = new Button(shlSystemApplication, SWT.NONE);
		btn_PrintSysDetails.setImage(SWTResourceManager.getImage(SystemGUI.class, "/com/sun/java/swing/plaf/windows/icons/Computer.gif"));
		btn_PrintSysDetails.setToolTipText("Print system details");
		btn_PrintSysDetails.setForeground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BORDER));
		btn_PrintSysDetails.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				JOptionPane.showMessageDialog(null,
						system.displayDetails(),
						"System Details", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btn_PrintSysDetails.setBounds(10, 75, 113, 25);
		btn_PrintSysDetails.setText("System Details");
		
//		System Properties Button
		Button btn_showSysProperties = new Button(shlSystemApplication, SWT.NONE);
		btn_showSysProperties.setImage(SWTResourceManager.getImage(SystemGUI.class, "/com/sun/java/swing/plaf/windows/icons/DetailsView.gif"));
		btn_showSysProperties.setToolTipText("Generate system properties, like hardware name etc.");
		btn_showSysProperties.setForeground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BORDER));
		btn_showSysProperties.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				JOptionPane.showMessageDialog(null,
						system.displaySystemProperties(),
						"System Properties", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btn_showSysProperties.setBounds(129, 75, 140, 25);
		btn_showSysProperties.setText("System Properties");
		
//		Set Details Button
		Button btn_showDiagnosisSys = new Button(shlSystemApplication, SWT.NONE);
		btn_showDiagnosisSys.setImage(SWTResourceManager.getImage(SystemGUI.class, "/icons/progress/ani/1.png"));
		btn_showDiagnosisSys.setToolTipText("Run diagnosis on system hardware status");
		btn_showDiagnosisSys.setForeground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BORDER));
		btn_showDiagnosisSys.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				JOptionPane.showMessageDialog(null,
						system.diagnoseSystem(),
						"System Properties", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btn_showDiagnosisSys.setBounds(275, 75, 126, 25);
		btn_showDiagnosisSys.setText("Diagnose System");

//		Set Details button
		Button btn_SetDetails = new Button(shlSystemApplication, SWT.NONE);
		btn_SetDetails.setImage(SWTResourceManager.getImage(SystemGUI.class, "/com/sun/javafx/scene/web/skin/Undo_16x16_JFX.png"));
		btn_SetDetails.setToolTipText("Input and set new system parameters");
		btn_SetDetails.setForeground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BORDER));
		btn_SetDetails.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
		
				JOptionPane.showMessageDialog(null,
						"Please type: \n1 = to Print System Details \n2 = to Display system properties \n3 = to Diagnose system \n4 = to Set Details",
						"Set Details", JOptionPane.INFORMATION_MESSAGE);
				String str1 = JOptionPane.showInputDialog("Enter any of the four(4) options");
				

				if(str1.equals("1") || str1.equals("2") || str1.equals("3") || str1.equals("4")) {
					String message = system.printSystemDetails(str1);
				JOptionPane.showMessageDialog(null, message, "Set Details",
						JOptionPane.INFORMATION_MESSAGE);
				}else {
					JOptionPane.showMessageDialog(null,
							"You entered the wrong options",
							"System Properties", JOptionPane.WARNING_MESSAGE);
				}
				
			}
		});
		btn_SetDetails.setBounds(407, 75, 90, 25);
		btn_SetDetails.setText("Set Details");

//		Quit Button
		Button btn_QuitProgram = new Button(shlSystemApplication, SWT.NONE);
		btn_QuitProgram.setImage(SWTResourceManager.getImage(SystemGUI.class, "/org/eclipse/jface/wizard/images/stop.png"));
		btn_QuitProgram.setToolTipText("Kill the program");
		btn_QuitProgram.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				JOptionPane.showMessageDialog(null, "Are you sure you want to quit", "Quit",
						JOptionPane.INFORMATION_MESSAGE);
				System.exit(0);
			}
		});
		btn_QuitProgram.setBounds(211, 132, 75, 25);
		btn_QuitProgram.setText("Quit");
		
//		Program instruction label		
		Label label_Instruction_top = new Label(shlSystemApplication, SWT.NONE);
		label_Instruction_top.setForeground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_DARK_SHADOW));
		label_Instruction_top.setBounds(146, 28, 201, 15);
		label_Instruction_top.setText("Please select a process to initialize!");
		
		Label label = new Label(shlSystemApplication, SWT.SEPARATOR | SWT.HORIZONTAL);
		label.setBounds(88, 55, 298, 2);

	}
}
