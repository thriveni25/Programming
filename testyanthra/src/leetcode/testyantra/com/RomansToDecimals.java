package leetcode.testyantra.com;

public class RomansToDecimals {
	
    public static int romansToDecimals(String roman) {
        int decimals = 0;

        for (int i=0; i<roman.length(); i++) {
        	
            int current = getValueOfRoman(roman.charAt(i));

            int next = 0;
            if (i+1 < roman.length()) {
                next = getValueOfRoman(roman.charAt(i+1));
            }

            if (current < next) { 
                decimals -= current;
            } else {
                decimals += current;
            }
        }
        return decimals;
    }

    private static int getValueOfRoman(char roman) {
        switch(roman) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }

    public static void main(String args[]) {
        System.out.println(romansToDecimals("LCD"));
    }
}
