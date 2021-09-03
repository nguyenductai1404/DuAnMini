package com.test.dao;



import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.test.entity.OrderDetail;



public interface OrderDetailDAO extends JpaRepository<OrderDetail, Long>{

	
//	@Query("SELECT new Reportdetail(d.order.id, sum(d.price * d.quantity), sum(d.quantity)) FROM Orderdetail d GROUP BY d.order.id")
//	List<Reportdetail> thongKeDoanhThu();
//	
//	@Query("select new ReportAcc(a.admin,count(a)) "
//			+ " from Account a " 
//			+ " group by a.admin")	
//			
//			List<ReportAcc> ThongKeTheoSL();
//	
//	
//	@Query("SELECT a FROM Orderdetail a WHERE a.order.id LIKE ?1")
//	Page<Orderdetail> timkiem(Long t, Pageable p);
//	
//	@Query("SELECT a FROM Orderdetail a WHERE a.order.id LIKE ?1")
//	List<Orderdetail> timkiem(Long t);
}
