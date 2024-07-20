package homework1;

public class Human {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0 && age < 120) {
            this.age = age;
        } else {
            System.out.println(age <= 0 ? "Human is loading..." : age >= 120 ?
                    "That's impressive, but looks like a stone turtle" : "Just a filler with no execution, sorry");
        }
    }
}