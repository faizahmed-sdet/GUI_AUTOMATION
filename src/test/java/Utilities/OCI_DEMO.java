package Utilities;

import java.io.File;

import com.lowagie.text.Image;

import net.sourceforge.tess4j.*;


public class OCI_DEMO {

	public static void main(String s[])
	{
		System.out.println("ssssssss");
		ITesseract itess = new Tesseract();
		itess.setDatapath("D:\\GITTY\\GUI_AUTOMATION\\tessdata");
		try {
			String ss = itess.doOCR(new File("C:\\Users\\Faiz\\Pictures\\myjpeg.jpeg"));
			System.out.println(ss);
			
		} catch (TesseractException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}
