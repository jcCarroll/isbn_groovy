public class Isbn {
    String isbn

    Boolean IsValidLength() {
        if (isbn.length() == 10 || isbn.length() == 13) {
            return true
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
            return true
        }
    }

    def CheckTenIsbn() {
        def sum = 0
        String[] isbnArray
        isbnArray = isbn
        if (isbnArray[9] == "X") {
            isbnArray[9] = 10
        }
        isbnArray.eachWithIndex { number, index ->
            if (index <= 8)
                sum += (index + 1) * number.toInteger()
        }
        String check_sum = sum % 11
        if (check_sum == isbnArray[9])
            return true
    }

    def CheckThirteenIsbn() {
        def sum = 0
        String[] isbnArray
        isbnArray = isbn
        isbnArray.eachWithIndex { number, index ->
            if (index <= 11) {
                if (index % 2 == 0) {
                    sum += number.toInteger() * 1
                } else {
                    sum += number.toInteger() * 3
                }
            }
        }
        int pre_pre_check = sum % 10
        int pre_check = 10 - pre_pre_check
        int check_sum = pre_check % 10
        int test = isbnArray[12].toInteger()
        if (check_sum == test)
            return true
    }

    def ValidateIsbn() {
        isbn = RemoveSpacesAndDashes()
        if (IsValidLength() == true && OnlyNumbers() == true){
            if (isbn.length() == 10) {
                println isbn
                if (CheckTenIsbn() == true)
                    return true
            } else if (isbn.length() == 13) {
                println isbn
                if (CheckThirteenIsbn() == true)
                    return true
            }
        }
    }

}