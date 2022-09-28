
import java.util.*;
class Employee implements Comparable<Employee> {
    Double age;
    Double salary;
    //  String firstname;
    //  String lastname;
    String name;
    Employee(Double age,Double salary,String name){
        this.age= age;
        this.salary = salary;
        this.name = name;
    }
    @Override
    public String toString(){
        return  " Name " + this.name + " Salary : " + this.salary + " Age : " + this.age;
    }
    @Override
    public int compareTo(Employee o) {
        if(o.name == this.name ){
            return 0;
        }
        return -1 * o.name.compareTo(this.name);

    }


}




class SortBasedOnSalary implements Comparator<Employee>{

    @Override
    public int compare(Employee o1, Employee o2) {
        return -o1.salary.compareTo(o2.salary);
    }
}

public class Ans2 {
    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();
        list.add(new Employee(25.0,8000.99,"z"));
        list.add(new Employee(26.0,7000.99,"m"));
        list.add(new Employee(23.0,9000.99,"a"));
        list.add(new Employee(22.0,3000.99,"c"));
        list.add(new Employee(21.0,1000.99,"l"));

        Collections.sort(list);

        for(Employee e : list){
            System.out.println(e);
        }

        System.out.println("Sorting based on salary using Comparator");
        Collections.sort(list,new SortBasedOnSalary());
        for(Employee e : list){
            System.out.println(e);
        }
    }


}
