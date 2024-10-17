class Employee{
    public  String Name;
    public  double BaseSalary;

    public Employee(String name, double baseSalary) {
        Name = name;
        BaseSalary = baseSalary;

    }

    public String getName() {
        return Name;
    }

    public double getBaseSalary() {
        return BaseSalary;
    }


    public void setName(String name) {
        Name = name;
    }

    public void setBaseSalary(double baseSalsry) {
        BaseSalary = baseSalsry;
    }

}

class Permanent{
    public void calculateSalary(Employee employee)
    {
        System.out.println(employee.BaseSalary * 1.2);
    }
}

class Contract{
    public void calculateSalary(Employee employee)
    {
        System.out.println(employee.BaseSalary * 1.1);
    }
}


class Intern{
    public void calculatSalary(Employee employee)
    {
        System.out.println(employee.BaseSalary * 0.8);
    }
}



public class Main {
    public static void main(String[] args) {
        Employee permanentEmployee = new Employee("Aslan", 3000);
        Employee contractEmployee = new Employee("Arman", 4000);
        Employee internEmployee = new Employee("Beka", 1500);
        System.out.println(permanentEmployee.getName() + "'s salary: " + calculateSalary(permanentEmployee, 1.2));
        System.out.println(contractEmployee.getName() + "'s salary: " + calculateSalary(contractEmployee, 1.1));
        System.out.println(internEmployee.getName() + "'s salary: " + calculateSalary(internEmployee, 0.8));
    }

    private static double calculateSalary(Employee employee, double multiplier) {
        return employee.getBaseSalary() * multiplier;
    }
}
