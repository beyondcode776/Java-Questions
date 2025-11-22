class Employee {
    private double salary;
    
    private String name;
    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public double getSalary() {
        return salary;
    }


    public void setSalary(double salary) {
        this.salary = salary;
    }



   
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    
    public void increaseSalary(double percentage) {
        if (percentage > 0) {
            
            double increment = (salary * percentage) / 100;
            salary = salary + increment;
            System.out.println(name + " salary increased by " + percentage + "%");
        } else {
            System.out.println("Percentage must greater than 0");
        }
    }

    
    public void display() {
        System.out.println("Name: " + name + "Salary: " + salary);
    }

    
    public static void main(String[] args) {
        Employee emp1 = new Employee("Kishlay", 100000);
        

        emp1.display();
        emp1.increaseSalary(10); 
        emp1.display();
        emp1.increaseSalary(25); 
    }
}
