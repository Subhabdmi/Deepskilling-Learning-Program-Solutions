
/**
 * Write a description of class ExcelDocFactory here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ExcelDocFactory extends DocumentFactory
{
    public ExcelDocument createDocument(String excelDoc){
        ExcelDocumentClass ed = new ExcelDocumentClass();
        System.out.print("\nExcel document is created.");
        return ed;
    }
}