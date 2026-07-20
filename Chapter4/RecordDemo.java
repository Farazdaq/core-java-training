package Chapter4;

public record RecordDemo(int id, String name, String department) {
    public String getInfo() {
        return name + "work in" + department;
    }
}
