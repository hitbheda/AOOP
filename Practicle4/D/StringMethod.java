import java.util.Scanner;
class Methods{
    // Globle variable
    public String str;
    // Using CharAT
    void useCharAt(Scanner Obj){
        System.out.print("Enter a string: ");
        this.str = Obj.nextLine();
        System.out.print("Enter an index: ");
        int index = Obj.nextInt();
        char ch = this.str.charAt(index);
        System.out.println("The character at index " + index + " is " + ch);
        System.out.print("\n");
    }// Using Contains 
    void useContains(Scanner Obj){
        System.out.print("Enter another string: ");
        String str2 = Obj.next();
        
        boolean contains = this.str.contains(str2);
        if (contains){
        System.out.println(this.str + " contains " + str2);
        }else{
        System.out.println(this.str + " does not contain " + str2);
        }
        System.out.print("\n");
    }// Using Format
    void useFormat(Scanner Obj){
        System.out.print("Enter a floating point number: ");
        double num = Obj.nextDouble();
        String formatted = String.format("%.2f", num);
        System.out.println("The number formatted to 2 decimal places is " + formatted);
        System.out.print("\n");
    }// Using Lenght
    void useLength(Scanner Obj){
         int len = this.str.length();
        System.out.println("The length of " + this.str + " is " + len);
        System.out.print("\n");
    }// Using Split
    void useSplit(Scanner Obj){
        System.out.print("Enter a sentence: ");
        Obj.nextLine();
        String sentence = Obj.nextLine();
        String[] words = sentence.split(" ");
        System.out.println("The words in the sentence are:");
        for (String word : words){
        System.out.println(word);
        }
    }
}
public class StringMethod{
    public static void main(String[] args){
        Scanner Obj = new Scanner(System.in);
        Methods Obj1 = new Methods();
        // charAt
        Obj1.useCharAt(Obj);
        // contains()
        Obj1.useContains(Obj);
        // length()
       Obj1.useLength(Obj);
        // format()
        Obj1.useFormat(Obj);
        // split()
       Obj1.useSplit(Obj);
    }
}
