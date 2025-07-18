package com.alibiner.Week4.SalaryCalculator;

public class Person implements IPerson {
    private String name;
    private String surname;
    private int age;

    public Person(String name, String surname) throws Exception {
        setName(name);
        setSurname(surname);
    }

    public Person(String name, String surname, int age) throws Exception{
        setName(name);
        setSurname(surname);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    private void setName(String name) throws Exception {
        if (name.length()<3) {
            throw new Exception("Lütfen az 3 karakterli bir isim giriniz. ");
        }
        else
            this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    private void setSurname(String surname) throws Exception {
        if (surname.length()<3)
            throw new Exception("Lütfen az 3 karakterli bir soyisim giriniz. ");
        else
            this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws Exception {
        try {
            if (age < 0)
                throw new NegativeException("Yaş için eksi değer giremezsiniz. ");
            else
                this.age = age;
        }catch (NegativeException e) {

        }


    }

    @Override
    public String getFullName() {
        return this.name  + " " + this.surname;
    }
}
