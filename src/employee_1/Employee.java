package employee_1;

public class Employee {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int age;

    public Employee(String name, String position, String email, String phone, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.age = age;
    }

    private String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    private String getPosition() {
        return position;
    }

    private void setPosition(String position) {
        this.position = position;
    }

    private String getEmail() {
        return email;
    }

    private void setEmail(String email) {
        this.email = email;
    }

    private String getPhone() {
        return phone;
    }

    private void setPhone(String phone) {
        this.phone = phone;
    }

    private int getAge() {
        return age;
    }

    private void setAge(int age) {
        this.age = age;
    }
}
