package hundredDays.phase1.day3_NameFormatter;

public class NameFormatter {
    public static void main(String[] args){
        String fullName = "Pietro Guidorizzi";
        int len = fullName.length();
        String FullNAME = fullName.toUpperCase();
        String fullname = fullName.toLowerCase();
        boolean contain = fullName.contains("Guido");
        String nameFull = fullName.replace("Guidorizzi", "Rat Robot");
        String trimedName = fullName.trim();
        String[] parts = nameFull.split(" ");
        char c = fullName.charAt(0);
        String subS = fullName.substring(7,17);
        int idxOf = fullName.indexOf("G");
        boolean isEmpty = fullName.isEmpty();

        System.out.println("Name and Surname: "+ fullName + " ");
        System.out.println("Name length: "+len + " ");
        System.out.println("Uppercase: "+FullNAME + " ");
        System.out.println("Lowercase: "+fullname + " ");
        System.out.println("Contains: "+contain + " ");
        System.out.println("Replaced: "+nameFull + " ");
        System.out.println("Trimmed Name: " + trimedName + " ");
        System.out.println("Splited part [0]: "+parts[0]);
        System.out.println("Splited part [1]: "+parts[1]);
        System.out.println("Splited part [2]: "+parts[2]);
        System.out.println("Char at [0]: "+c + " ");
        System.out.println("Substring: "+subS + " ");
        System.out.println("First Index of chosen char: "+ idxOf + " ");
        System.out.println("Boolean isEmpty: "+isEmpty + " ");
    }
    }
