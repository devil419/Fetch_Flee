package Registration;

public class Admin
{
    final static String masterKey = "admin";

    String adminUsername;
    String adminPassword;

    User[] userObjRef;

    public Admin(int size){
        userObjRef = new User[size];
    }

    public void insertUser(User user){
        for(int i = 0; i < userObjRef.length; i++){
            if(userObjRef[i] == null){
                userObjRef[i] = user;
                break;
            }
        }
    }

    public void showAllUser(){
        for(int i = 0; i < userObjRef.length; i++){
            if(userObjRef[i] != null){
                System.out.println("Name : "+userObjRef[i].fullName);
            }
        }
    }

    public void setUsername(String adminUsername) {
        this.adminUsername = adminUsername;
    }

    public void setPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    public String getUsername() {
        return adminUsername;
    }

    public String getPassword() {
        return adminPassword;
    }




}
