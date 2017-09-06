class IsbnTest extends GroovyTestCase {

   void testLengthTen() {
       def length = new Isbn(isbn : '0471958697')
       assertToString(length.IsValidLength(), 'true')
   }

            void testLengthThirteen() {
                def length = new Isbn(isbn : '9780470059029')
                assertToString(length.IsValidLength(), 'true')
            }

   void testRemoveEmptySpaces() {
       def spaces = new Isbn(isbn : '0 471 95869 7')
       assertToString(spaces.RemoveSpaces(), 'true')
   }

}