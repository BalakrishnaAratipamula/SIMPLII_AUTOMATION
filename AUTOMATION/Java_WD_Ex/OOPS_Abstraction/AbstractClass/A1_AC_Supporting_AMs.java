package AbstractClass;

abstract class A1_AC_Supporting_AMs {
	public abstract void method1();     // OK
    protected abstract void method2();  // OK
    abstract void method3();            // default/package-private, OK
    // private abstract void method4(); // ❌ compilation error
    // static abstract void method5();  // ❌ compilation error
    // final abstract void method6();   // ❌ compilation error
}
