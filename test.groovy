class IsbnTest extends GroovyTestCase {

   void testLengthTen() {
       def length = new Isbn(isbnTen : '1234567890')
       assertToString(length.IsTenDig(), 'true')
   }

   void testLengthThirteen() {
       def length = new Isbn(isbnThirt : '1234567891234')
       assertToString(length.IsThirteenDig(), 'true')
   }

}