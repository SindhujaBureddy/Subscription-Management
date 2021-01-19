package com.qa.pages;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentTest;
import com.qa.util.TestBase;

public class Subscriptionfunctions extends TestBase {
	@FindBy(xpath = "//li[@data-title='Lists']")
	WebElement Lists;
	@FindBy(xpath = "//li[@data-title='Relationships']")
	WebElement Relationships;
	@FindBy(xpath = "//li[@data-title='Customers']")
	WebElement Customers;
	@FindBy(xpath = "//li[@data-title='New']")
	WebElement New;
	@FindBy(xpath = "//input[@id='companyname']")
	WebElement company_name;
	@FindBy(xpath = "//td[@id='spn_multibutton_submitter']")
	WebElement customer_save;
	@FindBy(xpath = "//li[@data-title='Transactions']")
	WebElement Transcations;
	@FindBy(xpath = "//li[@data-title='Sales']")
	WebElement Sales;
	@FindBy(xpath = "//li[@data-title='Enter Sales Orders']")
	WebElement Enter_Sales_orders;
	@FindBy(xpath = "//span[@id='parent_actionbuttons_entity_fs']")
	WebElement customer_arrow;
	@FindBy(xpath = "//a[@id='entity_popup_list']")
	WebElement customer_list;
	@FindBy(xpath = "//input[@id='st']")
	WebElement customer_input;
	@FindBy(xpath = "//input[@id='Search']")
	WebElement search_button;
	@FindBy(xpath = "//div[@id='inner_popup_div']//table//tbody//tr//td//following-sibling::td//a")
	List<WebElement> customer_lists;
	@FindBy(xpath = "//input[@id='inpt_orderstatus2']")
	WebElement So_status;
	@FindBy(xpath = "//span[@id='parent_actionbuttons_item_item_fs']")
	WebElement Item_arrow;
	@FindBy(xpath = "//a[@id='item_popup_list']")
	WebElement item_search_button;
	@FindBy(xpath = "//input[@id='Search']")
	WebElement search;
	@FindBy(xpath = "//input[@id='st']")
	WebElement search_input;
	@FindBy(xpath = "//table//tr//td[@class='popupheadernosort']//following::tr//td[count(//table//tr//td[text()='Item'])+1]//a")
	List<WebElement> item_list;
	@FindBy(xpath = "//td[@id='tdbody_Search']")
	WebElement item_searching;
	@FindBy(xpath = "//div[@class='uir-machine-table-container']//table[@id='item_splits']//tbody//tr[@class='uir-machine-row uir-machine-row-odd listtextnonedit uir-machine-row-focused']//td[count(//td[@data-label='Quantity']//preceding-sibling::td)]")
	WebElement Item_click;
	@FindBy(xpath = "//a[@id='item_popup_link']")
	WebElement open_item;
	@FindBy(xpath = "//td[@id='tdbody_edit']")
	WebElement item_edit;
	@FindBy(xpath = "//td[@id='custom74lnk']")
	WebElement subscription_tab;
	@FindBy(xpath = "//input[@id='custitem_tss_free_trail_days_formattedValue']")
	WebElement free_trail_days;
	@FindBy(xpath = "//td[@id='spn_secondarymultibutton_submitter']")
	WebElement save_item;
	@FindBy(xpath = "//div[@class='uir-machine-table-container']//table[@id='item_splits']//tbody//tr[@class='uir-machine-row uir-machine-row-odd listtextnonedit uir-machine-row-focused']//td[count(//td[@data-label='Units']//preceding-sibling::td)]")
	WebElement quantity_click;
	@FindBy(xpath = "//table[@id='item_splits']//tbody//tr[@class='uir-machine-headerrow']//following-sibling::tr//td[count(//td[@data-label='Initial Charge Translation']//preceding-sibling::td)]")
	WebElement sub_id_in_sales_order;
	@FindBy(xpath = "//div[@class='uir-machine-table-container']//table[@id='item_splits']//tbody//tr[@class='uir-machine-row uir-machine-row-odd listtextnonedit uir-machine-row-focused']//td[count(//td[@data-label='License Code']//preceding-sibling::td)]")
	WebElement amount_click;
	@FindBy(xpath = "//input[@id='quantity_formattedValue']'")
	WebElement quantity_input;
	@FindBy(xpath = "//input[@id='item_item_display']")
	WebElement item_input;
	@FindBy(xpath = "//input[@id='amount_formattedValue']")
	WebElement amount_input;
	@FindBy(xpath = "//td[@id='spn_secondarymultibutton_submitter']")
	WebElement save_sales_order;
	@FindBy(xpath = "//div[@class='uir-machine-table-container']//table[@id='item_splits']//tbody//tr[@class='uir-machine-row uir-machine-row-odd listtextnonedit uir-machine-row-focused']//td[count(//td[@data-label='Initial Charge Translation']//preceding-sibling::td)]")
	WebElement subscription_associated;
	@FindBy(xpath = "//td[@id='cmmnctntablnk']")
	WebElement communication_tab;
	@FindBy(xpath = "//span[@id='fax_fs']//input[@id='fax' and @name='fax']")
	WebElement fax_number;
	@FindBy(xpath = "//img[@id='inpt_quicksort3_arrow']")
	WebElement sub_record_arrow;
	@FindBy(xpath = "//div[@class='dropdownDiv']//div")
	List<WebElement> sub_drop_down;
	@FindBy(xpath = "//table[@id='div__bodytab']//tbody//tr//following::tr//td[//td[@data-label='Internal ID']//preceding-sibling::td]//a[@class='dottedlink viewitem']")
	List<WebElement> view_sub_record;
	static String parentWindow=null;
	@FindBy(xpath = "//span[@id='custrecord_tss_start_date_fs_lbl_uir_label']//following-sibling::span")
	WebElement start_date;
	@FindBy(xpath = "//span[@id='custrecord_tss_next_bill_date_valid_fs_lbl_uir_label']//following-sibling::span")
	WebElement next_bill_date;
	@FindBy(xpath = "//span[@id='custrecord_tss_free_trail_enddate_fs_lbl_uir_label']//following-sibling::span")
	WebElement free_trail_end_date;
	@FindBy(xpath = "//span[@id='custrecord_tss_end_date_fs_lbl_uir_label']//following-sibling::span")
	WebElement end_date;
	@FindBy(xpath = "//span[@id='custrecord_subscription_type_sr_fs_lbl_uir_label']//following-sibling::span")
	WebElement subscription_type;
	@FindBy(xpath = "//span[@id='custrecord_tss_subrec_status_fs_lbl_uir_label']//following-sibling::span")
	WebElement s_status;
	@FindBy(xpath = "//span[@id='custrecord_tss_billing_item_fs_lbl_uir_label']//following-sibling::span")
	WebElement billing_item;
	@FindBy(xpath = "//span[@id='custrecord_tss_billing_frequency_sr_fs_lbl_uir_label']//following-sibling::span")
	WebElement billing_frequency;
	@FindBy(xpath = "//span[@id='custrecord_tss_customer_fs_lbl_uir_label']//following-sibling::span//a")
	WebElement s_customer;
	@FindBy(xpath = "//td[@id='custom73lnk']")
	WebElement subscription_event;
	@FindBy(xpath = "//table[@id='recmachcustrecord_tss_subscriptionevent__tab']//tbody//tr//td[count(//td[@data-label='Event Type']//preceding-sibling::td)]")
	List<WebElement> event_date;
	@FindBy(xpath = "//table[@id='recmachcustrecord_tss_subscriptionevent__tab']//tbody//tr//td[count(//td[@data-label='Event Date']//preceding-sibling::td)]//a")
	List<WebElement> related_id;
	@FindBy(xpath = "//table[@id='recmachcustrecord_tss_subscriptionevent__tab']//tbody//tr//td[count(//td[@data-label='Event Type']//preceding-sibling::td)+1]")
	List<WebElement> event_type;
	@FindBy(xpath = "//span[@id='custrecord_tss_related_transaction_fs_lbl_uir_label']//following-sibling::span")
	WebElement related_transcation;
	@FindBy(xpath = "//span[@id='custrecord_tss_subscriptionevent_fs_lbl_uir_label']//following-sibling::span")
	WebElement subcsription_event_relation;
	@FindBy(xpath = "//span[@id='name_fs_lbl_uir_label']//following-sibling::span")
	WebElement sub_id;
	@FindBy(xpath = "//td[@id='custom75lnk']")
	WebElement subcsription_tab_in_customer;
	@FindBy(xpath = "//span[@id='custentity_tss_subscriptn_roles_fs_lbl_uir_label']//following-sibling::span")
	WebElement customer_role;
	@FindBy(xpath = "//span[@id='custitem_tss_billing_frequen_fs_lbl_uir_label']//following-sibling::span")
	WebElement billing_frequency_in_item;
	@FindBy(xpath = "//span[@id='custitem_tss_subscription_type_fs_lbl_uir_label']//following-sibling::span")
	WebElement subscription_type_in_item_record;
	@FindBy(xpath = "//img[@id='inpt_custitem_tss_billing_frequen105_arrow']")
	WebElement m_q_a_arrow;
	@FindBy(xpath = "//div[@class='dropdownDiv']//div")
	List<WebElement> m_q_a_dropdown;
	@FindBy(xpath = "//td[@id='tdbody_custpage_btn_extendtrial']")
	WebElement extend_free_trail;
	@FindBy(xpath = "//input[@id='custpage_duration_formattedValue']")
	WebElement no_of_free_days;
	@FindBy(xpath = "//td[@id='tdbody_submitter']")
	WebElement extend_free_trail_save;
	@FindBy(xpath = "//td[@id='tdbody_edit']")
	WebElement subscription_edit;
	@FindBy(xpath = "//img[@id='inpt_custrecord_tss_subrec_status3_arrow']")
	WebElement sub_status_arrow;
	@FindBy(xpath = "//div[@class='dropdownDiv']//div")
	List<WebElement> sub_status_list;
	@FindBy(xpath = "//td[@id='spn_multibutton_submitter']")
	WebElement save_sub_record;
	@FindBy(xpath = "//td[@id='tdbody_custpage_btn_hold']")
	WebElement put_on_hold;
	@FindBy(xpath = "//textarea[@id='custpage_reason']")
	WebElement put_on_hold_reason;
	@FindBy(xpath = "//input[@id='custpage_holdmonths_formattedValue']")
	WebElement no_of_months_to_hod_for;
	@FindBy(xpath = "//td[@id='tdbody_submitter']")
	WebElement hold_sub_button;
	@FindBy(xpath = "//span[@id='custrecord_tss_subscription_hold_count_fs_lbl_uir_label']//following-sibling::span")
	WebElement sub_hold_count;
	@FindBy(xpath = "//span[@id='custrecord_tss_notes_fs_lbl_uir_label']//following-sibling::span")
	WebElement hold_notes;
	@FindBy(xpath = "//span[@id='custrecord_tss_event_type_fs_lbl_uir_label']//following-sibling::span")
	WebElement hold_event_type;
	@FindBy(xpath = "//textarea[@id='custpage_reason']")
	WebElement cancellation_reason;
	@FindBy(xpath = "//input[@id='custpage_canceldate']")
	WebElement cancellaton_date;
	@FindBy(xpath = "//td[@id='tdbody_custpage_btn_cancel']")
	WebElement cancel_button;
	@FindBy(xpath = "//td[@id='tdbody_submitter']")
	WebElement cancel_sub_button;
	@FindBy(xpath = "//span[@id='custpage_warning_fs']")
	WebElement warning_message;//Cannot provide another hold
	@FindBy(xpath = "//span[@id='custrecord_tss_event_type_fs_lbl_uir_label']//following-sibling::span")
	WebElement event_type_in_child_record;
	@FindBy(xpath = "//td[@id='tdbody_edit']")
	WebElement script_edit;
	@FindBy(xpath = "//img[@class='multiBntTri']")
	WebElement script_arrow;
	@FindBy(xpath = "//table[@id='div__bodytab']//tbody//tr//following-sibling::tr//td[count(//td[@data-label='ID']//preceding-sibling::td)+1]")
	List<WebElement> subscription_ids;
	@FindBy(xpath = "//td[@id='nl3']")
	WebElement save_and_execute;
	String billing_freq=null;
	String sub_type_in_item=null;
	String next_date=null;
	String next_date1=null;
	String sub_id_in_s=null;
	Actions action=new Actions(driver);
	public Subscriptionfunctions()
	{
		PageFactory.initElements(driver, this);
	}
	public String date_fun(int days_add) throws ParseException
	{
		SimpleDateFormat df = new SimpleDateFormat("MM/dd/yyyy");
		String formatted = df.format(new Date());
		String dt = "2008-01-01";  // Start date
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		Calendar c=Calendar.getInstance();
		c.setTime(sdf.parse(formatted)); 
		c.add(Calendar.DATE, days_add);
		 next_date=sdf.format(c.getTime());
		 return next_date;
	}
	public void create_customer(String customer) throws InterruptedException
	{
		action.moveToElement(Lists).build().perform();
		Thread.sleep(2000);
		action.moveToElement(Relationships).build().perform();
		Thread.sleep(2000);
		action.moveToElement(Customers).build().perform();
		Thread.sleep(2000);
		action.moveToElement(New).build().perform();
		New.click();
		company_name.sendKeys(customer.trim());
		Thread.sleep(1000);
		customer_save.click();
	}
	public static void windowHandle() throws Exception {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String currentwindow = driver.getWindowHandle();
		parentWindow = currentwindow;
		Set<String> allWindows = driver.getWindowHandles();
		Iterator<String> i = allWindows.iterator();
		while (i.hasNext()) {
			String childwindow = i.next();
			if (!childwindow.equalsIgnoreCase(currentwindow)) {
				driver.switchTo().window(childwindow);
			}
		}
	}
	public void create_so(String customer,String itemname,String testcase,String subscription,String free_trail_days1,ExtentTest test) throws Exception
	{
		action.moveToElement(Transcations).build().perform();
		Thread.sleep(2000);
		action.moveToElement(Sales).build().perform();
		Thread.sleep(2000);
		action.moveToElement(Enter_Sales_orders).build().perform();
		Thread.sleep(2000);
		Enter_Sales_orders.click();
		WebDriverWait wait=new WebDriverWait(driver,50);
		wait.until(ExpectedConditions.visibilityOf(customer_arrow));
		Thread.sleep(10000);
		action.moveToElement(customer_arrow).build().perform();
//		JavascriptExecutor executor = (JavascriptExecutor)driver;
//		executor.executeScript("arguments[0].click();", customer_arrow);
		customer_arrow.click();
		customer_list.click();
		customer_input.sendKeys(customer.trim());
		search_button.click();
		Thread.sleep(5000);
		for(int i=0;i<customer_lists.size();i++)
		{
			WebElement cust=customer_lists.get(i);
			if(cust.getText().trim().equals(customer.trim()))
			{
				cust.click();
				break;
			}
		}
		Thread.sleep(10000);
		So_status.click();
		So_status.sendKeys("Pending Fulfillment");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", Item_click);
		Item_click.click();
		Item_arrow.click();
		item_search_button.click();
		search.click();
		search_input.sendKeys(itemname);
		item_searching.click();
		Thread.sleep(10000);
		for(int i=0;i<item_list.size();i++)
		{
			item_list.get(0).click();
			break;
		}
		quantity_click.click();
		Item_click.click();
		action.moveToElement(Item_arrow).build().perform();
		open_item.click();
		windowHandle();
		item_edit.click();
		//js.executeScript("arguments[0].scrollIntoView();",subscription_tab );
		subscription_tab.click();
		free_trail_days.clear();
		free_trail_days.sendKeys(free_trail_days1.trim());
		m_q_a_arrow.click();
		for(int i=0;i<m_q_a_dropdown.size();i++)
		{
			WebElement sub=m_q_a_dropdown.get(i);
			if(sub.getText().trim().equals(subscription.trim()))
			{
				sub.click();
				break;
			}
		}
		save_item.click();
		subscription_tab.click();
		billing_freq=billing_frequency_in_item.getText().trim();
		sub_type_in_item=subscription_type_in_item_record.getText().trim();
		driver.close();
		driver.switchTo().window(parentWindow);
	    js.executeScript("window.scrollBy(0,-250)", "");
		communication_tab.click();
		fax_number.sendKeys("12345678");
		wait.until(ExpectedConditions.visibilityOf(save_sales_order));
		save_sales_order.click();	
		sub_id_in_s=sub_id_in_sales_order.getText().trim();
		System.out.println("Subscription id in sales order is: "+sub_id_in_s);
		
		
	}
	public void sub_record(String customer,String itemname,String testcase,String free_trail_days1,ExtentTest test) throws Exception
	{
		test.pass("Subscription id in sales order is :"+sub_id_in_s);
		driver.navigate().to("https://tstdrv939178.app.netsuite.com/app/common/custom/custrecordentrylist.nl?rectype=294");
		String relid=null;
		SimpleDateFormat df = new SimpleDateFormat("MM/dd/yyyy");
		String formatted = df.format(new Date());
		
		if(testcase.trim().equals("Subscription Cancellation")||testcase.trim().equals("Subscription Put On Hold functionality"))
		{
			sub_record_arrow.click();
			for(int i=0;i<sub_drop_down.size();i++)
			{
				WebElement sub=sub_drop_down.get(i);
				if(sub.getText().trim().equals("Recently Created"))
				{
					Thread.sleep(2000);
					sub.click();
					break;
				}
			}
			view_sub_record.get(0).click();
			//https://tstdrv939178.app.netsuite.com/app/common/scripting/scriptrecord.nl?id=1476
			if(testcase.trim().equals("Subscription Put On Hold functionality"))
			{
				for(int i=0;i<3;i++)
				{
				subscription_edit.click();
				sub_status_arrow.click();
				for(int j=0;j<sub_status_list.size();j++)
				{
					WebElement stat=sub_status_list.get(j);
					if(stat.getText().trim().equals("Billing"))
					{
						stat.click();
						break;
					}
							
				}
				save_sub_record.click();
				put_on_hold.click();
				if(i==2)
				{
					Thread.sleep(5000);
					windowHandle();
					if(warning_message.getText().trim().equals("Cannot provide another hold"))
					{
						ExtentTest test1=test.createNode("Providing Hold after Maximum time");
						System.out.println("Warning message is displayed: "+warning_message.getText());
						test1.pass("Warning message is displaying when we provide Hold greater than maximum count "+warning_message.getText());
					}
				break;
				}
			    Thread.sleep(5000);
				ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
			    driver.switchTo().window(tabs.get(1));
				put_on_hold_reason.sendKeys("puttinng on hold"+i);
				Thread.sleep(2000);
				no_of_months_to_hod_for.sendKeys("1");
				hold_sub_button.click();
				driver.switchTo().window(tabs.get(0));
				System.out.println("Hold count is: "+sub_hold_count.getText().trim());
				System.out.println("Subscription Status is: "+s_status.getText().trim());
				subscription_event.click();
				Thread.sleep(2000);
				String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
					for(int k=0;k<event_type.size();k++)
					{
						WebElement event=event_type.get(k);
						if(event.getText().trim().equals("Place on Hold"))
						{
							if(i==0)
							{
								related_id.get(k).sendKeys(selectLinkOpeninNewTab);
							}
							if(i==1)
							{
								related_id.get(k+1).sendKeys(selectLinkOpeninNewTab);
							}
							windowHandle();
							String notes=hold_notes.getText();
							if(i==0)
							{
							ExtentTest test2=test.createNode("Providing Hold for First Time");
							test2.pass("When we Provide Hold for First time "+"<br/>"+" Hold Notes is: "+notes+"<br/>"+"Event Type is: "+event_type_in_child_record.getText().trim()+"<br/>"+"Subscription event relation is "+subcsription_event_relation.getText());
							System.out.println("Hold Notes is : "+notes);
							System.out.println("Event Type is: "+event_type_in_child_record.getText().trim());
							System.out.println("Subscription event relation is "+subcsription_event_relation.getText());
							}
							if(i==1)
							{
								ExtentTest test3=test.createNode("Providing Hold for Second Time");
								test3.pass("When we Provide Hold for second time "+"<br/>"+" Hold Notes is: "+notes+"<br/>"+"Event Type is: "+event_type_in_child_record.getText().trim()+"<br/>"+"Subscription event relation is "+subcsription_event_relation.getText());
								System.out.println("Hold Notes is : "+notes);
								System.out.println("Event Type is: "+event_type_in_child_record.getText().trim());
								System.out.println("Subscription event relation is "+subcsription_event_relation.getText());
							}
							driver.close();
							driver.switchTo().window(parentWindow);
							JavascriptExecutor js = (JavascriptExecutor) driver;
							js.executeScript("window.scrollTo(0, 0)");
							break;
						}
					}
				}
				
					
				
				
			
		}
			if(testcase.trim().equals("Subscription Cancellation"))
			{
				String url1=driver.getCurrentUrl();
				cancel_button.click();
				Thread.sleep(5000);
				windowHandle();
				cancellation_reason.sendKeys("Not Interested");
				Thread.sleep(2000);
				cancellaton_date.clear();
				cancellaton_date.sendKeys(formatted);
				cancel_sub_button.click();
				Thread.sleep(1000);
				driver.switchTo().window(parentWindow);
				driver.navigate().to("https://tstdrv939178.app.netsuite.com/app/common/scripting/scriptrecord.nl?id=1476");
				script_edit.click();
				Thread.sleep(2000);
				action.moveToElement(script_arrow).build().perform();
				Thread.sleep(2000);
				save_and_execute.click();
				Thread.sleep(2000);
				driver.navigate().refresh();
				driver.navigate().refresh();
				driver.navigate().refresh();
				driver.navigate().refresh();
				driver.navigate().to(url1);
				System.out.println("Now the status after cancellation of subscription is: "+s_status.getText());
				test.pass("Status after cancellation of subscription is: "+s_status.getText());
				System.out.println("End date is today's date : "+end_date.getText());
				test.pass("End date is today's date : "+end_date.getText());
				String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
				s_customer.sendKeys(selectLinkOpeninNewTab);
				windowHandle();
				subcsription_tab_in_customer.click();
				String cust_role=customer_role.getText();
				System.out.println("Customer role after cancelling subscription is: "+cust_role);
				test.pass("Customer role after cancelling subscription is: "+cust_role);
				driver.switchTo().window(parentWindow);
				subscription_event.click();
				for(int i=0;i<event_type.size();i++)
				{
					WebElement ele=event_type.get(i);
					if(ele.getText().equals("Other"))
					{
						WebElement date=event_date.get(i);
						String datee=date.getText();
						test.pass("Event date for cancellation is today: "+datee);
						test.pass("Event type for cancellation is: "+ele.getText());
						break;
					}
				}
				
				
			}
		}
		else
		{
		String start_d=null;
		String next_bill_d=null;
		String free_trail_end_d=null;
		String end_d=null;
		String billing_f=null;
		String billing_itemm=null;
		String sub_customer=null;
		String sub_type=null;
		String sub_status=null;
		String subscription_id=null;
		String cust_role=null;
		sub_record_arrow.click();
		for(int i=0;i<sub_drop_down.size();i++)
		{
			WebElement sub=sub_drop_down.get(i);
			if(sub.getText().trim().equals("Recently Created"))
			{
				sub.click();
				break;
			}
		}
		int f_t_d=Integer.parseInt(free_trail_days1.trim());
		String sub_ids="SUBSCR"+sub_id_in_s.trim();
		System.out.println("subscription id is: "+sub_ids);
		for(int i=0;i<subscription_ids.size();i++)
		{
			WebElement sub_id=subscription_ids.get(i);
			if(sub_id.getText().trim().equals(sub_ids))
			{
				view_sub_record.get(i).click();
				break;
			}
		}
		System.out.println("Subscription record details");
		System.out.println("Todays date is "+formatted);
		String dt = "2008-01-01";  // Start date
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		Calendar c1=Calendar.getInstance();
		c1.setTime(sdf.parse(formatted)); 
		c1.add(Calendar.DATE, 1);
		String tomorro_date=sdf.format(c1.getTime());
		Calendar c2=Calendar.getInstance();
		c2.setTime(sdf.parse(formatted)); 
		c2.add(Calendar.DATE, f_t_d+1);
		String after_free_trail_date=sdf.format(c2.getTime());
		Calendar c = Calendar.getInstance();
		c.setTime(sdf.parse(formatted)); 
		if(testcase.trim().equals("subscription purchase with free trial for a new customer"))
		{
			c.add(Calendar.DATE, f_t_d);  // number of days to add
		}
		else
		{
		c.add(Calendar.DATE, 1); 
		}
		// number of days to add
		dt = sdf.format(c.getTime()); 
		start_d=start_date.getText().trim();
		next_bill_d=next_bill_date.getText().trim();
		free_trail_end_d=free_trail_end_date.getText().trim();
		end_d=end_date.getText().trim();
		billing_f=billing_frequency.getText().trim();
		billing_itemm=billing_item.getText().trim();
		sub_customer=s_customer.getText().trim();
		sub_type=subscription_type.getText().trim();
		sub_status=s_status.getText().trim();
		if(start_date.getText().trim().equals(formatted))
		{
			System.out.println("Start date is :"+start_d);
			test.pass("Start date is today's date: "+start_d);
		}
		if(next_bill_date.getText().trim().equals(tomorro_date))
		{
			test.pass("Next bill date is today's date: "+next_bill_d);
			System.out.println("Next bill date is today's date: "+next_bill_d);
		}
		if(testcase.trim().equals("subscription purchase with free trial for a new customer"))
		{
			System.out.println("after free trail date "+after_free_trail_date);
			System.out.println("next bill date is "+next_bill_d);
			if(next_bill_date.getText().trim().equals(after_free_trail_date.replace("/0", "/")))
			{
				test.pass("Next bill date is after free trail date + 1 day: "+next_bill_d);
				System.out.println("Next bill date is : "+next_bill_d);
			}
			if(free_trail_end_d.equals(dt.replace("/0", "/")))
			{
				test.pass("Free trail end date is after "+free_trail_days1+" days : "+dt);
				System.out.println("Free trail end date is after "+free_trail_days1+" days : "+dt);
			}
		}
		if(free_trail_end_date.getText().trim().equals(formatted))
		{
			test.pass("Free trail End date is today: "+free_trail_end_d);
			System.out.println("Free trail end date is today");
		}
		if(end_date.getText().trim().equals(""))
		{
			test.pass("End date is null");
			System.out.println("End Date is null");
		}
		if(billing_frequency.getText().trim().equals(billing_freq))
		{
			test.pass("Billing frequency in item record is: "+billing_frequency.getText()+"<br/>"+" Billing frequency in subscription record is: "+billing_freq+"<br/>"+" So, Test case is Verified");
			System.out.println("Billing frequency in item record and in subscription record is same: "+billing_freq);
		}
		if(itemname.trim().equals(billing_item.getText().trim()))
		{
			test.pass("Billing Item is: "+billing_itemm+"<br/>"+" Purchases Item is :"+itemname.trim()+"<br/>"+" So, testcase is verified");
			System.out.println("Billing item is the purchased item: "+billing_item.getText());
		}
		if(customer.trim().equals(s_customer.getText().trim()))
		{
			test.pass("Billing customer is: "+s_customer.getText()+"<br/>"+"Purchased customer is: "+customer.trim()+" So, testcase is verified");
			System.out.println("Billing customer is the purchased customer: "+s_customer.getText());
		}
		if(subscription_type.getText().trim().equals(sub_type_in_item))
		{
			test.pass("Subcription type in item record is: "+sub_type_in_item+"<br/>"+" Subscription type in the subscription record is: "+subscription_type.getText()+"<br/>"+"So, Testcase is verified");
			System.out.println("Subscription type is same in item and sub record: "+sub_type_in_item);
		}
		if(s_status.getText().trim().equals("New/Free Trial"))
		{
			test.pass("Subscription Status is: "+s_status.getText());
			System.out.println("Subscription status is verified: "+s_status.getText());
		}
		subscription_id=sub_id.getText();
		subscription_event.click();
		if(event_date.get(0).getText().trim().equals(formatted))
		{
			test.pass("Subscription event date is today's date: "+event_date.get(0).getText());
			System.out.println("Subscription event date is today");
		}
		System.out.println("Event type is: "+event_type.get(0).getText());
		test.pass("Subscription Event type is: "+event_type.get(0).getText());
		String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
		related_id.get(0).sendKeys(selectLinkOpeninNewTab);
		windowHandle();
		String related_t=related_transcation.getText();
		String sub_event_rel=subcsription_event_relation.getText().trim();
		System.out.println("related transaction is: "+related_transcation.getText());
		test.pass("Realted Transcation is: "+related_transcation.getText());
		if(subscription_id.trim().equals(subcsription_event_relation.getText().trim()))
		{
			System.out.println("subscription event relation is equaal to parent subscription id: "+subcsription_event_relation.getText());
			test.pass("Subscription id in Subscription Record is: "+subscription_id+"<br/>"+"Subscription event relation is: "+subcsription_event_relation.getText()+"<br/>"+" So,Test case is verified");
		}
		driver.close();
		driver.switchTo().window(parentWindow);
		s_customer.sendKeys(selectLinkOpeninNewTab);
		windowHandle();
		subcsription_tab_in_customer.click();
		 cust_role=customer_role.getText();
		System.out.println("customer role is: "+cust_role);
		if(testcase.trim().equals("Subscription Free Trial Extension"))
		{
		driver.close();
		driver.switchTo().window(parentWindow);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, 0)");
		extend_free_trail.click();
		Thread.sleep(5000);
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs.get(1));
		int no_of_days=f_t_d+1;
		String nfd=String.valueOf(no_of_days);
		no_of_free_days.sendKeys(nfd);
		extend_free_trail_save.click();
	    driver.switchTo().window(tabs.get(0));
		free_trail_end_d=free_trail_end_date.getText();
		next_date1=date_fun(no_of_days);
		next_bill_d=next_bill_date.getText();
		String next_bill=date_fun(no_of_days+1);
		System.out.println("free trail next is: "+next_date1);
		System.out.println("next bill from date is: "+next_bill);
		System.out.println("free trail end date after extension is: "+free_trail_end_d);
		System.out.println("next bill date after extension is: "+next_bill_d);
		if(next_date1.equals(free_trail_end_d.trim()))
		{
			test.pass("Free Trail end date after extension is: "+free_trail_end_d);
			System.out.println("Free Trail end date is verified");
		}
		if(next_bill.equals(next_bill_d))
		{
			test.pass("Next bill date after extension is :"+next_bill_d);
			System.out.println("Next bill date is verified");
		}
		}
		
		
	}
	}
	
	
	
	
}

