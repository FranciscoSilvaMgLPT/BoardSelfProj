package Game;
public abstract class TextEditor {



    public static void diceMagicText(){
        System.out.println("\n" +
                "                                 ██████╗░██╗░█████╗░███████╗  ███╗░░░███╗░█████╗░░██████╗░██╗░█████╗░  ░██████╗░░█████╗░███╗░░░███╗███████╗\n" +
                "                                 ██╔══██╗██║██╔══██╗██╔════╝  ████╗░████║██╔══██╗██╔════╝░██║██╔══██╗  ██╔════╝░██╔══██╗████╗░████║██╔════╝\n" +
                "                                 ██║░░██║██║██║░░╚═╝█████╗░░  ██╔████╔██║███████║██║░░██╗░██║██║░░╚═╝  ██║░░██╗░███████║██╔████╔██║█████╗░░\n" +
                "                                 ██║░░██║██║██║░░██╗██╔══╝░░  ██║╚██╔╝██║██╔══██║██║░░╚██╗██║██║░░██╗  ██║░░╚██╗██╔══██║██║╚██╔╝██║██╔══╝░░\n" +
                "                                 ██████╔╝██║╚█████╔╝███████╗  ██║░╚═╝░██║██║░░██║╚██████╔╝██║╚█████╔╝  ╚██████╔╝██║░░██║██║░╚═╝░██║███████╗\n" +
                "                                 ╚═════╝░╚═╝░╚════╝░╚══════╝  ╚═╝░░░░░╚═╝╚═╝░░╚═╝░╚═════╝░╚═╝░╚════╝░  ░╚═════╝░╚═╝░░╚═╝╚═╝░░░░░╚═╝╚══════╝");
    }


    public static void separatorText(){
        System.out.println(
                "╭━━┳━━┳━━┳━━┳━━┳━━┳━━┳━━┳━━┳━━┳━━┳━━┳━━┳━━┳━━┳━━┳━━┳━━┳━━┳━━┳━━┳━━┳━━┳━━┳━━┳━━┳━━┳━━┳━━┳━━┳━━┳━━┳━━┳━━┳━━┳━━┳━━┳━━┳━━┳━━┳━━┳━━┳━━┳━━┳━━┳━━┳━━┳━━┳━━┳━━┳━━┳━━┳━━┳━━┳━━┳━━┳━━┳━━┳━━┳━━┳━━┳━━┳━━╮\n" +
                "╰━━┻━━┻━━┻━━┻━━┻━━┻━━┻━━┻━━┻━━┻━━┻━━┻━━┻━━┻━━┻━━┻━━┻━━┻━━┻━━┻━━┻━━┻━━┻━━┻━━┻━━┻━━┻━━┻━━┻━━┻━━┻━━┻━━┻━━┻━━┻━━┻━━┻━━┻━━┻━━┻━━┻━━┻━━┻━━┻━━┻━━┻━━┻━━┻━━┻━━┻━━┻━━┻━━┻━━┻━━┻━━┻━━┻━━┻━━┻━━┻━━┻━━┻━━╯");

    }

    public static void numberOfPlayersText(){
        System.out.println("\uD83C\uDD3D\uD83C\uDD44\uD83C\uDD3C\uD83C\uDD31\uD83C\uDD34\uD83C\uDD41 \uD83C\uDD3E\uD83C\uDD35 \uD83C\uDD3F\uD83C\uDD3B\uD83C\uDD30\uD83C\uDD48\uD83C\uDD34\uD83C\uDD41\uD83C\uDD42❔    (\uD83C\uDD35\uD83C\uDD41\uD83C\uDD3E\uD83C\uDD3C 1-10)");
    }

    public static void playerText(){
        System.out.print("\uD83C\uDD7F\uD83C\uDD7B\uD83C\uDD70\uD83C\uDD88\uD83C\uDD74\uD83C\uDD81");
    }

    public static void iconNumberText(){
        System.out.println("\uD83C\uDD32\uD83C\uDD37\uD83C\uDD3E\uD83C\uDD3E\uD83C\uDD42\uD83C\uDD34 \uD83C\uDD48\uD83C\uDD3E\uD83C\uDD44\uD83C\uDD41 \uD83C\uDD32\uD83C\uDD37\uD83C\uDD30\uD83C\uDD41\uD83C\uDD30\uD83C\uDD32\uD83C\uDD43\uD83C\uDD34\uD83C\uDD41");
    }

    public static void MonstersIntroText(){
        System.out.println(Collors.redCollor+"\n" +
                "                   ☠            ███╗░░░███╗░█████╗░███╗░░██╗░██████╗████████╗███████╗██████╗░░██████╗      ░██████╗░░█████╗░███╗░░░███╗███████╗            ☠\n" +
                "                   ☠            ████╗░████║██╔══██╗████╗░██║██╔════╝╚══██╔══╝██╔════╝██╔══██╗██╔════╝      ██╔════╝░██╔══██╗████╗░████║██╔════╝            ☠\n" +
                "                   ☠            ██╔████╔██║██║░░██║██╔██╗██║╚█████╗░░░░██║░░░█████╗░░██████╔╝╚█████╗░      ██║░░██╗░███████║██╔████╔██║█████╗░░            ☠\n" +
                "                   ☠            ██║╚██╔╝██║██║░░██║██║╚████║░╚═══██╗░░░██║░░░██╔══╝░░██╔══██╗░╚═══██╗      ██║░░╚██╗██╔══██║██║╚██╔╝██║██╔══╝░░            ☠\n" +
                "                   ☠            ██║░╚═╝░██║╚█████╔╝██║░╚███║██████╔╝░░░██║░░░███████╗██║░░██║██████╔╝      ╚██████╔╝██║░░██║██║░╚═╝░██║███████╗            ☠\n" +
                "                   ☠            ╚═╝░░░░░╚═╝░╚════╝░╚═╝░░╚══╝╚═════╝░░░░╚═╝░░░╚══════╝╚═╝░░╚═╝╚═════╝░      ░╚═════╝░╚═╝░░╚═╝╚═╝░░░░░╚═╝╚══════╝            ☠"+Collors.resetCollor);
        System.out.println();
        System.out.println();

    }


}