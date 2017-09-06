class IsbnTest extends GroovyTestCase {

   void testLengthTen() {
       def length = new Isbn(isbn : '0471958697')
       assertToString(length.IsValidLength(), 'true')
   }

            void testLengthThirteen() {
                def length = new Isbn(isbn : '9780470059029')
                assertToString(length.IsValidLength(), 'true')
            }

   void testRemoveEmptySpacesTen() {
       def spaces = new Isbn(isbn : '0 471 95869 7')
       assertToString(spaces.RemoveSpacesAndDashes(), '0471958697')
   }

            void testRemoveEmptySpacesThirt() {
                def spaces = new Isbn(isbn : '9 780 4700 5902 9')
                assertToString(spaces.RemoveSpacesAndDashes(), '9780470059029')
            }

    void testRemoveDashTen() {
       def dashes = new Isbn(isbn : '0-471-95869-7')
       assertToString(dashes.RemoveSpacesAndDashes(), '0471958697')
    }

            void testRemoveDashThirt() {
                def dashes = new Isbn(isbn : '9-780-4700-5902-9')
                assertToString(dashes.RemoveSpacesAndDashes(), '9780470059029')
            }

    void testStringOnlyNumbers() {
        def numOnly = new Isbn(isbn : '123524875')
        assertToString(numOnly.OnlyNumbers(), 'true')
    }

}