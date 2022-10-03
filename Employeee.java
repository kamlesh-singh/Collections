import java.util.HashMap;
import java.util.Map;

public class Employeee
{
    String name;
    String designation;
    int age;

    Employeee(String name, String designation, int age){
        this.name=name;
        this.designation=designation;
        this.age=age;

    }

     @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result
                +  this.name.hashCode() +
                this.designation.hashCode();
        return result;
    }
    
    @Override
    public String toString(){
        return "Name : " + this.name + "designation : " + designation + " age : " + age;
    }
    public static void main(String[] args) {
        HashMap<Employeee,String> hash = new HashMap<>();
        Employeee obj1 = new Employeee("kamlesh","SE",24);
        Employeee obj2 = new Employeee("abhi","SE",22);
        Employeee obj3 = new Employeee("ram","SE",23);
        Employeee obj4 = new Employeee("hem","SE",25);
        Employeee obj5 = new Employeee("shyam","SE",26);

        hash.put(obj1,obj1.designation);
        hash.put(obj2,obj2.designation);
        hash.put(obj3,obj3.designation);
        hash.put(obj4,obj4.designation);
        hash.put(obj5,obj5.designation);

        for(Map.Entry<Employeee,String> entry : hash.entrySet()){
            System.out.println(entry.getKey());
        }
    }
}
