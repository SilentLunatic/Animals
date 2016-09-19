package animals;

public class Animals {

    public static void main(String[] args) {
        
        Dog myDog = new Dog();
        myDog.fetch();
        myDog.bite();
        myDog.noise();
        myDog.follow();
        System.out.println("");
        
        Cat myCat = new Cat();
        myCat.scratch();
        myCat.run();
        myCat.noise();
        myCat.follow();
        System.out.println("");
        
        Snake mySnake = new Snake();
        mySnake.eat();
        mySnake.slither();
        mySnake.noise();
        mySnake.follow();
        System.out.println("");
    } 
}