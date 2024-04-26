package dzio;

import java.io.Serializable;

public class Std implements Serializable {


    private String nameOfStudent;
    public String getNameOfStudent() {
        return nameOfStudent;
    }

    public void setNameOfStudent(String nameOfStudent) {
        this.nameOfStudent = nameOfStudent;
    }
    private Prepod prepod;

    public Prepod getPrepod() {
        return prepod;
    }

    public void setPrepod(Prepod prepod) {
        this.prepod = prepod;
    }

    private Pari pari;

    public Pari getLesson() {
        return pari;
    }

    public void setPari(Pari pari) {
        this.pari = pari;
    }

    private Pari pari2;

    public Pari getPari2() {
        return pari2;
    }

    public void setPari2(Pari pari2) {
        this.pari2 = pari2;
    }

    public Std(String nameOfStudent, Prepod teacher, Pari lesson, Pari lesson2) {
        this.nameOfStudent = nameOfStudent;
        this.pari = pari;
        this.pari2 = pari2;
        this.prepod = prepod;
    }
    @Override
    public String toString() {
        return "Student{" +
                "nameOfStudent='" + nameOfStudent + '\'' +
                ", teacher=" + prepod +
                ", subject1=" + pari + ", subject2=" + pari2 +
                '}';
    }




}
