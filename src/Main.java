public class Main {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(5, 6);
        boolean square = rect1.isSquare();
        System.out.println(square);

        System.out.println();

    // --- test milesToKm method ---
    // 1. use static milesToKm method to convert 13.85
    //    miles to kilometers; print the converted result

        System.out.println(RaceUtility.milesToKm(13.85));



    // 2. use static milesToKm method to convert 26.42
    //    miles to kilometers; print the converted result

        System.out.println(RaceUtility.milesToKm(26.42));



    // --- test kmToMiles method ---
    // 3. use static kmToMiles method to convert 40 km
    //    to miles; print the converted result


        System.out.println(RaceUtility.kmToMiles(40));


    // 4. use static kmToMiles method to convert 3.5 km
    //    to miles; print the converted result

        System.out.println(RaceUtility.kmToMiles(3.5));





    // --- test makeProper method ---
    // 5. use static makeProper method to make the string
    // "welcome to the marathon!" proper; print the result

        System.out.println(RaceUtility.makeProper("welcome to the marathon!"));



    // 6. use static makeProper method to make the string
    // "It's TIME for THE 5k!" proper; print the result


        System.out.println(RaceUtility.makeProper("It's TIME for THE 5k!"));

        System.out.println();

        // 1. create an Employee object named employee1 with a
        // first name of "Jim" and last name "Mason"; call the
        // employeeInfo() method and print the returned string
        Employee employee1 = new Employee("Jim", "Mason");
        System.out.println(employee1.employeeInfo());

        // 2. call the getter methods for both static variables
        // (most recent ID and employee count) and print values
        System.out.println(Employee.getMostRecentEmployeeID());
        System.out.println(Employee.getTotalEmployeesCreated());

        // 3. create a second Employee object named employee2
        // with first name of "Amy" and last name "Adams"; call
        // the employeeInfo() method and print returned string


        Employee employee2 = new Employee("Amy", "Adams");
        System.out.println(employee2.employeeInfo());

        // 4. call the getter methods for both static variables
        // again; you should see they have both increased

        System.out.println(Employee.getMostRecentEmployeeID());
        System.out.println(Employee.getTotalEmployeesCreated());

        // 5. call the employeeInfo() method a second time on
        // both employee1 and employee2 objects and print
        // the returned strings; note that both now show a most
        // recent ID of 101 and 2 total employees hired, but
        // Jim's ID is still 100 and Amy's ID is still 101


        System.out.println(employee1.employeeInfo());
        System.out.println(employee2.employeeInfo());

        // 6. create a third Employee object named employee3
        // with first name "Bob" and last name "Ross". then
        // call the employeeInfo() method on the object and
        // print the returned string

        Employee employee3 = new Employee("Bob", "Ross");
        System.out.println(employee3.employeeInfo());


        // 7. create a fourth Employee object named employee4
        // with first name "Cindy" and last name "Nox".  then
        // call the employeeInfo() method on the object and
        // print the returned string



        Employee employee4 = new Employee("Cidny", "Nox");
        System.out.println(employee4.employeeInfo());


        // 8. call the employeeInfo() method one last time on
        // all 4 Employee objects; note that the number of
        // created employees is 4 and most recent ID is 103 for
        // all four objects

        System.out.println(employee1.employeeInfo());
        System.out.println(employee2.employeeInfo());
        System.out.println(employee3.employeeInfo());
        System.out.println(employee4.employeeInfo());






























// 9. call the getter methods for both static variables
// (most recent ID and employee count) and print values

        System.out.println(Employee.getMostRecentEmployeeID());
        System.out.println(Employee.getTotalEmployeesCreated());



    }
}
