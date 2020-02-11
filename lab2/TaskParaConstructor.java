class TaskParaConstructor{
public String name;
public boolean isComplete;
	
public TaskParaConstructor(String s1,boolean isComplete){ 	
name=s1;
this.isComplete=isComplete;		//paramterized constructor
}

public static void main(String[] args)
{
TaskParaConstructor task1=new TaskParaConstructor("StudyWebTech",true);
System.out.println("Task Name="+task1.name);
}
}
