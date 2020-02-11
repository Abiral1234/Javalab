class TaskDemo{
public static void main(String[] args)
{
TaskConstructor task1=new TaskConstructor();
System.out.println("Task Name="+task1.name);

TaskConstructor task2=new TaskConstructor("StudyWebTech");
System.out.println("Task Name="+task2.name);
}
}