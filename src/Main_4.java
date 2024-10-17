interface Print{
    void Print(String content);
}

interface  Scan{
    void  Scan(String content);
}

interface  Fax{
    void Fax(String content);
}

class AllinPrint implements Print,Scan,Fax{
    @Override
    public void Print(String content) {
        System.out.println("Printing" + content);
    }

    @Override
    public void Fax(String content) {
        System.out.println("Faxing" + content);

    }

    @Override
    public void Scan(String content) {
        System.out.println("Scanner" + content );
    }
}


class BasicPrinter implements Print{
    @Override
    public void Print(String content) {
        System.out.println("Print" + content);
    }
}

public class Main_4 {
    public static void main(String[] args) {
        BasicPrinter basicPrinter = new BasicPrinter();
        basicPrinter.Print("Document");
    }
}
