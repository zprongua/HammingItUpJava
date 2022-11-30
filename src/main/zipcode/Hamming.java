package zipcode;

public class Hamming {
    String goodCell;
    String copyCell;

    public Hamming(String s, String s1) {
        this.goodCell = s;
        this.copyCell = s1;
        if (goodCell.length() != copyCell.length()) {
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }
    }

    public int getHammingDistance() {
        int count = 0;
        for (int i=0; i<goodCell.length(); i++) {
            if (goodCell.charAt(i) != copyCell.charAt(i)) count++;
        }
        return count;
    }
}
