package Model;

public class Student {
    private int id;
    private String name;
    private String scl_name;
    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", scl_name=" + scl_name + "]";
    }
    public Student(int id, String name, String scl_name) {
        this.id = id;
        this.name = name;
        this.scl_name = scl_name;
    }
    public Student() {
        //TODO Auto-generated constructor stub
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
    public String getScl_name() {
        return scl_name;
    }
    public void setScl_name(String scl_name) {
        this.scl_name = scl_name;
    }


}
