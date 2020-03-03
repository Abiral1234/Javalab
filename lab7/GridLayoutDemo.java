import java.awt.*;
class GridLayoutDemo{

GridLayoutDemo(){
	Frame f=new Frame();
	GridBagLayout grid = new GridBagLayout();  
    GridBagConstraints gbc = new GridBagConstraints();  
    f.setLayout(grid);  
    GridBagLayout layout = new GridBagLayout();
    gbc.fill = GridBagConstraints.HORIZONTAL;  
    gbc.gridx = 0;  
    gbc.gridy = 0;  
   Label l1=new Label("Name");  
    f.add(l1,gbc);

    gbc.fill = GridBagConstraints.HORIZONTAL;  
    gbc.gridx = 1;  
    gbc.gridy = 0;  
    TextField t1=new TextField(); 
     f.add(t1,gbc);

     gbc.fill = GridBagConstraints.HORIZONTAL;  
    gbc.gridx = 0;  
    gbc.gridy = 2;  
    Label l2=new Label("Bio");  
     f.add(l2,gbc);

    gbc.fill = GridBagConstraints.HORIZONTAL;  
    gbc.gridx = 1;  
    gbc.gridy = 2;  
    TextArea t2=new TextArea();
   f.add(t2,gbc);
    f.setSize(600,600);  
    
    f.setVisible(true);  }

public static void main(String[] args) {
	new GridLayoutDemo();
}

}