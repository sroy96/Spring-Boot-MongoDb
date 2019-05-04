package school.com.school.Controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.web.bind.annotation.*;
import school.com.school.DAO.SchoolDAO;
import school.com.school.Repository.SchoolRepository;

import java.util.List;


@RestController
@RequestMapping("/school")
public class controller {

    @Autowired
    SchoolRepository schoolRepository;

    @Autowired
    MongoOperations mongoOperations;

    public controller(SchoolRepository schoolRepository){
        this.schoolRepository=schoolRepository;
    }

    @GetMapping("/all")
    public List<SchoolDAO> userList(){
        return schoolRepository.findAll();
    }

    @GetMapping("/{roll}")
public SchoolDAO getroll(@PathVariable String roll){

        return schoolRepository.findByRoll(roll);
    }
    int f,g;
    @RequestMapping(method = RequestMethod.POST,value = "/new")
    public SchoolDAO addnew(@RequestBody SchoolDAO schoolDAO){
      return schoolRepository.save(schoolDAO);

    }

//EXPERIMENTAL ... IGNORE THIS.
    @RequestMapping(method =RequestMethod.POST,value = "/check")
    public void change(@RequestBody SchoolDAO schoolDAO){
        schoolRepository.save(schoolDAO);
        g= schoolDAO.getFees();
        f=(int)(g/schoolRepository.count());
        List<SchoolDAO>schoolDAOList=schoolRepository.findAll();
        for (SchoolDAO it:schoolDAOList){
            System.out.println("Testing"+it);
            it.setFees(it.getFees()+f);
        schoolRepository.saveAll(schoolDAOList);
        }

    }




    @RequestMapping(method = RequestMethod.PUT,value = "/change/{roll}")
    public SchoolDAO update(@RequestBody SchoolDAO schoolDAO,@PathVariable String roll){
        schoolRepository.findByRoll(roll);
        return schoolRepository.save(schoolDAO);
    }
    @RequestMapping(method = RequestMethod.DELETE,value = "/delete/{roll}")
    public  SchoolDAO delete(@PathVariable String roll){
        return  schoolRepository.deleteByRoll(roll);

    }
    @RequestMapping(method = RequestMethod.DELETE,value = "/delete")
    public void deleteall(){
         schoolRepository.deleteAll();
    }

}
