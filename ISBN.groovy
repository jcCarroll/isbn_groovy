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

    def ValidThirteenIsbn() {
        def sum = 0
        println "this is sum at first - $sum"
        String[] isbnArray
        println "this is the start of isbnArray - $isbnArray"
        isbnArray = isbn
        println "this is isbnArray with inbn in it - $isbnArray"
        isbnArray.eachWithIndex { number, index ->
            if (index <= 11) {
                if (index % 2 == 0) {
                println "this is the current index mod 2 - $index"
                println "this is the current number mod 2 - $number"
                    sum += number.toInteger() * 1
                    println "sum - $sum"
                } else {
                println "this is the current index - $index"
                println "this is the current number - $number"
                    sum += number.toInteger() * 3
                    println "sum - $sum"
                }
            }
        }
        println "this is sum at the end of it all - $sum"
        int pre_pre_check = sum % 10
        println "pre pre check should be 0 - $pre_pre_check"
        int pre_check = 10 - pre_pre_check
        println "pre check should be 10 - $pre_check"
        int check_sum = pre_check % 10
        println "check sum should be 0 - $check_sum"
        String test = isbnArray[12]
            println "isbnArray index 12 should be 0 - $test and check sum should be 0 - $check_sum"
        if (check_sum == isbnArray[12]) {
            return true
        } else {
            return false
        }

    }

}