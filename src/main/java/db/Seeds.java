package db;

import models.Department;
import models.Employee;
import models.Engineer;
import models.Manager;

public class Seeds {

    public static void seedData(){
        DBHelper.deleteAll(Engineer.class);
        DBHelper.deleteAll(Employee.class);
        DBHelper.deleteAll(Manager.class);
        DBHelper.deleteAll(Department.class);

        Department department1 = new Department("HR");
        DBHelper.save(department1);

        Department department2 = new Department("IT");
        DBHelper.save(department2);


        Manager manager1 = new Manager("Mark", "Owen", 40000,department1, 100000 );
        DBHelper.save(manager1);

        Manager manager2 = new Manager("Gary", "Barlow", 45000,department2, 100000 );
        DBHelper.save(manager2);

        Manager manager3 = new Manager("Howard", "Donald", 40000,department1, 100000 );
        DBHelper.save(manager3);

        Manager manager4 = new Manager("Jason", "Orange", 45000,department2, 100000 );
        DBHelper.save(manager4);


        Engineer engineer1 = new Engineer("Justin", "Timberlake", 29000, department1);
        DBHelper.save(engineer1);

        Engineer engineer2 = new Engineer("JC", "Chasez", 27000, department2);
        DBHelper.save(engineer2);

        Engineer engineer3 = new Engineer("Justin", "Timberlake", 29000, department1);
        DBHelper.save(engineer3);

        Engineer engineer4 = new Engineer("JC", "Chasez", 27000, department2);
        DBHelper.save(engineer4);

        Engineer engineer5 = new Engineer("Joey", "Fatone", 29000, department1);
        DBHelper.save(engineer5);

        Engineer engineer6 = new Engineer("Lance", "Bass", 27000, department2);
        DBHelper.save(engineer6);

        Engineer engineer7 = new Engineer("Chris", "Kirkpatrick", 29000, department1);
        DBHelper.save(engineer7);

        Engineer engineer8 = new Engineer("Nick", "Carter", 27000, department2);
        DBHelper.save(engineer8);

        Engineer engineer9 = new Engineer("Brian", "Littrell", 27000, department2);
        DBHelper.save(engineer9);

        Engineer engineer10 = new Engineer("Kevin", "Richardson", 27000, department2);
        DBHelper.save(engineer10);

        Engineer engineer11 = new Engineer("AJ", "McLean", 27000, department2);
        DBHelper.save(engineer11);

        Engineer engineer12 = new Engineer("Howie", "Dorough", 27000, department2);
        DBHelper.save(engineer12);

    }
}
