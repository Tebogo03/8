package Com.Task;

public class Fish extends Animal{
    private String scaleColourChukwu56985;
    public Fish(){
        super();
        scaleColourChukwu56985 = "NN";
    }
    public Fish(String nameChukwu56985, int ageChukwu56985, int weightChukwu56985,String scaleColourChukwu56985){
        super(nameChukwu56985,ageChukwu56985,weightChukwu56985);
        this.scaleColourChukwu56985 =scaleColourChukwu56985;
    }
    public Fish(int ageChukwu56985,String scaleColourChukwu56985){
        super(ageChukwu56985);
        this.scaleColourChukwu56985 =scaleColourChukwu56985;
    }
    public void move(){
        System.out.println("fleu fleu");
    }

    @Override
    public void eat(String foodnameChukwu56985) {
        System.out.println("Fish is eating "+ foodnameChukwu56985);

    }

    @Override
    public void getvoice() {
        System.out.println("Fish is making sound");

    }

    public String getScaleColourChukwu56985() {
        return scaleColourChukwu56985;
    }

    public void setScaleColourChukwu56985(String scaleColourChukwu56985) {
        this.scaleColourChukwu56985 = scaleColourChukwu56985;
    }

    @Override
    public String toString() {
        return "Fish{" +
                "scaleColourChukwu56985='" + scaleColourChukwu56985 + '\'' +
                '}';
    }
}
