public class FictionBook extends Book{
    private String category;

    public FictionBook(){

    }
    public FictionBook(String category){
        this.category=category;

    }
    public FictionBook(int bookCode, String name, int price, String author, String category){
        super(bookCode, name, price, author);
        this.category=category;
    }
    @Override
    public String toString() {
        return
                "bookCode = " + super.getBookCode() +
                        ", Name = '" + super.getName() + '\'' +
                        ", price = " + super.getPrice() +
                        ", author = '" + super.getAuthor() + '\''+
                        "category = '" + category + '\'' + " ";

    }
}
