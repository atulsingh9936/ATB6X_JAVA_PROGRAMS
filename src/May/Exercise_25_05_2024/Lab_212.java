package May.Exercise_25_05_2024;

public class Lab_212 {

}


class PersonATB {

    Integer rollno;
    String name;
    Long phone_number;

    public PersonATB(Integer rollno, String name, Long phone_number) {
        this.rollno = rollno;
        this.name = name;
        this.phone_number = phone_number;
    }

    public Integer getRollno() {
        return rollno;
    }

    public void setRollno(Integer rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(Long phone_number) {
        this.phone_number = phone_number;
    }
}
