package runnable.sample;

public class ExcelReportGenerator {
	
	
	public void generateExcelReport(String destFileName) {
		
		String path = ExcelReportGenerator.class.getClassLoader().getResource("./").getPath();	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new ExcelReportGenerator().generateExcelReport("");

	}

}
