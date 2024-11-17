import java.util.Objects;
class User {
    private String name;
    private int old;
    private String phone;
    public User(String name, int old, String phone) {
        this.name = name;
        this.old = old;
        this.phone = phone;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getOld() {
        return old;
    }
    public void setOld(int old) {
        this.old = old;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        User user = (User) obj;
        return old == user.old &&
                Objects.equals(name, user.name) &&
                Objects.equals(phone, user.phone);
    }
    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", old=" + old +
                ", phone='" + phone + '\'' +
                '}';
    }
}