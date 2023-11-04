public class Employee {
    private String surName;
    private String name;
    private String patronymic;
    private int departament;
    private int salary;
    private int id;
    private static int counter = 1;

    public Employee(String surName, String name, String patronymic, int departament, int salary) {
        this.surName = surName;
        this.name = name;
        this.patronymic = patronymic;
        this.departament = departament;
        this.salary = salary;
        id = counter++;
    }

    public String getSurName() {
        return surName;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public int getDepartament() {
        return departament;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setDepartament(int departament) {
        this.departament = departament;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String toString() {
        return "ФИО: " + surName + " " + name + " " + patronymic + ". Отдел: " + departament + ". Зарплата: " + salary + ". Id: " + id;
    }
}
