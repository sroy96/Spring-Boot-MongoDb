package school.com.school;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.data.mongodb.core.MongoOperations;
//import org.springframework.data.mongodb.core.query.Criteria;
//import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import school.com.school.DAO.SchoolDAO;
import school.com.school.Repository.SchoolRepository;

import java.util.ArrayList;
import java.util.List;


@SpringBootApplication
public class SchoolApplication extends  SchoolDAO implements CommandLineRunner {

	@Autowired
	SchoolRepository schoolRepository;

	public static void main(String[] args) {
		SpringApplication.run(SchoolApplication.class, args);
	}


	@Override
	public void run(String... strings) throws Exception {

		//System.out.println(schoolRepository.findAll());
//		SchoolDAO s1=new SchoolDAO("2","gaurav","X",5546);
//		List<SchoolDAO> schoolDAOList=new ArrayList<>();
//		schoolDAOList.add(s1);
//		schoolRepository.saveAll(schoolDAOList);
////		schoolRepository.findByName("saurav");
//		System.out.print(schoolRepository.findAll());
//		Query query = new Query();
//		query.addCriteria(Criteria.where("name").is("saurav"));
//
//		SchoolDAO s= mongoOperations.findOne(query, SchoolApplication.class);
//
//		s.setStandard("XII");
//		mongoOperations.save(s);
//		System.out.print(schoolRepository.findAll());
//	List<SchoolDAO> schoolDAOList=mongoOperations.findAll(SchoolDAO.class);
//	System.out.print(schoolDAOList);
//
//
//
		SchoolDAO it=  schoolRepository.findByName("aman");

			System.out.println(it.getId()+" "+it.getRoll()+" "+it.getName()+" "+it.getStandard()+" "+it.getFees());



	}
}


