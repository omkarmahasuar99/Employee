class Employee {
    String name;
    String company;
    double salary;
    int exp;

    Employee(String name, String company, double salary, int exp) {
        this.name = name;
        this.company = company;
        this.salary = salary;
        this.exp = exp;
    }
    void details()
    {
        if (this.exp >= 1 && this.exp <= 3) {
            double bonus = 0.15 * this.salary;
            salary=this.salary+bonus;
        }
        if (this.exp > 3) {
            double bonus=0.30*this.salary;
            salary=this.salary+bonus;
        }
        System.out.println("The salary is "+salary);
    }
    public static void main(String[] args)
    {
        Employee e1=new Employee("Rahul","Accenture",30000,2);
        Employee e2=new Employee("Sahil","Accenture",25000,1);
        Employee e3=new Employee("Rohit","Accenture",50000,5);
        e1.details();
        e2.details();
        e3.details();
    }

}