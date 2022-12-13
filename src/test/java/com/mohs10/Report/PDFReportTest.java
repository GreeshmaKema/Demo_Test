package com.mohs10.Report;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.color.Color;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.border.Border;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.element.Text;
import com.itextpdf.layout.property.TextAlignment;
import com.mohs10.base.StartBrowser;
//import com.mohs10.reuse.Tabl;

//import io.github.bonigarcia.wdm.WebDriverManager;
public class PDFReportTest extends StartBrowser  {
  @Test
//*****************************************************Data Fetching Script*******************************************************// 
  public void PDFreports() throws MalformedURLException, FileNotFoundException 
  {																						//variables declaration
		List <String> failText = new ArrayList<String>();
		List <String> failTime = new ArrayList<String>();
		List <String> passText = new ArrayList<String>();
		List <String> passTime = new ArrayList<String>();
		List <String> skippedText = new ArrayList<String>();
		List <String> skippedTime = new ArrayList<String>();

		driver.get("file:///C:/Users/Tharun/Downloads/pAInITe-master/pAInITe-master/test-output/Client%20Report/Automation%20Test.html");						  //opening .html file
		//driver.get("file:///C:/Users/91703/Downloads/Sample%20Test%20Case1.html");						  //opening .html file

		String status = driver.findElement(By.xpath("/html/body/table/tbody/tr[1]/td[2]")).getText();     //TestCase status
		String Timestamp = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]")).getText();  //Execution start time
		
//fetching passes testcases time and title
		List<WebElement> rows = driver.findElements(By.xpath("/html/body/p//table[@class=\"invocation-passed\"]/tbody/tr"));
		for(int i=2;i<rows.size();i++) {
				List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));						//Breaking xpath
				List<WebElement> cols1 = cols.get(0).findElements(By.tagName("b"));						//getting  O'th column value
				String title = cols1.get(0).getText();
				passText. add(title) ;
				String time=cols.get(2).getText();														//getting  1'th column value
				passTime. add(time) ;}
		
//fetching failed testcases time and title
		List<WebElement> rowsF = driver.findElements(By.xpath("/html/body/p//table[@class=\"invocation-failed\"]/tbody/tr"));
		for(int f=2;f<rowsF.size();f++){
				List<WebElement> colsF = rowsF.get(f).findElements(By.tagName("td"));
				List<WebElement> cols1F = colsF.get(0).findElements(By.tagName("b"));
				String title = cols1F.get(0).getText();
				failText. add(title) ;
				String time=colsF.get(2).getText();
				failTime. add(time) ;}
		
////fetching skipped testcases time and title
		List<WebElement> rowsS = driver.findElements(By.xpath("/html/body/p//table[@class=\"invocation-skipped\"]/tbody/tr"));
		for(int g=2;g<rowsS.size();g++){
				List<WebElement> colsS = rowsS.get(g).findElements(By.tagName("td"));
				List<WebElement> cols1S = colsS.get(0).findElements(By.tagName("b"));
				String title = cols1S.get(0).getText();
				skippedText. add(title) ;
				String time=colsS.get(2).getText();
				skippedTime. add(time) ;}
		
		driver.quit();																					//closing browser 
//**********************************************************PDF Script*************************************************************//		
	
// Creating a PdfWriter                                      
      String dest = "Report/ClientReport.pdf";       
      PdfWriter writer = new PdfWriter(dest);        
      PdfDocument pdf = new PdfDocument(writer);              
      Document document = new Document(pdf); 													//creating document of PDF format 
      
	     //Script to add logo image in pdf
	      String imgsrc = "./Logo/Mohs10logo.jpeg";
			ImageData data1 = ImageDataFactory.create(imgsrc);
			Image img = new Image(data1);
			img.scaleToFit(100f, 100f);         //image size
			img.setFixedPosition(500, 800);     // image position
			document.add(img);
      										///Table-0 (Automation Report)///
    float [] pointColumnWidths = {260f, 260f};                                                	//fixing table dimension(columns)
    Table table = new Table(pointColumnWidths);													//Creating Table-0
    Text text = new Text("Automation Test Report");  											//making title "automation report"
       text.setBold();
       text.setFontSize(15);
       text.setFontColor(Color.BLACK);
       text.setUnderline();
       text.setTextAlignment(TextAlignment.RIGHT);
    Paragraph para = new Paragraph(text);    													//adding title to paragraph
    document.add(para);																			//adding paragraph to document
  		table.addCell(new Cell().add("Project Name"));											//making Table-0 cells  
  		table.addCell(new Cell().add("Mohs10"));
  		table.addCell(new Cell().add("Started on"));
  		table.addCell(new Cell().add(Timestamp));
  		table.addCell(new Cell().add("Tester Name"));
  		table.addCell(new Cell().add("Greeshma"));
  		table.addCell(new Cell().add("Tests passed/Failed/Skipped"));
  		table.addCell(new Cell().add(status));
  	table.addCell(new Cell().setBorder(Border.NO_BORDER).setPaddingBottom(25).add(""));
    document.add(table);																		//Adding Table-0 cells after paragraph
    										///Table-1 (Passed TestCases Report)///
if (passText.isEmpty() == false ) {
     float[] pointColumnWidths1 = { 200f, 200f, 200f };
     Table table1 = new Table(pointColumnWidths1);
     Text text1 = new Text("Passed Testcases");
       	text1.setBold();
       	text1.setFontSize(15);
       	text1.setFontColor(Color.BLACK);
       	text1.setUnderline();
       	text1.setTextAlignment(TextAlignment.RIGHT);
     Paragraph para1 = new Paragraph(text1);
     document.add(para1);
       	table1.addCell(new Cell().add("TESTCASE NAME"));
       	table1.addCell(new Cell().add("STATUS"));
       	table1.addCell(new Cell().add("TIME IN SECONDS"));
     for (int a = 0 ; a < passText.size() ; a++) {
     	table1.addCell(new Cell().add(passText.get(a)));
     	table1.addCell(new Cell().add("PASSED"));
     	table1.addCell(new Cell().add(passTime.get(a)));}
     table1.addCell(new Cell().setBorder(Border.NO_BORDER).setPaddingBottom(25).add(""));
     document.add(table1);}																	
											///Table-2 (Failed TestCases Report)///
if (failText.isEmpty() == false ) {
	float[] pointColumnWidths2 = { 200f, 200f, 200f };
	Table table2 = new Table(pointColumnWidths2);
	Text text2 = new Text("Failed Testcases");
		text2.setBold();
		text2.setFontSize(15);
		text2.setFontColor(Color.BLACK);
		text2.setUnderline();
		text2.setTextAlignment(TextAlignment.RIGHT);
	Paragraph para2 = new Paragraph(text2);
	document.add(para2);
		table2.addCell(new Cell().add("TESTCASE NAME"));
		table2.addCell(new Cell().add("STATUS"));
		table2.addCell(new Cell().add("TIME IN SECONDS"));
	for (int b = 0 ; b < failText.size() ; b++) {
		table2.addCell(new Cell().add(failText.get(b)));
		table2.addCell(new Cell().add("FAILED"));
		table2.addCell(new Cell().add(failTime.get(b)));}
	table2.addCell(new Cell().setBorder(Border.NO_BORDER).setPaddingBottom(25).add(""));
	document.add(table2);}
												///Table-3 (Skipped TestCases Report)///
if (skippedText.isEmpty() == false ) {
	float[] pointColumnWidths3 = { 200f, 200f, 200f };
	Table table3 = new Table(pointColumnWidths3);
	Text text3 = new Text("Skipped Testcases");
		text3.setBold();
		text3.setFontSize(15);
		text3.setFontColor(Color.BLACK);
		text3.setUnderline();
		text3.setTextAlignment(TextAlignment.RIGHT);
	Paragraph para4 = new Paragraph(text3);
	document.add(para4);
		table3.addCell(new Cell().add("TESTCASE NAME"));
		table3.addCell(new Cell().add("STATUS"));
		table3.addCell(new Cell().add("TIME IN SECONDS"));
	for (int C = 0; C < skippedText.size(); C++) {
		table3.addCell(new Cell().add(skippedText.get(C)));
		table3.addCell(new Cell().add("SKIPPED"));
		table3.addCell(new Cell().add(skippedTime.get(C)));}
	table3.addCell(new Cell().setBorder(Border.NO_BORDER).setPaddingBottom(25).add(""));
	document.add(table3);}
											////Adding screen shots to pdf////
File file=new File("C:/Users/Tharun/Downloads/pAInITe-master/pAInITe-master/TestcaseScreenshots/");
String[] ls=file.list();																		//adding images in array

	float [] pointColumnWidths4 = {260f, 260f};
	Table table4 = new Table(pointColumnWidths4);
	for(int i=0;i<ls.length;i++) {
		String stepname=ls[i];
		String[] stepname1=stepname.split("\\.");
		String stepname2 = stepname1[0];
			table4.addCell(new Cell().add("Test case name"));
			table4.addCell(new Cell().add(stepname2));
			table4.addCell(new Cell().add("Details information"));
		String imFile = "C:/Users/Tharun/Downloads/pAInITe-master/pAInITe-master/TestcaseScreenshots/"+ls[i];
		ImageData data = ImageDataFactory.create(imFile);  
        Image image = new Image(data);
     		table4.addCell(new Cell().add(image.scaleToFit(300, 300)));
			table4.addCell(new Cell().setBorder(Border.NO_BORDER).setPaddingBottom(25).add(""));
     		table4.addCell(new Cell().setBorder(Border.NO_BORDER).setPaddingBottom(25).add(""));}
	document.add(table4);
	//document.add(img);
	
document.close();																					//Closing PDF Document
 }
 }



