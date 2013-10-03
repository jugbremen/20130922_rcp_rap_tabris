package de.jugbremen.app;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.IWorkbenchWindow;

public class AboutFactory {
  
  public static IAction create(IWorkbenchWindow window) {
    return new Action("About") {
      @Override
      public void run() {
        MessageDialog.openInformation(null, "About", "My RAP About");
      }
      @Override
      public String getId() {
        return "testid";
      }
    };
  }

}
