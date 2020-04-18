import insurance.*;

public class User{
    private long id;
    private String firstName;
    private String lastName;
    private String gender;
    private String email;
    private HealthInsurancePlan insurancePlan;
    private boolean isInsured;

    public boolean isInsured() {
        return isInsured;
    }

    public void setInsurance(HealthInsurancePlan insurancePlan) {
        this.insurancePlan = insurancePlan;
    }

    public HealthInsurancePlan getInsurancePlan() {
        if(isInsured){
            return insurancePlan;
        }

        return null;
    }

    public void setInsured(boolean isInsured) {
        this.isInsured = isInsured;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getGender() {
        return gender;
    }

    public long getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    
}
