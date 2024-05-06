import java.io.File;
import java.io.IOException;

class CreateFile{
    public static void main(String[] args) {
        File Obj = new File("Hello.txt");
        try{
            Boolean result;
            result = Obj.createNewFile();
            if(result){
                System.out.println("File Is Succefully Created "+Obj.getCanonicalPath());
            }else{
                System.out.println("FIle Exists "+Obj.getCanonicalPath());
            }
        } catch (IOException e) {
            System.out.println("Error while execution: " + e);
        }
    }
}
