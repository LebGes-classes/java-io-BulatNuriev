package dzio;

import java.io.*;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Dserializ {
    private String filepath;
    ArrayList<String> inputData = new ArrayList<>();
    String line;

    private final String delimiter = ",";
    ArrayList<Std> students = new ArrayList<>();



    public Dserializ(String filepath) {
        this.filepath = filepath;
    }

    private ArrayList<String> readFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader(
                filepath))) {

            reader.lines()
                    .skip(1)
                    .forEach(line -> inputData.add(line));

        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return inputData;
    }

    public ArrayList<Std> students(){
        readFile().stream()
                .map(line -> line.split(delimiter))
                .map(parts -> new Std(parts[0], new Prepod(parts[1]), new Pari(parts[2]), new Pari(parts[3])))
                .forEach(students::add);
        return students;
    }





}