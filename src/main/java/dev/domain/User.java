package dev.domain;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.time.LocalDate;

@Entity
@Table(name = "user_table")
public class User {

    @NotNull
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @NotBlank
    @Column(name = "username")
    private String username;

    @NotBlank
    @Column(name = "fullname")
    private String fullName;

    @NotBlank
    @Pattern(regexp = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$", message = "Incorrect email format")
    @Column(name = "email")
    private String email;

    @NotNull
    @Past
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @Column(name = "dateOfBirth")
    private LocalDate dateOfBirth;

    @NotNull
    @Column(name = "gender")
    private String gender;

    @NotBlank
    @Column(name = "fatherName")
    private String fatherName;

    @NotBlank
    @Column(name = "motherName")
    private String motherName;

    @NotBlank
    @Size(min = 15, max = 15, message = "NID number must be exactly 15 digits")
    @Column(name = "nid")
    private String nid;

    @NotBlank
    @Size(min = 12, max = 12, message = "TIN number must be exactly 12 digits")
    @Column(name = "tin")
    private String tin;


    @NotBlank
//    @Min(5)
    private String password;

    private Double tax;

    public User(int id, String username, String fullName, String email, LocalDate dateOfBirth, String gender, String fatherName,
                String motherName, String nid, String tin, String password, Double tax) {
        this.id = id;
        this.username = username;
        this.fullName = fullName;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.nid = nid;
        this.tin = tin;
        this.password = password;
        this.tax = tax;
    }


    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getNid() {
        return nid;
    }

    public void setNid(String nid) {
        this.nid = nid;
    }

    public String getTin() {
        return tin;
    }

    public void setTin(String tin) {
        this.tin = tin;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Double getTax() {
        return tax;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", gender='" + gender + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", motherName='" + motherName + '\'' +
                ", nid='" + nid + '\'' +
                ", tin='" + tin + '\'' +
                ", password='" + password + '\'' +
                ", tax=" + tax +
                '}';
    }
}
