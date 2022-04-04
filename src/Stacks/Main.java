package Stacks;

public class Main {

    public static void main(String[] args) {

       EmployeeArrayStack employeeArrayStack = new EmployeeArrayStack(5);

       employeeArrayStack.push(new Employee("Hamid","Said",10));
       employeeArrayStack.push(new Employee("Hallet","Packket",38));
       employeeArrayStack.push(new Employee("dell","seif",23));
        employeeArrayStack.push(new Employee("jojo","toto",23));

        //employeeArrayStack.print();



        //LinkedList Stack Testing
        LinkedListStack linkedListStack = new LinkedListStack();

        linkedListStack.push(new Employee("Hamid","Said",10));
        linkedListStack.push(new Employee("Naruto","Uzumaki",11));
        linkedListStack.push(new Employee("Kakashi","Uchiha",20));
        linkedListStack.push(new Employee("Lady","Nezuko",23));

        //System.out.println(linkedListStack.peek());
        linkedListStack.printStack();
        linkedListStack.pop();
        linkedListStack.printStack();

        System.out.println(linkedListStack.isEmpty());

    }
}
