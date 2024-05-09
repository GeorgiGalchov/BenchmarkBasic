import java.io.*;

public class Benchmark {

    public static void main(String[] args) throws IOException {
        String htmlContent = "<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "    <title>Benchmark App</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "    <h1>Benchmark App</h1>\n" +
                "    <form action=\"http://localhost:8080/start\" method=\"get\">\n" +
                "        <input type=\"submit\" value=\"Start Benchmark\"/>\n" +
                "    </form>\n" +
                "</body>\n" +
                "</html>";

        File htmlFile = new File("benchmark.html");
        FileWriter writer = new FileWriter(htmlFile);
        writer.write(htmlContent);
        writer.close();

        System.out.println("HTML file generated successfully. Open benchmark.html in your browser.");
    }
}
