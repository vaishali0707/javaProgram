package com.cg.eis.exception;
public class Employee extends Exception
{

    int salary;

    Employee(int salary)
    {
        this.salary=salary;
    }
    public String toString()
    {
        return "Exception: Salary is below 3000";
    }
    
}
class UserException
{
    public static void checkSalary(int salary)throws Employee
    {
        if(salary<3000)
        {
            throw new Employee(salary);
        }
        System.out.println("Salary is above 3000");
    }
}
class SalaryUpdate
{
    public static void main(String args[])
    {
    UserException u=new UserException();
   try
   {
    u.checkSalary(300);
   }
   catch(Employee a)
   {
       System.out.println(a);
   }
    }

}
