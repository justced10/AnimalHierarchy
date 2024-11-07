public class Mammal extends Animal {

    // Constructor that sets species to "Mammal"

    public Mammal() {

        this.species = "Mammal";

    }



    // Overridden makeSound() method

    @Override

    public void makeSound() {

        System.out.println("Some mammal sound");

    }

}