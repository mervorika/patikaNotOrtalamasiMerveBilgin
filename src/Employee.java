
import java.util.Scanner;

public class Employee {
    public String name;
    public double salary;
    public int workHours;
    public int hireYear;
    public int today = 2021;

    Employee(String name,int salary,int workHours,int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax(){
        if (salary <= 1000) {
            return 0;
        }
        return salary*0.03;
    }
    public double bonus(){
        if(workHours > 40){
            return 30*(workHours-40);
        }
        return 0;
    }

    public double raiseSalary(){
        int workYear = (today - hireYear);
        if( workYear<= 9){
            return salary*0.05;
        }else if( workYear <= 19){
            return salary*0.1;
        }else{
            return salary*0.15;
        }
    }

    public String toString(){
        System.out.println("Adı: "+name);
        System.out.println("Maaşı: "+salary);
        System.out.println("Çalışma Saati: "+workHours);
        System.out.println("Başlangıç Yılı: "+hireYear);
        System.out.println("Vergi: "+tax());
        System.out.println("Bonus: "+bonus());
        System.out.println("Maaş Artışı: "+raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maaş: "+(salary+tax()+bonus()));
        System.out.println("Toplam maaş: "+(salary+tax()+bonus()+raiseSalary()));
        return null;
    }
    public static void main(String[] args){
        Employee employee = new Employee("kemal",2000,45,1985);
        employee.toString();
    }
}
