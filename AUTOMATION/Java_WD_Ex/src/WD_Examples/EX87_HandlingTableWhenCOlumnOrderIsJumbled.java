package WD_Examples;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX87_HandlingTableWhenCOlumnOrderIsJumbled {
	public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("URL_OF_YOUR_TABLE"); //see the html code below --- copy and paste into notepad and execute the prog

        // Locate table
        WebElement table = driver.findElement(By.id("empTable"));

        // Step 1: Read all header columns & store their positions
        List<WebElement> headers = table.findElements(By.xpath(".//thead//th"));

        Map<String, Integer> columnIndex = new HashMap<>();

        for (int i = 0; i < headers.size(); i++) {
            String colName = headers.get(i).getText().trim();
            columnIndex.put(colName, i + 1);  // store column index (1-based)
        }

        // Print column mapping
        System.out.println("Column Index Mapping: " + columnIndex);

        // Step 2: Read all rows
        List<WebElement> rows = table.findElements(By.xpath(".//tbody//tr"));

        for (WebElement row : rows) {

            // Example: Read value from "Name" column
            int nameColIdx = columnIndex.get("Name");

            String name = row.findElement(By.xpath("./td[" + nameColIdx + "]")).getText();

            // Example: Read value from "Department"
            int depColIdx = columnIndex.get("Department");

            String department = row.findElement(By.xpath("./td[" + depColIdx + "]")).getText();

            System.out.println("Name: " + name + " | Department: " + department);
        }

        driver.quit();
    }
}

/*/html code
<table id="empTable">
<thead>
   <tr>
      <th>Age</th>
      <th>Name</th>
      <th>Department</th>
   </tr>
</thead>

<tbody>
   <tr>
      <td>28</td>
      <td>John</td>
      <td>Sales</td>
   </tr>
   <tr>
      <td>34</td>
      <td>Alice</td>
      <td>HR</td>
   </tr>
</tbody>
</table> 

/*/