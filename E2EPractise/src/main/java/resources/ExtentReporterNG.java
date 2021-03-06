package resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporterNG {
	static ExtentReports extent;

	
	public static ExtentReports getReportObject()
	{
		//ExtentReports, ExtentSparkReporter
				String path=System.getProperty("user.dir") +"\\reports\\index.html";
				ExtentSparkReporter reporter= new ExtentSparkReporter(path);
				reporter.config().setReportName(" E2E Practise Automation Report");
				reporter.config().setDocumentTitle("Extent Report Test Results");
				
				extent=new ExtentReports();
				extent.attachReporter(reporter);
				extent.setSystemInfo("Tester", "Ramesh");
				return extent;
				
	}
}
