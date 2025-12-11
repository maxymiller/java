package maxymiller.code;


public class HtmlCode {
    private static int line = 0;


    public static String tabla(boolean in){
        if (in == true) {
            line++;
            return tab(1) + "<table>";
        }else {
            line--;
            return tab(0) + "</table>";
        }
    }
    public static String tr(boolean in){
        if (in == true) {
            line++;
            return tab(1) + "<tr>";
        }else  {
            line--;
            return tab(0) + "</tr>";
        }
    }

    public static String section(boolean in){
        if (in == true) {
            line++;
            return tab(1) + "<section>";
        } else {
            line--;
            return tab(0) + "</section>";
        }
    }

    public static String aside(boolean in){
        if (in == true) {
            line++;
            return tab(1) + "<aside>";
        } else  {
            line--;
            return tab(0) + "</aside>";
        }
    }

    public static String footer(boolean in){
        if (in == true) {
            line++;
            return tab(1) + "<footer>";
        } else {
            line--;
            return tab(0) + "</footer>";
        }
    }

    public static String caption(String text){
        return tab(0) + "<caption>" + text + "</caption>";
    }

    private static String tdmode(String text, String class_html, int x, int y){
        String code = "";
        if (x >= 2){
            code = " colspan='" + x + "'";
        }
        if (y >= 2){
            code = code + " rowspan='" + y + "'";
        }
        if (!(class_html == null)) {
            code = code + " class='" + class_html + "'";
        }

        return tab(0) + "<td" + code + ">" + text + "</td>";
    }

    public static String td(String text){
        return tdmode(text, null, 1, 1);
    }
    public static String td(String text, int x){
        return tdmode(text, null, x, 1);
    }
    public static String td(String text, int x, int y){
        return tdmode(text, null, x, y);
    }
    public static String td(String text, String class_html){
        return tdmode(text, class_html, 1, 1);
    }
    public static String td(String text, String class_html, int x){
        return tdmode(text, class_html, x, 1);
    }
    public static String td(String text, String class_html, int x, int y){
        return tdmode(text, class_html, x, y);
    }

    private static String thmode(String text, String class_html, int x, int y){
        String code = "";
        if (x >= 2){
            code = " colspan='" + x + "'";
        }
        if (y >= 2){
            code = code + " rowspan='" + y + "'";
        }
        if (!(class_html == null)) {
            code = code + " class='" + class_html + "'";
        }

        return tab(0) + "<th" + code + ">" + text + "</th>";
    }

    public static String meta(){
        return tab(0) + "<meta charset=\"UTF-8\">" + "\n" +
                tab(0) + "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">";
    }

    public static String head(boolean in){
        if (in == true) {
            line++;
            return tab(1) + "<head>";
        } else {
            line--;
            return tab(0) + "</head>";
        }
    }

    public static String title(String title){
        return tab(0) + "<title>" + title + "</title>";
    }

    public static String html(String lang){
        return tab(0) + "<!DOCTYPE html>" + "\n" +
                tab(0) + "<html lang=\"" + lang + "\">";
    }
    public static String htmlEnd(){
        return tab(0) + "</html>";
    }

    public static String linkStyle(String style){
        return tab(0) + "<link rel=\"stylesheet\" href=\"" + style + "\">";
    }

    public static String body(boolean in){
        if (in == true) {
            line++;
            return tab(1) + "<body>";
        } else  {
            line--;
            return tab(0) + "</body>";
        }
    }

    public static String th(String text){
        return thmode(text, null, 1, 1);
    }
    public static String th(String text, int x){
        return thmode(text, null, x, 1);
    }
    public static String th(String text, int x, int y){
        return thmode(text, null, x, y);
    }
    public static String th(String text, String class_html){
        return  thmode(text, class_html, 1, 1);
    }
    public static String th(String text, String class_html, int x){
        return thmode(text, class_html, x, 1);
    }
    public static String th(String text, String class_html, int x, int y){
        return thmode(text, class_html, x, y);
    }

    private static String tab(int meno){
        String tab = "";
        for (int i = 0; i < line - meno; i++){
            tab = tab + "   ";
        }
        return tab;
    }

    public static int getLine(){return line;}
    public static void setLine(int Line){line = Line;}
}
