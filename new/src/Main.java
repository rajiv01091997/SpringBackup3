import javax.xml.transform.stream.StreamSource;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {


        List<Employee> emp=new ArrayList<>();
        emp.add(new Employee("A",1000));
        emp.add(new Employee("B",1000));
        emp.add(new Employee("C",2000));
        emp.add(new Employee("D",2000));
        emp.add(new Employee("E",3000));
        emp.add(new Employee("F",4000));

        //Set<Integer> set= emp.stream().map(e->e.salary).collect(Collectors.toSet());

        Set<Integer> set= emp.stream().


        System.out.println(set);

    }
}