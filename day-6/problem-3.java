// Check Valid username length(8-30)  first must be character
// input:Samantha output:true
// input:1samantha output:false
public static boolean isValid(String userName) {
    int n = userName.length();
    if (n < 8 || n > 30)
        return false;

    char first = userName.charAt(0);
    if (!Character.isLetter(first))
        return false;
    for (int i = 1; i < n; i++) {
        char ch = userName.charAt(i);
        if (!(Character.isLetterOrDigit(ch) || ch == '_')) {
            return false;
        }
    }

    return true;
}
