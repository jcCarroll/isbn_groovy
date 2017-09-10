public class Isbn {
    String isbn

    Boolean IsValidLength() {
        if (isbn.length() == 10 || isbn.length() == 13) {
            return 'true'
        }
    }

    def RemoveSpacesAndDashes() {
        isbn = isbn.replaceAll("( |-)", "")
            return isbn
    }

    def OnlyNumbers() {
        isbn = isbn.toUpperCase()
        if (isbn.endsWith('X')) {
            isbn = isbn.minus('X')
        }
        if (isbn.contains('[a-zA-Z]+') == false) {
            return isbn
        }
    }

    def ValidTenIsbn() {
        def sum = 0
        String[] isbnArray
        isbnArray = isbn
        if (isbnArray[9] == "X") {
            isbnArray[9] = 10
        }
        isbnArray.eachWithIndex { number, index ->
            if (index <= 8) {
                sum += (index + 1) * number.toInteger()
            }
        }
        String check_sum = sum % 11
        if (check_sum == isbnArray[9]) {
            return true
        } else {
            return false
        }
    }

}