/**
 * OOPSBannerAppUC7 demonstrates the use of Static Inner Classes and 
 * Object Arrays to manage character patterns efficiently.
 */
public class OOPSBannerAppUC7 {

    /**
     * Inner Static Class to encapsulate character data.
     * This acts as a blueprint for every letter in our banner.
     */
    public static class CharacterPattern {
        private char character;
        private String[] pattern;

        /**
         * Constructor to initialize the character and its 7-line pattern.
         * @param character The char this pattern represents.
         * @param pattern An array of strings representing the visual rows.
         */
        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        // Getter for character
        public char getCharacter() {
            return character;
        }

        // Getter for pattern
        public String[] getPattern() {
            return pattern;
        }
    }

    /**
     * Main method to execute the banner display logic.
     */
    public static void main(String[] args) {
        // 1. Define patterns for O, P, and S
        String[] patternO = {
            "    *** ",
            "  **   ** ",
            " **     ** ",
            " **     ** ",
            " **     ** ",
            "  **   ** ",
            "    *** "
        };

        String[] patternP = {
            " ***** ",
            " **   **",
            " **   **",
            " ***** ",
            " ** ",
            " ** ",
            " **  "
        };

        String[] patternS = {
            "    ****() ",
            "  ** ",
            " ** ",
            "   *** ",
            "      ** ",
            "     ** ",
            "***** "
        };

        // 2. Create an Array of Objects (CharacterPattern instances)
        CharacterPattern[] patterns = {
            new CharacterPattern('O', patternO),
            new CharacterPattern('O', patternO),
            new CharacterPattern('P', patternP),
            new CharacterPattern('S', patternS)
        };

        // 3. Display the banner
        displayBanner(patterns);
    }

    /**
     * Iterates through the 7 lines of the banner and appends patterns from each object.
     * @param patterns Array of CharacterPattern objects to be displayed.
     */
    public static void displayBanner(CharacterPattern[] patterns) {
        for (int i = 0; i < 7; i++) {
            StringBuilder line = new StringBuilder();
            for (CharacterPattern cp : patterns) {
                line.append(cp.getPattern()[i]).append("  "); // Append row 'i' + spacing
            }
            System.out.println(line.toString());
        }
    }
}