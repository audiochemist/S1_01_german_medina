package N2Ex1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serializer {


    public static void serializeObject() {
        Employee newUser1 = new Employee("Ricardo", "Smith", 4);

        if (newUser1.getClass().isAnnotationPresent(JSONSerializer.class)) {
            JSONSerializer annotation = newUser1.getClass().getAnnotation(JSONSerializer.class);
            String directory = annotation.directory();
            File serializedEmployeeFile = new File(directory, newUser1.getClass().getSimpleName() + ".json");

            try (FileOutputStream fos = new FileOutputStream(serializedEmployeeFile);
                 ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                    oos.writeObject(newUser1);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }

}
