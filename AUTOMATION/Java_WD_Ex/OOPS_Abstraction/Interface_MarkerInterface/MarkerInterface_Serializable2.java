package Interface_MarkerInterface;

import java.io.Serializable;

public class MarkerInterface_Serializable2 implements Serializable {
    int id;
    String name;

    MarkerInterface_Serializable2(int id, String name) {
        this.id = id;
        this.name = name;
    }
}