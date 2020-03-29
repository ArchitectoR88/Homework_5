package Homework_5;

public class Homework_5 {

    public static void main(String[] args) {
        Employees[] employees = new Employees[5];
        employees[0] = new Employees("Ivanov1","position1","Ivanov1@mail.com", 789456123, 2500, 45);
        employees[1] = new Employees("Ivanov2","position2","Ivanov2@mail.com", 789456321, 2000, 40);
        employees[2] = new Employees("Ivanov3","position3","Ivanov3@mail.com", 789654123, 1500, 35);
        employees[3] = new Employees("Ivanov4","position4","Ivanov4@mail.com", 987456123, 1000, 30);
        employees[4] = new Employees("Ivanov5","position5","Ivanov5@mail.com", 159357456, 3000, 50);
        for (int i = 0; i < employees.length; i++) {
            if(employees[i].getAge() > 40){
                employees[i].printInfo();
            }
        }
    }
}
