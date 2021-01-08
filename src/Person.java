public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public int getAge(){
        return this.age;
    }

    public void setFirstName(String n){
        this.firstName = n;
    }

    public void setLastName(String n){
        this.lastName = n;
    }

    public void setAge(int n){
        if (n < 0 || n > 100) this.age =0;

        else this.age = n;
    }

    public boolean isTeen(){
        return this.age > 12 && this.age < 20;
    }

    public String getFullName(){
        if (this.firstName.isEmpty() && this.lastName.isEmpty()) return "";
        if (this.firstName.isEmpty() && !this.lastName.isEmpty()) return this.lastName;
        if (!this.firstName.isEmpty() && this.lastName.isEmpty()) return this.firstName;

        return this.firstName + " " + this.lastName;
    }
}
