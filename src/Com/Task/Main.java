package Com.Task;

public class Main {
    public static void main(String[] args) {
        Animal animal[] = new Animal[6];
        animal[0]= new Mammal("little bug",2,3, "Bat");
        animal[1]= new Dog("CHOPi",3,20,"carnivora","massdifi");
        animal[2]= new Fish("Calvin",8,30, "Blue");
        animal[3]= new BlowFish("Drake",2,5,"grey","10");
        animal[4]= new Bird("Spark",6,10, "Brown");
        animal[5]= new Pigeon("David",4,15,"grey","spain");
        animal[2].getvoice();
        animal[5].getvoice();

        AnimalBehaviour animalBehaviour[] = new AnimalBehaviour[3];
        animalBehaviour[0] = new Dog("CHOPi",3,20,"carnivora","massdifi");
        animalBehaviour[1] = new BlowFish("Drake",2,5,"grey","10");
        animalBehaviour[2]= new Pigeon("David",4,15,"grey","spain");
        animalBehaviour[1].sleepChukwu56985();
        animalBehaviour[0].sleepChukwu56985();
        animalBehaviour[2].sleepChukwu56985();

        for (Animal a:animal
             ) {a.moveChukwu56985(a);

        }

        for (Animal a:animal
             ) {
            AnimalName.nameChukwu56985(a.getNameChukwu56985());

        }


    }

}
