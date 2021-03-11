package Builder;

public class Person {
    private String name;
    private String email;
    private String address;
    private int age;
    private String hobby;
// use BUILDER as PARAM
    public Person(Builder builder){
     this.name = builder.name;
     this.email = builder.email;
     this.address = builder.address;
     this.age = builder.age;
     this.hobby = builder.hobby;
    }
    public static class Builder{
        // final means field is mandatory
        private final String name;
        private final String email;
        // these fields are NOT mandatory
        private String address;
        private int age;
        private String hobby;

        public Builder(String name, String email){
            // set the mandatory fields
            this.name = name;
            this.email = email;
        }
        // set optionsl fields
        public Builder setAddress(String address){
            this.address = address;
            return this;
        }
        // set optionsl fields

        public Builder setAge(int age){
            this.age = age;
            return this;
        }
        // set optionsl fields

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
