package dzio;

public class Prepod {
    private String nameOfPrepod;

    public Prepod(String nameOfPrepod){
        this.nameOfPrepod = nameOfPrepod;
    }

    public String getNameOfPrepod() {
        return nameOfPrepod;
    }

    @Override
    public String toString() {
        return "Prepod{" +
                "nameOfPrepod='" + nameOfPrepod + '\'' +
                '}';
    }




}
