package Com.Task;

public abstract class Animal {
    private String nameChukwu56985;
    private int ageChukwu56985;
    private int weightChukwu56985;
    public Animal(){
        ageChukwu56985=weightChukwu56985= 0;
        nameChukwu56985 = "NN";
    }

    public Animal(String nameChukwu56985, int ageChukwu56985, int weightChukwu56985) {
        this.nameChukwu56985 = nameChukwu56985;
        this.ageChukwu56985=ageChukwu56985;
        this.weightChukwu56985 = weightChukwu56985;
    }
    public Animal(int ageChukwu56985) {
        this.ageChukwu56985=ageChukwu56985;
    }

    public int getAgeChukwu56985() {
        return ageChukwu56985;
    }

    public void setAgeChukwu56985(int ageChukwu56985) {
        this.ageChukwu56985 = ageChukwu56985;
    }

    public String getNameChukwu56985() {
        return nameChukwu56985;
    }

    public int getWeightChukwu56985() {
        return weightChukwu56985;
    }

    public void setWeightChukwu56985(int weightChukwu56985) {
        this.weightChukwu56985 = weightChukwu56985;
    }

    public void setNameChukwu56985(String nameChukwu56985) {
        this.nameChukwu56985 = nameChukwu56985;
    }
    public abstract void eat(String foodnameChukwu56985);
    public abstract void getvoice();
}
