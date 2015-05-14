package com.github.akarnokd.scp.gui;

import javax.annotation.PostConstruct;

import org.eclipse.rap.rwt.application.AbstractEntryPoint;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.*;
import org.eclipse.swt.widgets.*;

/**
 * Main entry point of the application, houses the menu and the base panel.
 */
public class SCPEntryPoint extends AbstractEntryPoint {

    @Override
    public int createUI() {
        return super.createUI();
    }

    int c;
    
    @PostConstruct
    @Override
    public void createContents(final Composite parent) {
        Label label = new Label(parent, SWT.NONE);
        label.setText("Hello world!");
        Button btn = new Button(parent, SWT.PUSH);
        btn.addSelectionListener(new SelectionAdapter() {
            /** */
            private static final long serialVersionUID = 1223221546391601176L;

            @Override
            public void widgetSelected(SelectionEvent e) {
                try {
                    Thread.sleep(200);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                label.setText("Clicks: " + (c++));
            }
        });
    }

}
