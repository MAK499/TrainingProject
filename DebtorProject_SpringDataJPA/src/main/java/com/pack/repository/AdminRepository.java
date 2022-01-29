package com.pack.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.pack.model.TransactionDetails;


@Repository
public interface AdminRepository extends JpaRepository<TransactionDetails, Integer>
{
	
@Modifying()	
@Query
(value = "update TransactionDetails set status= :status,transaction_info=:transaction_info,transaction_date=:transaction_date where debtor_id=:debtor_id")
@Transactional
void authorize(@Param("status")String status,
		                   @Param("transaction_info")String transaction_info,
		                   @Param("transaction_date")String transaction_date,
		                   @Param("debtor_id")int debtor_id);
}
