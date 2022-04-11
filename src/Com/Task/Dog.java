package Com.Task;

public class Dog extends Mammal{
    private  String breedChukwu56985;
    Dog(){
        super();
        breedChukwu56985 ="NN";
    }

    public Dog(String nameChukwu56985, int ageChukwu56985, int weightChukwu56985, String rzadChukwu56985,String breedChukwu56985) {
        super(nameChukwu56985,ageChukwu56985,weightChukwu56985,rzadChukwu56985);
        this.breedChukwu56985 = breedChukwu56985;
    }

    public Dog(String breedChukwu56985,String rzadChukwu56985,int ageChukwu56985 ) {
        super(ageChukwu56985,rzadChukwu56985);
        this.breedChukwu56985 = breedChukwu56985;
    }
    public void aport ( ) {
        System.out.println("Dog is retrieving. ") ;
    }

    @Override
    public void drinkMilk() {
        System.out.println("The dog is drinking milk");
    }

    @Override
    public void getvoice() {
        System.out.println("The dog is barking");

    }

    @Override
    public void eat(String foodnameChukwu56985) {
        System.out.println("The dog is eating "+ foodnameChukwu56985);
    }

    public String getBreedChukwu56985() {
        return breedChukwu56985;
    }

    public void setBreedChukwu56985(String breedChukwu56985) {
        this.breedChukwu56985 = breedChukwu56985;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breedChukwu56985='" + breedChukwu56985 + '\'' +
                '}';
    }
}
