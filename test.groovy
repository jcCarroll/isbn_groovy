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
       assertToString(spaces.RemoveSpaces(), '0471958697')
   }

            void testRemoveEmptySpacesThirt() {
                def spaces = new Isbn(isbn : '9 780 4700 5902 9')
                assertToString(spaces.RemoveSpaces(), '9780470059029')
            }

}