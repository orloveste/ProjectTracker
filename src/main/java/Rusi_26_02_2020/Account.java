package Rusi_26_02_2020;

//@
@DatabaseTable(tableName = "accounts")
public class Account {
    @DatabaseField(id = true)
    private String email;
    private String name;

    private String pasword;

    public void setName(String name) {
        this.name = name;
    }
    public void setPassword(String pasword) {
        this.pasword = pasword;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", pasword='" + pasword + '\'' +
                '}';
    }
}
