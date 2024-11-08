// Before overriding, the getName() method for both Animal and Bird returned the name without the mighty.
// After overriding, the Bird class now adds "The Mighty" in addition to the name, but the Animal class still doesn't.
// So, methods can be overridden in subclasses to change what they do.
// Tests 1-3 work because a Bird is an Animal, so it can be assigned to an Animal reference (and both animal to animal and bird to bird also work).
// Test 4 does not work because not all Animals are Birds, so this produced an error.
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