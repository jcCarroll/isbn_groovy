class IsbnTest extends GroovyTestCase {

   void testLengthTen() {
       def length = new Isbn(isbn : '0471958697')
       assertToString(length.IsValidLength(), 'true')
   }

   void testLengthThirteen() {
       def length = new Isbn(isbn : '9780470059029')
       assertToString(length.IsValidLength(), 'true')
   }

//    void testRemoveEmptySpaces() {
//        assertToString()
//    }

}