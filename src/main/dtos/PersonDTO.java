package main.dtos;

public class PersonDTO {
    private String firstName;
    private String lastName;
    private Double annualSalary;
    private Double superRate;
    private String paymentStartDate;

    public PersonDTO(){

    }

    public PersonDTO(String firstName, String lastName, Double annualSalary, Double superRate, String paymentStartDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.annualSalary = annualSalary;
        this.superRate = superRate;
        this.paymentStartDate = paymentStartDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(Double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public Double getSuperRate() {
        return superRate;
    }

    public void setSuperRate(Double superRate) {
        this.superRate = superRate;
    }

    public String getPaymentStartDate() {
        return paymentStartDate;
    }

    public void setPaymentStartDate(String paymentStartDate) {
        this.paymentStartDate = paymentStartDate;
    }
}
