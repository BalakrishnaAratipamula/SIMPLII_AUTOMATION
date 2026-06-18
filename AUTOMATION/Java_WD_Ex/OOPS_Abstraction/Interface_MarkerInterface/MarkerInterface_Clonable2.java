package Interface_MarkerInterface;

public class MarkerInterface_Clonable2 implements Cloneable {
    int id;

    MarkerInterface_Clonable2(int id) {
        this.id = id;
    }

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
