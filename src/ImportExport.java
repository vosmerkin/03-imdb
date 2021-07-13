import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ImportExport {

    public List<User> importFromFile(String filename)  {
        List<User> list = new ArrayList<>();

        try (BufferedReader in = new BufferedReader(new FileReader(new File(filename).getAbsoluteFile()))) {
            String s;
            String s1[];
            while ((s = in.readLine()) != null) {
                s1= s.split(":");
                list.add((new User (s1[0],s1[1],s1[2], new Address(s1[3],s1[4],s1[5]) ));
            }
        } catch (IOException e) {
            System.out.println("File not found");
            System.out.println(e.getMessage());
        }
        return list;
    }
}
