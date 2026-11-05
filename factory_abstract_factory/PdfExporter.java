package factory_abstract_factory;

public class PdfExporter implements DocumentExporter {
    @Override
    public void export(String Message) {
        System.out.println("Exporting as PDF: " + Message);
    }
}
