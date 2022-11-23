package Day1;

public class EscapeSequence {
    public static void main(String[] args) {
        //A character with a backslash (\) just before it is an escape sequence or escape character.

        /*
        Comment : //
        Block Comment :
                        /*  Text line1
                            Text line2
                            Text line3
                         */

        //todo special types of comments that are highlighted in the editor, single line
        //fixme Multiple line TODO comments
        // Continue
        // continue
        // continue



        /*Single quote : '\''
        Double quote : '\"'
        Backslash : '\\'
        Newline : '\n'
        Carriage return : '\r'
        Backspace : '\b'
        Form feed : '\f'
        Tab : '\t'

        */
        System.out.println("Welcome to \'CLARUSWAY SDET Course\'.");
        System.out.println("Welcome to \"CLARUSWAY SDET Course\".");

        System.out.println("This is for BACK SLASH \\ BUTTON");

        System.out.print("\nThis is starting in new line");

        System.out.println("This" + "\r is an implementation " + "of Carriage Return");

        System.out.println("This is for BACKSPACE \bBUTTON");
        System.out.println("This is for NO-BACKSPACE BUTTON");

        System.out.println("This" +  "\f is an" + " implementation of " + "formfeed");

        System.out.println("Escape Sequences :" + "\tThis is for TAB");

        System.out.print("Escape Sequences :" + "This is without TAB");

        //EscapeSequence more examples :
            System.out.println("\'escape sequence\'");
            System.out.println("\"escape sequence \"");
            System.out.println("\nescape sequence\n in java\\");
            System.out.println("\nescape sequence \r in java\\");
            System.out.println("\bescape sequence ");
            System.out.println("escape ");



    }
}
