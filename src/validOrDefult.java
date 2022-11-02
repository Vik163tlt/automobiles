public class validOrDefult {
    public static String validOrDefult(String value, String defultValue) {
        return value == null || value.isBlank() ? defultValue : value;
    }
}
