import java.util.Scanner;

/**
 * Write a description of class TestDocumentFactory here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestDocumentFactory
{
    public static void main(String args[]){
         String docType;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the type of document you want to create (Word/Excel/Pdf): ");
        docType = sc.nextLine();
        if(docType.equalsIgnoreCase("Word")){
            DocumentFactory df = new WordDocFactory();
            WordDocument wd = (WordDocument)df.createDocument("Word document");
            
        } else if(docType.equalsIgnoreCase("Excel")){
            DocumentFactory df = new ExcelDocFactory();
            ExcelDocument ed = (ExcelDocument)df.createDocument("Excel document");
            
        } else if(docType.equalsIgnoreCase("Pdf")){
            DocumentFactory df = new PdfDocFactory();
            PdfDocument pdf = (PdfDocument)df.createDocument("Pdf document");
            
        } else {
            System.out.println("Invalid document type.");
        }
    }
}