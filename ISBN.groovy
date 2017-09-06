public class Isbn {
    String isbnTen
    String isbnThirt

    Boolean IsTenDig() {
        if (isbnTen.length() == 10)
            return 'true'
    }
    
    Boolean IsThirteenDig() {
        if (isbnThirt.length() == 13)
            return 'true'
    }
}