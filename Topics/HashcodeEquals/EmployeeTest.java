import java.util.HashMap;

public class EmployeeTest 
{
    public static void main(String[] args)
    {
        HashMap<Employee, String> emp = new HashMap<>();
        Employee emp1 = new Employee("John",23,"Bangalore");
        Employee emp2 = new Employee("Max",29,"Chennai");
        emp.put(emp1,"John details");
        emp.put(emp2,"Max details");
        System.out.println(emp1);
        System.out.println(emp2);
        Employee emp3 = new Employee("John",23,"Bangalore");
        System.out.println(emp.get(emp3));
    }
}
