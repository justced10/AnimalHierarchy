public class Bird extends Animal {

    // Constructor that sets species to "Bird"

    public Bird() {

        this.species = "Bird";

    }



    // Overridden makeSound() method

    @Override

    public void makeSound() {

        System.out.println("Chirp chirp");

    }

}