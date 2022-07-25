package D20220725;

public class Employee
{
    private Integer id;
    private String firstname;
    private String lastName;
    private String department;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public boolean equals(Object anObject) {
        if (anObject == null) {
            return false;
        }
        if (anObject == this) {
            return true;
        }
        if (getClass() != anObject.getClass()) {
            return false;
        }
        Employee emp = (Employee) anObject;
        return (this.getId().equals(emp.getId()));
    }

    @Override
    public int hashCode()
    {
        final int PRIME = 29;
        int result = 1;
        result = PRIME * result + getId();
        return result;
    }
}