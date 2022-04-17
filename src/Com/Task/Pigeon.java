package Com.Task;

public class Pigeon extends Bird implements AnimalBehaviour, AnimalMove{
    private  String speciesChukwu56985;

    public Pigeon(){
        super();
        speciesChukwu56985 = "NN";
    }

    public Pigeon(String nameChukwu56985, int ageChukwu56985, int weightChukwu56985, String featherColorChukwu56985, String speciesChukwu56985) {
        super(nameChukwu56985, ageChukwu56985, weightChukwu56985, featherColorChukwu56985);
        this.speciesChukwu56985 = speciesChukwu56985;
    }

    public Pigeon(int ageChukwu56985, String featherColorChukwu56985, String speciesChukwu56985) {
        super(ageChukwu56985, featherColorChukwu56985);
        this.speciesChukwu56985 = speciesChukwu56985;
    }
    @Override
    public void sleepChukwu56985() {
        System.out.println("Zzz");
    }

    @Override
    public void moveChukwu56985(Animal nameChukwu56985) {
        System.out.println(nameChukwu56985 + " fly");
    }

    @Override
    public void getvoice() {
        System.out.println("Bird is making sound");
    }

    @Override
    public void eat(String foodnameChukwu56985) {
        System.out.println("Bird is eating "+ foodnameChukwu56985);

    }

    @Override
    public void peck() {
        System.out.println("The bird is pecking worms");
    }

    public String getSpeciesChukwu56985() {
        return speciesChukwu56985;
    }

    public void setSpeciesChukwu56985(String speciesChukwu56985) {
        this.speciesChukwu56985 = speciesChukwu56985;
    }

    @Override
    public String toString() {
        return "Pigeon";
    }
}
