package dzio;

import java.io.Serializable;
import java.util.Objects;

public class Pari implements Serializable {

    private String pariName;

    @Override
    public String toString() {
        return "Subject{" +
                "subjectName='" + pariName + '\'' +
                '}';
    }



    public Pari(String pariName) {
        this.pariName = pariName;
    }

    public String getPariName() {
        return pariName;
    }

}
