package ConstructorConcept;

public class FinalVarValue_CantBeChange_InsideConstructor {
	final int rollNo;

	FinalVarValue_CantBeChange_InsideConstructor(int rollNo) {
        this.rollNo = rollNo;  // Allowed (first and only assignment)
    }

    void change() {
        // rollNo = 20; ❌ Compile-time error
    }
}
