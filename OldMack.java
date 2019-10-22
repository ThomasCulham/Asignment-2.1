import java.util.Scanner;
public class OldMack{
    public static void main (String[]args){
       singOldMacdonald();
    }

    public static void verse(String animal, String sound) {
        System.out.println("Old MacDonald had a farm, EE-I-EE-I-O,");
        System.out.println("And on that farm he had a " + animal + ", EE-I-EE-I-O,");
        System.out.println("With a " + sound + " " +sound + " here and a " + sound + " " + sound + " there");
        System.out.println("Here a " + sound + ", there a " + sound + ", everywhere a " + sound + " " +sound);
        System.out.println("Old MacDonald had a farm, EE-I-EE-I-O.");
    }

    public static void singOldMacdonald() {
        verse("cow", "moo");
        System.out.println("");
        verse("dog", "woof");
        System.out.println("");
        verse("duck", "quack");
    }
}

/*
 1) the output is:
 
 Old MacDonald had a farm, EE-I-EE-I-O,
 And on that farm he had a cow, EE-I-EE-I-O,
 With a moo moo here and a moo moo there
 Here a moo, there a moo, everywhere a moo moo
 Old MacDonald had a farm, EE-I-EE-I-O.

 Old MacDonald had a farm, EE-I-EE-I-O,
 And on that farm he had a dog, EE-I-EE-I-O,
 With a woof woof here and a woof woof there
 Here a woof, there a woof, everywhere a woof woof
 Old MacDonald had a farm, EE-I-EE-I-O.
 
 2) add   verse("duck", "quack");   inside public static void singOldMacdonald() {}
*/

