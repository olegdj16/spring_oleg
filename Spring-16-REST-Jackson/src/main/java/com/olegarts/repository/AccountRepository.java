package com.olegarts.repository;

import com.olegarts.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {

//    // ------------------- DERIVED QUERIES ------------------- //
//
//    //Write a derived query to list all accounts with a specific country or state
//    List<Account> findAllByCountryOrState(String country,String state);
//
//    //Write a derived query to list all accounts with age lower than or equal to a specific value
//    List<Account> findAllByAgeLessThanEqual(Integer age);
//
//    //Write a derived query to list all accounts with a specific role
//    List<Account> findAllByRole(UserRole role);
//
//    //Write a derived query to list all accounts between a range of ages
//    List<Account> findAllByAgeBetween(Integer age1,Integer age2);
//
//    //Write a derived query to list all accounts where the beginning of the address contains the keyword
//    List<Account> findByAddressStartingWith(String address);
//
//    //Write a derived query to sort the list of accounts with age
//    List<Account> findByOrderByAgeDesc();
//
//    // ------------------- JPQL QUERIES ------------------- //
//
//    //Write a JPQL query that returns all accounts
//    @Query("SELECT a FROM Account a ")
//    List<Account> fetchAllJPQL();
//
//    //Write a JPQL query to list all admin accounts
//    @Query("SELECT a FROM Account a WHERE a.role ='USER'")
//    List<Account> fetchAdminUsers();
//
//    //Write a JPQL query to sort all accounts with age
//    @Query("SELECT a FROM Account a ORDER BY a.age desc ")
//    List<Account> orderWithAgeJPQL();
//
//    // ------------------- Native QUERIES ------------------- //
//
//    //Write a native query to read all accounts with an age lower than a specific value
//    @Query(value = "SELECT * FROM account_details WHERE age < ?1",nativeQuery = true)
//    List<Account>  retrieveAllByAgeLowerThan(Integer age);
//
//    //Write a native query to read all accounts that a specific value can be containable in the name, address, country, state city
//    @Query(value = "SELECT * FROM account_details WHERE name ILIKE concat('%',?1,'%') OR country ILIKE concat('%',?1,'%') OR address ILIKE concat('%',?1,'%') OR state ILIKE concat('%',?1,'%')",nativeQuery = true)
//    List<Account> retrieveBySearchCriteria(String pattern);
//
//    //Write a native query to read all accounts with an age lower than a specific value
//    @Query(value = "SELECT * FROM account_details WHERE age>?1",nativeQuery = true)
//    List<Account> retrieveLessThanAge(int age);

}
