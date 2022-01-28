package com.pack.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pack.model.BankDetails;


@Repository
public interface BankRepository extends JpaRepository<BankDetails, Integer>
{

	/*@Query("insert into bank_details values  (last_insert_id(),:bank_name,:branch_name,:IFSC,:acc_no,:acc_currency)")
	BankDetails addBank(@Param("bank_name")String bank_name,
			                               @Param("branch_name")String branch_name,
			                               @Param("IFSC")String IFSC,
			                               @Param("acc_no")String acc_no,
			                               @Param("acc_currency")String acc_currency);*/
	
	
}
