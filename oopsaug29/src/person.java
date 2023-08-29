 class person {
    private String name; private int age;

    public person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    void name_ag()
    {
        System.out.print("name = "+name+"  "+"age = "+age);
    }
}
class Student extends person{
    private int Stundent_id;
    public Student(String name, int age) {
        super(name, age);
    }

    public Student(String name, int age, int stundent_id) {
        super(name, age);
        Stundent_id = stundent_id;
    }

    public int getStundent_id() {
        return Stundent_id;
    }

    public int setStundent_id(int stundent_id) {
        Stundent_id = stundent_id;
        return stundent_id;
    }
    void displayStundetdetails()
    {
        System.out.print(getStundent_id());
    }
}
