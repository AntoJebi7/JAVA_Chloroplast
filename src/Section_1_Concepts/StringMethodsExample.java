package Section_1_Concepts;

public class StringMethodsExample {
    public static void main(String[] args) {
        String text = "  Hello, Java!  ";

        // 1️⃣ length() - Find the length of the string
        System.out.println("Length: " + text.length());

        // 2️⃣ charAt() - Get character at a specific index
        System.out.println("Character at index 4: " + text.charAt(4));

        // 3️⃣ toUpperCase() - Convert to uppercase
        System.out.println("Uppercase: " + text.toUpperCase());

        // 4️⃣ toLowerCase() - Convert to lowercase
        System.out.println("Lowercase: " + text.toLowerCase());

        // 5️⃣ trim() - Remove leading and trailing spaces
        System.out.println("Trimmed: '" + text.trim() + "'");

        // 6️⃣ substring() - Extract a part of the string
        System.out.println("Substring (7 to 11): " + text.substring(7, 11));

        // 7️⃣ contains() - Check if the string contains a sequence
        System.out.println("Contains 'Java': " + text.contains("Java"));

        // 8️⃣ equals() - Compare strings (case-sensitive)
        System.out.println("Equals 'Hello, Java!': " + text.trim().equals("Hello, Java!"));

        // 9️⃣ equalsIgnoreCase() - Compare strings (case-insensitive)
        System.out.println("EqualsIgnoreCase 'hello, java!': " + text.trim().equalsIgnoreCase("hello, java!"));

        // 🔟 startsWith() & endsWith() - Check starting/ending substrings
        System.out.println("Starts with '  He': " + text.startsWith("  He"));
        System.out.println("Ends with 'va!  ': " + text.endsWith("va!  "));

        // 1️⃣1️⃣ indexOf() - Find the first occurrence of a character
        System.out.println("Index of 'J': " + text.indexOf('J'));

        // 1️⃣2️⃣ lastIndexOf() - Find the last occurrence of a character
        System.out.println("Last index of 'a': " + text.lastIndexOf('a'));

        // 1️⃣3️⃣ replace() - Replace characters or substrings
        System.out.println("Replace 'Java' with 'World': " + text.replace("Java", "World"));

        // 1️⃣4️⃣ split() - Split the string based on a delimiter
        String[] parts = text.trim().split(", ");
        System.out.println("Split Result:");
        for (String part : parts) {
            System.out.println(part);
        }


        // 1️⃣5️⃣ isEmpty() & isBlank() - Check if the string is empty or blank
        String emptyStr = "";
        String blankStr = "   ";
        System.out.println("Is empty: " + emptyStr.isEmpty());
        System.out.println("Is blank: " + blankStr.isBlank());
    }
}
