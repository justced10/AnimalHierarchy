public class Zoo {

    public static void main(String[] args) {

        // Creating an array of Animal objects

        Animal[] animals = new Animal[3];



        // Adding instances of Bird, Mammal, and Dog

        animals[0] = new Bird();

        animals[1] = new Mammal();

        animals[2] = new Dog();



        // Looping through each Animal object and calling makeSound()

        for (Animal animal : animals) {

            animal.makeSound();

        }

    }

}