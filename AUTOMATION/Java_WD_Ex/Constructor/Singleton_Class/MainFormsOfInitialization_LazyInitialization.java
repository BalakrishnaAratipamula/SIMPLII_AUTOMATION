package Singleton_Class;

public class MainFormsOfInitialization_LazyInitialization {
	private static MainFormsOfInitialization_LazyInitialization instance;

    private MainFormsOfInitialization_LazyInitialization() {}

    public static synchronized MainFormsOfInitialization_LazyInitialization getInstance() {
        if (instance == null) {
            instance = new MainFormsOfInitialization_LazyInitialization();
        }
        return instance;
    }
}
