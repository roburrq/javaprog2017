package Practice2;

public class exercise6 {
    public static void main (String [] args){

        System.out.println("Watch this trick. Enter a word with alot of 'a' and see what happens");
        String favFood = TextIO.getlnString();
        System.out.println(favFood.replace('a', '_'));

    }
}
