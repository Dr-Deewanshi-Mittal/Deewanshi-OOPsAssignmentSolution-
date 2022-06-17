
public class Driver{

	public static void main(String[] args){

			//creating objects of 3 departments
			HrDepartment hr=new HrDepartment();
			TechDepartment tech= new TechDepartment();
			AdminDepartment admin= new AdminDepartment();

			//printing out functions of Admin Department
			System.out.println(admin.departmentName());
			System.out.println(admin.getTodaysWork());
			System.out.println(admin.getWorkDeadline());
			System.out.println(admin.isTodayAHoliday());
			System.out.println(" ");
			
			//printing out functions of Hr Department
			System.out.println(hr.departmentName());
			System.out.println(hr.doActivity());
			System.out.println(hr.getTodaysWork());
			System.out.println(hr.getWorkDeadline());
			System.out.println(hr.isTodayAHoliday());					
			System.out.println(" ");
			
	     	//printing out functions of Tech Department
			System.out.println(tech.departmentName());
			System.out.println(tech.getTodaysWork());			
			System.out.println(tech.getWorkDeadline());
			System.out.println(tech.getTechStackInformation());
			System.out.println(tech.isTodayAHoliday());
			System.out.println(" ");		
			
		}		

}
