package nestedClasses.nestedComparator;

import nestedClasses.nestedComparator.domain.Employee;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>(List.of(
                new Employee(1001,"Ralph",2015),
                new Employee(1005,"Carole",2021),
                new Employee(1022,"Jane",2013),
                new Employee(13151,"Laura",2020),
                new Employee(10050,"Jim",2018)
        ));

    employees.sort(new Employee.EmployeeComparator<>());
    for(var emp : employees){
        System.out.println(emp);
    }
    }

}
