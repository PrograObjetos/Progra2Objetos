
package progra2objetos;

public class Client {
    private String name;
    private String lastName;
    private String gender;
    private String email;
    private String password;
    private String checkPassword;
    private int age;

    public Client(String name, String lastName, String gender, String email, String password, String checkPassword, int age) {
        this.name = name;
        this.lastName = lastName;
        this.gender = gender;
        this.email = email;
        this.password = password;
        this.checkPassword = checkPassword;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCheckPassword() {
        return checkPassword;
    }

    public void setCheckPassword(String checkPassword) {
        this.checkPassword = checkPassword;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

 
    
}
