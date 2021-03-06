package Builder;

public class Person {
    private String name;
    private String email;
    private String address;
    private int age;
    private String hobby;

    public Person(Builder builder){
     this.name = builder.name;
     this.email = builder.email;
     this.address = builder.address;
     this.age = builder.age;
     this.hobby = builder.hobby;
    }
    public static class Builder{
        private final String name;
        private final String email;
        private String address;
        private int age;
        private String hobby;

        public Builder(String name, String email){
            this.name = name;
            this.email = email;
        }

        public Builder setAddress(String address){
            this.address = address;
            return this;
        }

        public Builder setAge(int age){
            this.age = age;
            return this;
        }

        public Builder setHobby(String hobby){
            this.hobby = hobby;
            return this;
        }
        public Person build(){
            return new Person(this);
        }


    }
    @Override
    public String toString(){
        return this.name+"\n"+this.email+"\n"+this.age+"\n"+this.address+"\n"+this.hobby+"\n";
    }

}
