public class Main {

    public static void main(String[] args) {
        Employee first = new Employee("Scott","Programmer","scott@email.com",25);
        System.out.println(first.getName());

        first.setName("Scotty");
        System.out.println(first.getName());

        first.printEmployee();
        first.incrementAge();
        first.printEmployee();
    }
}
