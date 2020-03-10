# Event and Listener (Java Event Handling)
Changing the state of an object is known as an event. For example, click on button, dragging mouse etc. The java.awt.event package provides many event classes and Listener interfaces for event handling.
Java Event classes and Listener interfaces
Event Classes	Listener Interfaces
ActionEvent	ActionListener
MouseEvent	MouseListener and MouseMotionListener
MouseWheelEvent	MouseWheelListener

KeyEvent	| KeyListener
---|----
ItemEvent	| ItemListener
TextEvent	| TextListener
AdjustmentEvent | 	AdjustmentListener
WindowEvent	| WindowListener
ComponentEvent	| ComponentListener
ContainerEvent |	ContainerListener
FocusEvent |	FocusListener

 
### Steps to perform Event Handling
Following steps are required to perform event handling:

1.Register the component with the Listener

### Registration Methods
For registering the component with the Listener, many classes provide the registration methods. For example:

* #### Button
public void addActionListener(ActionListener a){}
+  #### MenuItem
public void addActionListener(ActionListener a){}
+ #### TextField
public void addActionListener(ActionListener a){}
public void addTextListener(TextListener a){}
+  #### TextArea
public void addTextListener(TextListener a){}
+  #### Checkbox
public void addItemListener(ItemListener a){}
+  #### Choice
public void addItemListener(ItemListener a){}
+  #### List
public void addActionListener(ActionListener a){}
public void addItemListener(ItemListener a){}

### Java Event Handling Code
We can put the event handling code into one of the following places:

1. Within class
1. Other class
1. Anonymous class
