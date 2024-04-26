package dzio;

import dzio.Dserializ;

import java.rmi.ServerError;

public class Main {
    public static void main(String[] args) {
        Dserializ ds = new Dserializ("D:\\bulat\\Documents\\Hash\\src\\main\\java\\dzio\\start2.csv");
        for (Std s : ds.students()) {
            System.out.println(s);
        }
        Serializ s = new Serializ(ds.students());
        s.convertToJson();
    }
}