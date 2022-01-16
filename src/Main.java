import exception.IncorrectGenderChoiceException;

public class Main {
    public static void main(String[] args) throws IncorrectGenderChoiceException {

        Author firstAuthor = new Author("Mihai Eminescu", "eminescu@yahoo.com", 'm');
        System.out.println(firstAuthor);
        Book luceafarul = new Book("Luceafarul", firstAuthor, 19.95, 1000);
        System.out.println(luceafarul);

        Book java = new Book("Java for beginner",
                new Author("Programming with Mosh", "programmingMosh@yahooo.com", 'm'),
                12.55, 12500);
        System.out.println(java);
        java.getAuthorDetails();
        System.out.println("------------------------");
        System.out.println(java.getAuthorName());
        System.out.println(java.getAuthorGender());
        System.out.println(java.getAuthorEmail());

    }
}
