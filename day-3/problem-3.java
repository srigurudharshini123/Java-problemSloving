// crete employee with is,name,salary. store in a list 
// input: [(1,"john",3000),(2,"sam",4000)]
// output: id:2 
//         name:sam  
//        salary:4000
import java.util.ArrayList;
import java.util.List;

class Employee{
    int id;
    String name;
    double salary;

    Employee(int id,String name,double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
}

public class Main{
    public static void main (String[] args){

        List<Employee> emp = new ArrayList<Employee>();

        Employee emp1 = new Employee(1,"guru",3000);
        Employee emp2 = new Employee(2,"sri",5000);
        Employee emp3 = new Employee(3,"vishnu",6000);
        Employee emp4 = new Employee(4,"dharshini",4000);

        emp.add(emp1);
        emp.add(emp2);
        emp.add(emp3);
        emp.add(emp4);

        Employee highest = emp.get(0);

        for(int i=1; i<emp.size(); i++){

            Employee current = emp.get(i);

            if(current.salary > highest.salary){
                highest = current;
            }
        }

        System.out.println("Highest Salary Employee:");
        System.out.println("Id: " + highest.id);
        System.out.println("Name: " + highest.name);
        System.out.println("Salary: " + highest.salary);
    }
}
