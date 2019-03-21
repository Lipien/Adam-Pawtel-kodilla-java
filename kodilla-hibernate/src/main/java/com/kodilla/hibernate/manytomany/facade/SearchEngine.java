package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public final class SearchEngine {
    @Autowired
    private EmployeeDao employee;
    @Autowired
    private CompanyDao company;

    public List <Employee> employeeSearch(final String name) {
        return employee.retrieveEmployeeByAnyPartOfLastname(name);
    }

    public List <Company> companySearch(final String name) {
        return company.retrieveCompanyByAnyPartOfName(name);
    }

    @Override
    public String toString() {
        return "SearchEngine{" +
                "employee=" + employee +
                ", company=" + company +
                '}';
    }
}
