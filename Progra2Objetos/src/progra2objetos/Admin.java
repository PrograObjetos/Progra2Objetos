/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra2objetos;

/**
 *
 * @author kevin
 */
public class Admin {
    private String name;
    private String email;
    private String passWord;
    private String checkPassWord;

    public Admin(String email, String passWord, String checkPassWord, String name) {
        this.email = email;
        this.passWord = passWord;
        this.checkPassWord = checkPassWord;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getCheckPassWord() {
        return checkPassWord;
    }

    public void setCheckPassWord(String checkPassWord) {
        this.checkPassWord = checkPassWord;
    }
    
    
}
