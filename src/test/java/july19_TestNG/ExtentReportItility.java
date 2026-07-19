package july19_TestNG;

import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportItility {
	
	//create static object of ExtentReports.
	public static ExtentReports report;
	
	public ExtentReports getExtentReport()
	{
		if(report == null) 
		{
			String reportPath = System.getProperty("user.dir") + "/reports/extent-report.html";
			File reportFolder = new File(System.getProperty("user.dir") + "/reports");
			
			if(reportFolder.exists()) 
			{
				reportFolder.mkdirs();
			}
			
			
			ExtentSparkReporter spark = new ExtentSparkReporter(reportPath);
			spark.config().setReportName("Automation Test Result");
			spark.config().setDocumentTitle("Extent Report");
			spark.config().setTheme(Theme.STANDARD);
			spark.config().setTimeStampFormat("");
			
			report = new ExtentReports();
			report.attachReporter(spark);
			report.setSystemInfo("Tester", "Suraj");
			report.setSystemInfo("OS", "Windows11");
			report.setSystemInfo("Browser", "Chrome");
			report.setSystemInfo("Machine", "Tester LP");
			
		}
		
		return report;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
