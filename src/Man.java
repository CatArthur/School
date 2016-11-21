public class Man {
    private String name;
    private String secondName;
    private int age;
    Man(String n,String f,int a){
        age=a;
        name=n;
        secondName=f;
    }
    int getAge(){
        return this.age;
    }
    String getName(){
        return this.name+" "+this.secondName;
    }
    String toStr() {
        return this.getName() + "\n" + "Age: "+this.getAge();
    }
}
