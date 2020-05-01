import java.util.HashMap;
import java.util.Map;
import java.util.*;
import java.util.Map.Entry;

public class Sample {
	
	public static void main(String[] args) {
		
	//Student 1
			Student s1 = new Student();
			s1.setStdId(1234);
			s1.setStdName("Alpha");
			s1.setStdPhone(987654362l);
			s1.setAddress("Chennai");
			s1.setdOB("17-08-1994");
			s1.setEmail("alpha@gmail.com");
			s1.setGender('M');
		
	//Student 2
			Student s2 = new Student();
			s2.setStdId(2234);
			s2.setStdName("Omega");
			s2.setStdPhone(887654362l);
			s2.setAddress("Delhi");
			s2.setdOB("07-07-1990");
			s2.setEmail("omega@gmail.com");
			s2.setGender('F');
			
		Map<Integer, Student> mi = new HashMap <Integer, Student>();
				
				mi.put(1, s1);
				mi.put(2, s2);
			
			Set<Entry<Integer, Student>> e = mi.entrySet();
								
				for(Entry<Integer, Student> x : e) {
					Student std = x.getValue();
					int stdId = std.getStdId();
					String stdName = std.getStdName();
					
					System.out.println(stdId);
					System.out.println(stdName);		
			}
		}
	}
		
//Scanner si = new Scanner(System.in);
//System.out.println("Enter Details of Student " );
//int stdId = si.nextInt();
//System.out.println("Student Id" + stdId);
//String stdName = si.nextLine();
//long stdPhone = si.nextLong();
//String address = si.nextLine();
//String dOB = si.nextLine();
//String email = si.nextLine();
//char gender = si.next().charAt(0);

