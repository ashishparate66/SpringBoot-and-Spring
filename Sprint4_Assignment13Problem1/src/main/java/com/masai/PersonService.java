package com.masai;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.stereotype.Service;

@Service
public class PersonService {

   
	private Map<Person, Skill> skillMap;
   
	private List<Person> personList;
	
	
	public Map<Person, Skill> getSkillMap() {
		return skillMap;
	}

	public void setSkillMap(Map<Person, Skill> skillMap) {
		this.skillMap = skillMap;
	}

	public List<Person> getPersonList() {
		return personList;
	}

	public void setPersonList(List<Person> personList) {
		this.personList = personList;
	}

	public void printSkillMap(){
		System.out.println("skill in Map");
		for(Entry<Person, Skill> entry : skillMap.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}

	}

	public void printPersonList(){
		System.out.println("person in ArrayList");
		personList.forEach(System.out::println);
		
	}

}
