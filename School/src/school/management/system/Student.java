package school.management.system;


/*
 * This class is responsible for keeping track 
 * of the student fee, name ,grade, fees paid
 * 
 */
public class Student {
	
	private int id;
	private String name;
	private int feePaid;
	private int grade;
	private int feesTotal;
	
	/*role of constructor is to create a new student object by intilizing the values
	 * 
	 * 
	*/
	public Student(int id,String name,int grade) {
		
		this.id = id;
		this.name= name;
		this.grade= grade;
		this.feePaid=0;
		this.feesTotal= 10000;
				
		
		
	}
	
	public void setGrade(int grade) {
		
		this.grade=grade;
	}
	public void payFees(int fees) {
		
		feePaid+=fees;
		School.updateTotalMoneyEarned(feePaid);
		
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getFeePaid() {
		return feePaid;
	}

	public int getGrade() {
		return grade;
	}

	public int getFeesTotal() {
		return feesTotal;
	}
	public int getRemainingFee() {
		
		return feesTotal-feePaid;
	}
}
