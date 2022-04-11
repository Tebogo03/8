package Com.Task;

public class BlowFish extends Fish{
    private  String diameterChukwu56985;
    BlowFish(){
        super();
        diameterChukwu56985 ="NN";
    }
    public BlowFish(String nameChukwu56985, int ageChukwu56985, int weightChukwu56985, String scaleColourChukwu56985,String diameterChukwu56985) {
        super(nameChukwu56985,ageChukwu56985,weightChukwu56985,scaleColourChukwu56985);
        this.diameterChukwu56985 = diameterChukwu56985;
    }

    public BlowFish(int ageChukwu56985, String scaleColourChukwu56985, String diameterChukwu56985) {
        super(ageChukwu56985, scaleColourChukwu56985);
        this.diameterChukwu56985 = diameterChukwu56985;
    }
    public void aport ( ) {
        System.out.println("Fish is Swimming. ") ;
    }

    @Override
    public void move() {
        System.out.println("Fish is moving. ");
    }

    @Override
    public void eat(String foodnameChukwu56985) {
        System.out.println("The fish is eating "+ foodnameChukwu56985);
    }

    @Override
    public void getvoice() {
        System.out.println(" The fish ");
    }

    public String getDiameterChukwu56985() {
        return diameterChukwu56985;
    }

    public void setDiameterChukwu56985(String diameterChukwu56985) {
        this.diameterChukwu56985 = diameterChukwu56985;
    }

    @Override
    public String toString() {
        return "BlowFish{" +
                "diameterChukwu56985='" + diameterChukwu56985 + '\'' +
                '}';
    }
}
