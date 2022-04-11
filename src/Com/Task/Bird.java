package Com.Task;

public class Bird extends Animal {
    private String featherColorChukwu56985;
    public Bird(){
        super();
        featherColorChukwu56985 = "NN";
    }

    public Bird(String nameChukwu56985, int ageChukwu56985, int weightChukwu56985, String featherColorChukwu56985) {
        super(nameChukwu56985, ageChukwu56985, weightChukwu56985);
        this.featherColorChukwu56985 = featherColorChukwu56985;
    }

    public Bird(int ageChukwu56985, String featherColorChukwu56985) {
        super(ageChukwu56985);
        this.featherColorChukwu56985 = featherColorChukwu56985;
    }
    public void peck() {
        System.out.println("The bird is pecking worms");
    }


    @Override
    public void getvoice() {
        System.out.println(" Bird is making sound");
    }

    @Override
    public void eat(String foodnameChukwu56985) {
        System.out.println("Bird is eating "+ foodnameChukwu56985);

    }

    public String getFeatherColorChukwu56985() {
        return featherColorChukwu56985;
    }

    public void setFeatherColorChukwu56985(String featherColorChukwu56985) {
        this.featherColorChukwu56985 = featherColorChukwu56985;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "featherColorChukwu56985='" + featherColorChukwu56985 + '\'' +
                '}';
    }
}
