import java.awt.*;
class GridLayoutDemo{

GridLayoutDemo(){
	Frame f=new Frame();
	GridBagLayout grid = new GridBagLayout();  
    GridBagConstraints gbc = new GridBagConstraints();  
    f.setLayout(grid);  
   
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

    gbc.fill = GridBagConstraints.HORIZONTAL;  
    gbc.gridx = 0;  
    gbc.gridy = 3;  
    Label l3=new Label("Country");
   f.add(l3,gbc);

   gbc.fill = GridBagConstraints.HORIZONTAL;  
    gbc.gridx = 1;  
    gbc.gridy = 3;  
     Choice c=new Choice(); 
      	c.add("Nepal");     
        c.add("India");  
        c.add("China");  
        f.add(c,gbc);  

    gbc.fill = GridBagConstraints.VERTICAL;  
    gbc.gridx = 0;  
    gbc.gridy = 4;  
    Checkbox checkbox1 = new Checkbox("Dancing"); 
    f.add(checkbox1,gbc);   
    Checkbox checkbox2 = new Checkbox("Singing", true); 
    f.add(checkbox2,gbc);  

    f.setSize(600,600);  
    f.setVisible(true);  }

public static void main(String[] args) {
	new GridLayoutDemo();
}

}
