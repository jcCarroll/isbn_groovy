class IsbnTest extends GroovyTestCase {
   void testDisplay() {
      def stud = new Isbn(name : 'Joe', ID : 1)
      def expected = 'Joe1'
      assertToString(stud.Display(), expected)
   }

   void testLengthTen() {
       def length = new Isbn(isbn : '1234567890')
       assertToString(length.IsTenDig(), 'true')
   }
   
   void testLengthNotTen() {
       def lengthBad = new Isbn(isbn : '123456')
       assertToString(lengthBad.IsTenDig(), 'null')
   }
}