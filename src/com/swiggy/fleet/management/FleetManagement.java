package com.swiggy.fleet.management;

import com.swiggy.fleet.management.model.City;
import com.swiggy.fleet.management.model.Employee;
import com.swiggy.fleet.management.model.Postion;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FleetManagement {

    private static HashMap<Integer, Employee> employeeMap = new HashMap<Integer, Employee>();

    public FleetManagement() {
        City city1 = new City("Bangalore" , 560037);
        City city2 = new City("Delhi", 100001);
        City city3 = new City("Hyderabad", 240034);
        City city4 = new City("Chennai", 450098);
        City city5 = new City("Mumbai", 340098);

        ArrayList<Employee> m1List = new ArrayList<Employee>();
        Employee m1 = new Employee("Ram", 1, 200000.00, 4, Postion.CM, city1, null, m1List);
        employeeMap.put(m1.getId(),m1);


        ArrayList<Employee> f1List = new ArrayList<Employee>();
        Employee f1 = new Employee("Mohan", 11, 100010.00, 5, Postion.FM, city1, m1, f1List);
        employeeMap.put(f1.getId(), f1);
        m1List.add(f1);

        Employee ep11 = new Employee("Kanan", 111, 25000.00, 5, Postion.DE, city1, f1, null);
        employeeMap.put(ep11.getId(),ep11);
        f1List.add(ep11);

        Employee ep12 = new Employee("Kran", 112, 23000.00, 3, Postion.DE, city1, f1, null);
        employeeMap.put(ep12.getId(),ep12);
        f1List.add(ep12);

        Employee ep13 = new Employee("Kumar", 113, 22000.00, 4, Postion.DE, city1, f1, null);
        employeeMap.put(ep13.getId(), ep13);
        f1List.add(ep13);

        Employee ep14 = new Employee("Mohn", 114, 21000.00, 5, Postion.DE, city1, f1, null);
        employeeMap.put(ep14.getId(), ep14);
        f1List.add(ep14);


        ArrayList<Employee> f2List = new ArrayList<Employee>();
        Employee f2 = new Employee("Krishna", 12, 100020.00, 4, Postion.FM, city1, m1, f2List);
        employeeMap.put(f2.getId(), f2);
        m1List.add(f2);
        Employee ep21 = new Employee("Kanan2", 121, 25000.00, 5, Postion.DE, city1, f2, null);
        employeeMap.put(ep21.getId(), ep21);
        f2List.add(ep21);

        Employee ep22 = new Employee("Kran2", 122, 23000.00, 3, Postion.DE, city1, f2, null);
        employeeMap.put(ep22.getId(), ep22);
        f2List.add(ep22);

        Employee ep23 = new Employee("Kumar2", 123, 22000.00, 4, Postion.DE, city1, f2, null);
        employeeMap.put(ep23.getId(), ep23);
        f2List.add(ep23);

        Employee ep24 = new Employee("Mohn2", 124, 21000.00, 5, Postion.DE, city1, f2, null);
        employeeMap.put(ep24.getId(), ep24);
        f2List.add(ep24);

        ArrayList<Employee> f3List = new ArrayList<Employee>();
        Employee f3 = new Employee("Rohan", 13, 100030.00, 3, Postion.FM, city1, m1, f3List);
        employeeMap.put(f3.getId(), f3);
        m1List.add(f3);
        Employee ep31 = new Employee("Kanan3", 131, 25000.00, 3, Postion.DE, city1, f3, null);
        employeeMap.put(ep31.getId(), ep31);
        f3List.add(ep31);

        Employee ep32 = new Employee("Kran3", 132, 23000.00, 3, Postion.DE, city1, f3, null);
        employeeMap.put(ep32.getId(), ep32);
        f3List.add(ep32);

        Employee ep33 = new Employee("Kumar3", 133, 22000.00, 4, Postion.DE, city1, f3, null);
        employeeMap.put(ep33.getId(), ep33);
        f3List.add(ep33);

        Employee ep34 = new Employee("Mohn3", 134, 21000.00, 3, Postion.DE, city1, f3, null);
        employeeMap.put(ep34.getId(), ep34);
        f3List.add(ep34);


        ArrayList<Employee> f4List = new ArrayList<Employee>();
        Employee f4 = new Employee("Bajaj", 14, 100040.00, 4, Postion.FM, city1, m1, f4List);
        employeeMap.put(f4.getId(),f4);
        m1List.add(f4);
        Employee ep41 = new Employee("Kanan3", 141, 25000.00, 4, Postion.DE, city1, f4, null);
        employeeMap.put(ep41.getId(), ep41);
        f4List.add(ep41);

        Employee ep42 = new Employee("Kran3", 142, 23000.00, 5, Postion.DE, city1, f4, null);
        employeeMap.put(ep42.getId(), ep42);
        f4List.add(ep42);

        Employee ep43 = new Employee("Kumar3", 143, 22000.00, 4, Postion.DE, city1, f4, null);
        employeeMap.put(ep43.getId(), ep43);
        f4List.add(ep43);

        Employee ep44 = new Employee("Mohn3", 144, 21000.00, 3, Postion.DE, city1, f4, null);
        employeeMap.put(ep44.getId(), ep44);
        f4List.add(ep44);


        ArrayList<Employee> m2List = new ArrayList<Employee>();
        Employee m2 = new Employee("Manohar", 2, 220000.00, 5, Postion.CM, city2, null, m2List);
        employeeMap.put(m2.getId(), m2);


        ArrayList<Employee> f11List = new ArrayList<Employee>();
        Employee f11 = new Employee("Mohan", 211, 100010.00, 5, Postion.FM, city2, m2, f11List);
        employeeMap.put(f11.getId(), f11);
        m2List.add(f11);

        Employee ep111 = new Employee("Kanan", 21111, 25000.00, 5, Postion.DE, city2, f11, null);
        employeeMap.put(ep111.getId(), ep111);
        f11List.add(ep111);

        Employee ep112 = new Employee("Kran", 21112, 23000.00, 3, Postion.DE, city2, f11, null);
        employeeMap.put(ep112.getId(), ep112);
        f11List.add(ep112);

        Employee ep113 = new Employee("Kumar", 21113, 22000.00, 4, Postion.DE, city2, f11, null);
        employeeMap.put(ep113.getId(), ep113);
        f11List.add(ep113);

        Employee ep114 = new Employee("Mohn", 21114, 21000.00, 5, Postion.DE, city2, f11, null);
        employeeMap.put(ep114.getId(), ep114);
        f11List.add(ep114);


        ArrayList<Employee> f22List = new ArrayList<Employee>();
        Employee f22 = new Employee("Krishna", 212, 100020.00, 4, Postion.FM, city2, m2, f22List);
        employeeMap.put(f22.getId(), f22);
        m2List.add(f22);
        Employee ep221 = new Employee("Kanan2", 2121, 25000.00, 5, Postion.DE, city2, f22, null);
        employeeMap.put(ep221.getId(), ep221);
        f22List.add(ep221);

        Employee ep222 = new Employee("Kran2", 2122, 23000.00, 3, Postion.DE, city2, f22, null);
        employeeMap.put(ep222.getId(), ep222);
        f22List.add(ep222);

        Employee ep223 = new Employee("Kumar2", 2123, 22000.00, 4, Postion.DE, city2, f22, null);
        employeeMap.put(ep223.getId(), ep223);
        f22List.add(ep223);

        Employee ep224 = new Employee("Mohn2", 2124, 21000.00, 5, Postion.DE, city2, f22, null);
        employeeMap.put(ep224.getId(), ep224);
        f22List.add(ep224);

        ArrayList<Employee> f33List = new ArrayList<Employee>();
        Employee f33 = new Employee("Rohan", 213, 100030.00, 3, Postion.FM, city2, m2, f33List);
        employeeMap.put(f33.getId(), f33);
        m2List.add(f33);
        Employee ep331 = new Employee("Kanan3", 2131, 25000.00, 3, Postion.DE, city2, f33, null);
        employeeMap.put(ep331.getId(), ep331);
        f33List.add(ep331);

        Employee ep332 = new Employee("Kran3", 2132, 23000.00, 3, Postion.DE, city2, f33, null);
        employeeMap.put(ep332.getId(), ep332);
        f33List.add(ep332);

        Employee ep333 = new Employee("Kumar3", 2133, 22000.00, 4, Postion.DE, city2, f33, null);
        employeeMap.put(ep333.getId(), ep333);
        f33List.add(ep333);

        Employee ep334 = new Employee("Mohn3", 2134, 21000.00, 3, Postion.DE, city2, f33, null);
        employeeMap.put(ep334.getId(), ep334);
        f33List.add(ep334);


        ArrayList<Employee> f44List = new ArrayList<Employee>();
        Employee f44 = new Employee("Bajaj", 214, 100040.00, 4, Postion.FM, city2, m2, f44List);
        employeeMap.put(f44.getId(), f44);
        m2List.add(f44);
        Employee ep441 = new Employee("Kanan3", 2141, 25000.00, 4, Postion.DE, city2, f44, null);
        employeeMap.put(ep441.getId(), ep441);
        f44List.add(ep441);

        Employee ep442 = new Employee("Kran3", 2142, 23000.00, 5, Postion.DE, city2, f44, null);
        employeeMap.put(ep442.getId(), ep442);
        f44List.add(ep442);

        Employee ep443 = new Employee("Kumar3", 2143, 22000.00, 4, Postion.DE, city2, f44, null);
        employeeMap.put(ep443.getId(),ep443);
        f44List.add(ep443);

        Employee ep444 = new Employee("Mohn3", 2144, 21000.00, 3, Postion.DE, city2, f44, null);
        employeeMap.put(ep444.getId(), ep444);
        f44List.add(ep444);
    }

    public static void main(String[] args) {
        Integer empId;
        String city;
        Double bonus;
        FleetManagement fleetManagement = new FleetManagement();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter id of the employee: ");
        empId = in.nextInt();

        if (employeeMap.get(empId) == null){
            System.out.println("The employee does not exist in the system with Id: " + empId);
            System.exit(0);
        }
        Employee emp = employeeMap.get(empId);
        fleetManagement.printHierarchyEmployee(emp);

        System.out.println("Enter the amount of Bonus: ");
        bonus = in.nextDouble();

        System.out.println("Enter the city for name for Bonus: ");
        city = in.next();
        System.out.println("Ciy: " + city);
        ArrayList<Employee> fmList = fleetManagement.distributeBonus(city,bonus);

        System.out.println("Top 5 DEs with ration of Bonus : Salary:");
        fleetManagement.getTop5DEs(fmList);
    }

    private void printHierarchyEmployee(Employee employee) {
        employee.showDetails();
        if(employee.getPostion().getRank()==3){
            return;
        }

        for(Employee employee1 : employee.getSubordinates()){
            printHierarchyEmployee(employee1);
        }
    }

    private ArrayList<Employee> distributeBonus(String city , Double bonus){
        ArrayList<Employee> fmList = new ArrayList<>();
        int fmRatingsCount = 0;
        for(Map.Entry<Integer, Employee> entry: employeeMap.entrySet()){
            Employee employee = entry.getValue();
            if (employee.getCity().getName().equals(city)){
                if(employee.getPostion() == Postion.FM){
                    fmRatingsCount = fmRatingsCount + employee.getRating();
                    fmList.add(employee);
                }
            }
        }
        for(Employee employee : fmList){
            distributeBonusInFM(employee,(bonus*employee.getRating())/fmRatingsCount);
        }

        return fmList;
    }

    private void distributeBonusInFM(Employee employee, Double bonus){
        System.out.println("The FM : " + employee.getId() + " with rating: " + employee.getRating() + " will have bonus of : " + bonus);
        int deRatingCounts = 0;
        for( Employee emp: employee.getSubordinates()){
            deRatingCounts = deRatingCounts + emp.getRating();
        }

        for( Employee emp: employee.getSubordinates()){
            emp.setBonous((bonus*employee.getRating())/deRatingCounts);
            System.out.println("Employee: " + emp.getId() + " with rating: " + emp.getRating() +  " gets bonus of " + emp.getBonous());
        }
    }

    private void getTop5DEs(ArrayList<Employee> fmList){
        ArrayList<Employee> deList = new ArrayList<Employee>();
        for(Employee employee: fmList){
            deList.addAll(employee.getSubordinates());
        }
        deList.sort(Comparator.comparing(employee -> employee.getBonousSalaryRatio()));
        System.out.println("Top 5 DEs: ");
        for (int i=0 ; i< (deList.size()>5?5:deList.size()) ; i++){
            System.out.println("EmpID : " + deList.get(i).getId());
        }
    }
}
