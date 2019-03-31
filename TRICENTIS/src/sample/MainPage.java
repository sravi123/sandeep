package sample;

public class MainPage {
	public ReusableMethods m;
	//Test Name:HomePage
	//Author:Sravanthi
	//Date Created:Mar30
	//********************************************************
	public void mainpage () throws Exception{
	m=new ReusableMethods();
	//connecting to Excel
	m.excel_Con("‪C:\\Users\\Sandeep Chitumalla\\Desktop\\DEMO PROJECT\\TEST DATA\\INPUTDATA.xls", "Sheet1");
    //launch App
	m.launchApp(m.s.getCell(0,0).getContents(), "‪C:\\Users\\Sandeep Chitumalla\\Desktop\\DEMO PROJECT\\TEST RESULTS\\LaunchApp.png");
	}

}
