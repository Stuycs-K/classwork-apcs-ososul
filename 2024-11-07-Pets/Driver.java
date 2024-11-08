// Before overriding, the getName() method for both Animal and Bird returned the name without the mighty.
// After overriding, the Bird class now adds "The Mighty" in addition to the name, but the Animal class still doesn't.
// So, methods can be overridden in subclasses to change what they do.

public class Driver {

    public static void main (String[] args){
      Animal a = new Animal("Hello", 78, "jeremy");
      a.speak();
      Bird b = new Bird("chirp", 10, "bob", 30.5, "blue");
      b.speak();

      Animal a2 = new Bird("wow", 4, "Crow", 12.3, "Black");
      a2.speak();

    //   Bird b2 = new Animal("Roar", 7, "Lion");
    //   b2.speak();
  
    }
  
  
  }