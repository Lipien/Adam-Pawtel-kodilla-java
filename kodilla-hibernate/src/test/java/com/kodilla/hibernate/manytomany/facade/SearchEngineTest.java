package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class SearchEngineTest {
    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;
    @Autowired
    private SearchEngine searchEngine;

    @Test
    public void companySearch() {
        //Given
        Company company1 = new Company("Sharp");
        Company company2 = new Company("Samsung");
        Company company3 = new Company("Nokia");

        companyDao.save(company1);
        companyDao.save(company2);
        companyDao.save(company3);

        //When
        List <Company> companySearchByAnyPartOfName = searchEngine.companySearch("ams");

        //Then
        Assert.assertEquals(1, companySearchByAnyPartOfName.size());
    }

    @Test
    public void employeeSearch() {
        //Given
        Employee employee1 = new Employee("John", "Kowalski");
        Employee employee2 = new Employee("Jan", "Nowak");
        Employee employee3 = new Employee("John", "Smith");

        employeeDao.save(employee1);
        employeeDao.save(employee2);
        employeeDao.save(employee3);

        //When
        List <Employee> employeeSearchByAnyPartOfLastname = searchEngine.employeeSearch("mit");

        //Then
        Assert.assertEquals(1, employeeSearchByAnyPartOfLastname.size());
    }
}
