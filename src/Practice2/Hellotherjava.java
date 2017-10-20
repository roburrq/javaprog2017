package ee.itcollege.ics0004.practice2;

import Practice2.TextIO;

class HelloThere {
    public  static void main(String[] args) {
        System.out.print("Insert a name: ");

        String name = TextIO.getlnString();

        System.out.println("The users name seems to be " + name);
    }
}