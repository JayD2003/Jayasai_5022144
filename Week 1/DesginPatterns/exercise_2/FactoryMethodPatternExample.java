package exercise_2;

import java.util.Scanner;

public class FactoryMethodPatternExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            DocumentFactory factory = null;

            System.out.println("Enter the type of document to create (word, pdf, excel): ");
            String docType = scanner.nextLine();

            switch (docType.toLowerCase()) {
                case "word":
                    factory = new WordDocumentFactory();
                    break;
                case "pdf":
                    factory = new PdfDocumentFactory();
                    break;
                case "excel":
                    factory = new ExcelDocumentFactory();
                    break;
                default:
                    System.out.println("Unknown document type.");
                    scanner.close();
                    return;
            }

            Document document = factory.createDocument();
            document.open();
            document.save();
            document.close();

            scanner.close();
    }
}
