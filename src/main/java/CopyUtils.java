import java.io.*;

public class CopyUtils {

    /**
     * Returns a deep copy of the object.
     */
    public static <T> T deepCopy(T original) {
        T obj = null;
        try {
            ByteArrayOutputStream bOut = new ByteArrayOutputStream();
            ObjectOutputStream out = new ObjectOutputStream(bOut);
            out.writeObject(original);
            out.flush();
            out.close();

            ObjectInputStream in = new ObjectInputStream(
                    new ByteArrayInputStream(bOut.toByteArray()));
            obj = (T) in.readObject();
        }
        catch(IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return obj;
    }

}

