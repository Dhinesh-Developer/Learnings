// violates the principle

class BadReport{
    void generateReport(){
        System.out.println("Report Generated");
    }

    void saveToFile(){
        System.out.println("Saved to File");
    }

    void sendEmail(){
        System.out.println("Email Sent!");
    }
}

class Report{
    void generateReport(){
        System.out.println("Report Generated!");
    }
}

class FileSaver{
    void saveToFile(){
        System.out.println("Saved to file!");
    }
}

class EmailSender{
    void sendEmail(){
        System.out.println("Email sent!");
    }
}

public class SRP {
    public static void main(String[] args) {
        
        Report report = new Report();
        report.generateReport();

        FileSaver fileSaver = new FileSaver();
        fileSaver.saveToFile();

        EmailSender sender = new EmailSender();
        sender.sendEmail();

    }
}
