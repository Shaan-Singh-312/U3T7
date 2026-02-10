public class Employee {
    private String firstName;
    private String lastName;
    private int employeeID;
    private static int mostRecentEmployeeID = 99;
    private static int totalEmployeesCreated = 0;

    public Employee(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        mostRecentEmployeeID++;
        employeeID = mostRecentEmployeeID;
        totalEmployeesCreated++;
    }

    public String getFullName(){
        return firstName + " " + lastName;
    }

    public int getID(){
        return employeeID;
    }

    public static int getMostRecentEmployeeID(){
        return mostRecentEmployeeID;
    }

    public static int getTotalEmployeesCreated() {
        return totalEmployeesCreated;
    }

    public String employeeInfo(){
        return "--------------------------\n" + "Employee full name: " + getFullName() + "\n" + "Employee ID: " + employeeID + "\n" + "Most recent ID assigned: " + mostRecentEmployeeID + "\n" + "Total employees hired: " + totalEmployeesCreated;
    }
}
