package ConstructorConcept;

/*/Ex1
public class FinalVarValue_CantBeChange_InsideConstructor {
	final int rollNo;

	FinalVarValue_CantBeChange_InsideConstructor(int rollNo) {
        this.rollNo = rollNo;  // Allowed (first and only assignment)
    }

    void change() {
        // rollNo = 20; ❌ Compile-time error
    }
} //*/

//Ex2
class Employee2 {
    final int id;

    Employee2(int id) {
        this.id = id; // Assigning final variable in constructor
    }

    Employee2() {
        id = 101;
//      id = 102; // Compile-time Error
    }
    
    void display() {
        System.out.println(id);
    }
}
