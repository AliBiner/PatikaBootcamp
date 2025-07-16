package com.alibiner.Week3.SalaryCalculator;

import java.time.LocalDate;

public class Employe extends Person implements IEmployee {

    private float salary;
    private float workHours;
    private LocalDate hireDate;
    private int maxWorkHoursWeekly = 40;
    private float overtimePay = 30;


    public Employe(String name, String surname, float salary, float workHours, LocalDate hireDate) throws Exception {
        super(name, surname);
        setSalary(salary);
        setWorkHours(workHours);
        setHireDate(hireDate);
    }

    public Employe(String name, String surname, int age, float salary, float workHours, LocalDate hireDate) throws Exception {
        super(name, surname, age);
        setSalary(salary);
        setWorkHours(workHours);
        setHireDate(hireDate);
    }

    public float getSalary() {
        return salary;
    }

    private void setSalary(float salary) throws Exception {
        if (salary < 0)
            throw new Exception("Eksi maaş girilemez.");
        else
            this.salary = salary;
    }

    public float getWorkHours() {
        return workHours;
    }

    private void setWorkHours(float workHours) throws Exception {
        if (workHours < 0)
            throw new Exception("Eksi çalışma saati girilemez.");
        else if (workHours > 168) {
            throw new Exception("Haftalık çalışma saati 168 saatten fazla olamaz.");
        } else
            this.workHours = workHours;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    private void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public int getMaxWorkHoursWeekly() {
        return maxWorkHoursWeekly;
    }

    public void setMaxWorkHoursWeekly(int maxWorkHoursWeekly) throws Exception {
        if (maxWorkHoursWeekly < 0)
            throw new Exception("Haftalık max çalışma saati eksi değer girilemez.");
        else if (maxWorkHoursWeekly > 168) {
            throw new Exception("Haftalık max çalışma saati 168'den büyük olamaz.");
        } else
            this.maxWorkHoursWeekly = maxWorkHoursWeekly;
    }

    public float getOvertimePay() {
        return overtimePay;
    }

    public void setOvertimePay(float overtimePay) throws Exception {
        if (overtimePay < 0)
            throw new Exception("Mesai ücreti eksi değer olamaz.");
        else
            this.overtimePay = overtimePay;
    }

    @Override
    public String getFullName() {
        return "Sayın, " + super.getFullName();
    }

    @Override
    public float tax() {
        if (salary < 1000)
            return 0f;
        else
            return salary * 0.03f;
    }


    @Override
    public float bonus() {
        if (workHours <= maxWorkHoursWeekly)
            return 0;
        else
            return (workHours - maxWorkHoursWeekly) * overtimePay;
    }

    @Override
    public float raiseSalary() {
        int nowYear = LocalDate.now().getYear();
        int hireYear = hireDate.getYear();
        int difference = nowYear - hireYear;
        if (difference < 10)
            return salary * 0.05f;
        else if (difference < 20)
            return salary * 0.10f;
        else
            return salary * 0.15f;
    }

    @Override
    public String toString() {
        return "Adı : " + super.getFullName() + "\n" +
                "Maaşı : " + salary + "\n" +
                "Çalışma Saati : " + workHours + "\n" +
                "Başlangıç Yılı : " + hireDate.getYear() + "\n" +
                "Vergi : " + tax() + "\n" +
                "Bonus : " + bonus() + "\n" +
                "Maaş Artışı : " + raiseSalary() + "\n" +
                "Vergi ve bonuslar ile maaş : " + (salary - tax() + bonus()) + "\n" +
                "Toplam maaş : " + (salary - tax() + bonus() + raiseSalary());
    }
}
