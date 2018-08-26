package JavaSchoolHW.Lectures;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employees")
public class Employee {
    @Id
    private Long id;
    private String name;
    private int age;

    public Employee() {

    }
}
