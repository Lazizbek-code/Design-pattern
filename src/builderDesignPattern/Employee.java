package builderDesignPattern;

public class Employee {
    private String id;
    private String firstName;
    private String lastName;
    private Integer age;
    private String email;
    private String phoneNumber;




    public static EmployeeBuilder builder(){
        return new EmployeeBuilder();
    }

    public Employee(String id, String firstName, String lastName, Integer age, String email, String phoneNumber) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public static class EmployeeBuilder {
        private String id;
        private String firstName;
        private String lastName;
        private Integer age;
        private String email;
        private String phoneNumber;

        public EmployeeBuilder id(String id) {
            this.id = id;
            return this;
        }

        public EmployeeBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public EmployeeBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public EmployeeBuilder age(Integer age) {
            this.age = age;
            return this;
        }

        public EmployeeBuilder email(String email) {
            this.email = email;
            return this;
        }

        public EmployeeBuilder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Employee build() {
            return new Employee(
                    this.id,
                    this.firstName,
                    this.lastName,
                    this.age,
                    this.email,
                    this.phoneNumber);
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
