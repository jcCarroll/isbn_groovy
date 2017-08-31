public class Isbn {
    String name
    int ID
    String isbn
	
    String Display() {
        return name + ID
    }

    Boolean IsTenDig() {
        if (isbn.length() == 10)
            return 'true'
   }
}