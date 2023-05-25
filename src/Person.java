public class Person {
    private String name;
    private int age;
    private JOB job;
    private boolean married;

    public Person(String name, int age, JOB job, boolean married) {
        setName(name);
        setAge(age);
        setJob(job);
        setMarried(married);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setJob(JOB job) {
        this.job = job;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public JOB getJob() {
        return job;
    }

    public boolean isMarried() {
        return married;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job=" + job +
                ", married=" + married +
                '}';
    }
}

enum JOB {
    ENGINEER,
    POSTMAN,
    DOCTOR,
    FIREFIGHTER,
    MECHANIC,
    HAIRDRESSER
}
