package Stacks;

public class Employee {
    private String fName;
    private String lName;
    private int id;

    public Employee(String fName, String lName, int id) {
        this.fName = fName;
        this.lName = lName;
        this.id = id;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", id=" + id +
                '}';
    }
}
