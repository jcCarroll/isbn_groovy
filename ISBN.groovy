public class Isbn {
    String isbn

    Boolean IsValidLength() {
        if (isbn.length() == 10) {
            return 'true'
        } else if (isbn.length() == 13){
            return 'true'
        }
    }
}