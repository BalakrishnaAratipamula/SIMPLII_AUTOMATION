package Java_Examples;

class Bird {
    void fly() {
        System.out.println("Bird can fly");
    }
}

class Sparrow extends Bird {
    @Override
    void fly() {
        System.out.println("Sparrow is flying");
    }
}

class LiskovSubstitutionPrinciple {
    static void makeItFly(Bird b) {
        b.fly();  // Works for any Bird subclass
    }

    public static void main(String[] args) {
        Bird bird = new Bird();
        Sparrow sparrow = new Sparrow();
        
        makeItFly(bird);      // Bird can fly
        makeItFly(sparrow);   // Sparrow is flying
    }
}

