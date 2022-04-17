package Com.Task;

public class Mammal extends Animal{
    private String orderChukwu56985;
    public Mammal(){
        super();
        orderChukwu56985 = "NN";
    }
    public Mammal(String nameChukwu56985, int ageChukwu56985, int weightChukwu56985,String orderChukwu56985){
        super(nameChukwu56985,ageChukwu56985,weightChukwu56985);
        this.orderChukwu56985 =orderChukwu56985;
    }
    public Mammal(int ageChukwu56985,String orderChukwu56985){
        super(ageChukwu56985);
        this.orderChukwu56985 =orderChukwu56985;
    }
    public void drinkMilk(){
        System.out.println("siup siup");
    }

    @Override
    public void eat(String foodnameChukwu56985) {
        System.out.println("mammal is eating "+ foodnameChukwu56985);

    }

    @Override
    public void getvoice() {
        System.out.println("mammal is making sound");

    }
    public String getOrderChukwu56985(){
        return orderChukwu56985;
    }

    public void setOrderChukwu56985(String orderChukwu56985) {
        this.orderChukwu56985 = orderChukwu56985;
    }

    @Override
    public String toString() {
        return "Mammal";
    }
}
