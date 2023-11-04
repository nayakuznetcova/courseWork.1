public class Main {
    private static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        employees[0] = new Employee("Савинов", "Илья", "Иванович", 2, 106000);
        employees[1] = new Employee("Козлова", "София", "Павловна", 5, 88000);
        employees[2] = new Employee("Голубев", "Кирилл", "Владиславович", 4, 72000);
        employees[3] = new Employee("Иванова", "Ксения", "Дмитриевна", 1, 89000);
        employees[4] = new Employee("Романова", "Анна", "Александровна", 3, 92000);
        employees[5] = new Employee("Смирнов", "Павел", "Владимирович", 1, 66000);
        employees[6] = new Employee("Федорова", "Мария", "Сергеевна", 5, 83000);
        employees[7] = new Employee("Фомин", "Михаил", "Алексеевич", 2, 97000);
        employees[8] = new Employee("Зайцев", "Дмитрий", "Геннадьевич", 4, 103000);
        employees[9] = new Employee("Макарова", "Полина", "Евгеньевна", 3, 78000);

        System.out.println("Сумма затрат на зарплаты в месяц: " + calculatePayrollCosts());
        System.out.println("------------------------------------");
        System.out.println(minSalary());
        System.out.println("------------------------------------");
        System.out.println(maxSalary());
        System.out.println("------------------------------------");
        System.out.println("Средняя зарплата сотрудников: " + averageSalary());
        System.out.println("------------------------------------");
        printName();
        System.out.println("------------------------------------");
        changeSalary(1.0f);
        System.out.println("------------------------------------");
        System.out.println("Минимальная зарплата в отделе: " + personaMinSalary(3));
        System.out.println("------------------------------------");
        System.out.println("Максимальная зарплата в отделе: " + personaMaxSalary(1));
        System.out.println("------------------------------------");
        System.out.println("Общая зарплата на отдел: " + sumByDepartament(3));
        System.out.println("------------------------------------");
        changeSalaryByDepartment(5, 1.0f);
        System.out.println("------------------------------------");
        printEmployees();
        System.out.println("------------------------------------");
        printNameSalary(4);
        System.out.println("------------------------------------");
        lessNumber(90000);
        System.out.println("------------------------------------");
        moreNumber(90000);
    }

    public static void printEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static int calculatePayrollCosts() {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }

    public static Employee minSalary() {
        Employee person = employees[0];
        int minSalary = person.getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() < minSalary) {
                person = employees[i];
                minSalary = person.getSalary();
            }
        }
        return person;
    }

    public static Employee maxSalary() {
        Employee person = employees[0];
        int maxSalary = person.getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() > maxSalary) {
                person = employees[i];
                maxSalary = person.getSalary();
            }
        }
        return person;
    }

    public static int averageSalary() {
        return calculatePayrollCosts() / 10;
    }

    public static void printName() {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println("ФИО: " + employees[i].getSurName() + " " + employees[i].getName() + " " + employees[i].getPatronymic());
            }
        }
    }

    public static void changeSalary(float coef) {
        for (int i = 0; i < employees.length; i++) {
            int newSalary = (int) (employees[i].getSalary() * coef);
            employees[i].setSalary(newSalary);
        }
    }

    public static Employee personaMinSalary(int departament) {
        int minSalary = Integer.MAX_VALUE;
        Employee person = null;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartament() == departament && employees[i].getSalary() < minSalary) {
                minSalary = employees[i].getSalary();
                person = employees[i];
            }
        }
        return person;
    }

    public static Employee personaMaxSalary(int departament) {
        int maxSalary = Integer.MIN_VALUE;
        Employee person = null;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartament() == departament && employees[i].getSalary() > maxSalary) {
                maxSalary = employees[i].getSalary();
                person = employees[i];
            }
        }
        return person;
    }

    public static int sumByDepartament(int departament) {
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartament() == departament) {
                sum += employees[i].getSalary();
            }
        }
        return sum;
    }

    public static void changeSalaryByDepartment(int departament, float coef) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartament() == departament) {
                int newSalary = (int) (employees[i].getSalary() * coef);
                employees[i].setSalary(newSalary);
            }
        }
    }

    public static void printNameSalary(int departament) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getDepartament() == departament) {
                System.out.println("ФИО: " + employees[i].getSurName() + " " + employees[i].getName() + " " + employees[i].getPatronymic() + ". Зарплата: " + employees[i].getSalary());
            }
        }
    }

    public static void lessNumber(int salary) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < salary) {
                System.out.println(employees[i]);
            }
        }
    }

    public static void moreNumber(int salary) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() >= salary) {
                System.out.println(employees[i]);
            }
        }
    }
}