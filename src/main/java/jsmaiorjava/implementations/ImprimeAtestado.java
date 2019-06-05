package jsmaiorjava.implementations;

import jsmaiorjava.interfaces.IImprimeAtestado;
import jsmaiorjava.interfaces.IProntuario;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.draw.VerticalPositionMark;
import com.itextpdf.text.pdf.BaseFont;


public class ImprimeAtestado implements IImprimeAtestado {
    public ImprimeAtestado() {
    }

    public void imprime(IProntuario prontuario) {
        Document document = new Document();
        try {
            PdfWriter.getInstance(document, new FileOutputStream("iTextHelloWorld.pdf"));
            // Cria os parágrafos
            Paragraph titulo1 = new Paragraph("ATESTADO MÉDICO");
            Paragraph titulo2 = new Paragraph("TRATAMENTO:");
            Paragraph nome = new Paragraph("NOME DO PACIENTE: " + prontuario.getPaciente()); 
            Paragraph tratamento = new Paragraph(prontuario.getTratamento());
            //Cria a fonte da assinatura do Doutor
            BaseFont base = BaseFont.createFont("fonts/doctor.ttf", BaseFont.WINANSI, true);
            Font font = new Font(base, 15f);
            Chunk sigDoutor = new Chunk(prontuario.getDoutor());
            sigDoutor.setFont(font);
            Paragraph assinatura = new Paragraph(sigDoutor);
            //Adiciona as imagens do cabeçalho
            Image image1 = Image.getInstance("images/Logo_HC.png");
            Image image2 = Image.getInstance("images/UNICAMP_logo.png");
            image2.scalePercent(10);
            image1.scalePercent(20);
            //Formata a posição das imagens
            Chunk glue = new Chunk(new VerticalPositionMark());
            Chunk im1 = new Chunk(image1, 0, 0);
            Chunk im2 = new Chunk(image2, 0, 0);
            Paragraph logos = new Paragraph(im1);
            logos.add(new Chunk(glue));
            logos.add(im2);
            //Data e hora
            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            Calendar cal = Calendar.getInstance();
            Chunk dt = new Chunk(dateFormat.format(cal.getTime()));
            Paragraph data = new Paragraph("DATA: "+ dt); 
            //Alinhamentos
            titulo1.setAlignment(1);
            assinatura.setAlignment(1);
            // Escreve os parágrafos no pdf
            document.open();
            document.add(logos);
            document.add(titulo1);
            document.add(data);
            document.add(nome);
            document.add(titulo2);
            document.add(tratamento);
            document.add(assinatura);
            document.close();
        } catch (DocumentException e) {
            System.out.println("Deu Ruim");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // System.out.println("Nome do doutor: " + prontuario.getDoutor() + " Nome do Paciente: " + prontuario.getPaciente() + "\n" + "Tratamento: " + prontuario.getTratamento());
    }
}