
/**
 * Write a description of class PdfDocFactory here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PdfDocFactory extends DocumentFactory
{
    public PdfDocument createDocument(String pdfDoc){
        PdfDocumentClass pd = new PdfDocumentClass();
        System.out.print("\nPdf document is created.");
        return pd;
    }
}