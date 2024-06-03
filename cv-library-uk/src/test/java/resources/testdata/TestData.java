package resources.testdata;

import org.testng.annotations.DataProvider;

public class TestData {

    @DataProvider(name = "JobSearchData")
    public Object[][] createData() {

        return new Object[][] {
                { "Tester","Harrow","5","30000","500000","Per annum","Permanent","Permanent Tester jobs in Harrow" },
                { "Developer","London","2","25000","40000","Per month","Apprenticeship","Apprenticeship Developer jobs in London" },
                { "Frontend Developer","Hatfield","35","8000","10000","Per week","Contract","Contract Frontend Developer jobs in Hatfield" },
                { "Web Developer","Stevenage","50","8000","1000","Per day","Part Time","Part Time Web Developer jobs in Stevenage" },
                { "Web Designer","Leeds","25","100","150","Per hour","Permanent","Permanent Web Designer jobs in Leeds" },
                { "Test Analyst","Kent","15","30000","600000","Per annum","Temporary","Temporary Test Analyst jobs in Kent" },
                { "Test Manager","Scotland","1","28000","450000","Per annum","Contract","Contract Test Manager jobs in Scotland" },
        };
    }
}