public class Person implements Comparable<Person>{

    private int salary;
    private String name;

    public Person(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }
    // overwrides the compareto method which is used in the collections.sort interface
    @Override 
    public int compareTo(Person p){
        //return - if this salary is smaller then compared
        return p.getSalary() - this.salary; 
    }

    @Override
    public String toString() {
        return name + " " + salary;
    }
}
