package sber.book;

public class Author {

    private String name;
    private String sex;
    private String email;

    public Author(String name, String sex, String email) {
        this.name = name;
        this.sex = sex;
        this.email = email;
        System.out.println("Author Created.");
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public String getEmail() {
        return email;
    }

    public String toString() {
        return "\nName: " + getName()
                + "\nSex: " + getSex()
                + "\nEmail: " + getEmail();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
