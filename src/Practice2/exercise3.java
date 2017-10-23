package Practice2;

public class exercise3 {
    public static void main (String [] args){

        System.out.println ("Number of persons: ");

        Integer NumP = TextIO.getlnInt();


        System.out.println ("Insert amount allowed to a Group : ");

        Integer NumG =TextIO.getlnInt();

        Integer Groups = NumP/NumG;
        Integer remainder = NumP % NumG;

        System.out.format ("Groups:  %d, and  Remainder %d" , Groups,  remainder);
    }

}
