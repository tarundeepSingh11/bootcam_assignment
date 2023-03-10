package question10;

public class question10 {
    public static void main(String[] args) {


        String str = "Tarundeep Singh \n";
        System.out.println(str.repeat(2));

        //STRIP
        String stripp = "\n \t he is a boy";
        System.out.println(stripp.strip());

        //isBlank
        String bl = " \t ";
        System.out.println(bl.isBlank());

        //INDENT
        String ind = "ok tested mic is working and performing";
        System.out.println(ind.indent(5));

        //TRANSFORM
        String txt = " Abstraction";
        String return_txt = txt.transform(abc -> new StringBuilder(abc)
                .reverse().toString());
        System.out.println(return_txt);

        //STRIPINDENT
        String si = "Good Morning Bella" + "\n\tlet's count " + "\n    Java 1 \n" + " Java 2 " + "bla..bla\n" + "\tJava 18";
        System.out.println(si.stripIndent());

        //TRANSLATE ESCAPES
        String te = "\"Am soo \\nBored\\";
        System.out.println(te);

        //FORMATTED STRING METHODS
        System.out.println(String.format("Java %s", "12"));
        String fsm = """
                This is line no. %s
                This is line no. %s
                """;
        System.out.println(fsm.formatted(3, 4));
    }
}
