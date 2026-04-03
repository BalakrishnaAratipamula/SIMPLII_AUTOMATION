package Singleton_Class;

public class MainFormsOfInitialization_EarlyInitialization {
	// instance created at loading time
    private static final MainFormsOfInitialization_EarlyInitialization instance = new MainFormsOfInitialization_EarlyInitialization();

    private MainFormsOfInitialization_EarlyInitialization() {}  // private constructor

    public static MainFormsOfInitialization_EarlyInitialization getInstance() {
        return instance;
    }
}
