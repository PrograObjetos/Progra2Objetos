
package progra2objetos;

public class Client {
    private String name;
    private String lastName;
    private String gender;
    private String email;
    private String password;
    private String checkPassword;
    private int membershipnumber;
    private int age;
    private String country;
    private int phonenumber;
    private String Currency;

    public Client(String name, String lastName, String gender, String email, String password, String checkPassword, int membershipnumber, int age, String country, int phonenumber, String Currency) {
        this.name = name;
        this.lastName = lastName;
        this.gender = gender;
        this.email = email;
        this.password = password;
        this.checkPassword = checkPassword;
        this.membershipnumber = membershipnumber;
        this.age = age;
        this.country = country;
        this.phonenumber = phonenumber;
        this.Currency = Currency;
    }

    public int getMembershipnumber() {
        return membershipnumber;
    }

    public void setMembershipnumber(int membershipnumber) {
        this.membershipnumber = membershipnumber;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(int phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getCurrency() {
        return Currency;
    }

    public void setCurrency(String Currency) {
        this.Currency = Currency;
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
