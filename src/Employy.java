import javax.swing.plaf.DesktopPaneUI;
import java.util.Objects;

public class Employy {

    /*ПЕРЕМЕННЫЕ*/

    private String fullName;
    private int department;
    private int salary;
    private static int number = 0;
    private int id;



    /*КОНСТРУКТОР*/

    public Employy(String FIO, int salary, int department) {
        if(department < 1 || department > 5) throw new IllegalArgumentException("У нас нет такого отдела.");
        this.fullName = FIO;
        this.salary = salary;
        this.department = department;
        this.id = ++number;
    }



    /*GETTERS*/

    public int getDepartment() {
        return department;
    }
    public int getSalary() {
        return salary;
    }
    public String getFIO() {
        return fullName;
    }
    public int getId() {
        return id;
    }



    /*SETTER`S*/

    public void setDepartment(int department) {
        this.department = department;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }


    /*МЕТОДЫ*/

    @Override
    public String toString() {
        return "Employy{" +
                "fullName='" + fullName + '\'' +
                ", department=" + department +
                ", salary=" + salary +
                ", id=" + id +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employy)) return false;
        Employy employy = (Employy) o;
        return department == employy.department && salary == employy.salary && id == employy.id && fullName.equals(employy.fullName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(fullName, department, salary, id);
    }
}