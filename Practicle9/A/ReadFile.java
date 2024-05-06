import java.io.FileInputStream;

class ReadFile{
    public static void main(String[] args) {
        
        try(FileInputStream Obj = new FileInputStream("Hello.txt")){
            int i;
            while ((i = Obj.read()) != -1) {
                System.out.print((char) i);
            }Obj.close();
        } catch (Exception e){
            System.out.println("Error While Execution "+e);
        }
    }
}