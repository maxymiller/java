public class asciiTableHexCodeMaxymiller {
    public asciiTableHexCodeMaxymiller(int Decimal) {
        list(Decimal);
    }

    listAsciiTableHexCodeMaxymiller out2 = null;
    private listAsciiTableHexCodeMaxymiller list(int list){
        if(list >= 0 && list <= 127) {
            int o = list;
            int m = 0;
            int out = 0;
            String h = null;
            for (int i = 0; i <= list; i++) {
                if(i > ((9*(m+1)) + (5*m) + (2*m))) {
                    int l = i - ((9*(m+1)) + (5*m) + (2*m));
                    if(l == 1) {
                        h = "A";
                    } else if (l == 2) {
                        h = "B";
                    } else if (l == 3) {
                        h = "C";
                    } else if (l == 4) {
                        h = "D";
                    } else if (l == 5) {
                        h = "E";
                    } else if (l == 6) {
                        h = "F";
                        m++;
                    }
                } else {
                    h = String.valueOf(i - (((9*m) + (5*m)) + (2*m)));

                }

                if(h != "F") {
                    out = m;
                } else {
                    out = m-1;
                }

                if(out <= 0) {
                    //System.out.println(i + ": " + h);
                    out2 = new listAsciiTableHexCodeMaxymiller(i, h, listChar(i));
                } else {
                    //System.out.println(i + ": " + out + h);
                    out2 = new listAsciiTableHexCodeMaxymiller(i, out + h,listChar(i));
                }
            }
            return out2;
        }
        return null;
    }

    private String listChar(int Decimal) {
        if (Decimal == 0) {
            return "[NULL]";

        } else if (Decimal == 1) {
            return "[START OF HEADING]";

        } else if (Decimal == 2) {
            return "[START OF TEXT]";

        } else if (Decimal == 3) {
            return "[END OF TEXT]";

        } else if (Decimal == 4) {
            return "[END OF TRANSMISSION]";
            
        } else if (Decimal == 5) {
            return "[ENQUIRY]";

        } else if (Decimal == 6) {
            return "[ACKNOWLEDGE]";

        } else if (Decimal == 7) {
            return "[BELL]";

        } else if (Decimal == 8) {
            return "[BACKSPACE]";

        } else if (Decimal == 9) {
            return "[HORIZONTAL TAB]";

        } else if (Decimal == 10) {
            return "[LINE FEED]";

        } else if (Decimal == 11) {
            return "[VERTICAL TAB]";

        } else if (Decimal == 12) {
            return "[FORM FEED]";

        } else if (Decimal == 13) {
            return "[CARRIAGE RETURN]";

        } else if (Decimal == 14) {
            return "[SHIFT OUT]";

        } else if (Decimal == 15) {
            return "[SHIFT IN]";

        } else if (Decimal == 16) {
            return "[DATA LINK ESCAPE]";

        } else if (Decimal == 17) {
            return "[DEVICE CONTROL 1]";

        } else if (Decimal == 18) {
            return "[DEVICE CONTROL 2]";

        } else if (Decimal == 19) {
            return "[DEVICE CONTROL 3]";

        } else if (Decimal == 20) {
            return "[DEVICE CONTROL 4]";

        } else if (Decimal == 21) {
            return "[NEGATIVE ACKNOWLEDGE]";

        } else if (Decimal == 22) {
            return "[SYNCHRONOUS IDLE]";

        } else if (Decimal == 23) {
            return "[ENG OF TRANS. BLOCK]";

        } else if (Decimal == 24) {
            return "[CANCEL]";

        } else if (Decimal == 25) {
            return "[END OF MEDIUM]";

        } else if (Decimal == 26) {
            return "[SUBSTITUTE]";

        } else if (Decimal == 27) {
            return "[ESCAPE]";

        } else if (Decimal == 28) {
            return "[FILE SEPARATOR]";

        } else if (Decimal == 29) {
            return "[GROUP SEPARATOR]";

        } else if (Decimal == 30) {
            return "[RECORD SEPARATOR]";

        } else if (Decimal == 31) {
            return "[UNIT SEPARATOR]";

        } else if (Decimal == 32) {
            return "[SPACE]";

        } else if (Decimal == 33) {
            return "!";

        } else if (Decimal == 34) {
            return "\"";

        } else if (Decimal == 35) {
            return "#";

        } else if (Decimal == 36) {
            return "$";

        } else if (Decimal == 37) {
            return "%";

        } else if (Decimal == 38) {
            return "&";

        } else if (Decimal == 39) {
            return "'";

        } else if (Decimal == 40) {
            return "(";

        } else if (Decimal == 41) {
            return ")";

        } else if (Decimal == 42) {
            return "*";

        } else if (Decimal == 43) {
            return "+";

        } else if (Decimal == 44) {
            return ",";

        } else if (Decimal == 45) {
            return "-";

        } else if (Decimal == 46) {
            return ".";

        } else if (Decimal == 47) {
            return "/";

        } else if (Decimal == 48) {
            return "0";

        } else if (Decimal == 49) {
            return "1";

        } else if (Decimal == 50) {
            return "2";

        } else if (Decimal == 51) {
            return "3";

        } else if (Decimal == 52) {
            return "4";

        } else if (Decimal == 53) {
            return "5";

        } else if (Decimal == 54) {
            return "6";

        } else if (Decimal == 55) {
            return "7";

        } else if (Decimal == 56) {
            return "8";

        } else if (Decimal == 57) {
            return "9";

        } else if (Decimal == 58) {
            return ":";

        } else if (Decimal == 59) {
            return ";";

        } else if (Decimal == 60) {
            return "<";

        } else if (Decimal == 61) {
            return "=";

        } else if (Decimal == 62) {
            return ">";

        } else if (Decimal == 63) {
            return "?";

        } else if (Decimal == 64) {
            return "@";

        } else if (Decimal == 65) {
            return "A";

        } else if (Decimal == 66) {
            return "B";

        } else if (Decimal == 67) {
            return "C";

        } else if (Decimal == 68) {
            return "D";

        } else if (Decimal == 69) {
            return "E";

        } else if (Decimal == 70) {
            return "F";

        } else if (Decimal == 71) {
            return "G";

        } else if (Decimal == 72) {
            return "H";

        } else if (Decimal == 73) {
            return "I";

        } else if (Decimal == 74) {
            return "J";

        } else if (Decimal == 75) {
            return "K";

        } else if (Decimal == 76) {
            return "L";

        } else if (Decimal == 77) {
            return "M";

        } else if (Decimal == 78) {
            return "N";

        } else if (Decimal == 79) {
            return "O";

        } else if (Decimal == 80) {
            return "P";

        } else if (Decimal == 81) {
            return "Q";

        } else if (Decimal == 82) {
            return "R";

        } else if (Decimal == 83) {
            return "S";

        } else if (Decimal == 84) {
            return "T";

        } else if (Decimal == 85) {
            return "U";

        } else if (Decimal == 86) {
            return "V";

        } else if (Decimal == 87) {
            return "W";

        } else if (Decimal == 88) {
            return "X";

        } else if (Decimal == 89) {
            return "Y";

        } else if (Decimal == 90) {
            return "Z";

        } else if (Decimal == 91) {
            return "[";

        } else if (Decimal == 92) {
            return "\\";

        } else if (Decimal == 93) {
            return "]";

        } else if (Decimal == 94) {
            return "^";

        } else if (Decimal == 95) {
            return "_";

        } else if (Decimal == 96) {
            return "`";

        } else if (Decimal == 97) {
            return "a";

        } else if (Decimal == 98) {
            return "b";

        } else if (Decimal == 99) {
            return "c";

        } else if (Decimal == 100) {
            return "d";

        } else if (Decimal == 101) {
            return "e";

        } else if (Decimal == 102) {
            return "f";

        } else if (Decimal == 103) {
            return "g";

        } else if (Decimal == 104) {
            return "h";

        } else if (Decimal == 105) {
            return "i";

        } else if (Decimal == 106) {
            return "j";

        } else if (Decimal == 107) {
            return "k";

        } else if (Decimal == 108) {
            return "l";

        } else if (Decimal == 109) {
            return "m";

        } else if (Decimal == 110) {
            return "n";

        } else if (Decimal == 111) {
            return "o";

        } else if (Decimal == 112) {
            return "p";

        } else if (Decimal == 113) {
            return "q";

        } else if (Decimal == 114) {
            return "r";

        } else if (Decimal == 115) {
            return "s";

        } else if (Decimal == 116) {
            return "t";

        } else if (Decimal == 117) {
            return "u";

        } else if (Decimal == 118) {
            return "v";

        } else if (Decimal == 119) {
            return "w";

        } else if (Decimal == 120) {
            return "x";

        } else if (Decimal == 121) {
            return "y";

        } else if (Decimal == 122) {
            return "z";

        } else if (Decimal == 123) {
            return "{";

        } else if (Decimal == 124) {
            return "|";

        } else if (Decimal == 125) {
            return "}";

        } else if (Decimal == 126) {
            return "~";

        } else if (Decimal == 127) {
            return "[DEL]";

        }
        return null;
    }

    public int getDecimal() {
        return out2.getDecimal();
    }
    public String getHex() {
        return out2.getHex();
    }
    public String getChar() {
        return out2.getChar();
    }
}
