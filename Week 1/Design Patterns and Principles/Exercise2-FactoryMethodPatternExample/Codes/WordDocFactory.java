
/**
 * Write a description of class WordDocFactory here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WordDocFactory extends DocumentFactory
{
    public WordDocument createDocument(String wordDoc){
        WordDocumentClass wd = new WordDocumentClass();
        System.out.print("\nWord document is created.");
        return wd;
    }
}