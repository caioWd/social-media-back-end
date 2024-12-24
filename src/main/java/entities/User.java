package entities;

public class User {
    private String nickname;
    private String email;
    private String password;
    private Integer age;
    private String description;

    public User(){}

    public User(String nickname, String email, String password, Integer age, String description) {
        this.nickname = nickname;
        this.email = email;
        this.password = password;
        this.age = age;
        this.description = description;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
