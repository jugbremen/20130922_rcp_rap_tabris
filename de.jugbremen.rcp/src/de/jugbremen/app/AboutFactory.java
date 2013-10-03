/**
 * Copyright by Rabea 2013
 */
package de.jugbremen.app;

import org.eclipse.jface.action.IAction;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.actions.ActionFactory;

/**
 * @author gransberger
 */
public class AboutFactory {
  
  public static IAction create(IWorkbenchWindow window) {
    return ActionFactory.ABOUT.create(window);
  }

}
