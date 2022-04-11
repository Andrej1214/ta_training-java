package com.epam.training.Andrej_Paulau.classes;

public class Customer {
    private int id;
    private String name;
    private String surname;
    private String patronymic;
    private Address address;
    private long creditCardNumber;
    private String bankAccount;

    public Customer(int id, String name, String surname, String patronymic) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
    }

    public Customer(int id, String name, String surname, String patronymic, Address address) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.address = address;
    }

    public Customer(int id, String name, String surname, String patronymic, long creditCardNumber) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.creditCardNumber = creditCardNumber;
    }

    public Customer(int id, String name, String surname, String patronymic, Address address, long creditCardNumber, String bankAccount) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.address = address;
        this.creditCardNumber = creditCardNumber;
        this.bankAccount = bankAccount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public long getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(long creditCardNumber) {
        if(creditCardNumber>1000_0000_0000_0000L){
            this.creditCardNumber = creditCardNumber;
        }else {
            throw new CustomerException("Указанное значение ниже 1000_0000_0000_0000L");
        }

    }
    public String getBankAccount() {
        return bankAccount;
    }
    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        if (id != customer.id) return false;
        if (creditCardNumber != customer.creditCardNumber) return false;
        if (!name.equals(customer.name)) return false;
        if (!surname.equals(customer.surname)) return false;
        if (!patronymic.equals(customer.patronymic)) return false;
        if (!address.equals(customer.address)) return false;
        return bankAccount.equals(customer.bankAccount);
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + name.hashCode();
        result = 31 * result + surname.hashCode();
        result = 31 * result + patronymic.hashCode();
        result = 31 * result + address.hashCode();
        result = 31 * result + (int) (creditCardNumber ^ (creditCardNumber >>> 32));
        result = 31 * result + bankAccount.hashCode();
        return result;
    }

    @Override
    public java.lang.String toString() {
        final StringBuilder sb = new StringBuilder("Customer{");
        sb.append("id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", surname=").append(surname);
        sb.append(", patronymic=").append(patronymic);
        sb.append(", address=").append(address);
        sb.append(", creditCardNumber=").append(creditCardNumber);
        sb.append(", bankAccount=").append(bankAccount);
        sb.append('}');
        return sb.toString();
    }
}

