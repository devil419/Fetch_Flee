package Registration;

public class User extends Registration
{
    public User(){}

    public User(String fullName, String username,String password, String mailAddress,String mobile){

        this.fullName = fullName;
        this.username = username;
        this.password = password;
        this.mailAddress = mailAddress;
        this.mobile = mobile;
    }


    public void setFullName(String fullName) {this.fullName = fullName;}


    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setMailAddress(String mailAddress) {
        this.mailAddress = mailAddress;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getFullName() {return fullName;}

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getMailAddress() {
        return mailAddress;
    }

    public String getMobile() {
        return mobile;
    }








}
