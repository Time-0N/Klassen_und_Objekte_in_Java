import java.util.Arrays;

public class Lib {
    private Book[] lib = new Book[10];

    @Override
    public String toString() {
        return "Lib: " +
                Arrays.toString(lib)
                ;
    }

    public Book[] getLib() {
        return lib;
    }

    public void setLib(Book[] lib) {
        this.lib = lib;
    }
    public void deleteBook(int selectedSlot) {
        lib[selectedSlot] = null;
    }
}
