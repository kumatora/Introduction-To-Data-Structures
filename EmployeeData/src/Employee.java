public class Employee {

    private String name;
    private String jobTitle;
    private String email;
    private int age;
    private String dateOfBirth;

    private String[] validJobTitles = {"Software developer", "HR", "VP", "Sales", "CEO"};

    public Employee(String name, String jobTitle, String email, int age){

        boolean validJobProvided = false;
        this.name = name;

        for (String titles:validJobTitles){
            if (titles.equals(jobTitle)){
                validJobProvided = true;
            }
        }

        if (validJobProvided){
            this.jobTitle = jobTitle;
        }else{
            throw new IllegalArgumentException("Job title provided is not valid!");
        }

        this.email = email;



        if (age >= 0) {
            this.age = age;
        }else{
            throw new IllegalArgumentException("The age provided must be greateer than or equal to 0");
        }
    }

    public void setDateOfBirth(String dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }

    public String getDateOfBirth(){
        return this.dateOfBirth;
    }

    public String getName(){
        return this.name;
    }

    public String getJobTitle(){
        return this.jobTitle;
    }

    public String getEmail(){
        return this.email;
    }

    public int getAge(){
        return this.age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setJobTitle(String jobTitle){

        boolean validJobProvided = false;
        for (String titles:validJobTitles){
            if (titles.equals(jobTitle)){
                validJobProvided = true;
            }
        }

        if (validJobProvided){
            this.jobTitle = jobTitle;
        }else{
            throw new IllegalArgumentException("Job title provided is not valid!");
        }
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setAge(int age){
        if (age >= 0){
            this.age = age;
        }else{
            throw new IllegalArgumentException("The age provided must be greateer than or equal to 0");
        }

    }

    public void printEmployee(){
        System.out.println("Name: " + this.name);
        System.out.println("Job Title: " + this.jobTitle);
        System.out.println("Email: " + this.email);
        System.out.println("Age: " + String.valueOf(this.age));
    }

    /*Increment the age of an employee
        -Takes the current age of the employee, and increment it by one
     */

    public void incrementAge(){
        this.age = this.age + 1;
    }

    public boolean isHR(){
        return this.jobTitle == "HR";
    }
}

    /*4.	Create a method, isHR(), which will return true if the employee is a member of HR, and false otherwise.

}
