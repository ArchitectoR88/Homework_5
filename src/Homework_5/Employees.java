package Homework_5;

public class Employees {
    private String fio;
    private String position;
    private String email;
    private int phone;
    private int salary;
    private int age;

    public int getAge() {  //Создали "геттер" для "age"
        return age;
    }

    public Employees(String fio, String position, String email, int phone, int salary, int age) {
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void printInfo(){
        System.out.println("fio: "+fio+"; position: "+position+"; email: "+email+"; age: "+age);
    }
}
