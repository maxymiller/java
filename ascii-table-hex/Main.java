public class Main {
    public static void main(String[] args) {
        for(int i = 0; i <= 127; i++) {
            asciiTableHexCodeMaxymiller out = new asciiTableHexCodeMaxymiller(i);
            System.out.println(out.getDecimal() + ": " + out.getHex() + ": " + out.getChar());
        }
    }
}