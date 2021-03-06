package CalcSheet.Gui;

import com.jgoodies.forms.layout.CellConstraints;
import com.jgoodies.forms.layout.CellConstraints.Alignment;
import com.jgoodies.forms.layout.FormLayout;
import org.jdesktop.swingx.JXPanel;

import javax.swing.*;

/**
 * Created by Kacper on 2015-02-04.
 */
public class FormPanel extends JXPanel {

    protected Alignment alignment;
    protected FormLayout formLayout;
    protected CellConstraints cellConstraints;

    protected String row,col;

    public FormPanel(String col,String row){
        this.row = row;
        this.col = col;
        createLayout();

    }

    private void createLayout(){
        formLayout = new FormLayout(col,row);
        setLayout(formLayout);

        alignment = CellConstraints.FILL;
        cellConstraints = new CellConstraints();
    }

    public void addXY(JComponent component,int x,int y){
        this.add(component,cellConstraints.xy(x, y, alignment, alignment));
        this.repaint();
    }

    public void addXYW(JComponent component,int x,int y,int w){
        this.add(component, cellConstraints.xyw(x, y, w, alignment, alignment));
        this.repaint();
    }


    public void addXYWH(JComponent component,int x,int y,int w,int h){
        this.add(component, cellConstraints.xywh(x, y, w, h, alignment, alignment));
        this.repaint();
    }


}
