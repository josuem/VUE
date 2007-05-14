package tufts.vue;

import javax.swing.*;
import javax.swing.border.*;

/**
 * Replacement for old LWCToolPanel, mainly for backward compat with some old code.
 * Ultimately, we probably don't need this class at all.  -- SMF 2007-04-30
 *
 * @version $Revision: 1.4 $ / $Date: 2007-05-14 16:42:29 $ / $Author: sfraize $  
 */

public class ToolPanel extends JPanel
{        
    protected JPanel mBox;
   
    public ToolPanel()
    {
         setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
         setBorder(new EmptyBorder(0,2,0,3));//t,l,b,r
         
         setOpaque(false);
         mBox = new JPanel();
         mBox.setLayout(new java.awt.GridBagLayout());
         //tufts.vue.gui.GUI.applyToolbarColor(mBox); // was only for the old perma-docked toolbar
         //buildBox();
         //add(mBox);
    }

    public void addNotify() {
        buildBox();
        add(mBox);
        super.addNotify();
    }

    protected void buildBox() {}
    
    protected javax.swing.JComponent getBox() {
        return mBox;
    }
    
    /** @deprecated */
    public boolean addComponent(java.awt.Component c) {
        tufts.Util.printStackTrace("ToolPanel:addComponent IGNORED " + c);
        return true;
    }
    
}
