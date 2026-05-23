package Low_Level.Design_patterns.Builder;

class User{
    private String name;
    private String age;
    private String email;

    private User(UserBuilder builder){
        this.name = builder.name;
        this.age = builder.age;
        this.email = builder.email;
    }


    static class UserBuilder{
        String name;
        String age;
        String email;

        UserBuilder setName(String name){
            this.name = name;
            return this;
        }

        UserBuilder setAge(String age){
            this.age = age;
            return this;
        }

        UserBuilder setEmail(String email){
            this.email = email;
            return this;
        }

        User build(){
            return new User(this);
        }
    }

    public void show(){
        System.out.println(name + " " + age + " " + email);
    }
}

public class BuilderDemo {
    public static void main(String[] args) {
        User user = new User.UserBuilder()
        .setName("Kumar")
        .setAge("20")
        .setEmail("kumar@gmail.com")
        .build();

        user.show();
    }
}
