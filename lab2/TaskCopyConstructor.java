class TaskCopyConstructor{
public String name;
public boolean isComplete;

public TaskCopyConstructor(){ 	//default constructor
name="Studyjava";
isComplete=false;
}
	
public TaskCopyConstructor(TaskCopyConstructor t1){ 	
name=t1.name;		//copy constructor
}

public static void main(String[] args)
{
TaskCopyConstructor task1=new TaskCopyConstructor();
TaskCopyConstructor task2=new TaskCopyConstructor(task1);
System.out.println("Task Name="+task1.name);
System.out.println("Task Name="+task2.name);
}
}
