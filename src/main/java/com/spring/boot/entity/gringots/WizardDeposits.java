package com.spring.boot.entity.gringots;





import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "wizard_deposits")
public class WizardDeposits {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "first_name", length = 50)
    private String firstName;

    @Column(name = "last_name", length = 60)
    private String lastName;

    @Column(name = "notes", length = 1000)
    private String note;

    @Column(name = "age", nullable = false, columnDefinition = "INT UNSIGNED")
    private int age;

    @Column(name = "magic_wand_creator",length = 100)
    private String magicWandCreator;

    @Column(name = "magic_wand_size")
    private int magicWandSize;

    @Column(name = "deposit_group",length = 20)
    private String depositGroup;

    @Column(name = "deposit_start_date")
    private LocalDateTime depositStartDate;

    @Column(name = "deposit_amount")
    private BigDecimal depositAmount;

    @Column(name = "deposit_interest")
    private double depositInterest;

    @Column(name = "deposit_charge")
    private double depositCharge;

    @Column(name = "deposit_expiration_date")
    private LocalDateTime depositExpirationDate;

    @Column(name = "is_deposit_expired")
    private Boolean isDepositExpired;

    public WizardDeposits() {
    }

    public WizardDeposits(String firstName, String lastName, String note, int age, String magicWandCreator, int magicWandSize, String depositGroup, LocalDateTime depositStartDate, BigDecimal depositAmount, double depositInterest, double depositCharge, LocalDateTime depositExpirationDate, Boolean isDepositExpired) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.note = note;
        this.age = age;
        this.magicWandCreator = magicWandCreator;
        this.magicWandSize = magicWandSize;
        this.depositGroup = depositGroup;
        this.depositStartDate = depositStartDate;
        this.depositAmount = depositAmount;
        this.depositInterest = depositInterest;
        this.depositCharge = depositCharge;
        this.depositExpirationDate = depositExpirationDate;
        this.isDepositExpired = isDepositExpired;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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


    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public long getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public String getMagicWandCreator() {
        return magicWandCreator;
    }


    public void setMagicWandCreator(String magicWandCreator) {
        this.magicWandCreator = magicWandCreator;
    }


    public int getMagicWandSize() {
        return magicWandSize;
    }

    public void setMagicWandSize(int magicWandSize) {
        this.magicWandSize = magicWandSize;
    }


    public String getDepositGroup() {
        return depositGroup;
    }

    public void setDepositGroup(String depositGroup) {
        this.depositGroup = depositGroup;
    }


    public LocalDateTime getDepositStartDate() {
        return depositStartDate;
    }

    public void setDepositStartDate(LocalDateTime deposit_start_date) {
        this.depositStartDate = deposit_start_date;
    }


    public BigDecimal getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(BigDecimal deposit_amount) {
        this.depositAmount = deposit_amount;
    }


    public double getDepositInterest() {
        return depositInterest;
    }

    public void setDepositInterest(Float deposit_interest) {
        this.depositInterest = deposit_interest;
    }


    public double getDepositCharge() {
        return depositCharge;
    }

    public void setDepositCharge(Float deposit_charge) {
        this.depositCharge = deposit_charge;
    }


    public LocalDateTime getDepositExpirationDate() {
        return depositExpirationDate;
    }

    public void setDepositExpirationDate(LocalDateTime deposit_expiration_date) {
        this.depositExpirationDate = deposit_expiration_date;
    }


    public Boolean getIsDepositExpired() {
        return isDepositExpired;
    }

    public void setIsDepositExpired(Boolean is_deposit_expired) {
        this.isDepositExpired = is_deposit_expired;
    }
}
