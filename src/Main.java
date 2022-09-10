public class Main {

    private static Employy[] employys = new Employy[10];

    public static void main(String[] args) {
        initial();
        printAllEmployy();
        System.out.println("Сумма затрат на зарплату: " + sumSalary());
        System.out.println("Сумма минимальной зароботной платы: " + minSalaryEmployy());
        System.out.println("Среднее значение заработной платы: " + averageSalary());
        System.out.println("Максимальное значение заработной платы: " + maxSalaryEmployy());
        fioAllEmployy();
    }



    /*МЕТОДЫ*/

    private static void initial() {
        int department = 1;
        for (int i = 0; i < employys.length; i++) {
            if (department > 5) {
                department = 1;
            }
            employys[i] = new Employy("John " + i, ((i + 1) * 10_000), department++);
        }
    }
    private static int sumSalary() {
        int sum = 0;
        for (int i = 0; i < employys.length; i++) {
            sum += employys[i].getSalary();
        }
        return sum;
    }
    private static void printAllEmployy() {
        for (int i = 0; i < employys.length; i++) {
            System.out.println(employys[i]);
        }
    }
    private static Employy minSalaryEmployy() {
        Employy minSalaryEmployy = null;
        for (int i = 0; i < employys.length; i++) {
            if (minSalaryEmployy == null) {
                minSalaryEmployy = employys[i];
                continue;
            }
            if (employys[i].getSalary() < minSalaryEmployy.getSalary()) {
                minSalaryEmployy = employys[i];
            }
        }
        return minSalaryEmployy;
    }
    private static int averageSalary() {
        return sumSalary()/ employys.length;
    }
    private static Employy maxSalaryEmployy() {
        int max = 0;
        Employy maxSalaryEmployy = null;
        for (int i = 0; i < employys.length; i++) {
            if (max < employys[i].getSalary()) {
                maxSalaryEmployy = employys[i];
                max = employys[i].getSalary();
            }
        }
        return maxSalaryEmployy;
    }
    private static void fioAllEmployy() {
        for (int i = 0; i < employys.length; i++) {
            System.out.println(employys[i].getFIO());
        }
    }
}