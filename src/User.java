public class User {
    private String firstName;
    private String lastName;
    private String email;
    private String password;


    User(String firstName, String lastName, String email, String password ){
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setEmail(email);
        this.setPassword(password);

    }

    public String getFirstName(){
        return  firstName;
    }
    public String getLastName(){
        return  lastName;
    }
    public String getEmail(){
        return  email;
    }
    public String getPassword(){
        return password;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }public void setLastName(String lastName){
        this.lastName = lastName;
    }public void setEmail(String email){
        this.email = email;
    }public void setPassword(String password){
        this.password = password;
    }

}
