package repl;

public class Repl_182_MethodsWithString5_CleanString {
    public static void main(String[] args) {

//
//        This method gets two strings (text and badWord)  and returns a string.
//
//        basicly what it dose is take out all the occurrences of badWord in text.
//
//        for example:
//
//        clean ("one two three","two")
//        returns "one three"
//
//        clean ("foo bar","foo")
//        returns "bar"
//
//        clean ("he said bla bla bla","bla")
//        returns "he said "
//
//        hint:
//
//        https://docs.oracle.com/javase/7/docs/api/java/lang/String.html#replace(char,%20char)

    }
        public static String clean (String text ,String badWord) {

        return text.replace(badWord,"");
        }
    }
