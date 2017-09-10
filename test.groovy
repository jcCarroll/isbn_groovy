class IsbnTest extends GroovyTestCase {

    void testLength() {
        def lengthTen = new Isbn(isbn : '0471958697')
        assertToString(lengthTen.IsValidLength(), 'true')
        def lengthThirt = new Isbn(isbn : '9780470059029')
        assertToString(lengthThirt.IsValidLength(), 'true')
    }

    void testRemoveEmptySpacesTen() {
        def spacesTen = new Isbn(isbn : '0 471 95869 7')
        assertToString(spacesTen.RemoveSpacesAndDashes(), '0471958697')
        def spacesThirt = new Isbn(isbn : '9 780 4700 5902 9')
        assertToString(spacesThirt.RemoveSpacesAndDashes(), '9780470059029')
    }

    void testRemoveDashTen() {
        def dashesTen = new Isbn(isbn : '0-471-95869-7')
        assertToString(dashesTen.RemoveSpacesAndDashes(), '0471958697')
        def dashesThirt = new Isbn(isbn : '9-780-4700-5902-9')
        assertToString(dashesThirt.RemoveSpacesAndDashes(), '9780470059029')
    }

    void testStringOnlyNumbers() {
        def numOnly = new Isbn(isbn : '123456789x')
        assertToString(numOnly.OnlyNumbers(), '123456789')
    }

    void testValidTen() {
        def validTenIsbn = new Isbn(isbn : '877195869X')
        assertToString(validTenIsbn.ValidTenIsbn(), 'true')
    }

    // void testValidThirteen() {
    //     def validThirteenIsbn = new Isbn(isbn : '9780470059029')
    //     assertToString(validThirteenIsbn.ValidThirteenIsbn(), 'true')
    // }

}